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

package com.lark.oapi.service.hire.v1.model;

import com.lark.oapi.core.response.EmptyData;
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

public class WebsiteDeliveryCustomizedDataParent {
    /**
     * 自定义字段 ID
     * <p> 示例值：6960663240925956651
     */
    @SerializedName("object_id")
    private String objectId;
    /**
     * 模块下的字段
     * <p> 示例值：
     */
    @SerializedName("children")
    private WebsiteDeliveryCustomizedData[] children;

    // builder 开始
    public WebsiteDeliveryCustomizedDataParent() {
    }

    public WebsiteDeliveryCustomizedDataParent(Builder builder) {
        /**
         * 自定义字段 ID
         * <p> 示例值：6960663240925956651
         */
        this.objectId = builder.objectId;
        /**
         * 模块下的字段
         * <p> 示例值：
         */
        this.children = builder.children;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getObjectId() {
        return this.objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public WebsiteDeliveryCustomizedData[] getChildren() {
        return this.children;
    }

    public void setChildren(WebsiteDeliveryCustomizedData[] children) {
        this.children = children;
    }

    public static class Builder {
        /**
         * 自定义字段 ID
         * <p> 示例值：6960663240925956651
         */
        private String objectId;
        /**
         * 模块下的字段
         * <p> 示例值：
         */
        private WebsiteDeliveryCustomizedData[] children;

        /**
         * 自定义字段 ID
         * <p> 示例值：6960663240925956651
         *
         * @param objectId
         * @return
         */
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }


        /**
         * 模块下的字段
         * <p> 示例值：
         *
         * @param children
         * @return
         */
        public Builder children(WebsiteDeliveryCustomizedData[] children) {
            this.children = children;
            return this;
        }


        public WebsiteDeliveryCustomizedDataParent build() {
            return new WebsiteDeliveryCustomizedDataParent(this);
        }
    }
}
