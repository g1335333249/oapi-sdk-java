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

public class WebsiteDeliveryAward {
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("customized_data")
    private WebsiteDeliveryCustomizedData[] customizedData;
    /**
     * 描述
     * <p> 示例值：ACM国际大学生程序设计竞赛
     */
    @SerializedName("desc")
    private String desc;
    /**
     * 奖项名称
     * <p> 示例值：ACM 亚洲区金牌
     */
    @SerializedName("title")
    private String title;
    /**
     * 获奖时间
     * <p> 示例值：1609430400
     */
    @SerializedName("award_time")
    private Integer awardTime;

    // builder 开始
    public WebsiteDeliveryAward() {
    }

    public WebsiteDeliveryAward(Builder builder) {
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customizedData = builder.customizedData;
        /**
         * 描述
         * <p> 示例值：ACM国际大学生程序设计竞赛
         */
        this.desc = builder.desc;
        /**
         * 奖项名称
         * <p> 示例值：ACM 亚洲区金牌
         */
        this.title = builder.title;
        /**
         * 获奖时间
         * <p> 示例值：1609430400
         */
        this.awardTime = builder.awardTime;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public WebsiteDeliveryCustomizedData[] getCustomizedData() {
        return this.customizedData;
    }

    public void setCustomizedData(WebsiteDeliveryCustomizedData[] customizedData) {
        this.customizedData = customizedData;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getAwardTime() {
        return this.awardTime;
    }

    public void setAwardTime(Integer awardTime) {
        this.awardTime = awardTime;
    }

    public static class Builder {
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private WebsiteDeliveryCustomizedData[] customizedData;
        /**
         * 描述
         * <p> 示例值：ACM国际大学生程序设计竞赛
         */
        private String desc;
        /**
         * 奖项名称
         * <p> 示例值：ACM 亚洲区金牌
         */
        private String title;
        /**
         * 获奖时间
         * <p> 示例值：1609430400
         */
        private Integer awardTime;

        /**
         * 自定义字段
         * <p> 示例值：
         *
         * @param customizedData
         * @return
         */
        public Builder customizedData(WebsiteDeliveryCustomizedData[] customizedData) {
            this.customizedData = customizedData;
            return this;
        }


        /**
         * 描述
         * <p> 示例值：ACM国际大学生程序设计竞赛
         *
         * @param desc
         * @return
         */
        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }


        /**
         * 奖项名称
         * <p> 示例值：ACM 亚洲区金牌
         *
         * @param title
         * @return
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }


        /**
         * 获奖时间
         * <p> 示例值：1609430400
         *
         * @param awardTime
         * @return
         */
        public Builder awardTime(Integer awardTime) {
            this.awardTime = awardTime;
            return this;
        }


        public WebsiteDeliveryAward build() {
            return new WebsiteDeliveryAward(this);
        }
    }
}
