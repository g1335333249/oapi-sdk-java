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

package com.lark.oapi.service.acs.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.acs.v1.enums.*;
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

public class User {
    /**
     * 用户特征
     * <p> 示例值：
     */
    @SerializedName("feature")
    private Feature feature;
    /**
     * 用户 ID
     * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
     */
    @SerializedName("user_id")
    private String userId;

    // builder 开始
    public User() {
    }

    public User(Builder builder) {
        /**
         * 用户特征
         * <p> 示例值：
         */
        this.feature = builder.feature;
        /**
         * 用户 ID
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         */
        this.userId = builder.userId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Feature getFeature() {
        return this.feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public static class Builder {
        /**
         * 用户特征
         * <p> 示例值：
         */
        private Feature feature;
        /**
         * 用户 ID
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         */
        private String userId;

        /**
         * 用户特征
         * <p> 示例值：
         *
         * @param feature
         * @return
         */
        public Builder feature(Feature feature) {
            this.feature = feature;
            return this;
        }


        /**
         * 用户 ID
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        public User build() {
            return new User(this);
        }
    }
}
