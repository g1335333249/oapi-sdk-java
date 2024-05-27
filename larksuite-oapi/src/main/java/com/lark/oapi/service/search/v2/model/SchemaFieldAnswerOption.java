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

package com.lark.oapi.service.search.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.search.v2.enums.*;
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

public class SchemaFieldAnswerOption {
    /**
     * 是否用于搜索
     * <p> 示例值：false
     */
    @SerializedName("is_searchable")
    private Boolean isSearchable;
    /**
     * 是否用于返回
     * <p> 示例值：false
     */
    @SerializedName("is_returnable")
    private Boolean isReturnable;

    // builder 开始
    public SchemaFieldAnswerOption() {
    }

    public SchemaFieldAnswerOption(Builder builder) {
        /**
         * 是否用于搜索
         * <p> 示例值：false
         */
        this.isSearchable = builder.isSearchable;
        /**
         * 是否用于返回
         * <p> 示例值：false
         */
        this.isReturnable = builder.isReturnable;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Boolean getIsSearchable() {
        return this.isSearchable;
    }

    public void setIsSearchable(Boolean isSearchable) {
        this.isSearchable = isSearchable;
    }

    public Boolean getIsReturnable() {
        return this.isReturnable;
    }

    public void setIsReturnable(Boolean isReturnable) {
        this.isReturnable = isReturnable;
    }

    public static class Builder {
        /**
         * 是否用于搜索
         * <p> 示例值：false
         */
        private Boolean isSearchable;
        /**
         * 是否用于返回
         * <p> 示例值：false
         */
        private Boolean isReturnable;

        /**
         * 是否用于搜索
         * <p> 示例值：false
         *
         * @param isSearchable
         * @return
         */
        public Builder isSearchable(Boolean isSearchable) {
            this.isSearchable = isSearchable;
            return this;
        }


        /**
         * 是否用于返回
         * <p> 示例值：false
         *
         * @param isReturnable
         * @return
         */
        public Builder isReturnable(Boolean isReturnable) {
            this.isReturnable = isReturnable;
            return this;
        }


        public SchemaFieldAnswerOption build() {
            return new SchemaFieldAnswerOption(this);
        }
    }
}