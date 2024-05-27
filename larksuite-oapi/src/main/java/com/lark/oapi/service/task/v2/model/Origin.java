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

package com.lark.oapi.service.task.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.task.v2.enums.*;
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

public class Origin {
    /**
     * 任务导入来源的名称，用于在任务中心详情页展示。需提供多语言版本。
     * <p> 示例值：
     */
    @SerializedName("platform_i18n_name")
    private I18nText platformI18nName;
    /**
     * 任务关联的来源平台详情页链接
     * <p> 示例值：
     */
    @SerializedName("href")
    private Href href;

    // builder 开始
    public Origin() {
    }

    public Origin(Builder builder) {
        /**
         * 任务导入来源的名称，用于在任务中心详情页展示。需提供多语言版本。
         * <p> 示例值：
         */
        this.platformI18nName = builder.platformI18nName;
        /**
         * 任务关联的来源平台详情页链接
         * <p> 示例值：
         */
        this.href = builder.href;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public I18nText getPlatformI18nName() {
        return this.platformI18nName;
    }

    public void setPlatformI18nName(I18nText platformI18nName) {
        this.platformI18nName = platformI18nName;
    }

    public Href getHref() {
        return this.href;
    }

    public void setHref(Href href) {
        this.href = href;
    }

    public static class Builder {
        /**
         * 任务导入来源的名称，用于在任务中心详情页展示。需提供多语言版本。
         * <p> 示例值：
         */
        private I18nText platformI18nName;
        /**
         * 任务关联的来源平台详情页链接
         * <p> 示例值：
         */
        private Href href;

        /**
         * 任务导入来源的名称，用于在任务中心详情页展示。需提供多语言版本。
         * <p> 示例值：
         *
         * @param platformI18nName
         * @return
         */
        public Builder platformI18nName(I18nText platformI18nName) {
            this.platformI18nName = platformI18nName;
            return this;
        }


        /**
         * 任务关联的来源平台详情页链接
         * <p> 示例值：
         *
         * @param href
         * @return
         */
        public Builder href(Href href) {
            this.href = href;
            return this;
        }


        public Origin build() {
            return new Origin(this);
        }
    }
}