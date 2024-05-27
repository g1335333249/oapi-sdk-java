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

package com.lark.oapi.service.vc.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.vc.v1.enums.*;
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

public class MyAiResponsePresent {
    /**
     * 类型
     * <p> 示例值：2
     */
    @SerializedName("type")
    private String type;
    /**
     * 透传消息体
     * <p> 示例值：json字符串
     */
    @SerializedName("body")
    private String body;
    /**
     * 是否可交互
     * <p> 示例值：true
     */
    @SerializedName("interactable")
    private Boolean interactable;
    /**
     * tool对卡片交互的响应
     * <p> 示例值：update
     */
    @SerializedName("operation_type")
    private String operationType;
    /**
     * 卡片后续链路交互的请求地址
     * <p> 示例值：https://open.feishu-boe.cn/open-apis/lark_ai/operation
     */
    @SerializedName("operation_url")
    private String operationUrl;
    /**
     * 透传数据上屏后,回调业务方的url;支持Open API 与 rpc 两种方式。由业务方提供。
     * <p> 示例值：https://open.feishu-boe.cn/open-apis/lark_ai/callback
     */
    @SerializedName("callback_url")
    private String callbackUrl;
    /**
     * 回调信息
     * <p> 示例值：call back raw data
     */
    @SerializedName("callback_info")
    private String callbackInfo;

    // builder 开始
    public MyAiResponsePresent() {
    }

    public MyAiResponsePresent(Builder builder) {
        /**
         * 类型
         * <p> 示例值：2
         */
        this.type = builder.type;
        /**
         * 透传消息体
         * <p> 示例值：json字符串
         */
        this.body = builder.body;
        /**
         * 是否可交互
         * <p> 示例值：true
         */
        this.interactable = builder.interactable;
        /**
         * tool对卡片交互的响应
         * <p> 示例值：update
         */
        this.operationType = builder.operationType;
        /**
         * 卡片后续链路交互的请求地址
         * <p> 示例值：https://open.feishu-boe.cn/open-apis/lark_ai/operation
         */
        this.operationUrl = builder.operationUrl;
        /**
         * 透传数据上屏后,回调业务方的url;支持Open API 与 rpc 两种方式。由业务方提供。
         * <p> 示例值：https://open.feishu-boe.cn/open-apis/lark_ai/callback
         */
        this.callbackUrl = builder.callbackUrl;
        /**
         * 回调信息
         * <p> 示例值：call back raw data
         */
        this.callbackInfo = builder.callbackInfo;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Boolean getInteractable() {
        return this.interactable;
    }

    public void setInteractable(Boolean interactable) {
        this.interactable = interactable;
    }

    public String getOperationType() {
        return this.operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getOperationUrl() {
        return this.operationUrl;
    }

    public void setOperationUrl(String operationUrl) {
        this.operationUrl = operationUrl;
    }

    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getCallbackInfo() {
        return this.callbackInfo;
    }

    public void setCallbackInfo(String callbackInfo) {
        this.callbackInfo = callbackInfo;
    }

    public static class Builder {
        /**
         * 类型
         * <p> 示例值：2
         */
        private String type;
        /**
         * 透传消息体
         * <p> 示例值：json字符串
         */
        private String body;
        /**
         * 是否可交互
         * <p> 示例值：true
         */
        private Boolean interactable;
        /**
         * tool对卡片交互的响应
         * <p> 示例值：update
         */
        private String operationType;
        /**
         * 卡片后续链路交互的请求地址
         * <p> 示例值：https://open.feishu-boe.cn/open-apis/lark_ai/operation
         */
        private String operationUrl;
        /**
         * 透传数据上屏后,回调业务方的url;支持Open API 与 rpc 两种方式。由业务方提供。
         * <p> 示例值：https://open.feishu-boe.cn/open-apis/lark_ai/callback
         */
        private String callbackUrl;
        /**
         * 回调信息
         * <p> 示例值：call back raw data
         */
        private String callbackInfo;

        /**
         * 类型
         * <p> 示例值：2
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }


        /**
         * 透传消息体
         * <p> 示例值：json字符串
         *
         * @param body
         * @return
         */
        public Builder body(String body) {
            this.body = body;
            return this;
        }


        /**
         * 是否可交互
         * <p> 示例值：true
         *
         * @param interactable
         * @return
         */
        public Builder interactable(Boolean interactable) {
            this.interactable = interactable;
            return this;
        }


        /**
         * tool对卡片交互的响应
         * <p> 示例值：update
         *
         * @param operationType
         * @return
         */
        public Builder operationType(String operationType) {
            this.operationType = operationType;
            return this;
        }


        /**
         * 卡片后续链路交互的请求地址
         * <p> 示例值：https://open.feishu-boe.cn/open-apis/lark_ai/operation
         *
         * @param operationUrl
         * @return
         */
        public Builder operationUrl(String operationUrl) {
            this.operationUrl = operationUrl;
            return this;
        }


        /**
         * 透传数据上屏后,回调业务方的url;支持Open API 与 rpc 两种方式。由业务方提供。
         * <p> 示例值：https://open.feishu-boe.cn/open-apis/lark_ai/callback
         *
         * @param callbackUrl
         * @return
         */
        public Builder callbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }


        /**
         * 回调信息
         * <p> 示例值：call back raw data
         *
         * @param callbackInfo
         * @return
         */
        public Builder callbackInfo(String callbackInfo) {
            this.callbackInfo = callbackInfo;
            return this;
        }


        public MyAiResponsePresent build() {
            return new MyAiResponsePresent(this);
        }
    }
}