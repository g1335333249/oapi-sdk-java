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

package com.lark.oapi.service.calendar.v4.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.calendar.v4.enums.*;
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

public class VcInfo {
    /**
     * 会议唯一ID
     * <p> 示例值：7226647229510582291
     */
    @SerializedName("unique_id")
    private String uniqueId;
    /**
     * 会议号
     * <p> 示例值：808056935
     */
    @SerializedName("meeting_no")
    private String meetingNo;

    // builder 开始
    public VcInfo() {
    }

    public VcInfo(Builder builder) {
        /**
         * 会议唯一ID
         * <p> 示例值：7226647229510582291
         */
        this.uniqueId = builder.uniqueId;
        /**
         * 会议号
         * <p> 示例值：808056935
         */
        this.meetingNo = builder.meetingNo;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getMeetingNo() {
        return this.meetingNo;
    }

    public void setMeetingNo(String meetingNo) {
        this.meetingNo = meetingNo;
    }

    public static class Builder {
        /**
         * 会议唯一ID
         * <p> 示例值：7226647229510582291
         */
        private String uniqueId;
        /**
         * 会议号
         * <p> 示例值：808056935
         */
        private String meetingNo;

        /**
         * 会议唯一ID
         * <p> 示例值：7226647229510582291
         *
         * @param uniqueId
         * @return
         */
        public Builder uniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }


        /**
         * 会议号
         * <p> 示例值：808056935
         *
         * @param meetingNo
         * @return
         */
        public Builder meetingNo(String meetingNo) {
            this.meetingNo = meetingNo;
            return this;
        }


        public VcInfo build() {
            return new VcInfo(this);
        }
    }
}
