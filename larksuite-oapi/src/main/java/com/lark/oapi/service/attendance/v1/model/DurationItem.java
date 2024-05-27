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

package com.lark.oapi.service.attendance.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.attendance.v1.enums.*;
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

public class DurationItem {
    /**
     * 日期
     * <p> 示例值：20231010
     */
    @SerializedName("date")
    private String date;
    /**
     * 加班时长
     * <p> 示例值：20.0
     */
    @SerializedName("duration")
    private Double duration;
    /**
     * 加班单位
     * <p> 示例值：1
     */
    @SerializedName("unit")
    private Integer unit;
    /**
     * 加班类型
     * <p> 示例值：1
     */
    @SerializedName("settlement_type")
    private Integer settlementType;

    // builder 开始
    public DurationItem() {
    }

    public DurationItem(Builder builder) {
        /**
         * 日期
         * <p> 示例值：20231010
         */
        this.date = builder.date;
        /**
         * 加班时长
         * <p> 示例值：20.0
         */
        this.duration = builder.duration;
        /**
         * 加班单位
         * <p> 示例值：1
         */
        this.unit = builder.unit;
        /**
         * 加班类型
         * <p> 示例值：1
         */
        this.settlementType = builder.settlementType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getDuration() {
        return this.duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Integer getUnit() {
        return this.unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Integer getSettlementType() {
        return this.settlementType;
    }

    public void setSettlementType(Integer settlementType) {
        this.settlementType = settlementType;
    }

    public static class Builder {
        /**
         * 日期
         * <p> 示例值：20231010
         */
        private String date;
        /**
         * 加班时长
         * <p> 示例值：20.0
         */
        private Double duration;
        /**
         * 加班单位
         * <p> 示例值：1
         */
        private Integer unit;
        /**
         * 加班类型
         * <p> 示例值：1
         */
        private Integer settlementType;

        /**
         * 日期
         * <p> 示例值：20231010
         *
         * @param date
         * @return
         */
        public Builder date(String date) {
            this.date = date;
            return this;
        }


        /**
         * 加班时长
         * <p> 示例值：20.0
         *
         * @param duration
         * @return
         */
        public Builder duration(Double duration) {
            this.duration = duration;
            return this;
        }


        /**
         * 加班单位
         * <p> 示例值：1
         *
         * @param unit
         * @return
         */
        public Builder unit(Integer unit) {
            this.unit = unit;
            return this;
        }

        /**
         * 加班单位
         * <p> 示例值：1
         *
         * @param unit {@link com.lark.oapi.service.attendance.v1.enums.DurationItemOvertimeUnitEnum}
         * @return
         */
        public Builder unit(com.lark.oapi.service.attendance.v1.enums.DurationItemOvertimeUnitEnum unit) {
            this.unit = unit.getValue();
            return this;
        }


        /**
         * 加班类型
         * <p> 示例值：1
         *
         * @param settlementType
         * @return
         */
        public Builder settlementType(Integer settlementType) {
            this.settlementType = settlementType;
            return this;
        }

        /**
         * 加班类型
         * <p> 示例值：1
         *
         * @param settlementType {@link com.lark.oapi.service.attendance.v1.enums.DurationItemSettleTypeEnumEnum}
         * @return
         */
        public Builder settlementType(com.lark.oapi.service.attendance.v1.enums.DurationItemSettleTypeEnumEnum settlementType) {
            this.settlementType = settlementType.getValue();
            return this;
        }


        public DurationItem build() {
            return new DurationItem(this);
        }
    }
}