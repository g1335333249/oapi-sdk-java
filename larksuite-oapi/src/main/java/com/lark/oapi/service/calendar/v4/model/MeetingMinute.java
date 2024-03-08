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

package com.lark.oapi.service.calendar.v4.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.calendar.v4.enums.*;
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

public class MeetingMinute {
    /**
     * 文档token
     * <p> 示例值：WCEZdjUSSoH5rvx6hEhcyMjxn6c
     */
    @SerializedName("doc_token")
    private String docToken;
    /**
     * 文档URL
     * <p> 示例值：https://bytedance.feishu.cn/docx/WCEZdjUSSoH5rvx6hEhcyMjxn6c
     */
    @SerializedName("doc_url")
    private String docUrl;

    // builder 开始
    public MeetingMinute() {
    }

    public MeetingMinute(Builder builder) {
        /**
         * 文档token
         * <p> 示例值：WCEZdjUSSoH5rvx6hEhcyMjxn6c
         */
        this.docToken = builder.docToken;
        /**
         * 文档URL
         * <p> 示例值：https://bytedance.feishu.cn/docx/WCEZdjUSSoH5rvx6hEhcyMjxn6c
         */
        this.docUrl = builder.docUrl;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getDocToken() {
        return this.docToken;
    }

    public void setDocToken(String docToken) {
        this.docToken = docToken;
    }

    public String getDocUrl() {
        return this.docUrl;
    }

    public void setDocUrl(String docUrl) {
        this.docUrl = docUrl;
    }

    public static class Builder {
        /**
         * 文档token
         * <p> 示例值：WCEZdjUSSoH5rvx6hEhcyMjxn6c
         */
        private String docToken;
        /**
         * 文档URL
         * <p> 示例值：https://bytedance.feishu.cn/docx/WCEZdjUSSoH5rvx6hEhcyMjxn6c
         */
        private String docUrl;

        /**
         * 文档token
         * <p> 示例值：WCEZdjUSSoH5rvx6hEhcyMjxn6c
         *
         * @param docToken
         * @return
         */
        public Builder docToken(String docToken) {
            this.docToken = docToken;
            return this;
        }


        /**
         * 文档URL
         * <p> 示例值：https://bytedance.feishu.cn/docx/WCEZdjUSSoH5rvx6hEhcyMjxn6c
         *
         * @param docUrl
         * @return
         */
        public Builder docUrl(String docUrl) {
            this.docUrl = docUrl;
            return this;
        }


        public MeetingMinute build() {
            return new MeetingMinute(this);
        }
    }
}
