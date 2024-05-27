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

public class SignatureTemplateFilterItem {
    /**
     * 左值
     * <p> 示例值：aa
     */
    @SerializedName("left")
    private String left;
    /**
     * 右值列表
     * <p> 示例值：
     */
    @SerializedName("rights")
    private String[] rights;
    /**
     * 操作符
     * <p> 示例值：
     */
    @SerializedName("op")
    private Enum op;

    // builder 开始
    public SignatureTemplateFilterItem() {
    }

    public SignatureTemplateFilterItem(Builder builder) {
        /**
         * 左值
         * <p> 示例值：aa
         */
        this.left = builder.left;
        /**
         * 右值列表
         * <p> 示例值：
         */
        this.rights = builder.rights;
        /**
         * 操作符
         * <p> 示例值：
         */
        this.op = builder.op;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getLeft() {
        return this.left;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public String[] getRights() {
        return this.rights;
    }

    public void setRights(String[] rights) {
        this.rights = rights;
    }

    public Enum getOp() {
        return this.op;
    }

    public void setOp(Enum op) {
        this.op = op;
    }

    public static class Builder {
        /**
         * 左值
         * <p> 示例值：aa
         */
        private String left;
        /**
         * 右值列表
         * <p> 示例值：
         */
        private String[] rights;
        /**
         * 操作符
         * <p> 示例值：
         */
        private Enum op;

        /**
         * 左值
         * <p> 示例值：aa
         *
         * @param left
         * @return
         */
        public Builder left(String left) {
            this.left = left;
            return this;
        }


        /**
         * 右值列表
         * <p> 示例值：
         *
         * @param rights
         * @return
         */
        public Builder rights(String[] rights) {
            this.rights = rights;
            return this;
        }


        /**
         * 操作符
         * <p> 示例值：
         *
         * @param op
         * @return
         */
        public Builder op(Enum op) {
            this.op = op;
            return this;
        }


        public SignatureTemplateFilterItem build() {
            return new SignatureTemplateFilterItem(this);
        }
    }
}