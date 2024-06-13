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

package com.lark.oapi.service.compensation.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.compensation.v1.enums.*;
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

public class ArchiveIndicator {
    /**
     * 薪资统计指标ID，详细信息可以通过[批量查询薪资统计指标](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/indicator/list)接口查询获得
     * <p> 示例值：23141423
     */
    @SerializedName("indicator_id")
    private String indicatorId;
    /**
     * 档案关联薪资统计指标数值
     * <p> 示例值：15000
     */
    @SerializedName("indicator_result")
    private String indicatorResult;
    /**
     * 档案关联薪资统计指标转正后数值
     * <p> 示例值：18000
     */
    @SerializedName("indicator_result_regular")
    private String indicatorResultRegular;

    // builder 开始
    public ArchiveIndicator() {
    }

    public ArchiveIndicator(Builder builder) {
        /**
         * 薪资统计指标ID，详细信息可以通过[批量查询薪资统计指标](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/indicator/list)接口查询获得
         * <p> 示例值：23141423
         */
        this.indicatorId = builder.indicatorId;
        /**
         * 档案关联薪资统计指标数值
         * <p> 示例值：15000
         */
        this.indicatorResult = builder.indicatorResult;
        /**
         * 档案关联薪资统计指标转正后数值
         * <p> 示例值：18000
         */
        this.indicatorResultRegular = builder.indicatorResultRegular;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getIndicatorId() {
        return this.indicatorId;
    }

    public void setIndicatorId(String indicatorId) {
        this.indicatorId = indicatorId;
    }

    public String getIndicatorResult() {
        return this.indicatorResult;
    }

    public void setIndicatorResult(String indicatorResult) {
        this.indicatorResult = indicatorResult;
    }

    public String getIndicatorResultRegular() {
        return this.indicatorResultRegular;
    }

    public void setIndicatorResultRegular(String indicatorResultRegular) {
        this.indicatorResultRegular = indicatorResultRegular;
    }

    public static class Builder {
        /**
         * 薪资统计指标ID，详细信息可以通过[批量查询薪资统计指标](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/indicator/list)接口查询获得
         * <p> 示例值：23141423
         */
        private String indicatorId;
        /**
         * 档案关联薪资统计指标数值
         * <p> 示例值：15000
         */
        private String indicatorResult;
        /**
         * 档案关联薪资统计指标转正后数值
         * <p> 示例值：18000
         */
        private String indicatorResultRegular;

        /**
         * 薪资统计指标ID，详细信息可以通过[批量查询薪资统计指标](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/indicator/list)接口查询获得
         * <p> 示例值：23141423
         *
         * @param indicatorId
         * @return
         */
        public Builder indicatorId(String indicatorId) {
            this.indicatorId = indicatorId;
            return this;
        }


        /**
         * 档案关联薪资统计指标数值
         * <p> 示例值：15000
         *
         * @param indicatorResult
         * @return
         */
        public Builder indicatorResult(String indicatorResult) {
            this.indicatorResult = indicatorResult;
            return this;
        }


        /**
         * 档案关联薪资统计指标转正后数值
         * <p> 示例值：18000
         *
         * @param indicatorResultRegular
         * @return
         */
        public Builder indicatorResultRegular(String indicatorResultRegular) {
            this.indicatorResultRegular = indicatorResultRegular;
            return this;
        }


        public ArchiveIndicator build() {
            return new ArchiveIndicator(this);
        }
    }
}