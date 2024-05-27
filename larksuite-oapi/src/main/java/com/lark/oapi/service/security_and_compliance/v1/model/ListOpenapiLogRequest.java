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

package com.lark.oapi.service.security_and_compliance.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.security_and_compliance.v1.enums.*;
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

public class ListOpenapiLogRequest {
    /**
     * 飞书开放平台定义的API
     * <p> 示例值：
     */
    @SerializedName("api_keys")
    private String[] apiKeys;
    /**
     * 以秒为单位的起始时间戳
     * <p> 示例值：1610613336
     */
    @SerializedName("start_time")
    private Integer startTime;
    /**
     * 以秒为单位的终止时间戳
     * <p> 示例值：1610613336
     */
    @SerializedName("end_time")
    private Integer endTime;
    /**
     * 在开发者后台——凭证与基础信息页面查看的app_id（cli_xxx），指调用openapi的应用
     * <p> 示例值：cli_xxx
     */
    @SerializedName("app_id")
    private String appId;
    /**
     * 分页大小
     * <p> 示例值：20
     */
    @SerializedName("page_size")
    private Integer pageSize;
    /**
     * 分页标记，第一次请求不填，表示从头开始遍历；当返回的has_more为true时，会返回新的page_token，再次调用接口，传入这个page_token，将获得下一页数据
     * <p> 示例值：xxx
     */
    @SerializedName("page_token")
    private String pageToken;

    // builder 开始
    public ListOpenapiLogRequest() {
    }

    public ListOpenapiLogRequest(Builder builder) {
        /**
         * 飞书开放平台定义的API
         * <p> 示例值：
         */
        this.apiKeys = builder.apiKeys;
        /**
         * 以秒为单位的起始时间戳
         * <p> 示例值：1610613336
         */
        this.startTime = builder.startTime;
        /**
         * 以秒为单位的终止时间戳
         * <p> 示例值：1610613336
         */
        this.endTime = builder.endTime;
        /**
         * 在开发者后台——凭证与基础信息页面查看的app_id（cli_xxx），指调用openapi的应用
         * <p> 示例值：cli_xxx
         */
        this.appId = builder.appId;
        /**
         * 分页大小
         * <p> 示例值：20
         */
        this.pageSize = builder.pageSize;
        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；当返回的has_more为true时，会返回新的page_token，再次调用接口，传入这个page_token，将获得下一页数据
         * <p> 示例值：xxx
         */
        this.pageToken = builder.pageToken;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String[] getApiKeys() {
        return this.apiKeys;
    }

    public void setApiKeys(String[] apiKeys) {
        this.apiKeys = apiKeys;
    }

    public Integer getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public static class Builder {
        /**
         * 飞书开放平台定义的API
         * <p> 示例值：
         */
        private String[] apiKeys;
        /**
         * 以秒为单位的起始时间戳
         * <p> 示例值：1610613336
         */
        private Integer startTime;
        /**
         * 以秒为单位的终止时间戳
         * <p> 示例值：1610613336
         */
        private Integer endTime;
        /**
         * 在开发者后台——凭证与基础信息页面查看的app_id（cli_xxx），指调用openapi的应用
         * <p> 示例值：cli_xxx
         */
        private String appId;
        /**
         * 分页大小
         * <p> 示例值：20
         */
        private Integer pageSize;
        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；当返回的has_more为true时，会返回新的page_token，再次调用接口，传入这个page_token，将获得下一页数据
         * <p> 示例值：xxx
         */
        private String pageToken;

        /**
         * 飞书开放平台定义的API
         * <p> 示例值：
         *
         * @param apiKeys
         * @return
         */
        public Builder apiKeys(String[] apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }


        /**
         * 以秒为单位的起始时间戳
         * <p> 示例值：1610613336
         *
         * @param startTime
         * @return
         */
        public Builder startTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }


        /**
         * 以秒为单位的终止时间戳
         * <p> 示例值：1610613336
         *
         * @param endTime
         * @return
         */
        public Builder endTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }


        /**
         * 在开发者后台——凭证与基础信息页面查看的app_id（cli_xxx），指调用openapi的应用
         * <p> 示例值：cli_xxx
         *
         * @param appId
         * @return
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }


        /**
         * 分页大小
         * <p> 示例值：20
         *
         * @param pageSize
         * @return
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }


        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；当返回的has_more为true时，会返回新的page_token，再次调用接口，传入这个page_token，将获得下一页数据
         * <p> 示例值：xxx
         *
         * @param pageToken
         * @return
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }


        public ListOpenapiLogRequest build() {
            return new ListOpenapiLogRequest(this);
        }
    }
}