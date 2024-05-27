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

package com.lark.oapi.service.task.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.task.v2.enums.*;
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

public class TaskAssignee {
    /**
     * 任务执行者的id
     * <p> 示例值：ou_2cefb2f014f8d0c6c2d2eb7bafb0e54f
     */
    @SerializedName("id")
    private String id;
    /**
     * 会签任务中执行者完成的时间戳(ms)
     * <p> 示例值：1675742789470
     */
    @SerializedName("completed_at")
    private String completedAt;

    // builder 开始
    public TaskAssignee() {
    }

    public TaskAssignee(Builder builder) {
        /**
         * 任务执行者的id
         * <p> 示例值：ou_2cefb2f014f8d0c6c2d2eb7bafb0e54f
         */
        this.id = builder.id;
        /**
         * 会签任务中执行者完成的时间戳(ms)
         * <p> 示例值：1675742789470
         */
        this.completedAt = builder.completedAt;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompletedAt() {
        return this.completedAt;
    }

    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }

    public static class Builder {
        /**
         * 任务执行者的id
         * <p> 示例值：ou_2cefb2f014f8d0c6c2d2eb7bafb0e54f
         */
        private String id;
        /**
         * 会签任务中执行者完成的时间戳(ms)
         * <p> 示例值：1675742789470
         */
        private String completedAt;

        /**
         * 任务执行者的id
         * <p> 示例值：ou_2cefb2f014f8d0c6c2d2eb7bafb0e54f
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 会签任务中执行者完成的时间戳(ms)
         * <p> 示例值：1675742789470
         *
         * @param completedAt
         * @return
         */
        public Builder completedAt(String completedAt) {
            this.completedAt = completedAt;
            return this;
        }


        public TaskAssignee build() {
            return new TaskAssignee(this);
        }
    }
}