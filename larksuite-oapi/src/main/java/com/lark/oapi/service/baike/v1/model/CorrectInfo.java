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

package com.lark.oapi.service.baike.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.baike.v1.enums.*;
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

public class CorrectInfo {
    /**
     * 用户英文纠错数总数
     * <p> 示例值：
     */
    @SerializedName("correct_total")
    private Integer correctTotal;
    /**
     * 时间区间内每一天纠错数
     * <p> 示例值：
     */
    @SerializedName("eachday_correct")
    private Integer[] eachdayCorrect;
    /**
     * 语法错误相关统计信息
     * <p> 示例值：
     */
    @SerializedName("grammar_error")
    private CorrectError grammarError;
    /**
     * 拼写错误相关统计信息
     * <p> 示例值：
     */
    @SerializedName("spell_error")
    private CorrectError spellError;
    /**
     * 单复数错误相关统计信息
     * <p> 示例值：
     */
    @SerializedName("noun_error")
    private CorrectError nounError;
    /**
     * 时态错误相关统计信息
     * <p> 示例值：
     */
    @SerializedName("verb_tense_error")
    private CorrectError verbTenseError;

    // builder 开始
    public CorrectInfo() {
    }

    public CorrectInfo(Builder builder) {
        /**
         * 用户英文纠错数总数
         * <p> 示例值：
         */
        this.correctTotal = builder.correctTotal;
        /**
         * 时间区间内每一天纠错数
         * <p> 示例值：
         */
        this.eachdayCorrect = builder.eachdayCorrect;
        /**
         * 语法错误相关统计信息
         * <p> 示例值：
         */
        this.grammarError = builder.grammarError;
        /**
         * 拼写错误相关统计信息
         * <p> 示例值：
         */
        this.spellError = builder.spellError;
        /**
         * 单复数错误相关统计信息
         * <p> 示例值：
         */
        this.nounError = builder.nounError;
        /**
         * 时态错误相关统计信息
         * <p> 示例值：
         */
        this.verbTenseError = builder.verbTenseError;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getCorrectTotal() {
        return this.correctTotal;
    }

    public void setCorrectTotal(Integer correctTotal) {
        this.correctTotal = correctTotal;
    }

    public Integer[] getEachdayCorrect() {
        return this.eachdayCorrect;
    }

    public void setEachdayCorrect(Integer[] eachdayCorrect) {
        this.eachdayCorrect = eachdayCorrect;
    }

    public CorrectError getGrammarError() {
        return this.grammarError;
    }

    public void setGrammarError(CorrectError grammarError) {
        this.grammarError = grammarError;
    }

    public CorrectError getSpellError() {
        return this.spellError;
    }

    public void setSpellError(CorrectError spellError) {
        this.spellError = spellError;
    }

    public CorrectError getNounError() {
        return this.nounError;
    }

    public void setNounError(CorrectError nounError) {
        this.nounError = nounError;
    }

    public CorrectError getVerbTenseError() {
        return this.verbTenseError;
    }

    public void setVerbTenseError(CorrectError verbTenseError) {
        this.verbTenseError = verbTenseError;
    }

    public static class Builder {
        /**
         * 用户英文纠错数总数
         * <p> 示例值：
         */
        private Integer correctTotal;
        /**
         * 时间区间内每一天纠错数
         * <p> 示例值：
         */
        private Integer[] eachdayCorrect;
        /**
         * 语法错误相关统计信息
         * <p> 示例值：
         */
        private CorrectError grammarError;
        /**
         * 拼写错误相关统计信息
         * <p> 示例值：
         */
        private CorrectError spellError;
        /**
         * 单复数错误相关统计信息
         * <p> 示例值：
         */
        private CorrectError nounError;
        /**
         * 时态错误相关统计信息
         * <p> 示例值：
         */
        private CorrectError verbTenseError;

        /**
         * 用户英文纠错数总数
         * <p> 示例值：
         *
         * @param correctTotal
         * @return
         */
        public Builder correctTotal(Integer correctTotal) {
            this.correctTotal = correctTotal;
            return this;
        }


        /**
         * 时间区间内每一天纠错数
         * <p> 示例值：
         *
         * @param eachdayCorrect
         * @return
         */
        public Builder eachdayCorrect(Integer[] eachdayCorrect) {
            this.eachdayCorrect = eachdayCorrect;
            return this;
        }


        /**
         * 语法错误相关统计信息
         * <p> 示例值：
         *
         * @param grammarError
         * @return
         */
        public Builder grammarError(CorrectError grammarError) {
            this.grammarError = grammarError;
            return this;
        }


        /**
         * 拼写错误相关统计信息
         * <p> 示例值：
         *
         * @param spellError
         * @return
         */
        public Builder spellError(CorrectError spellError) {
            this.spellError = spellError;
            return this;
        }


        /**
         * 单复数错误相关统计信息
         * <p> 示例值：
         *
         * @param nounError
         * @return
         */
        public Builder nounError(CorrectError nounError) {
            this.nounError = nounError;
            return this;
        }


        /**
         * 时态错误相关统计信息
         * <p> 示例值：
         *
         * @param verbTenseError
         * @return
         */
        public Builder verbTenseError(CorrectError verbTenseError) {
            this.verbTenseError = verbTenseError;
            return this;
        }


        public CorrectInfo build() {
            return new CorrectInfo(this);
        }
    }
}
