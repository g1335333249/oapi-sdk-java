// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.corehr.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v2.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class PatchPersonReq {
    /**
     * 根据client_token是否一致来判断是否为同一请求
     * <p> 示例值：12454646
     */
    @Query
    @SerializedName("client_token")
    private String clientToken;
    /**
     * 根据no_need_query判断更新后是否做查询请求并返回个人信息
     * <p> 示例值：false
     */
    @Query
    @SerializedName("no_need_query")
    private Boolean noNeedQuery;
    /**
     * person的ID
     * <p> 示例值：12454646
     */
    @Path
    @SerializedName("person_id")
    private String personId;
    @Body
    private PersonInfo body;

    // builder 开始
    public PatchPersonReq() {
    }

    public PatchPersonReq(Builder builder) {
        /**
         * 根据client_token是否一致来判断是否为同一请求
         * <p> 示例值：12454646
         */
        this.clientToken = builder.clientToken;
        /**
         * 根据no_need_query判断更新后是否做查询请求并返回个人信息
         * <p> 示例值：false
         */
        this.noNeedQuery = builder.noNeedQuery;
        /**
         * person的ID
         * <p> 示例值：12454646
         */
        this.personId = builder.personId;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getClientToken() {
        return this.clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public Boolean getNoNeedQuery() {
        return this.noNeedQuery;
    }

    public void setNoNeedQuery(Boolean noNeedQuery) {
        this.noNeedQuery = noNeedQuery;
    }

    public String getPersonId() {
        return this.personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public PersonInfo getPersonInfo() {
        return this.body;
    }

    public void setPersonInfo(PersonInfo body) {
        this.body = body;
    }

    public static class Builder {
        private String clientToken; // 根据client_token是否一致来判断是否为同一请求
        private Boolean noNeedQuery; // 根据no_need_query判断更新后是否做查询请求并返回个人信息
        private String personId; // person的ID
        private PersonInfo body;

        /**
         * 根据client_token是否一致来判断是否为同一请求
         * <p> 示例值：12454646
         *
         * @param clientToken
         * @return
         */
        public Builder clientToken(String clientToken) {
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 根据no_need_query判断更新后是否做查询请求并返回个人信息
         * <p> 示例值：false
         *
         * @param noNeedQuery
         * @return
         */
        public Builder noNeedQuery(Boolean noNeedQuery) {
            this.noNeedQuery = noNeedQuery;
            return this;
        }

        /**
         * person的ID
         * <p> 示例值：12454646
         *
         * @param personId
         * @return
         */
        public Builder personId(String personId) {
            this.personId = personId;
            return this;
        }

        public PersonInfo getPersonInfo() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder personInfo(PersonInfo body) {
            this.body = body;
            return this;
        }

        public PatchPersonReq build() {
            return new PatchPersonReq(this);
        }
    }
}