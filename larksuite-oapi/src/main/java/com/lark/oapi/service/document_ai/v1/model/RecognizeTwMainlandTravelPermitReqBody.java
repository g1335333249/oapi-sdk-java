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

package com.lark.oapi.service.document_ai.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.document_ai.v1.enums.*;
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

public class RecognizeTwMainlandTravelPermitReqBody {
    /**
     * 识别的台湾居民来往大陆通行证源文件
     * <p> 示例值：
     */
    @SerializedName("file")
    private java.io.File file;

    // builder 开始
    public RecognizeTwMainlandTravelPermitReqBody() {
    }

    public RecognizeTwMainlandTravelPermitReqBody(Builder builder) {
        /**
         * 识别的台湾居民来往大陆通行证源文件
         * <p> 示例值：
         */
        this.file = builder.file;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public java.io.File getFile() {
        return this.file;
    }

    public void setFile(java.io.File file) {
        this.file = file;
    }

    public static class Builder {
        /**
         * 识别的台湾居民来往大陆通行证源文件
         * <p> 示例值：
         */
        private java.io.File file;

        /**
         * 识别的台湾居民来往大陆通行证源文件
         * <p> 示例值：
         *
         * @param file
         * @return
         */
        public Builder file(java.io.File file) {
            this.file = file;
            return this;
        }


        public RecognizeTwMainlandTravelPermitReqBody build() {
            return new RecognizeTwMainlandTravelPermitReqBody(this);
        }
    }
}
