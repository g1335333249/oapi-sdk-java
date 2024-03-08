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
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class JobLevel {
    /**
     * 职务级别 ID
     * <p> 示例值：4692446793125560154
     */
    @SerializedName("id")
    private String id;
    /**
     * 职级数值
     * <p> 示例值：9999
     */
    @SerializedName("level_order")
    private Integer levelOrder;
    /**
     * 编码
     * <p> 示例值：VQzo/BSonp8l6PmcZ+VlDhkd2595LMkhyBAGX6HAlCY=
     */
    @SerializedName("code")
    private String code;
    /**
     * 名称
     * <p> 示例值：
     */
    @SerializedName("name")
    private I18n[] name;
    /**
     * 描述
     * <p> 示例值：
     */
    @SerializedName("description")
    private I18n[] description;
    /**
     * 是否启用
     * <p> 示例值：true
     */
    @SerializedName("active")
    private Boolean active;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("custom_fields")
    private ObjectFieldData[] customFields;

    // builder 开始
    public JobLevel() {
    }

    public JobLevel(Builder builder) {
        /**
         * 职务级别 ID
         * <p> 示例值：4692446793125560154
         */
        this.id = builder.id;
        /**
         * 职级数值
         * <p> 示例值：9999
         */
        this.levelOrder = builder.levelOrder;
        /**
         * 编码
         * <p> 示例值：VQzo/BSonp8l6PmcZ+VlDhkd2595LMkhyBAGX6HAlCY=
         */
        this.code = builder.code;
        /**
         * 名称
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 描述
         * <p> 示例值：
         */
        this.description = builder.description;
        /**
         * 是否启用
         * <p> 示例值：true
         */
        this.active = builder.active;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customFields = builder.customFields;
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

    public Integer getLevelOrder() {
        return this.levelOrder;
    }

    public void setLevelOrder(Integer levelOrder) {
        this.levelOrder = levelOrder;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public I18n[] getName() {
        return this.name;
    }

    public void setName(I18n[] name) {
        this.name = name;
    }

    public I18n[] getDescription() {
        return this.description;
    }

    public void setDescription(I18n[] description) {
        this.description = description;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public ObjectFieldData[] getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(ObjectFieldData[] customFields) {
        this.customFields = customFields;
    }

    public static class Builder {
        /**
         * 职务级别 ID
         * <p> 示例值：4692446793125560154
         */
        private String id;
        /**
         * 职级数值
         * <p> 示例值：9999
         */
        private Integer levelOrder;
        /**
         * 编码
         * <p> 示例值：VQzo/BSonp8l6PmcZ+VlDhkd2595LMkhyBAGX6HAlCY=
         */
        private String code;
        /**
         * 名称
         * <p> 示例值：
         */
        private I18n[] name;
        /**
         * 描述
         * <p> 示例值：
         */
        private I18n[] description;
        /**
         * 是否启用
         * <p> 示例值：true
         */
        private Boolean active;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private ObjectFieldData[] customFields;

        /**
         * 职务级别 ID
         * <p> 示例值：4692446793125560154
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 职级数值
         * <p> 示例值：9999
         *
         * @param levelOrder
         * @return
         */
        public Builder levelOrder(Integer levelOrder) {
            this.levelOrder = levelOrder;
            return this;
        }


        /**
         * 编码
         * <p> 示例值：VQzo/BSonp8l6PmcZ+VlDhkd2595LMkhyBAGX6HAlCY=
         *
         * @param code
         * @return
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }


        /**
         * 名称
         * <p> 示例值：
         *
         * @param name
         * @return
         */
        public Builder name(I18n[] name) {
            this.name = name;
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
         * 是否启用
         * <p> 示例值：true
         *
         * @param active
         * @return
         */
        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }


        /**
         * 自定义字段
         * <p> 示例值：
         *
         * @param customFields
         * @return
         */
        public Builder customFields(ObjectFieldData[] customFields) {
            this.customFields = customFields;
            return this;
        }


        public JobLevel build() {
            return new JobLevel(this);
        }
    }
}
