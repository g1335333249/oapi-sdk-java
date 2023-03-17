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

package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class ListNotifyStatus {
    /**
     * 用户id
     * <p> 示例值：
     */
    @SerializedName("user_id")
    private UserId userId;
    /**
     * 加急状态类型
     * <p> 示例值：
     */
    @SerializedName("notify_status_type")
    private String notifyStatusType;

    // builder 开始
    public ListNotifyStatus() {
    }

    public ListNotifyStatus(Builder builder) {
        /**
         * 用户id
         * <p> 示例值：
         */
        this.userId = builder.userId;
        /**
         * 加急状态类型
         * <p> 示例值：
         */
        this.notifyStatusType = builder.notifyStatusType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public UserId getUserId() {
        return this.userId;
    }

    public void setUserId(UserId userId) {
        this.userId = userId;
    }

    public String getNotifyStatusType() {
        return this.notifyStatusType;
    }

    public void setNotifyStatusType(String notifyStatusType) {
        this.notifyStatusType = notifyStatusType;
    }

    public static class Builder {
        /**
         * 用户id
         * <p> 示例值：
         */
        private UserId userId;
        /**
         * 加急状态类型
         * <p> 示例值：
         */
        private String notifyStatusType;

        /**
         * 用户id
         * <p> 示例值：
         *
         * @param userId
         * @return
         */
        public Builder userId(UserId userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 加急状态类型
         * <p> 示例值：
         *
         * @param notifyStatusType
         * @return
         */
        public Builder notifyStatusType(String notifyStatusType) {
            this.notifyStatusType = notifyStatusType;
            return this;
        }

        /**
         * 加急状态类型
         * <p> 示例值：
         *
         * @param notifyStatusType {@link com.lark.oapi.service.im.v1.enums.ListNotifyStatusNotifyStatusTypeEnum}
         * @return
         */
        public Builder notifyStatusType(com.lark.oapi.service.im.v1.enums.ListNotifyStatusNotifyStatusTypeEnum notifyStatusType) {
            this.notifyStatusType = notifyStatusType.getValue();
            return this;
        }


        public ListNotifyStatus build() {
            return new ListNotifyStatus(this);
        }
    }
}