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
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class ProfileSettingEmergencyContact {
    /**
     * 姓名
     * <p> 示例值：王大帅
     */
    @SerializedName("legal_name")
    private String legalName;
    /**
     * 关系，枚举值。 可选项可通过【获取字段详情】接口查询，查询参数如下： object_api_name = "emergency_contract" custom_api_name = "relationship"
     * <p> 示例值：parent
     */
    @SerializedName("relationship")
    private String relationship;
    /**
     * 主要联系人
     * <p> 示例值：true
     */
    @SerializedName("is_primary")
    private Boolean isPrimary;
    /**
     * 电话
     * <p> 示例值：
     */
    @SerializedName("phone")
    private ProfileSettingPhone phone;
    /**
     * 邮箱
     * <p> 示例值：1234567@example.feishu.cn
     */
    @SerializedName("email")
    private String email;
    /**
     * 地址
     * <p> 示例值：
     */
    @SerializedName("address")
    private ProfileSettingAddress address;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("custom_fields")
    private ProfileSettingCustomField[] customFields;

    // builder 开始
    public ProfileSettingEmergencyContact() {
    }

    public ProfileSettingEmergencyContact(Builder builder) {
        /**
         * 姓名
         * <p> 示例值：王大帅
         */
        this.legalName = builder.legalName;
        /**
         * 关系，枚举值。 可选项可通过【获取字段详情】接口查询，查询参数如下： object_api_name = "emergency_contract" custom_api_name = "relationship"
         * <p> 示例值：parent
         */
        this.relationship = builder.relationship;
        /**
         * 主要联系人
         * <p> 示例值：true
         */
        this.isPrimary = builder.isPrimary;
        /**
         * 电话
         * <p> 示例值：
         */
        this.phone = builder.phone;
        /**
         * 邮箱
         * <p> 示例值：1234567@example.feishu.cn
         */
        this.email = builder.email;
        /**
         * 地址
         * <p> 示例值：
         */
        this.address = builder.address;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customFields = builder.customFields;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getLegalName() {
        return this.legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getRelationship() {
        return this.relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public Boolean getIsPrimary() {
        return this.isPrimary;
    }

    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    public ProfileSettingPhone getPhone() {
        return this.phone;
    }

    public void setPhone(ProfileSettingPhone phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ProfileSettingAddress getAddress() {
        return this.address;
    }

    public void setAddress(ProfileSettingAddress address) {
        this.address = address;
    }

    public ProfileSettingCustomField[] getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(ProfileSettingCustomField[] customFields) {
        this.customFields = customFields;
    }

    public static class Builder {
        /**
         * 姓名
         * <p> 示例值：王大帅
         */
        private String legalName;
        /**
         * 关系，枚举值。 可选项可通过【获取字段详情】接口查询，查询参数如下： object_api_name = "emergency_contract" custom_api_name = "relationship"
         * <p> 示例值：parent
         */
        private String relationship;
        /**
         * 主要联系人
         * <p> 示例值：true
         */
        private Boolean isPrimary;
        /**
         * 电话
         * <p> 示例值：
         */
        private ProfileSettingPhone phone;
        /**
         * 邮箱
         * <p> 示例值：1234567@example.feishu.cn
         */
        private String email;
        /**
         * 地址
         * <p> 示例值：
         */
        private ProfileSettingAddress address;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private ProfileSettingCustomField[] customFields;

        /**
         * 姓名
         * <p> 示例值：王大帅
         *
         * @param legalName
         * @return
         */
        public Builder legalName(String legalName) {
            this.legalName = legalName;
            return this;
        }


        /**
         * 关系，枚举值。 可选项可通过【获取字段详情】接口查询，查询参数如下： object_api_name = "emergency_contract" custom_api_name = "relationship"
         * <p> 示例值：parent
         *
         * @param relationship
         * @return
         */
        public Builder relationship(String relationship) {
            this.relationship = relationship;
            return this;
        }


        /**
         * 主要联系人
         * <p> 示例值：true
         *
         * @param isPrimary
         * @return
         */
        public Builder isPrimary(Boolean isPrimary) {
            this.isPrimary = isPrimary;
            return this;
        }


        /**
         * 电话
         * <p> 示例值：
         *
         * @param phone
         * @return
         */
        public Builder phone(ProfileSettingPhone phone) {
            this.phone = phone;
            return this;
        }


        /**
         * 邮箱
         * <p> 示例值：1234567@example.feishu.cn
         *
         * @param email
         * @return
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }


        /**
         * 地址
         * <p> 示例值：
         *
         * @param address
         * @return
         */
        public Builder address(ProfileSettingAddress address) {
            this.address = address;
            return this;
        }


        /**
         * 自定义字段
         * <p> 示例值：
         *
         * @param customFields
         * @return
         */
        public Builder customFields(ProfileSettingCustomField[] customFields) {
            this.customFields = customFields;
            return this;
        }


        public ProfileSettingEmergencyContact build() {
            return new ProfileSettingEmergencyContact(this);
        }
    }
}