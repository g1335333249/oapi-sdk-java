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

package com.lark.oapi.service.hire.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class ListBackgroundCheckOrderReq {
    /**
     * 用户 ID 类型
     * <p> 示例值：open_id
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 页码标识，获取第一页传空，每次查询会返回下一页的page_token
     * <p> 示例值：eyJvZmZzZXQiOjEsInRpbWVzdGFtcCI6MTY0MDc2NTYzMjA4OCwiaWQiOm51bGx9
     */
    @Query
    @SerializedName("page_token")
    private String pageToken;
    /**
     * 每页获取记录数量，最大100
     * <p> 示例值：100
     */
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    /**
     * 投递 ID
     * <p> 示例值：6985833807195212076
     */
    @Query
    @SerializedName("application_id")
    private String applicationId;
    /**
     * 最早更新时间，毫秒级时间戳
     * <p> 示例值：1638848468868
     */
    @Query
    @SerializedName("update_start_time")
    private String updateStartTime;
    /**
     * 最晚更新时间，毫秒级时间戳
     * <p> 示例值：1638848468869
     */
    @Query
    @SerializedName("update_end_time")
    private String updateEndTime;

    // builder 开始
    public ListBackgroundCheckOrderReq() {
    }

    public ListBackgroundCheckOrderReq(Builder builder) {
        /**
         * 用户 ID 类型
         * <p> 示例值：open_id
         */
        this.userIdType = builder.userIdType;
        /**
         * 页码标识，获取第一页传空，每次查询会返回下一页的page_token
         * <p> 示例值：eyJvZmZzZXQiOjEsInRpbWVzdGFtcCI6MTY0MDc2NTYzMjA4OCwiaWQiOm51bGx9
         */
        this.pageToken = builder.pageToken;
        /**
         * 每页获取记录数量，最大100
         * <p> 示例值：100
         */
        this.pageSize = builder.pageSize;
        /**
         * 投递 ID
         * <p> 示例值：6985833807195212076
         */
        this.applicationId = builder.applicationId;
        /**
         * 最早更新时间，毫秒级时间戳
         * <p> 示例值：1638848468868
         */
        this.updateStartTime = builder.updateStartTime;
        /**
         * 最晚更新时间，毫秒级时间戳
         * <p> 示例值：1638848468869
         */
        this.updateEndTime = builder.updateEndTime;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getUpdateStartTime() {
        return this.updateStartTime;
    }

    public void setUpdateStartTime(String updateStartTime) {
        this.updateStartTime = updateStartTime;
    }

    public String getUpdateEndTime() {
        return this.updateEndTime;
    }

    public void setUpdateEndTime(String updateEndTime) {
        this.updateEndTime = updateEndTime;
    }

    public static class Builder {
        private String userIdType; // 用户 ID 类型
        private String pageToken; // 页码标识，获取第一页传空，每次查询会返回下一页的page_token
        private Integer pageSize; // 每页获取记录数量，最大100
        private String applicationId; // 投递 ID
        private String updateStartTime; // 最早更新时间，毫秒级时间戳
        private String updateEndTime; // 最晚更新时间，毫秒级时间戳


        /**
         * 用户 ID 类型
         * <p> 示例值：open_id
         *
         * @param userIdType
         * @return
         */
        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }


        /**
         * 页码标识，获取第一页传空，每次查询会返回下一页的page_token
         * <p> 示例值：eyJvZmZzZXQiOjEsInRpbWVzdGFtcCI6MTY0MDc2NTYzMjA4OCwiaWQiOm51bGx9
         *
         * @param pageToken
         * @return
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }


        /**
         * 每页获取记录数量，最大100
         * <p> 示例值：100
         *
         * @param pageSize
         * @return
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }


        /**
         * 投递 ID
         * <p> 示例值：6985833807195212076
         *
         * @param applicationId
         * @return
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }


        /**
         * 最早更新时间，毫秒级时间戳
         * <p> 示例值：1638848468868
         *
         * @param updateStartTime
         * @return
         */
        public Builder updateStartTime(String updateStartTime) {
            this.updateStartTime = updateStartTime;
            return this;
        }


        /**
         * 最晚更新时间，毫秒级时间戳
         * <p> 示例值：1638848468869
         *
         * @param updateEndTime
         * @return
         */
        public Builder updateEndTime(String updateEndTime) {
            this.updateEndTime = updateEndTime;
            return this;
        }

        public ListBackgroundCheckOrderReq build() {
            return new ListBackgroundCheckOrderReq(this);
        }
    }
}