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

public class AppScope {
    /**
     * 应用权限
     * <p> 示例值：contact:user.base
     */
    @SerializedName("scope")
    private String scope;
    /**
     * 应用权限的国际化描述
     * <p> 示例值：获取应用信息
     */
    @SerializedName("description")
    private String description;
    /**
     * 权限等级描述
     * <p> 示例值：1
     */
    @SerializedName("level")
    private Integer level;

    // builder 开始
    public AppScope() {
    }

    public AppScope(Builder builder) {
        /**
         * 应用权限
         * <p> 示例值：contact:user.base
         */
        this.scope = builder.scope;
        /**
         * 应用权限的国际化描述
         * <p> 示例值：获取应用信息
         */
        this.description = builder.description;
        /**
         * 权限等级描述
         * <p> 示例值：1
         */
        this.level = builder.level;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getScope() {
        return this.scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getLevel() {
        return this.level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public static class Builder {
        /**
         * 应用权限
         * <p> 示例值：contact:user.base
         */
        private String scope;
        /**
         * 应用权限的国际化描述
         * <p> 示例值：获取应用信息
         */
        private String description;
        /**
         * 权限等级描述
         * <p> 示例值：1
         */
        private Integer level;

        /**
         * 应用权限
         * <p> 示例值：contact:user.base
         *
         * @param scope
         * @return
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }


        /**
         * 应用权限的国际化描述
         * <p> 示例值：获取应用信息
         *
         * @param description
         * @return
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }


        /**
         * 权限等级描述
         * <p> 示例值：1
         *
         * @param level
         * @return
         */
        public Builder level(Integer level) {
            this.level = level;
            return this;
        }

        /**
         * 权限等级描述
         * <p> 示例值：1
         *
         * @param level {@link com.lark.oapi.service.application.v6.enums.AppScopeScopeLevelEnum}
         * @return
         */
        public Builder level(com.lark.oapi.service.application.v6.enums.AppScopeScopeLevelEnum level) {
            this.level = level.getValue();
            return this;
        }


        public AppScope build() {
            return new AppScope(this);
        }
    }
}
