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
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class TasksSectionReq {
    /**
     * 分页大小
     * <p> 示例值：50
     */
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    /**
     * 分页标记
     * <p> 示例值：aWQ9NzEwMjMzMjMxMDE=
     */
    @Query
    @SerializedName("page_token")
    private String pageToken;
    /**
     * 按照任务状态过滤，如果不填写则表示不按完成状态过滤
     * <p> 示例值：true
     */
    @Query
    @SerializedName("completed")
    private Boolean completed;
    /**
     * 按照创建时间筛选的起始时间戳（ms)，如不填写则为首个任务的创建时刻
     * <p> 示例值：1675742789470
     */
    @Query
    @SerializedName("created_from")
    private String createdFrom;
    /**
     * 按照创建时间筛选的起始时间戳（ms)，如不填写则为最后任务的创建时刻
     * <p> 示例值：1675742789470
     */
    @Query
    @SerializedName("created_to")
    private String createdTo;
    /**
     * 表示user的ID的类型，支持open_id, user_id, union_id
     * <p> 示例值：open_id
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 要获取任务的自定义分组全局唯一ID
     * <p> 示例值：9842501a-9f47-4ff5-a622-d319eeecb97f
     */
    @Path
    @SerializedName("section_guid")
    private String sectionGuid;

    // builder 开始
    public TasksSectionReq() {
    }

    public TasksSectionReq(Builder builder) {
        /**
         * 分页大小
         * <p> 示例值：50
         */
        this.pageSize = builder.pageSize;
        /**
         * 分页标记
         * <p> 示例值：aWQ9NzEwMjMzMjMxMDE=
         */
        this.pageToken = builder.pageToken;
        /**
         * 按照任务状态过滤，如果不填写则表示不按完成状态过滤
         * <p> 示例值：true
         */
        this.completed = builder.completed;
        /**
         * 按照创建时间筛选的起始时间戳（ms)，如不填写则为首个任务的创建时刻
         * <p> 示例值：1675742789470
         */
        this.createdFrom = builder.createdFrom;
        /**
         * 按照创建时间筛选的起始时间戳（ms)，如不填写则为最后任务的创建时刻
         * <p> 示例值：1675742789470
         */
        this.createdTo = builder.createdTo;
        /**
         * 表示user的ID的类型，支持open_id, user_id, union_id
         * <p> 示例值：open_id
         */
        this.userIdType = builder.userIdType;
        /**
         * 要获取任务的自定义分组全局唯一ID
         * <p> 示例值：9842501a-9f47-4ff5-a622-d319eeecb97f
         */
        this.sectionGuid = builder.sectionGuid;
    }

    public static Builder newBuilder() {
        return new Builder();
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

    public Boolean getCompleted() {
        return this.completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public String getCreatedFrom() {
        return this.createdFrom;
    }

    public void setCreatedFrom(String createdFrom) {
        this.createdFrom = createdFrom;
    }

    public String getCreatedTo() {
        return this.createdTo;
    }

    public void setCreatedTo(String createdTo) {
        this.createdTo = createdTo;
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public String getSectionGuid() {
        return this.sectionGuid;
    }

    public void setSectionGuid(String sectionGuid) {
        this.sectionGuid = sectionGuid;
    }

    public static class Builder {
        private Integer pageSize; // 分页大小
        private String pageToken; // 分页标记
        private Boolean completed; // 按照任务状态过滤，如果不填写则表示不按完成状态过滤
        private String createdFrom; // 按照创建时间筛选的起始时间戳（ms)，如不填写则为首个任务的创建时刻
        private String createdTo; // 按照创建时间筛选的起始时间戳（ms)，如不填写则为最后任务的创建时刻
        private String userIdType; // 表示user的ID的类型，支持open_id, user_id, union_id
        private String sectionGuid; // 要获取任务的自定义分组全局唯一ID

        /**
         * 分页大小
         * <p> 示例值：50
         *
         * @param pageSize
         * @return
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 分页标记
         * <p> 示例值：aWQ9NzEwMjMzMjMxMDE=
         *
         * @param pageToken
         * @return
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }

        /**
         * 按照任务状态过滤，如果不填写则表示不按完成状态过滤
         * <p> 示例值：true
         *
         * @param completed
         * @return
         */
        public Builder completed(Boolean completed) {
            this.completed = completed;
            return this;
        }

        /**
         * 按照创建时间筛选的起始时间戳（ms)，如不填写则为首个任务的创建时刻
         * <p> 示例值：1675742789470
         *
         * @param createdFrom
         * @return
         */
        public Builder createdFrom(String createdFrom) {
            this.createdFrom = createdFrom;
            return this;
        }

        /**
         * 按照创建时间筛选的起始时间戳（ms)，如不填写则为最后任务的创建时刻
         * <p> 示例值：1675742789470
         *
         * @param createdTo
         * @return
         */
        public Builder createdTo(String createdTo) {
            this.createdTo = createdTo;
            return this;
        }

        /**
         * 表示user的ID的类型，支持open_id, user_id, union_id
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
         * 要获取任务的自定义分组全局唯一ID
         * <p> 示例值：9842501a-9f47-4ff5-a622-d319eeecb97f
         *
         * @param sectionGuid
         * @return
         */
        public Builder sectionGuid(String sectionGuid) {
            this.sectionGuid = sectionGuid;
            return this;
        }

        public TasksSectionReq build() {
            return new TasksSectionReq(this);
        }
    }
}