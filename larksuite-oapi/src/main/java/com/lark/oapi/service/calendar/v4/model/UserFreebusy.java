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

package com.lark.oapi.service.calendar.v4.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.calendar.v4.enums.*;
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

public class UserFreebusy {
    /**
     * 日历上请求时间区间内的忙闲信息
     * <p> 示例值：
     */
    @SerializedName("freebusy_items")
    private Freebusy[] freebusyItems;
    /**
     * 日历的创建者userID
     * <p> 示例值：
     */
    @SerializedName("user_id")
    private String userId;

    // builder 开始
    public UserFreebusy() {
    }

    public UserFreebusy(Builder builder) {
        /**
         * 日历上请求时间区间内的忙闲信息
         * <p> 示例值：
         */
        this.freebusyItems = builder.freebusyItems;
        /**
         * 日历的创建者userID
         * <p> 示例值：
         */
        this.userId = builder.userId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Freebusy[] getFreebusyItems() {
        return this.freebusyItems;
    }

    public void setFreebusyItems(Freebusy[] freebusyItems) {
        this.freebusyItems = freebusyItems;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public static class Builder {
        /**
         * 日历上请求时间区间内的忙闲信息
         * <p> 示例值：
         */
        private Freebusy[] freebusyItems;
        /**
         * 日历的创建者userID
         * <p> 示例值：
         */
        private String userId;

        /**
         * 日历上请求时间区间内的忙闲信息
         * <p> 示例值：
         *
         * @param freebusyItems
         * @return
         */
        public Builder freebusyItems(Freebusy[] freebusyItems) {
            this.freebusyItems = freebusyItems;
            return this;
        }


        /**
         * 日历的创建者userID
         * <p> 示例值：
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        public UserFreebusy build() {
            return new UserFreebusy(this);
        }
    }
}