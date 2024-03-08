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

public class ProfileSettingCostCenter {
    /**
     * 100
     * <p> 示例值：6950635856373745165
     */
    @SerializedName("id")
    private String id;
    /**
     * 分摊比例
     * <p> 示例值：100
     */
    @SerializedName("rate")
    private Integer rate;

    // builder 开始
    public ProfileSettingCostCenter() {
    }

    public ProfileSettingCostCenter(Builder builder) {
        /**
         * 100
         * <p> 示例值：6950635856373745165
         */
        this.id = builder.id;
        /**
         * 分摊比例
         * <p> 示例值：100
         */
        this.rate = builder.rate;
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

    public Integer getRate() {
        return this.rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public static class Builder {
        /**
         * 100
         * <p> 示例值：6950635856373745165
         */
        private String id;
        /**
         * 分摊比例
         * <p> 示例值：100
         */
        private Integer rate;

        /**
         * 100
         * <p> 示例值：6950635856373745165
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 分摊比例
         * <p> 示例值：100
         *
         * @param rate
         * @return
         */
        public Builder rate(Integer rate) {
            this.rate = rate;
            return this;
        }


        public ProfileSettingCostCenter build() {
            return new ProfileSettingCostCenter(this);
        }
    }
}
