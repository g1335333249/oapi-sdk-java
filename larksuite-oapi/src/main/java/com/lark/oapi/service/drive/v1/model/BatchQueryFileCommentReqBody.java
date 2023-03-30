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

package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;

public class BatchQueryFileCommentReqBody {
    /**
     * 需要获取数据的评论id
     * <p> 示例值：1654857036541812356
     */
    @SerializedName("comment_ids")
    private String[] commentIds;

    // builder 开始
    public BatchQueryFileCommentReqBody() {
    }

    public BatchQueryFileCommentReqBody(Builder builder) {
        /**
         * 需要获取数据的评论id
         * <p> 示例值：1654857036541812356
         */
        this.commentIds = builder.commentIds;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String[] getCommentIds() {
        return this.commentIds;
    }

    public void setCommentIds(String[] commentIds) {
        this.commentIds = commentIds;
    }

    public static class Builder {
        /**
         * 需要获取数据的评论id
         * <p> 示例值：1654857036541812356
         */
        private String[] commentIds;

        /**
         * 需要获取数据的评论id
         * <p> 示例值：1654857036541812356
         *
         * @param commentIds
         * @return
         */
        public Builder commentIds(String[] commentIds) {
            this.commentIds = commentIds;
            return this;
        }


        public BatchQueryFileCommentReqBody build() {
            return new BatchQueryFileCommentReqBody(this);
        }
    }
}
