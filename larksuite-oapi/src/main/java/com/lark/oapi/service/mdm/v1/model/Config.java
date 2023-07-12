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

package com.lark.oapi.service.mdm.v1.model;

import com.google.gson.annotations.SerializedName;

public class Config {
    /**
     * 字段编码
     * <p> 示例值：V00000001
     */
    @SerializedName("field_code")
    private String fieldCode;
    /**
     * 字段名称
     * <p> 示例值：字段1
     */
    @SerializedName("field_name")
    private String fieldName;
    /**
     * 模块分组
     * <p> 示例值：0
     */
    @SerializedName("module")
    private Integer module;
    /**
     * 字段描述
     * <p> 示例值：字段描述
     */
    @SerializedName("field_describe")
    private String fieldDescribe;
    /**
     * 是否系统字段
     * <p> 示例值：0
     */
    @SerializedName("sys")
    private Integer sys;
    /**
     * 字段类型
     * <p> 示例值：
     */
    @SerializedName("field_type")
    private Integer fieldType;
    /**
     * 是否必填
     * <p> 示例值：0
     */
    @SerializedName("required")
    private Integer required;
    /**
     * 是否启用
     * <p> 示例值：0
     */
    @SerializedName("status")
    private Integer status;
    /**
     * 当前最新版本号
     * <p> 示例值：1
     */
    @SerializedName("field_version")
    private Integer fieldVersion;

    // builder 开始
    public Config() {
    }

