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

package com.lark.oapi.service.im.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.im.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class CreateMessageReq {
    /**
     * 消息接收者id类型 open_id/user_id/union_id/email/chat_id
     * <p> 示例值：open_id
     */
    @Query
    @SerializedName("receive_id_type")
    private String receiveIdType;
    @Body
    private CreateMessageReqBody body;

    // builder 开始
    public CreateMessageReq() {
    }

    public CreateMessageReq(Builder builder) {
        /**
         * 消息接收者id类型 open_id/user_id/union_id/email/chat_id
         * <p> 示例值：open_id
         */
        this.receiveIdType = builder.receiveIdType;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getReceiveIdType() {
        return this.receiveIdType;
    }

    public void setReceiveIdType(String receiveIdType) {
        this.receiveIdType = receiveIdType;
    }

    public CreateMessageReqBody getCreateMessageReqBody() {
        return this.body;
    }

    public void setCreateMessageReqBody(CreateMessageReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String receiveIdType; // 消息接收者id类型 open_id/user_id/union_id/email/chat_id
        private CreateMessageReqBody body;

        /**
         * 消息接收者id类型 open_id/user_id/union_id/email/chat_id
         * <p> 示例值：open_id
         *
         * @param receiveIdType
         * @return
         */
        public Builder receiveIdType(String receiveIdType) {
            this.receiveIdType = receiveIdType;
            return this;
        }

        /**
         * 消息接收者id类型 open_id/user_id/union_id/email/chat_id
         * <p> 示例值：open_id
         *
         * @param receiveIdType {@link com.lark.oapi.service.im.v1.enums.CreateMessageReceiveIdTypeEnum}
         * @return
         */
        public Builder receiveIdType(com.lark.oapi.service.im.v1.enums.CreateMessageReceiveIdTypeEnum receiveIdType) {
            this.receiveIdType = receiveIdType.getValue();
            return this;
        }

        public CreateMessageReqBody getCreateMessageReqBody() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder createMessageReqBody(CreateMessageReqBody body) {
            this.body = body;
            return this;
        }

        public CreateMessageReq build() {
            return new CreateMessageReq(this);
        }
    }
}
