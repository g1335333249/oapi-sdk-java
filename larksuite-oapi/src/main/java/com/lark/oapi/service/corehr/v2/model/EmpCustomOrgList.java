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

package com.lark.oapi.service.corehr.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v2.enums.*;
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

public class EmpCustomOrgList {
    /**
     * 自定义组织列表
     * <p> 示例值：
     */
    @SerializedName("custom_org_list")
    private CustomOrgList[] customOrgList;
    /**
     * 生效时间
     * <p> 示例值：2024-06-13 00:00:00
     */
    @SerializedName("effective_time")
    private String effectiveTime;
    /**
     * 变动原因
     * <p> 示例值：自动打标
     */
    @SerializedName("start_reason")
    private String startReason;
    /**
     * ID
     * <p> 示例值：7260357352426782739
     */
    @SerializedName("job_data_custom_org_id")
    private String jobDataCustomOrgId;
    /**
     * 版本号
     * <p> 示例值：7260357352426782749
     */
    @SerializedName("version_id")
    private String versionId;
    /**
     * 自定义组织类型
     * <p> 示例值：custom_org_03
     */
    @SerializedName("object_api_name")
    private String objectApiName;
    /**
     * 用户id
     * <p> 示例值：7352797725202581036
     */
    @SerializedName("user_id")
    private String userId;

    // builder 开始
    public EmpCustomOrgList() {
    }

    public EmpCustomOrgList(Builder builder) {
        /**
         * 自定义组织列表
         * <p> 示例值：
         */
        this.customOrgList = builder.customOrgList;
        /**
         * 生效时间
         * <p> 示例值：2024-06-13 00:00:00
         */
        this.effectiveTime = builder.effectiveTime;
        /**
         * 变动原因
         * <p> 示例值：自动打标
         */
        this.startReason = builder.startReason;
        /**
         * ID
         * <p> 示例值：7260357352426782739
         */
        this.jobDataCustomOrgId = builder.jobDataCustomOrgId;
        /**
         * 版本号
         * <p> 示例值：7260357352426782749
         */
        this.versionId = builder.versionId;
        /**
         * 自定义组织类型
         * <p> 示例值：custom_org_03
         */
        this.objectApiName = builder.objectApiName;
        /**
         * 用户id
         * <p> 示例值：7352797725202581036
         */
        this.userId = builder.userId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public CustomOrgList[] getCustomOrgList() {
        return this.customOrgList;
    }

    public void setCustomOrgList(CustomOrgList[] customOrgList) {
        this.customOrgList = customOrgList;
    }

    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public String getStartReason() {
        return this.startReason;
    }

    public void setStartReason(String startReason) {
        this.startReason = startReason;
    }

    public String getJobDataCustomOrgId() {
        return this.jobDataCustomOrgId;
    }

    public void setJobDataCustomOrgId(String jobDataCustomOrgId) {
        this.jobDataCustomOrgId = jobDataCustomOrgId;
    }

    public String getVersionId() {
        return this.versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public String getObjectApiName() {
        return this.objectApiName;
    }

    public void setObjectApiName(String objectApiName) {
        this.objectApiName = objectApiName;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public static class Builder {
        /**
         * 自定义组织列表
         * <p> 示例值：
         */
        private CustomOrgList[] customOrgList;
        /**
         * 生效时间
         * <p> 示例值：2024-06-13 00:00:00
         */
        private String effectiveTime;
        /**
         * 变动原因
         * <p> 示例值：自动打标
         */
        private String startReason;
        /**
         * ID
         * <p> 示例值：7260357352426782739
         */
        private String jobDataCustomOrgId;
        /**
         * 版本号
         * <p> 示例值：7260357352426782749
         */
        private String versionId;
        /**
         * 自定义组织类型
         * <p> 示例值：custom_org_03
         */
        private String objectApiName;
        /**
         * 用户id
         * <p> 示例值：7352797725202581036
         */
        private String userId;

        /**
         * 自定义组织列表
         * <p> 示例值：
         *
         * @param customOrgList
         * @return
         */
        public Builder customOrgList(CustomOrgList[] customOrgList) {
            this.customOrgList = customOrgList;
            return this;
        }


        /**
         * 生效时间
         * <p> 示例值：2024-06-13 00:00:00
         *
         * @param effectiveTime
         * @return
         */
        public Builder effectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }


        /**
         * 变动原因
         * <p> 示例值：自动打标
         *
         * @param startReason
         * @return
         */
        public Builder startReason(String startReason) {
            this.startReason = startReason;
            return this;
        }


        /**
         * ID
         * <p> 示例值：7260357352426782739
         *
         * @param jobDataCustomOrgId
         * @return
         */
        public Builder jobDataCustomOrgId(String jobDataCustomOrgId) {
            this.jobDataCustomOrgId = jobDataCustomOrgId;
            return this;
        }


        /**
         * 版本号
         * <p> 示例值：7260357352426782749
         *
         * @param versionId
         * @return
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }


        /**
         * 自定义组织类型
         * <p> 示例值：custom_org_03
         *
         * @param objectApiName
         * @return
         */
        public Builder objectApiName(String objectApiName) {
            this.objectApiName = objectApiName;
            return this;
        }


        /**
         * 用户id
         * <p> 示例值：7352797725202581036
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        public EmpCustomOrgList build() {
            return new EmpCustomOrgList(this);
        }
    }
}
