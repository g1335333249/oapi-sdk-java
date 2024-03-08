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

package com.lark.oapi.service.hire.v1.model;

import com.lark.oapi.core.response.EmptyData;
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

public class ApplicationOfferBasicInfoUser {
    /**
     * ID
     * <p> 示例值：
     */
    @SerializedName("id")
    private String id;
    /**
     * 名字
     * <p> 示例值：
     */
    @SerializedName("name")
    private String name;
    /**
     * 英文名
     * <p> 示例值：
     */
    @SerializedName("en_name")
    private String enName;
    /**
     * 头像
     * <p> 示例值：
     */
    @SerializedName("avatar")
    private String avatar;
    /**
     * 部门
     * <p> 示例值：
     */
    @SerializedName("department")
    private Department department;
    /**
     * 时区
     * <p> 示例值：
     */
    @SerializedName("timezone")
    private String timezone;
    /**
     * 手机
     * <p> 示例值：
     */
    @SerializedName("phone")
    private String phone;
    /**
     * 邮箱
     * <p> 示例值：
     */
    @SerializedName("email")
    private String email;
    /**
     * 是否拥有app权限
     * <p> 示例值：
     */
    @SerializedName("in_app_scope")
    private Boolean inAppScope;

    // builder 开始
    public ApplicationOfferBasicInfoUser() {
    }

    public ApplicationOfferBasicInfoUser(Builder builder) {
        /**
         * ID
         * <p> 示例值：
         */
        this.id = builder.id;
        /**
         * 名字
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 英文名
         * <p> 示例值：
         */
        this.enName = builder.enName;
        /**
         * 头像
         * <p> 示例值：
         */
        this.avatar = builder.avatar;
        /**
         * 部门
         * <p> 示例值：
         */
        this.department = builder.department;
        /**
         * 时区
         * <p> 示例值：
         */
        this.timezone = builder.timezone;
        /**
         * 手机
         * <p> 示例值：
         */
        this.phone = builder.phone;
        /**
         * 邮箱
         * <p> 示例值：
         */
        this.email = builder.email;
        /**
         * 是否拥有app权限
         * <p> 示例值：
         */
        this.inAppScope = builder.inAppScope;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnName() {
        return this.enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getInAppScope() {
        return this.inAppScope;
    }

    public void setInAppScope(Boolean inAppScope) {
        this.inAppScope = inAppScope;
    }

    public static class Builder {
        /**
         * ID
         * <p> 示例值：
         */
        private String id;
        /**
         * 名字
         * <p> 示例值：
         */
        private String name;
        /**
         * 英文名
         * <p> 示例值：
         */
        private String enName;
        /**
         * 头像
         * <p> 示例值：
         */
        private String avatar;
        /**
         * 部门
         * <p> 示例值：
         */
        private Department department;
        /**
         * 时区
         * <p> 示例值：
         */
        private String timezone;
        /**
         * 手机
         * <p> 示例值：
         */
        private String phone;
        /**
         * 邮箱
         * <p> 示例值：
         */
        private String email;
        /**
         * 是否拥有app权限
         * <p> 示例值：
         */
        private Boolean inAppScope;

        /**
         * ID
         * <p> 示例值：
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 名字
         * <p> 示例值：
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 英文名
         * <p> 示例值：
         *
         * @param enName
         * @return
         */
        public Builder enName(String enName) {
            this.enName = enName;
            return this;
        }


        /**
         * 头像
         * <p> 示例值：
         *
         * @param avatar
         * @return
         */
        public Builder avatar(String avatar) {
            this.avatar = avatar;
            return this;
        }


        /**
         * 部门
         * <p> 示例值：
         *
         * @param department
         * @return
         */
        public Builder department(Department department) {
            this.department = department;
            return this;
        }


        /**
         * 时区
         * <p> 示例值：
         *
         * @param timezone
         * @return
         */
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            return this;
        }


        /**
         * 手机
         * <p> 示例值：
         *
         * @param phone
         * @return
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }


        /**
         * 邮箱
         * <p> 示例值：
         *
         * @param email
         * @return
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }


        /**
         * 是否拥有app权限
         * <p> 示例值：
         *
         * @param inAppScope
         * @return
         */
        public Builder inAppScope(Boolean inAppScope) {
            this.inAppScope = inAppScope;
            return this;
        }


        public ApplicationOfferBasicInfoUser build() {
            return new ApplicationOfferBasicInfoUser(this);
        }
    }
}
