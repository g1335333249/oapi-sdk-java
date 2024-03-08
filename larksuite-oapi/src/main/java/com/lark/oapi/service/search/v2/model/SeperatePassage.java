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

package com.lark.oapi.service.search.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.search.v2.enums.*;
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

public class SeperatePassage {
    /**
     * passage_id
     * <p> 示例值：6953165194634772508
     */
    @SerializedName("passage_id")
    private String passageId;
    /**
     * obj_id
     * <p> 示例值：6953165194634772508
     */
    @SerializedName("obj_id")
    private String objId;
    /**
     * 内容
     * <p> 示例值：这是一段passage
     */
    @SerializedName("content")
    private String content;
    /**
     * passage的token数量
     * <p> 示例值：12
     */
    @SerializedName("num_tokens")
    private Integer numTokens;

    // builder 开始
    public SeperatePassage() {
    }

    public SeperatePassage(Builder builder) {
        /**
         * passage_id
         * <p> 示例值：6953165194634772508
         */
        this.passageId = builder.passageId;
        /**
         * obj_id
         * <p> 示例值：6953165194634772508
         */
        this.objId = builder.objId;
        /**
         * 内容
         * <p> 示例值：这是一段passage
         */
        this.content = builder.content;
        /**
         * passage的token数量
         * <p> 示例值：12
         */
        this.numTokens = builder.numTokens;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getPassageId() {
        return this.passageId;
    }

    public void setPassageId(String passageId) {
        this.passageId = passageId;
    }

    public String getObjId() {
        return this.objId;
    }

    public void setObjId(String objId) {
        this.objId = objId;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getNumTokens() {
        return this.numTokens;
    }

    public void setNumTokens(Integer numTokens) {
        this.numTokens = numTokens;
    }

    public static class Builder {
        /**
         * passage_id
         * <p> 示例值：6953165194634772508
         */
        private String passageId;
        /**
         * obj_id
         * <p> 示例值：6953165194634772508
         */
        private String objId;
        /**
         * 内容
         * <p> 示例值：这是一段passage
         */
        private String content;
        /**
         * passage的token数量
         * <p> 示例值：12
         */
        private Integer numTokens;

        /**
         * passage_id
         * <p> 示例值：6953165194634772508
         *
         * @param passageId
         * @return
         */
        public Builder passageId(String passageId) {
            this.passageId = passageId;
            return this;
        }


        /**
         * obj_id
         * <p> 示例值：6953165194634772508
         *
         * @param objId
         * @return
         */
        public Builder objId(String objId) {
            this.objId = objId;
            return this;
        }


        /**
         * 内容
         * <p> 示例值：这是一段passage
         *
         * @param content
         * @return
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }


        /**
         * passage的token数量
         * <p> 示例值：12
         *
         * @param numTokens
         * @return
         */
        public Builder numTokens(Integer numTokens) {
            this.numTokens = numTokens;
            return this;
        }


        public SeperatePassage build() {
            return new SeperatePassage(this);
        }
    }
}
