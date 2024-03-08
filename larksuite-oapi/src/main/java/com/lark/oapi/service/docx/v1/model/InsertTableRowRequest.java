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

package com.lark.oapi.service.docx.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.docx.v1.enums.*;
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

public class InsertTableRowRequest {
    /**
     * 插入的行在表格中的索引。（-1表示在表格末尾插入一行）
     * <p> 示例值：-1
     */
    @SerializedName("row_index")
    private Integer rowIndex;

    // builder 开始
    public InsertTableRowRequest() {
    }

    public InsertTableRowRequest(Builder builder) {
        /**
         * 插入的行在表格中的索引。（-1表示在表格末尾插入一行）
         * <p> 示例值：-1
         */
        this.rowIndex = builder.rowIndex;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getRowIndex() {
        return this.rowIndex;
    }

    public void setRowIndex(Integer rowIndex) {
        this.rowIndex = rowIndex;
    }

    public static class Builder {
        /**
         * 插入的行在表格中的索引。（-1表示在表格末尾插入一行）
         * <p> 示例值：-1
         */
        private Integer rowIndex;

        /**
         * 插入的行在表格中的索引。（-1表示在表格末尾插入一行）
         * <p> 示例值：-1
         *
         * @param rowIndex
         * @return
         */
        public Builder rowIndex(Integer rowIndex) {
            this.rowIndex = rowIndex;
            return this;
        }


        public InsertTableRowRequest build() {
            return new InsertTableRowRequest(this);
        }
    }
}
