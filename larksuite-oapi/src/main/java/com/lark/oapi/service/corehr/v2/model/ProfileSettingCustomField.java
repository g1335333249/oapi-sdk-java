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

public class ProfileSettingCustomField {
    /**
     * 字段名
     * <p> 示例值：custom_field_1__c
     */
    @SerializedName("field_name")
    private String fieldName;
    /**
     * 字段值, 是 json 转义后的字符串，根据元数据定义不同，字段格式不同。使用方式可参考【操作手册】如何通过 OpenAPI 维护自定义字段
     * <p> 示例值：["custom_enum_0__c"]
     */
    @SerializedName("value")
    private String value;

    // builder 开始
    public ProfileSettingCustomField() {
    }

    public ProfileSettingCustomField(Builder builder) {
        /**
         * 字段名
         * <p> 示例值：custom_field_1__c
         */
        this.fieldName = builder.fieldName;
        /**
         * 字段值, 是 json 转义后的字符串，根据元数据定义不同，字段格式不同。使用方式可参考【操作手册】如何通过 OpenAPI 维护自定义字段
         * <p> 示例值：["custom_enum_0__c"]
         */
        this.value = builder.value;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static class Builder {
        /**
         * 字段名
         * <p> 示例值：custom_field_1__c
         */
        private String fieldName;
        /**
         * 字段值, 是 json 转义后的字符串，根据元数据定义不同，字段格式不同。使用方式可参考【操作手册】如何通过 OpenAPI 维护自定义字段
         * <p> 示例值：["custom_enum_0__c"]
         */
        private String value;

        /**
         * 字段名
         * <p> 示例值：custom_field_1__c
         *
         * @param fieldName
         * @return
         */
        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }


        /**
         * 字段值, 是 json 转义后的字符串，根据元数据定义不同，字段格式不同。使用方式可参考【操作手册】如何通过 OpenAPI 维护自定义字段
         * <p> 示例值：["custom_enum_0__c"]
         *
         * @param value
         * @return
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }


        public ProfileSettingCustomField build() {
            return new ProfileSettingCustomField(this);
        }
    }
}
