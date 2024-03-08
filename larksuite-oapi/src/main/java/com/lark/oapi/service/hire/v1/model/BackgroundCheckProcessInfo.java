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

public class BackgroundCheckProcessInfo {
    /**
     * 背调进度
     * <p> 示例值：待安排
     */
    @SerializedName("process")
    private String process;
    /**
     * 进度更新时间
     * <p> 示例值：1638359554952
     */
    @SerializedName("update_time")
    private String updateTime;

    // builder 开始
    public BackgroundCheckProcessInfo() {
    }

    public BackgroundCheckProcessInfo(Builder builder) {
        /**
         * 背调进度
         * <p> 示例值：待安排
         */
        this.process = builder.process;
        /**
         * 进度更新时间
         * <p> 示例值：1638359554952
         */
        this.updateTime = builder.updateTime;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getProcess() {
        return this.process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public static class Builder {
        /**
         * 背调进度
         * <p> 示例值：待安排
         */
        private String process;
        /**
         * 进度更新时间
         * <p> 示例值：1638359554952
         */
        private String updateTime;

        /**
         * 背调进度
         * <p> 示例值：待安排
         *
         * @param process
         * @return
         */
        public Builder process(String process) {
            this.process = process;
            return this;
        }


        /**
         * 进度更新时间
         * <p> 示例值：1638359554952
         *
         * @param updateTime
         * @return
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }


        public BackgroundCheckProcessInfo build() {
            return new BackgroundCheckProcessInfo(this);
        }
    }
}
