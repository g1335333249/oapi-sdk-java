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

package com.lark.oapi.service.helpdesk.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.helpdesk.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class TicketImageTicketReq {
    /**
     * 工单ID
     * <p> 示例值：12345
     */
    @Query
    @SerializedName("ticket_id")
    private String ticketId;
    /**
     * 消息ID;;[查询消息ID](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/ticket-message/list)
     * <p> 示例值：12345
     */
    @Query
    @SerializedName("msg_id")
    private String msgId;
    /**
     * index，当消息类型为post时，需指定图片index，index从0开始。当消息类型为img时，无需index
     * <p> 示例值：0
     */
    @Query
    @SerializedName("index")
    private Integer index;

    // builder 开始
    public TicketImageTicketReq() {
    }

    public TicketImageTicketReq(Builder builder) {
        /**
         * 工单ID
         * <p> 示例值：12345
         */
        this.ticketId = builder.ticketId;
        /**
         * 消息ID;;[查询消息ID](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/ticket-message/list)
         * <p> 示例值：12345
         */
        this.msgId = builder.msgId;
        /**
         * index，当消息类型为post时，需指定图片index，index从0开始。当消息类型为img时，无需index
         * <p> 示例值：0
         */
        this.index = builder.index;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getTicketId() {
        return this.ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getMsgId() {
        return this.msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public Integer getIndex() {
        return this.index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public static class Builder {
        private String ticketId; // 工单ID
        private String msgId; // 消息ID;;[查询消息ID](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/ticket-message/list)
        private Integer index; // index，当消息类型为post时，需指定图片index，index从0开始。当消息类型为img时，无需index


        /**
         * 工单ID
         * <p> 示例值：12345
         *
         * @param ticketId
         * @return
         */
        public Builder ticketId(String ticketId) {
            this.ticketId = ticketId;
            return this;
        }


        /**
         * 消息ID;;[查询消息ID](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/ticket-message/list)
         * <p> 示例值：12345
         *
         * @param msgId
         * @return
         */
        public Builder msgId(String msgId) {
            this.msgId = msgId;
            return this;
        }


        /**
         * index，当消息类型为post时，需指定图片index，index从0开始。当消息类型为img时，无需index
         * <p> 示例值：0
         *
         * @param index
         * @return
         */
        public Builder index(Integer index) {
            this.index = index;
            return this;
        }

        public TicketImageTicketReq build() {
            return new TicketImageTicketReq(this);
        }
    }
}
