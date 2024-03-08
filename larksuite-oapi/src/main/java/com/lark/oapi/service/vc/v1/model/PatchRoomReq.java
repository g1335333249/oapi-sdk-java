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
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class PatchRoomReq {
    /**
     * 此次调用中使用的用户ID的类型，默认使用open_id可不填
     * <p> 示例值：open_id
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 会议室ID
     * <p> 示例值：omm_4de32cf10a4358788ff4e09e37ebbf9b
     */
    @Path
    @SerializedName("room_id")
    private String roomId;
    @Body
    private Room body;

    // builder 开始
    public PatchRoomReq() {
    }

    public PatchRoomReq(Builder builder) {
        /**
         * 此次调用中使用的用户ID的类型，默认使用open_id可不填
         * <p> 示例值：open_id
         */
        this.userIdType = builder.userIdType;
        /**
         * 会议室ID
         * <p> 示例值：omm_4de32cf10a4358788ff4e09e37ebbf9b
         */
        this.roomId = builder.roomId;
        this.body = builder.body;
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

    public String getRoomId() {
        return this.roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public Room getRoom() {
        return this.body;
    }

    public void setRoom(Room body) {
        this.body = body;
    }

    public static class Builder {
        private String userIdType; // 此次调用中使用的用户ID的类型，默认使用open_id可不填
        private String roomId; // 会议室ID
        private Room body;

        /**
         * 此次调用中使用的用户ID的类型，默认使用open_id可不填
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
         * 此次调用中使用的用户ID的类型，默认使用open_id可不填
         * <p> 示例值：open_id
         *
         * @param userIdType {@link com.lark.oapi.service.vc.v1.enums.PatchRoomUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.vc.v1.enums.PatchRoomUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        /**
         * 会议室ID
         * <p> 示例值：omm_4de32cf10a4358788ff4e09e37ebbf9b
         *
         * @param roomId
         * @return
         */
        public Builder roomId(String roomId) {
            this.roomId = roomId;
            return this;
        }

        public Room getRoom() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder room(Room body) {
            this.body = body;
            return this;
        }

        public PatchRoomReq build() {
            return new PatchRoomReq(this);
        }
    }
}
