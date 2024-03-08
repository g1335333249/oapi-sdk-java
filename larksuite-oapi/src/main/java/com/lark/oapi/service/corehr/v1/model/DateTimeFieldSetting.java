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

package com.lark.oapi.service.corehr.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v1.enums.*;
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

public class DateTimeFieldSetting {
    /**
     * 时间类型枚举，枚举值如下：;1. Date 日期，如 2020-01-01;2. Time  时间，如 11:52:00;3. Datetime 日期时间，如 2020-01-01 11:52:00;4. CusDatetime // timestamp 时间戳
     * <p> 示例值：1
     */
    @SerializedName("date_time_type")
    private Integer dateTimeType;

    // builder 开始
    public DateTimeFieldSetting() {
    }

    public DateTimeFieldSetting(Builder builder) {
        /**
         * 时间类型枚举，枚举值如下：;1. Date 日期，如 2020-01-01;2. Time  时间，如 11:52:00;3. Datetime 日期时间，如 2020-01-01 11:52:00;4. CusDatetime // timestamp 时间戳
         * <p> 示例值：1
         */
        this.dateTimeType = builder.dateTimeType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getDateTimeType() {
        return this.dateTimeType;
    }

    public void setDateTimeType(Integer dateTimeType) {
        this.dateTimeType = dateTimeType;
    }

    public static class Builder {
        /**
         * 时间类型枚举，枚举值如下：;1. Date 日期，如 2020-01-01;2. Time  时间，如 11:52:00;3. Datetime 日期时间，如 2020-01-01 11:52:00;4. CusDatetime // timestamp 时间戳
         * <p> 示例值：1
         */
        private Integer dateTimeType;

        /**
         * 时间类型枚举，枚举值如下：;1. Date 日期，如 2020-01-01;2. Time  时间，如 11:52:00;3. Datetime 日期时间，如 2020-01-01 11:52:00;4. CusDatetime // timestamp 时间戳
         * <p> 示例值：1
         *
         * @param dateTimeType
         * @return
         */
        public Builder dateTimeType(Integer dateTimeType) {
            this.dateTimeType = dateTimeType;
            return this;
        }


        public DateTimeFieldSetting build() {
            return new DateTimeFieldSetting(this);
        }
    }
}
