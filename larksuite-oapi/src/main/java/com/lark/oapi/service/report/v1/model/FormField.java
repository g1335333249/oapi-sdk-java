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

package com.lark.oapi.service.report.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.report.v1.enums.*;
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

public class FormField {
    /**
     * 字段名称
     * <p> 示例值：ou_133f0b6d0f097cf7d7ba00b38fffb112
     */
    @SerializedName("name")
    private String name;
    /**
     * 字段类型
     * <p> 示例值：张三
     */
    @SerializedName("type")
    private String type;

    // builder 开始
    public FormField() {
    }

    public FormField(Builder builder) {
        /**
         * 字段名称
         * <p> 示例值：ou_133f0b6d0f097cf7d7ba00b38fffb112
         */
        this.name = builder.name;
        /**
         * 字段类型
         * <p> 示例值：张三
         */
        this.type = builder.type;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static class Builder {
        /**
         * 字段名称
         * <p> 示例值：ou_133f0b6d0f097cf7d7ba00b38fffb112
         */
        private String name;
        /**
         * 字段类型
         * <p> 示例值：张三
         */
        private String type;

        /**
         * 字段名称
         * <p> 示例值：ou_133f0b6d0f097cf7d7ba00b38fffb112
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 字段类型
         * <p> 示例值：张三
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * 字段类型
         * <p> 示例值：张三
         *
         * @param type {@link com.lark.oapi.service.report.v1.enums.FormFieldFieldTypeEnum}
         * @return
         */
        public Builder type(com.lark.oapi.service.report.v1.enums.FormFieldFieldTypeEnum type) {
            this.type = type.getValue();
            return this;
        }


        public FormField build() {
            return new FormField(this);
        }
    }
}
