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

public class BankInfo {
    /**
     * 甲乙方信息类型
     * <p> 示例值：buy
     */
    @SerializedName("bank_type")
    private String bankType;
    /**
     * 值
     * <p> 示例值：value
     */
    @SerializedName("value")
    private BankEntity value;

    // builder 开始
    public BankInfo() {
    }

    public BankInfo(Builder builder) {
        /**
         * 甲乙方信息类型
         * <p> 示例值：buy
         */
        this.bankType = builder.bankType;
        /**
         * 值
         * <p> 示例值：value
         */
        this.value = builder.value;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getBankType() {
        return this.bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public BankEntity getValue() {
        return this.value;
    }

    public void setValue(BankEntity value) {
        this.value = value;
    }

    public static class Builder {
        /**
         * 甲乙方信息类型
         * <p> 示例值：buy
         */
        private String bankType;
        /**
         * 值
         * <p> 示例值：value
         */
        private BankEntity value;

        /**
         * 甲乙方信息类型
         * <p> 示例值：buy
         *
         * @param bankType
         * @return
         */
        public Builder bankType(String bankType) {
            this.bankType = bankType;
            return this;
        }

        /**
         * 甲乙方信息类型
         * <p> 示例值：buy
         *
         * @param bankType {@link com.lark.oapi.service.document_ai.v1.enums.BankInfoBankTypeEnum}
         * @return
         */
        public Builder bankType(com.lark.oapi.service.document_ai.v1.enums.BankInfoBankTypeEnum bankType) {
            this.bankType = bankType.getValue();
            return this;
        }


        /**
         * 值
         * <p> 示例值：value
         *
         * @param value
         * @return
         */
        public Builder value(BankEntity value) {
            this.value = value;
            return this;
        }


        public BankInfo build() {
            return new BankInfo(this);
        }
    }
}