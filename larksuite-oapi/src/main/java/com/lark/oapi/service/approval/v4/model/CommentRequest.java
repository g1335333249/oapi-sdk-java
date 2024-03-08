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

package com.lark.oapi.service.approval.v4.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.approval.v4.enums.*;
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

public class CommentRequest {
    /**
     * 评论内容，包含艾特人、附件等
     * <p> 示例值：{\"text\":\"来自小程序的评论111我带附件中有extra \",\"files\":[{\"url\":\"xxx\",\"fileSize\":155149,\"title\":\"9a9fedc5cfb01a4a20c715098.png\",\"type\":\"image\",\"extra\":\"\"}]}
     */
    @SerializedName("content")
    private String content;
    /**
     * 评论中艾特人信息
     * <p> 示例值：
     */
    @SerializedName("at_info_list")
    private CommentAtInfo[] atInfoList;
    /**
     * 父评论ID，如果是回复评论，需要传
     * <p> 示例值：7081516627711524883
     */
    @SerializedName("parent_comment_id")
    private String parentCommentId;
    /**
     * 评论ID，如果是编辑、删除一条评论，需要传
     * <p> 示例值：7081516627711524883
     */
    @SerializedName("comment_id")
    private String commentId;
    /**
     * disable_bot=true只同步数据，不触发bot
     * <p> 示例值：false
     */
    @SerializedName("disable_bot")
    private Boolean disableBot;
    /**
     * 附加字段
     * <p> 示例值：{\"a\":\"a\"}
     */
    @SerializedName("extra")
    private String extra;

    // builder 开始
    public CommentRequest() {
    }

    public CommentRequest(Builder builder) {
        /**
         * 评论内容，包含艾特人、附件等
         * <p> 示例值：{\"text\":\"来自小程序的评论111我带附件中有extra \",\"files\":[{\"url\":\"xxx\",\"fileSize\":155149,\"title\":\"9a9fedc5cfb01a4a20c715098.png\",\"type\":\"image\",\"extra\":\"\"}]}
         */
        this.content = builder.content;
        /**
         * 评论中艾特人信息
         * <p> 示例值：
         */
        this.atInfoList = builder.atInfoList;
        /**
         * 父评论ID，如果是回复评论，需要传
         * <p> 示例值：7081516627711524883
         */
        this.parentCommentId = builder.parentCommentId;
        /**
         * 评论ID，如果是编辑、删除一条评论，需要传
         * <p> 示例值：7081516627711524883
         */
        this.commentId = builder.commentId;
        /**
         * disable_bot=true只同步数据，不触发bot
         * <p> 示例值：false
         */
        this.disableBot = builder.disableBot;
        /**
         * 附加字段
         * <p> 示例值：{\"a\":\"a\"}
         */
        this.extra = builder.extra;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CommentAtInfo[] getAtInfoList() {
        return this.atInfoList;
    }

    public void setAtInfoList(CommentAtInfo[] atInfoList) {
        this.atInfoList = atInfoList;
    }

    public String getParentCommentId() {
        return this.parentCommentId;
    }

    public void setParentCommentId(String parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    public String getCommentId() {
        return this.commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public Boolean getDisableBot() {
        return this.disableBot;
    }

    public void setDisableBot(Boolean disableBot) {
        this.disableBot = disableBot;
    }

    public String getExtra() {
        return this.extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public static class Builder {
        /**
         * 评论内容，包含艾特人、附件等
         * <p> 示例值：{\"text\":\"来自小程序的评论111我带附件中有extra \",\"files\":[{\"url\":\"xxx\",\"fileSize\":155149,\"title\":\"9a9fedc5cfb01a4a20c715098.png\",\"type\":\"image\",\"extra\":\"\"}]}
         */
        private String content;
        /**
         * 评论中艾特人信息
         * <p> 示例值：
         */
        private CommentAtInfo[] atInfoList;
        /**
         * 父评论ID，如果是回复评论，需要传
         * <p> 示例值：7081516627711524883
         */
        private String parentCommentId;
        /**
         * 评论ID，如果是编辑、删除一条评论，需要传
         * <p> 示例值：7081516627711524883
         */
        private String commentId;
        /**
         * disable_bot=true只同步数据，不触发bot
         * <p> 示例值：false
         */
        private Boolean disableBot;
        /**
         * 附加字段
         * <p> 示例值：{\"a\":\"a\"}
         */
        private String extra;

        /**
         * 评论内容，包含艾特人、附件等
         * <p> 示例值：{\"text\":\"来自小程序的评论111我带附件中有extra \",\"files\":[{\"url\":\"xxx\",\"fileSize\":155149,\"title\":\"9a9fedc5cfb01a4a20c715098.png\",\"type\":\"image\",\"extra\":\"\"}]}
         *
         * @param content
         * @return
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }


        /**
         * 评论中艾特人信息
         * <p> 示例值：
         *
         * @param atInfoList
         * @return
         */
        public Builder atInfoList(CommentAtInfo[] atInfoList) {
            this.atInfoList = atInfoList;
            return this;
        }


        /**
         * 父评论ID，如果是回复评论，需要传
         * <p> 示例值：7081516627711524883
         *
         * @param parentCommentId
         * @return
         */
        public Builder parentCommentId(String parentCommentId) {
            this.parentCommentId = parentCommentId;
            return this;
        }


        /**
         * 评论ID，如果是编辑、删除一条评论，需要传
         * <p> 示例值：7081516627711524883
         *
         * @param commentId
         * @return
         */
        public Builder commentId(String commentId) {
            this.commentId = commentId;
            return this;
        }


        /**
         * disable_bot=true只同步数据，不触发bot
         * <p> 示例值：false
         *
         * @param disableBot
         * @return
         */
        public Builder disableBot(Boolean disableBot) {
            this.disableBot = disableBot;
            return this;
        }


        /**
         * 附加字段
         * <p> 示例值：{\"a\":\"a\"}
         *
         * @param extra
         * @return
         */
        public Builder extra(String extra) {
            this.extra = extra;
            return this;
        }


        public CommentRequest build() {
            return new CommentRequest(this);
        }
    }
}
