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

package com.lark.oapi.service.corehr.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class QueryCustomFieldReq {
    /**
     * 所属对象 apiname，支持一个或多个;;当前数量限制为 20 个
     * <p> 示例值：["offboarding_info"]
     */
    @Query
    @SerializedName("object_api_name_list")
    private String[] objectApiNameList;

    // builder 开始
    public QueryCustomFieldReq() {
    }

    public QueryCustomFieldReq(Builder builder) {
        /**
         * 所属对象 apiname，支持一个或多个;;当前数量限制为 20 个
         * <p> 示例值：["offboarding_info"]
         */
        this.objectApiNameList = builder.objectApiNameList;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String[] getObjectApiNameList() {
        return this.objectApiNameList;
    }

    public void setObjectApiNameList(String[] objectApiNameList) {
        this.objectApiNameList = objectApiNameList;
    }

    public static class Builder {
        private String[] objectApiNameList; // 所属对象 apiname，支持一个或多个;;当前数量限制为 20 个


        /**
         * 所属对象 apiname，支持一个或多个;;当前数量限制为 20 个
         * <p> 示例值：["offboarding_info"]
         *
         * @param objectApiNameList
         * @return
         */
        public Builder objectApiNameList(String[] objectApiNameList) {
            this.objectApiNameList = objectApiNameList;
            return this;
        }

        public QueryCustomFieldReq build() {
            return new QueryCustomFieldReq(this);
        }
    }
}
