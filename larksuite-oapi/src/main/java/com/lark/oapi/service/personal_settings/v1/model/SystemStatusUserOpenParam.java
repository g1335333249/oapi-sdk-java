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

package com.lark.oapi.service.personal_settings.v1.model;

import com.google.gson.annotations.SerializedName;

public class SystemStatusUserOpenParam {
    /**
     * 用户ID
     * <p> 示例值：ou_53edd3282dbc2fdbe5c593cfa5ce82ab
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 结束时间，传入的应为秒单位的时间戳，距当前的时间跨度不能超过365天。
     * <p> 示例值：1665990378
     */
    @SerializedName("end_time")
    private String endTime;

    // builder 开始
    public SystemStatusUserOpenParam() {
    }

    public SystemStatusUserOpenParam(Builder builder) {
        /**
         * 用户ID
         * <p> 示例值：ou_53edd3282dbc2fdbe5c593cfa5ce82ab
         */
        this.userId = builder.userId;
        /**
         * 结束时间，传入的应为秒单位的时间戳，距当前的时间跨度不能超过365天。
         * <p> 示例值：1665990378
         */
        this.endTime = builder.endTime;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public static class Builder {
        /**
         * 用户ID
         * <p> 示例值：ou_53edd3282dbc2fdbe5c593cfa5ce82ab
         */
        private String userId;
        /**
         * 结束时间，传入的应为秒单位的时间戳，距当前的时间跨度不能超过365天。
         * <p> 示例值：1665990378
         */
        private String endTime;

        /**
         * 用户ID
         * <p> 示例值：ou_53edd3282dbc2fdbe5c593cfa5ce82ab
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 结束时间，传入的应为秒单位的时间戳，距当前的时间跨度不能超过365天。
         * <p> 示例值：1665990378
         *
         * @param endTime
         * @return
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }


        public SystemStatusUserOpenParam build() {
            return new SystemStatusUserOpenParam(this);
        }
    }
}