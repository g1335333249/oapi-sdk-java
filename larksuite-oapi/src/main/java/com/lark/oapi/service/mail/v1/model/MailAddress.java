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

package com.lark.oapi.service.mail.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.mail.v1.enums.*;
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

public class MailAddress {
    /**
     * 邮件地址
     * <p> 示例值：mike@outlook.com
     */
    @SerializedName("mail_address")
    private String mailAddress;
    /**
     * 名称
     * <p> 示例值：Mike
     */
    @SerializedName("name")
    private String name;

    // builder 开始
    public MailAddress() {
    }

    public MailAddress(Builder builder) {
        /**
         * 邮件地址
         * <p> 示例值：mike@outlook.com
         */
        this.mailAddress = builder.mailAddress;
        /**
         * 名称
         * <p> 示例值：Mike
         */
        this.name = builder.name;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getMailAddress() {
        return this.mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class Builder {
        /**
         * 邮件地址
         * <p> 示例值：mike@outlook.com
         */
        private String mailAddress;
        /**
         * 名称
         * <p> 示例值：Mike
         */
        private String name;

        /**
         * 邮件地址
         * <p> 示例值：mike@outlook.com
         *
         * @param mailAddress
         * @return
         */
        public Builder mailAddress(String mailAddress) {
            this.mailAddress = mailAddress;
            return this;
        }


        /**
         * 名称
         * <p> 示例值：Mike
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        public MailAddress build() {
            return new MailAddress(this);
        }
    }
}
