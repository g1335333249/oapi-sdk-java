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

package com.lark.oapi.service.security_and_compliance.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.security_and_compliance.v1.enums.*;
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

public class Notification {
    /**
     * 幂等建
     * <p> 示例值：0cbd65e0-c7ab-4e9f-a80c-be29dd21df8f
     */
    @SerializedName("idempotent_key")
    private String idempotentKey;
    /**
     * 通知内容
     * <p> 示例值：
     */
    @SerializedName("content")
    private String content;

    // builder 开始
    public Notification() {
    }

    public Notification(Builder builder) {
        /**
         * 幂等建
         * <p> 示例值：0cbd65e0-c7ab-4e9f-a80c-be29dd21df8f
         */
        this.idempotentKey = builder.idempotentKey;
        /**
         * 通知内容
         * <p> 示例值：
         */
        this.content = builder.content;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getIdempotentKey() {
        return this.idempotentKey;
    }

    public void setIdempotentKey(String idempotentKey) {
        this.idempotentKey = idempotentKey;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static class Builder {
        /**
         * 幂等建
         * <p> 示例值：0cbd65e0-c7ab-4e9f-a80c-be29dd21df8f
         */
        private String idempotentKey;
        /**
         * 通知内容
         * <p> 示例值：
         */
        private String content;

        /**
         * 幂等建
         * <p> 示例值：0cbd65e0-c7ab-4e9f-a80c-be29dd21df8f
         *
         * @param idempotentKey
         * @return
         */
        public Builder idempotentKey(String idempotentKey) {
            this.idempotentKey = idempotentKey;
            return this;
        }


        /**
         * 通知内容
         * <p> 示例值：
         *
         * @param content
         * @return
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }


        public Notification build() {
            return new Notification(this);
        }
    }
}