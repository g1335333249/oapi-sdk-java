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

public class PatchTaskReqBody {
    /**
     * 要更新的任务数据，只需要写明要更新的字段
     * <p> 示例值：
     */
    @SerializedName("task")
    private InputTask task;
    /**
     * 要更新的字段名称。支持summary, description, due, start, completed_at, extra, repeat_rule, custom_complete, mode, is_milestone, custom_fields。
     * <p> 示例值：
     */
    @SerializedName("update_fields")
    private String[] updateFields;

    // builder 开始
    public PatchTaskReqBody() {
    }

    public PatchTaskReqBody(Builder builder) {
        /**
         * 要更新的任务数据，只需要写明要更新的字段
         * <p> 示例值：
         */
        this.task = builder.task;
        /**
         * 要更新的字段名称。支持summary, description, due, start, completed_at, extra, repeat_rule, custom_complete, mode, is_milestone, custom_fields。
         * <p> 示例值：
         */
        this.updateFields = builder.updateFields;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public InputTask getTask() {
        return this.task;
    }

    public void setTask(InputTask task) {
        this.task = task;
    }

    public String[] getUpdateFields() {
        return this.updateFields;
    }

    public void setUpdateFields(String[] updateFields) {
        this.updateFields = updateFields;
    }

    public static class Builder {
        /**
         * 要更新的任务数据，只需要写明要更新的字段
         * <p> 示例值：
         */
        private InputTask task;
        /**
         * 要更新的字段名称。支持summary, description, due, start, completed_at, extra, repeat_rule, custom_complete, mode, is_milestone, custom_fields。
         * <p> 示例值：
         */
        private String[] updateFields;

        /**
         * 要更新的任务数据，只需要写明要更新的字段
         * <p> 示例值：
         *
         * @param task
         * @return
         */
        public Builder task(InputTask task) {
            this.task = task;
            return this;
        }


        /**
         * 要更新的字段名称。支持summary, description, due, start, completed_at, extra, repeat_rule, custom_complete, mode, is_milestone, custom_fields。
         * <p> 示例值：
         *
         * @param updateFields
         * @return
         */
        public Builder updateFields(String[] updateFields) {
            this.updateFields = updateFields;
            return this;
        }


        public PatchTaskReqBody build() {
            return new PatchTaskReqBody(this);
        }
    }
}
