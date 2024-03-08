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

package com.lark.oapi.service.application.v6.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.application.v6.enums.*;
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

public class ApplicationOwner {
    /**
     * 应用所有者类型
     * <p> 示例值：0
     */
    @SerializedName("type")
    private Integer type;
    /**
     * 应用所有者ID
     * <p> 示例值：ou_d317f090b7258ad0372aa53963cda70d
     */
    @SerializedName("owner_id")
    private String ownerId;
    /**
     * 应用开发商名称(仅商店应用返回)
     * <p> 示例值：test tenant
     */
    @SerializedName("name")
    private String name;
    /**
     * 应用开发商服务台链接(仅商店应用返回)
     * <p> 示例值：https://applink.feishu.cn/client/helpdesk/open?id=6940534140529803284
     */
    @SerializedName("help_desk")
    private String helpDesk;
    /**
     * 应用开发商的邮箱(仅商店应用返回)
     * <p> 示例值：test123@163.com
     */
    @SerializedName("email")
    private String email;
    /**
     * 应用开发商的手机号(仅商店应用返回)
     * <p> 示例值：1234534234234
     */
    @SerializedName("phone")
    private String phone;
    /**
     * 客服账号，仅当商店应用配置了这种联系方式时才会返回
     * <p> 示例值：feishu@bytedance.com
     */
    @SerializedName("customer_service_account")
    private String customerServiceAccount;

    // builder 开始
    public ApplicationOwner() {
    }

    public ApplicationOwner(Builder builder) {
        /**
         * 应用所有者类型
         * <p> 示例值：0
         */
        this.type = builder.type;
        /**
         * 应用所有者ID
         * <p> 示例值：ou_d317f090b7258ad0372aa53963cda70d
         */
        this.ownerId = builder.ownerId;
        /**
         * 应用开发商名称(仅商店应用返回)
         * <p> 示例值：test tenant
         */
        this.name = builder.name;
        /**
         * 应用开发商服务台链接(仅商店应用返回)
         * <p> 示例值：https://applink.feishu.cn/client/helpdesk/open?id=6940534140529803284
         */
        this.helpDesk = builder.helpDesk;
        /**
         * 应用开发商的邮箱(仅商店应用返回)
         * <p> 示例值：test123@163.com
         */
        this.email = builder.email;
        /**
         * 应用开发商的手机号(仅商店应用返回)
         * <p> 示例值：1234534234234
         */
        this.phone = builder.phone;
        /**
         * 客服账号，仅当商店应用配置了这种联系方式时才会返回
         * <p> 示例值：feishu@bytedance.com
         */
        this.customerServiceAccount = builder.customerServiceAccount;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHelpDesk() {
        return this.helpDesk;
    }

    public void setHelpDesk(String helpDesk) {
        this.helpDesk = helpDesk;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCustomerServiceAccount() {
        return this.customerServiceAccount;
    }

    public void setCustomerServiceAccount(String customerServiceAccount) {
        this.customerServiceAccount = customerServiceAccount;
    }

    public static class Builder {
        /**
         * 应用所有者类型
         * <p> 示例值：0
         */
        private Integer type;
        /**
         * 应用所有者ID
         * <p> 示例值：ou_d317f090b7258ad0372aa53963cda70d
         */
        private String ownerId;
        /**
         * 应用开发商名称(仅商店应用返回)
         * <p> 示例值：test tenant
         */
        private String name;
        /**
         * 应用开发商服务台链接(仅商店应用返回)
         * <p> 示例值：https://applink.feishu.cn/client/helpdesk/open?id=6940534140529803284
         */
        private String helpDesk;
        /**
         * 应用开发商的邮箱(仅商店应用返回)
         * <p> 示例值：test123@163.com
         */
        private String email;
        /**
         * 应用开发商的手机号(仅商店应用返回)
         * <p> 示例值：1234534234234
         */
        private String phone;
        /**
         * 客服账号，仅当商店应用配置了这种联系方式时才会返回
         * <p> 示例值：feishu@bytedance.com
         */
        private String customerServiceAccount;

        /**
         * 应用所有者类型
         * <p> 示例值：0
         *
         * @param type
         * @return
         */
        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        /**
         * 应用所有者类型
         * <p> 示例值：0
         *
         * @param type {@link com.lark.oapi.service.application.v6.enums.ApplicationOwnerAppOwnerTypeEnum}
         * @return
         */
        public Builder type(com.lark.oapi.service.application.v6.enums.ApplicationOwnerAppOwnerTypeEnum type) {
            this.type = type.getValue();
            return this;
        }


        /**
         * 应用所有者ID
         * <p> 示例值：ou_d317f090b7258ad0372aa53963cda70d
         *
         * @param ownerId
         * @return
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }


        /**
         * 应用开发商名称(仅商店应用返回)
         * <p> 示例值：test tenant
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 应用开发商服务台链接(仅商店应用返回)
         * <p> 示例值：https://applink.feishu.cn/client/helpdesk/open?id=6940534140529803284
         *
         * @param helpDesk
         * @return
         */
        public Builder helpDesk(String helpDesk) {
            this.helpDesk = helpDesk;
            return this;
        }


        /**
         * 应用开发商的邮箱(仅商店应用返回)
         * <p> 示例值：test123@163.com
         *
         * @param email
         * @return
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }


        /**
         * 应用开发商的手机号(仅商店应用返回)
         * <p> 示例值：1234534234234
         *
         * @param phone
         * @return
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }


        /**
         * 客服账号，仅当商店应用配置了这种联系方式时才会返回
         * <p> 示例值：feishu@bytedance.com
         *
         * @param customerServiceAccount
         * @return
         */
        public Builder customerServiceAccount(String customerServiceAccount) {
            this.customerServiceAccount = customerServiceAccount;
            return this;
        }


        public ApplicationOwner build() {
            return new ApplicationOwner(this);
        }
    }
}
