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

public class GetMeetingListReq {
    /**
     * 查询开始时间（unix时间，单位sec）
     * <p> 示例值：1655276858
     */
    @Query
    @SerializedName("start_time")
    private String startTime;
    /**
     * 查询结束时间（unix时间，单位sec）
     * <p> 示例值：1655276858
     */
    @Query
    @SerializedName("end_time")
    private String endTime;
    /**
     * 会议状态
     * <p> 示例值：2
     */
    @Query
    @SerializedName("meeting_status")
    private Integer meetingStatus;
    /**
     * 按9位会议号筛选（最多一个筛选条件）
     * <p> 示例值：123456789
     */
    @Query
    @SerializedName("meeting_no")
    private String meetingNo;
    /**
     * 按参会Lark用户筛选（最多一个筛选条件）
     * <p> 示例值：ou_3ec3f6a28a0d08c45d895276e8e5e19b
     */
    @Query
    @SerializedName("user_id")
    private String userId;
    /**
     * 按参会Rooms筛选（最多一个筛选条件）
     * <p> 示例值：omm_eada1d61a550955240c28757e7dec3af
     */
    @Query
    @SerializedName("room_id")
    private String roomId;
    /**
     * 分页尺寸大小
     * <p> 示例值：20
     */
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    /**
     * 分页标记,第一次请求不填,表示从头开始遍历.下次遍历可采用该 page_token获取查询结果
     * <p> 示例值：
     */
    @Query
    @SerializedName("page_token")
    private String pageToken;
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;

    // builder 开始
    public GetMeetingListReq() {
    }

    public GetMeetingListReq(Builder builder) {
        /**
         * 查询开始时间（unix时间，单位sec）
         * <p> 示例值：1655276858
         */
        this.startTime = builder.startTime;
        /**
         * 查询结束时间（unix时间，单位sec）
         * <p> 示例值：1655276858
         */
        this.endTime = builder.endTime;
        /**
         * 会议状态
         * <p> 示例值：2
         */
        this.meetingStatus = builder.meetingStatus;
        /**
         * 按9位会议号筛选（最多一个筛选条件）
         * <p> 示例值：123456789
         */
        this.meetingNo = builder.meetingNo;
        /**
         * 按参会Lark用户筛选（最多一个筛选条件）
         * <p> 示例值：ou_3ec3f6a28a0d08c45d895276e8e5e19b
         */
        this.userId = builder.userId;
        /**
         * 按参会Rooms筛选（最多一个筛选条件）
         * <p> 示例值：omm_eada1d61a550955240c28757e7dec3af
         */
        this.roomId = builder.roomId;
        /**
         * 分页尺寸大小
         * <p> 示例值：20
         */
        this.pageSize = builder.pageSize;
        /**
         * 分页标记,第一次请求不填,表示从头开始遍历.下次遍历可采用该 page_token获取查询结果
         * <p> 示例值：
         */
        this.pageToken = builder.pageToken;
        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         */
        this.userIdType = builder.userIdType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getMeetingStatus() {
        return this.meetingStatus;
    }

    public void setMeetingStatus(Integer meetingStatus) {
        this.meetingStatus = meetingStatus;
    }

    public String getMeetingNo() {
        return this.meetingNo;
    }

    public void setMeetingNo(String meetingNo) {
        this.meetingNo = meetingNo;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
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

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public static class Builder {
        private String startTime; // 查询开始时间（unix时间，单位sec）
        private String endTime; // 查询结束时间（unix时间，单位sec）
        private Integer meetingStatus; // 会议状态
        private String meetingNo; // 按9位会议号筛选（最多一个筛选条件）
        private String userId; // 按参会Lark用户筛选（最多一个筛选条件）
        private String roomId; // 按参会Rooms筛选（最多一个筛选条件）
        private Integer pageSize; // 分页尺寸大小
        private String pageToken; // 分页标记,第一次请求不填,表示从头开始遍历.下次遍历可采用该 page_token获取查询结果
        private String userIdType; // 此次调用中使用的用户ID的类型


        /**
         * 查询开始时间（unix时间，单位sec）
         * <p> 示例值：1655276858
         *
         * @param startTime
         * @return
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }


        /**
         * 查询结束时间（unix时间，单位sec）
         * <p> 示例值：1655276858
         *
         * @param endTime
         * @return
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }


        /**
         * 会议状态
         * <p> 示例值：2
         *
         * @param meetingStatus
         * @return
         */
        public Builder meetingStatus(Integer meetingStatus) {
            this.meetingStatus = meetingStatus;
            return this;
        }

        /**
         * 会议状态
         * <p> 示例值：2
         *
         * @param meetingStatus {@link com.lark.oapi.service.vc.v1.enums.GetMeetingListMeetingStatusTypeEnum}
         * @return
         */
        public Builder meetingStatus(com.lark.oapi.service.vc.v1.enums.GetMeetingListMeetingStatusTypeEnum meetingStatus) {
            this.meetingStatus = meetingStatus.getValue();
            return this;
        }


        /**
         * 按9位会议号筛选（最多一个筛选条件）
         * <p> 示例值：123456789
         *
         * @param meetingNo
         * @return
         */
        public Builder meetingNo(String meetingNo) {
            this.meetingNo = meetingNo;
            return this;
        }


        /**
         * 按参会Lark用户筛选（最多一个筛选条件）
         * <p> 示例值：ou_3ec3f6a28a0d08c45d895276e8e5e19b
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 按参会Rooms筛选（最多一个筛选条件）
         * <p> 示例值：omm_eada1d61a550955240c28757e7dec3af
         *
         * @param roomId
         * @return
         */
        public Builder roomId(String roomId) {
            this.roomId = roomId;
            return this;
        }


        /**
         * 分页尺寸大小
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
         * 分页标记,第一次请求不填,表示从头开始遍历.下次遍历可采用该 page_token获取查询结果
         * <p> 示例值：
         *
         * @param pageToken
         * @return
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }


        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         *
         * @param userIdType
         * @return
         */
        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }

        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         *
         * @param userIdType {@link com.lark.oapi.service.vc.v1.enums.GetMeetingListUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.vc.v1.enums.GetMeetingListUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        public GetMeetingListReq build() {
            return new GetMeetingListReq(this);
        }
    }
}
