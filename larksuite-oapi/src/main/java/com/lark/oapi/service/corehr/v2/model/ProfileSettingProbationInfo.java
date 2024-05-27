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

public class ProfileSettingProbationInfo {
    /**
     * 试用期开始日期
     * <p> 示例值：2021-01-01
     */
    @SerializedName("probation_start_date")
    private String probationStartDate;
    /**
     * 试用期预计结束日期
     * <p> 示例值：2021-02-01
     */
    @SerializedName("probation_expected_end_date")
    private String probationExpectedEndDate;
    /**
     * 试用期实际结束日期
     * <p> 示例值：2021-02-01
     */
    @SerializedName("actual_probation_end_date")
    private String actualProbationEndDate;

    // builder 开始
    public ProfileSettingProbationInfo() {
    }

    public ProfileSettingProbationInfo(Builder builder) {
        /**
         * 试用期开始日期
         * <p> 示例值：2021-01-01
         */
        this.probationStartDate = builder.probationStartDate;
        /**
         * 试用期预计结束日期
         * <p> 示例值：2021-02-01
         */
        this.probationExpectedEndDate = builder.probationExpectedEndDate;
        /**
         * 试用期实际结束日期
         * <p> 示例值：2021-02-01
         */
        this.actualProbationEndDate = builder.actualProbationEndDate;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getProbationStartDate() {
        return this.probationStartDate;
    }

    public void setProbationStartDate(String probationStartDate) {
        this.probationStartDate = probationStartDate;
    }

    public String getProbationExpectedEndDate() {
        return this.probationExpectedEndDate;
    }

    public void setProbationExpectedEndDate(String probationExpectedEndDate) {
        this.probationExpectedEndDate = probationExpectedEndDate;
    }

    public String getActualProbationEndDate() {
        return this.actualProbationEndDate;
    }

    public void setActualProbationEndDate(String actualProbationEndDate) {
        this.actualProbationEndDate = actualProbationEndDate;
    }

    public static class Builder {
        /**
         * 试用期开始日期
         * <p> 示例值：2021-01-01
         */
        private String probationStartDate;
        /**
         * 试用期预计结束日期
         * <p> 示例值：2021-02-01
         */
        private String probationExpectedEndDate;
        /**
         * 试用期实际结束日期
         * <p> 示例值：2021-02-01
         */
        private String actualProbationEndDate;

        /**
         * 试用期开始日期
         * <p> 示例值：2021-01-01
         *
         * @param probationStartDate
         * @return
         */
        public Builder probationStartDate(String probationStartDate) {
            this.probationStartDate = probationStartDate;
            return this;
        }


        /**
         * 试用期预计结束日期
         * <p> 示例值：2021-02-01
         *
         * @param probationExpectedEndDate
         * @return
         */
        public Builder probationExpectedEndDate(String probationExpectedEndDate) {
            this.probationExpectedEndDate = probationExpectedEndDate;
            return this;
        }


        /**
         * 试用期实际结束日期
         * <p> 示例值：2021-02-01
         *
         * @param actualProbationEndDate
         * @return
         */
        public Builder actualProbationEndDate(String actualProbationEndDate) {
            this.actualProbationEndDate = actualProbationEndDate;
            return this;
        }


        public ProfileSettingProbationInfo build() {
            return new ProfileSettingProbationInfo(this);
        }
    }
}