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

package com.lark.oapi.service.drive.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.drive.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class Owner {
    /**
     * 文档拥有者的ID类型
     * <p> 示例值：openid
     */
    @SerializedName("member_type")
    private String memberType;
    /**
     * 文档拥有者的ID，与文档拥有者的ID类型需要对应
     * <p> 示例值：string
     */
    @SerializedName("member_id")
    private String memberId;

    // builder 开始
    public Owner() {
    }

    public Owner(Builder builder) {
        /**
         * 文档拥有者的ID类型
         * <p> 示例值：openid
         */
        this.memberType = builder.memberType;
        /**
         * 文档拥有者的ID，与文档拥有者的ID类型需要对应
         * <p> 示例值：string
         */
        this.memberId = builder.memberId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getMemberType() {
        return this.memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public static class Builder {
        /**
         * 文档拥有者的ID类型
         * <p> 示例值：openid
         */
        private String memberType;
        /**
         * 文档拥有者的ID，与文档拥有者的ID类型需要对应
         * <p> 示例值：string
         */
        private String memberId;

        /**
         * 文档拥有者的ID类型
         * <p> 示例值：openid
         *
         * @param memberType
         * @return
         */
        public Builder memberType(String memberType) {
            this.memberType = memberType;
            return this;
        }

        /**
         * 文档拥有者的ID类型
         * <p> 示例值：openid
         *
         * @param memberType {@link com.lark.oapi.service.drive.v1.enums.OwnerMemberTypeEnum}
         * @return
         */
        public Builder memberType(com.lark.oapi.service.drive.v1.enums.OwnerMemberTypeEnum memberType) {
            this.memberType = memberType.getValue();
            return this;
        }


        /**
         * 文档拥有者的ID，与文档拥有者的ID类型需要对应
         * <p> 示例值：string
         *
         * @param memberId
         * @return
         */
        public Builder memberId(String memberId) {
            this.memberId = memberId;
            return this;
        }


        public Owner build() {
            return new Owner(this);
        }
    }
}