    public Config(Builder builder) {
        /**
         * 字段编码
         * <p> 示例值：V00000001
         */
        this.fieldCode = builder.fieldCode;
        /**
         * 字段名称
         * <p> 示例值：字段1
         */
        this.fieldName = builder.fieldName;
        /**
         * 模块分组
         * <p> 示例值：0
         */
        this.module = builder.module;
        /**
         * 字段描述
         * <p> 示例值：字段描述
         */
        this.fieldDescribe = builder.fieldDescribe;
        /**
         * 是否系统字段
         * <p> 示例值：0
         */
        this.sys = builder.sys;
        /**
         * 字段类型
         * <p> 示例值：
         */
        this.fieldType = builder.fieldType;
        /**
         * 是否必填
         * <p> 示例值：0
         */
        this.required = builder.required;
        /**
         * 是否启用
         * <p> 示例值：0
         */
        this.status = builder.status;
        /**
         * 当前最新版本号
         * <p> 示例值：1
         */
        this.fieldVersion = builder.fieldVersion;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFieldCode() {
        return this.fieldCode;
    }

    public void setFieldCode(String fieldCode) {
        this.fieldCode = fieldCode;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Integer getModule() {
        return this.module;
    }

    public void setModule(Integer module) {
        this.module = module;
    }

    public String getFieldDescribe() {
        return this.fieldDescribe;
    }

    public void setFieldDescribe(String fieldDescribe) {
        this.fieldDescribe = fieldDescribe;
    }

    public Integer getSys() {
        return this.sys;
    }

    public void setSys(Integer sys) {
        this.sys = sys;
    }

    public Integer getFieldType() {
        return this.fieldType;
    }

    public void setFieldType(Integer fieldType) {
        this.fieldType = fieldType;
    }

    public Integer getRequired() {
        return this.required;
    }

    public void setRequired(Integer required) {
        this.required = required;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFieldVersion() {
        return this.fieldVersion;
    }

    public void setFieldVersion(Integer fieldVersion) {
        this.fieldVersion = fieldVersion;
    }

    public static class Builder {
        /**
         * 字段编码
         * <p> 示例值：V00000001
         */
        private String fieldCode;
        /**
         * 字段名称
         * <p> 示例值：字段1
         */
        private String fieldName;
        /**
         * 模块分组
         * <p> 示例值：0
         */
        private Integer module;
        /**
         * 字段描述
         * <p> 示例值：字段描述
         */
        private String fieldDescribe;
        /**
         * 是否系统字段
         * <p> 示例值：0
         */
        private Integer sys;
        /**
         * 字段类型
         * <p> 示例值：
         */
        private Integer fieldType;
        /**
         * 是否必填
         * <p> 示例值：0
         */
        private Integer required;
        /**
         * 是否启用
         * <p> 示例值：0
         */
        private Integer status;
        /**
         * 当前最新版本号
         * <p> 示例值：1
         */
        private Integer fieldVersion;

        /**
         * 字段编码
         * <p> 示例值：V00000001
         *
         * @param fieldCode
         * @return
         */
        public Builder fieldCode(String fieldCode) {
            this.fieldCode = fieldCode;
            return this;
        }


        /**
         * 字段名称
         * <p> 示例值：字段1
         *
         * @param fieldName
         * @return
         */
        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }


        /**
         * 模块分组
         * <p> 示例值：0
         *
         * @param module
         * @return
         */
        public Builder module(Integer module) {
            this.module = module;
            return this;
        }

        /**
         * 模块分组
         * <p> 示例值：0
         *
         * @param module {@link com.lark.oapi.service.mdm.v1.enums.ConfigModuleEnum}
         * @return
         */
        public Builder module(com.lark.oapi.service.mdm.v1.enums.ConfigModuleEnum module) {
            this.module = module.getValue();
            return this;
        }


        /**
         * 字段描述
         * <p> 示例值：字段描述
         *
         * @param fieldDescribe
         * @return
         */
        public Builder fieldDescribe(String fieldDescribe) {
            this.fieldDescribe = fieldDescribe;
            return this;
        }


        /**
         * 是否系统字段
         * <p> 示例值：0
         *
         * @param sys
         * @return
         */
        public Builder sys(Integer sys) {
            this.sys = sys;
            return this;
        }

        /**
         * 是否系统字段
         * <p> 示例值：0
         *
         * @param sys {@link com.lark.oapi.service.mdm.v1.enums.ConfigSysEnum}
         * @return
         */
        public Builder sys(com.lark.oapi.service.mdm.v1.enums.ConfigSysEnum sys) {
            this.sys = sys.getValue();
            return this;
        }


        /**
         * 字段类型
         * <p> 示例值：
         *
         * @param fieldType
         * @return
         */
        public Builder fieldType(Integer fieldType) {
            this.fieldType = fieldType;
            return this;
        }

        /**
         * 字段类型
         * <p> 示例值：
         *
         * @param fieldType {@link com.lark.oapi.service.mdm.v1.enums.ConfigFieldTypeEnum}
         * @return
         */
        public Builder fieldType(com.lark.oapi.service.mdm.v1.enums.ConfigFieldTypeEnum fieldType) {
            this.fieldType = fieldType.getValue();
            return this;
        }


        /**
         * 是否必填
         * <p> 示例值：0
         *
         * @param required
         * @return
         */
        public Builder required(Integer required) {
            this.required = required;
            return this;
        }

        /**
         * 是否必填
         * <p> 示例值：0
         *
         * @param required {@link com.lark.oapi.service.mdm.v1.enums.ConfigRequiredEnum}
         * @return
         */
        public Builder required(com.lark.oapi.service.mdm.v1.enums.ConfigRequiredEnum required) {
            this.required = required.getValue();
            return this;
        }


        /**
         * 是否启用
         * <p> 示例值：0
         *
         * @param status
         * @return
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * 是否启用
         * <p> 示例值：0
         *
         * @param status {@link com.lark.oapi.service.mdm.v1.enums.ConfigStatusEnum}
         * @return
         */
        public Builder status(com.lark.oapi.service.mdm.v1.enums.ConfigStatusEnum status) {
            this.status = status.getValue();
            return this;
        }


        /**
         * 当前最新版本号
         * <p> 示例值：1
         *
         * @param fieldVersion
         * @return
         */
        public Builder fieldVersion(Integer fieldVersion) {
            this.fieldVersion = fieldVersion;
            return this;
        }


        public Config build() {
            return new Config(this);
        }
    }
}