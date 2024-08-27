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

public class CustomOrgUpdate {
    /**
     * 组织类型编码
     * <p> 示例值：apiname__c
     */
    @SerializedName("object_api_name")
    private String objectApiName;
    /**
     * 组织名称
     * <p> 示例值：
     */
    @SerializedName("names")
    private I18n[] names;
    /**
     * 组织编码
     * <p> 示例值：MDPD00000023
     */
    @SerializedName("code")
    private String code;
    /**
     * 上级组织 ID
     * <p> 示例值：6862995757234914824
     */
    @SerializedName("parent_id")
    private String parentId;
    /**
     * 负责人ID 列表
     * <p> 示例值：
     */
    @SerializedName("manager_ids")
    private String[] managerIds;
    /**
     * 描述
     * <p> 示例值：
     */
    @SerializedName("description")
    private I18n[] description;
    /**
     * 生效时间
     * <p> 示例值：2020-01-01
     */
    @SerializedName("effective_time")
    private String effectiveTime;
    /**
     * 组织角色
     * <p> 示例值：
     */
    @SerializedName("org_roles")
    private OrgRoleUpdate[] orgRoles;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("custom_fields")
    private CustomFieldData[] customFields;

    // builder 开始
    public CustomOrgUpdate() {
    }

    public CustomOrgUpdate(Builder builder) {
        /**
         * 组织类型编码
         * <p> 示例值：apiname__c
         */
        this.objectApiName = builder.objectApiName;
        /**
         * 组织名称
         * <p> 示例值：
         */
        this.names = builder.names;
        /**
         * 组织编码
         * <p> 示例值：MDPD00000023
         */
        this.code = builder.code;
        /**
         * 上级组织 ID
         * <p> 示例值：6862995757234914824
         */
        this.parentId = builder.parentId;
        /**
         * 负责人ID 列表
         * <p> 示例值：
         */
        this.managerIds = builder.managerIds;
        /**
         * 描述
         * <p> 示例值：
         */
        this.description = builder.description;
        /**
         * 生效时间
         * <p> 示例值：2020-01-01
         */
        this.effectiveTime = builder.effectiveTime;
        /**
         * 组织角色
         * <p> 示例值：
         */
        this.orgRoles = builder.orgRoles;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customFields = builder.customFields;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getObjectApiName() {
        return this.objectApiName;
    }

    public void setObjectApiName(String objectApiName) {
        this.objectApiName = objectApiName;
    }

    public I18n[] getNames() {
        return this.names;
    }

    public void setNames(I18n[] names) {
        this.names = names;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParentId() {
        return this.parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String[] getManagerIds() {
        return this.managerIds;
    }

    public void setManagerIds(String[] managerIds) {
        this.managerIds = managerIds;
    }

    public I18n[] getDescription() {
        return this.description;
    }

    public void setDescription(I18n[] description) {
        this.description = description;
    }

    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public OrgRoleUpdate[] getOrgRoles() {
        return this.orgRoles;
    }

    public void setOrgRoles(OrgRoleUpdate[] orgRoles) {
        this.orgRoles = orgRoles;
    }

    public CustomFieldData[] getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(CustomFieldData[] customFields) {
        this.customFields = customFields;
    }

    public static class Builder {
        /**
         * 组织类型编码
         * <p> 示例值：apiname__c
         */
        private String objectApiName;
        /**
         * 组织名称
         * <p> 示例值：
         */
        private I18n[] names;
        /**
         * 组织编码
         * <p> 示例值：MDPD00000023
         */
        private String code;
        /**
         * 上级组织 ID
         * <p> 示例值：6862995757234914824
         */
        private String parentId;
        /**
         * 负责人ID 列表
         * <p> 示例值：
         */
        private String[] managerIds;
        /**
         * 描述
         * <p> 示例值：
         */
        private I18n[] description;
        /**
         * 生效时间
         * <p> 示例值：2020-01-01
         */
        private String effectiveTime;
        /**
         * 组织角色
         * <p> 示例值：
         */
        private OrgRoleUpdate[] orgRoles;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private CustomFieldData[] customFields;

        /**
         * 组织类型编码
         * <p> 示例值：apiname__c
         *
         * @param objectApiName
         * @return
         */
        public Builder objectApiName(String objectApiName) {
            this.objectApiName = objectApiName;
            return this;
        }


        /**
         * 组织名称
         * <p> 示例值：
         *
         * @param names
         * @return
         */
        public Builder names(I18n[] names) {
            this.names = names;
            return this;
        }


        /**
         * 组织编码
         * <p> 示例值：MDPD00000023
         *
         * @param code
         * @return
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }


        /**
         * 上级组织 ID
         * <p> 示例值：6862995757234914824
         *
         * @param parentId
         * @return
         */
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            return this;
        }


        /**
         * 负责人ID 列表
         * <p> 示例值：
         *
         * @param managerIds
         * @return
         */
        public Builder managerIds(String[] managerIds) {
            this.managerIds = managerIds;
            return this;
        }


        /**
         * 描述
         * <p> 示例值：
         *
         * @param description
         * @return
         */
        public Builder description(I18n[] description) {
            this.description = description;
            return this;
        }


        /**
         * 生效时间
         * <p> 示例值：2020-01-01
         *
         * @param effectiveTime
         * @return
         */
        public Builder effectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }


        /**
         * 组织角色
         * <p> 示例值：
         *
         * @param orgRoles
         * @return
         */
        public Builder orgRoles(OrgRoleUpdate[] orgRoles) {
            this.orgRoles = orgRoles;
            return this;
        }


        /**
         * 自定义字段
         * <p> 示例值：
         *
         * @param customFields
         * @return
         */
        public Builder customFields(CustomFieldData[] customFields) {
            this.customFields = customFields;
            return this;
        }


        public CustomOrgUpdate build() {
            return new CustomOrgUpdate(this);
        }
    }
}
