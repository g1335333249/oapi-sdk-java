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

package com.lark.oapi.service.lingo.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.lingo.v1.enums.*;
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

public class Span {
    /**
     * 偏移量开始位置，从 0 开始计数（编码格式采用 utf-8）
     * <p> 示例值：0
     */
    @SerializedName("start")
    private Integer start;
    /**
     * 偏移量结束位置，从 0 开始计数（编码格式采用 utf-8）
     * <p> 示例值：4
     */
    @SerializedName("end")
    private Integer end;

    // builder 开始
    public Span() {
    }

    public Span(Builder builder) {
        /**
         * 偏移量开始位置，从 0 开始计数（编码格式采用 utf-8）
         * <p> 示例值：0
         */
        this.start = builder.start;
        /**
         * 偏移量结束位置，从 0 开始计数（编码格式采用 utf-8）
         * <p> 示例值：4
         */
        this.end = builder.end;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getStart() {
        return this.start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return this.end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public static class Builder {
        /**
         * 偏移量开始位置，从 0 开始计数（编码格式采用 utf-8）
         * <p> 示例值：0
         */
        private Integer start;
        /**
         * 偏移量结束位置，从 0 开始计数（编码格式采用 utf-8）
         * <p> 示例值：4
         */
        private Integer end;

        /**
         * 偏移量开始位置，从 0 开始计数（编码格式采用 utf-8）
         * <p> 示例值：0
         *
         * @param start
         * @return
         */
        public Builder start(Integer start) {
            this.start = start;
            return this;
        }


        /**
         * 偏移量结束位置，从 0 开始计数（编码格式采用 utf-8）
         * <p> 示例值：4
         *
         * @param end
         * @return
         */
        public Builder end(Integer end) {
            this.end = end;
            return this;
        }


        public Span build() {
            return new Span(this);
        }
    }
}