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

public class CreateMigrationEntity {
    /**
     * 实体的 id
     * <p> 示例值：43c58071254443c580712544
     */
    @SerializedName("id")
    private String id;
    /**
     * 实体的类型
     * <p> 示例值：sheets
     */
    @SerializedName("type")
    private String type;
    /**
     * 实体的数据驻留地
     * <p> 示例值：SG
     */
    @SerializedName("location")
    private String location;
    /**
     * 实体类型为 mailbox 时，返回 mail address，如果没有，则返回空
     * <p> 示例值：xxx@xxx.xx
     */
    @SerializedName("mail_address")
    private String mailAddress;

    // builder 开始
    public CreateMigrationEntity() {
    }

    public CreateMigrationEntity(Builder builder) {
        /**
         * 实体的 id
         * <p> 示例值：43c58071254443c580712544
         */
        this.id = builder.id;
        /**
         * 实体的类型
         * <p> 示例值：sheets
         */
        this.type = builder.type;
        /**
         * 实体的数据驻留地
         * <p> 示例值：SG
         */
        this.location = builder.location;
        /**
         * 实体类型为 mailbox 时，返回 mail address，如果没有，则返回空
         * <p> 示例值：xxx@xxx.xx
         */
        this.mailAddress = builder.mailAddress;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMailAddress() {
        return this.mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public static class Builder {
        /**
         * 实体的 id
         * <p> 示例值：43c58071254443c580712544
         */
        private String id;
        /**
         * 实体的类型
         * <p> 示例值：sheets
         */
        private String type;
        /**
         * 实体的数据驻留地
         * <p> 示例值：SG
         */
        private String location;
        /**
         * 实体类型为 mailbox 时，返回 mail address，如果没有，则返回空
         * <p> 示例值：xxx@xxx.xx
         */
        private String mailAddress;

        /**
         * 实体的 id
         * <p> 示例值：43c58071254443c580712544
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 实体的类型
         * <p> 示例值：sheets
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }


        /**
         * 实体的数据驻留地
         * <p> 示例值：SG
         *
         * @param location
         * @return
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * 实体的数据驻留地
         * <p> 示例值：SG
         *
         * @param location {@link com.lark.oapi.service.security_and_compliance.v1.enums.CreateMigrationEntityLocationEnum}
         * @return
         */
        public Builder location(com.lark.oapi.service.security_and_compliance.v1.enums.CreateMigrationEntityLocationEnum location) {
            this.location = location.getValue();
            return this;
        }


        /**
         * 实体类型为 mailbox 时，返回 mail address，如果没有，则返回空
         * <p> 示例值：xxx@xxx.xx
         *
         * @param mailAddress
         * @return
         */
        public Builder mailAddress(String mailAddress) {
            this.mailAddress = mailAddress;
            return this;
        }


        public CreateMigrationEntity build() {
            return new CreateMigrationEntity(this);
        }
    }
}