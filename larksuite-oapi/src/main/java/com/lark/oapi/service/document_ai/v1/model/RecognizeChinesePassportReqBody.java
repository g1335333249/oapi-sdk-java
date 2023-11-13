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

import com.google.gson.annotations.SerializedName;

public class RecognizeChinesePassportReqBody {
    /**
     * 识别的中国护照源文件
     * <p> 示例值：
     */
    @SerializedName("file")
    private java.io.File file;

    // builder 开始
    public RecognizeChinesePassportReqBody() {
    }

    public RecognizeChinesePassportReqBody(Builder builder) {
        /**
         * 识别的中国护照源文件
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
         * 识别的中国护照源文件
         * <p> 示例值：
         */
        private java.io.File file;

        /**
         * 识别的中国护照源文件
         * <p> 示例值：
         *
         * @param file
         * @return
         */
        public Builder file(java.io.File file) {
            this.file = file;
            return this;
        }


        public RecognizeChinesePassportReqBody build() {
            return new RecognizeChinesePassportReqBody(this);
        }
    }
}
