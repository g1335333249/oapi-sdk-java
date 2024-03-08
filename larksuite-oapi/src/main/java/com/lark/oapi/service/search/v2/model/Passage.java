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

public class Passage {
    /**
     * passage的唯一标识
     * <p> 示例值：7045980712687697921
     */
    @SerializedName("passage_id")
    private String passageId;
    /**
     * passage所属的数据源
     * <p> 示例值：1
     */
    @SerializedName("passage_source")
    private Integer passageSource;
    /**
     * 和query相关的文本段落
     * <p> 示例值：流程如下：xxxxxxx。可以在飞书官方官网上找到更详细内容。
     */
    @SerializedName("content")
    private String content;
    /**
     * wiki或doc的题目
     * <p> 示例值：文档的题目
     */
    @SerializedName("title")
    private String title;
    /**
     * 跳转链接
     * <p> 示例值：https://www.feishu.cn/hc/zh-CN/
     */
    @SerializedName("url")
    private String url;
    /**
     * 文本段落和query的相关性分数
     * <p> 示例值：0.94
     */
    @SerializedName("score")
    private Double score;
    /**
     * 其他source相关的字段
     * <p> 示例值：{\"obj_id\":7263345601809530881}
     */
    @SerializedName("extra")
    private String extra;

    // builder 开始
    public Passage() {
    }

    public Passage(Builder builder) {
        /**
         * passage的唯一标识
         * <p> 示例值：7045980712687697921
         */
        this.passageId = builder.passageId;
        /**
         * passage所属的数据源
         * <p> 示例值：1
         */
        this.passageSource = builder.passageSource;
        /**
         * 和query相关的文本段落
         * <p> 示例值：流程如下：xxxxxxx。可以在飞书官方官网上找到更详细内容。
         */
        this.content = builder.content;
        /**
         * wiki或doc的题目
         * <p> 示例值：文档的题目
         */
        this.title = builder.title;
        /**
         * 跳转链接
         * <p> 示例值：https://www.feishu.cn/hc/zh-CN/
         */
        this.url = builder.url;
        /**
         * 文本段落和query的相关性分数
         * <p> 示例值：0.94
         */
        this.score = builder.score;
        /**
         * 其他source相关的字段
         * <p> 示例值：{\"obj_id\":7263345601809530881}
         */
        this.extra = builder.extra;
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

    public Integer getPassageSource() {
        return this.passageSource;
    }

    public void setPassageSource(Integer passageSource) {
        this.passageSource = passageSource;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Double getScore() {
        return this.score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getExtra() {
        return this.extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public static class Builder {
        /**
         * passage的唯一标识
         * <p> 示例值：7045980712687697921
         */
        private String passageId;
        /**
         * passage所属的数据源
         * <p> 示例值：1
         */
        private Integer passageSource;
        /**
         * 和query相关的文本段落
         * <p> 示例值：流程如下：xxxxxxx。可以在飞书官方官网上找到更详细内容。
         */
        private String content;
        /**
         * wiki或doc的题目
         * <p> 示例值：文档的题目
         */
        private String title;
        /**
         * 跳转链接
         * <p> 示例值：https://www.feishu.cn/hc/zh-CN/
         */
        private String url;
        /**
         * 文本段落和query的相关性分数
         * <p> 示例值：0.94
         */
        private Double score;
        /**
         * 其他source相关的字段
         * <p> 示例值：{\"obj_id\":7263345601809530881}
         */
        private String extra;

        /**
         * passage的唯一标识
         * <p> 示例值：7045980712687697921
         *
         * @param passageId
         * @return
         */
        public Builder passageId(String passageId) {
            this.passageId = passageId;
            return this;
        }


        /**
         * passage所属的数据源
         * <p> 示例值：1
         *
         * @param passageSource
         * @return
         */
        public Builder passageSource(Integer passageSource) {
            this.passageSource = passageSource;
            return this;
        }

        /**
         * passage所属的数据源
         * <p> 示例值：1
         *
         * @param passageSource {@link com.lark.oapi.service.search.v2.enums.PassagePassageSourceEnum}
         * @return
         */
        public Builder passageSource(com.lark.oapi.service.search.v2.enums.PassagePassageSourceEnum passageSource) {
            this.passageSource = passageSource.getValue();
            return this;
        }


        /**
         * 和query相关的文本段落
         * <p> 示例值：流程如下：xxxxxxx。可以在飞书官方官网上找到更详细内容。
         *
         * @param content
         * @return
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }


        /**
         * wiki或doc的题目
         * <p> 示例值：文档的题目
         *
         * @param title
         * @return
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }


        /**
         * 跳转链接
         * <p> 示例值：https://www.feishu.cn/hc/zh-CN/
         *
         * @param url
         * @return
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }


        /**
         * 文本段落和query的相关性分数
         * <p> 示例值：0.94
         *
         * @param score
         * @return
         */
        public Builder score(Double score) {
            this.score = score;
            return this;
        }


        /**
         * 其他source相关的字段
         * <p> 示例值：{\"obj_id\":7263345601809530881}
         *
         * @param extra
         * @return
         */
        public Builder extra(String extra) {
            this.extra = extra;
            return this;
        }


        public Passage build() {
            return new Passage(this);
        }
    }
}
