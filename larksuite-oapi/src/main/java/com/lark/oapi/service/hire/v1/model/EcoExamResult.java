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

import com.google.gson.annotations.SerializedName;

public class EcoExamResult {
    /**
     * 笔试结果
     * <p> 示例值：60.5
     */
    @SerializedName("result")
    private String result;
    /**
     * 笔试结果时间
     * <p> 示例值：1658676234053
     */
    @SerializedName("result_time")
    private String resultTime;
    /**
     * 报告列表
     * <p> 示例值：
     */
    @SerializedName("report_list")
    private EcoExamResultReport[] reportList;
    /**
     * 详细评价结果
     * <p> 示例值：
     */
    @SerializedName("detail_list")
    private EcoExamResultDetail[] detailList;

    // builder 开始
    public EcoExamResult() {
    }

    public EcoExamResult(Builder builder) {
        /**
         * 笔试结果
         * <p> 示例值：60.5
         */
        this.result = builder.result;
        /**
         * 笔试结果时间
         * <p> 示例值：1658676234053
         */
        this.resultTime = builder.resultTime;
        /**
         * 报告列表
         * <p> 示例值：
         */
        this.reportList = builder.reportList;
        /**
         * 详细评价结果
         * <p> 示例值：
         */
        this.detailList = builder.detailList;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResultTime() {
        return this.resultTime;
    }

    public void setResultTime(String resultTime) {
        this.resultTime = resultTime;
    }

    public EcoExamResultReport[] getReportList() {
        return this.reportList;
    }

    public void setReportList(EcoExamResultReport[] reportList) {
        this.reportList = reportList;
    }

    public EcoExamResultDetail[] getDetailList() {
        return this.detailList;
    }

    public void setDetailList(EcoExamResultDetail[] detailList) {
        this.detailList = detailList;
    }

    public static class Builder {
        /**
         * 笔试结果
         * <p> 示例值：60.5
         */
        private String result;
        /**
         * 笔试结果时间
         * <p> 示例值：1658676234053
         */
        private String resultTime;
        /**
         * 报告列表
         * <p> 示例值：
         */
        private EcoExamResultReport[] reportList;
        /**
         * 详细评价结果
         * <p> 示例值：
         */
        private EcoExamResultDetail[] detailList;

        /**
         * 笔试结果
         * <p> 示例值：60.5
         *
         * @param result
         * @return
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }


        /**
         * 笔试结果时间
         * <p> 示例值：1658676234053
         *
         * @param resultTime
         * @return
         */
        public Builder resultTime(String resultTime) {
            this.resultTime = resultTime;
            return this;
        }


        /**
         * 报告列表
         * <p> 示例值：
         *
         * @param reportList
         * @return
         */
        public Builder reportList(EcoExamResultReport[] reportList) {
            this.reportList = reportList;
            return this;
        }


        /**
         * 详细评价结果
         * <p> 示例值：
         *
         * @param detailList
         * @return
         */
        public Builder detailList(EcoExamResultDetail[] detailList) {
            this.detailList = detailList;
            return this;
        }


        public EcoExamResult build() {
            return new EcoExamResult(this);
        }
    }
}