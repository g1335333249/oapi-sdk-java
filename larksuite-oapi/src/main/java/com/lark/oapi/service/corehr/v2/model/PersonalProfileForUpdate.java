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

public class PersonalProfileForUpdate {
    /**
     * 资料类型，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可：- object_api_name = "personal_profile" - custom_api_name = "profile_type"
     * <p> 示例值：1
     */
    @SerializedName("personal_profile_type")
    private String personalProfileType;
    /**
     * 资料文件列表
     * <p> 示例值：
     */
    @SerializedName("files")
    private File[] files;

    // builder 开始
    public PersonalProfileForUpdate() {
    }

    public PersonalProfileForUpdate(Builder builder) {
        /**
         * 资料类型，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可：- object_api_name = "personal_profile" - custom_api_name = "profile_type"
         * <p> 示例值：1
         */
        this.personalProfileType = builder.personalProfileType;
        /**
         * 资料文件列表
         * <p> 示例值：
         */
        this.files = builder.files;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getPersonalProfileType() {
        return this.personalProfileType;
    }

    public void setPersonalProfileType(String personalProfileType) {
        this.personalProfileType = personalProfileType;
    }

    public File[] getFiles() {
        return this.files;
    }

    public void setFiles(File[] files) {
        this.files = files;
    }

    public static class Builder {
        /**
         * 资料类型，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可：- object_api_name = "personal_profile" - custom_api_name = "profile_type"
         * <p> 示例值：1
         */
        private String personalProfileType;
        /**
         * 资料文件列表
         * <p> 示例值：
         */
        private File[] files;

        /**
         * 资料类型，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可：- object_api_name = "personal_profile" - custom_api_name = "profile_type"
         * <p> 示例值：1
         *
         * @param personalProfileType
         * @return
         */
        public Builder personalProfileType(String personalProfileType) {
            this.personalProfileType = personalProfileType;
            return this;
        }


        /**
         * 资料文件列表
         * <p> 示例值：
         *
         * @param files
         * @return
         */
        public Builder files(File[] files) {
            this.files = files;
            return this;
        }


        public PersonalProfileForUpdate build() {
            return new PersonalProfileForUpdate(this);
        }
    }
}