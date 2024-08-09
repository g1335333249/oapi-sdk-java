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

public class JobDataCustomOrg {
    /**
     * 生效时间
     * <p> 示例值：2024-07-02
     */
    @SerializedName("effective_time")
    private String effectiveTime;
    /**
     * 原因
     * <p> 示例值：新增人员
     */
    @SerializedName("start_reason")
    private String startReason;
    /**
     * 自定义组织列表
     * <p> 示例值：
     */
    @SerializedName("custom_org_with_rates")
    private CreateEmpCustomOrg[] customOrgWithRates;
    /**
     * 自定义组织类型
     * <p> 示例值：custom_org_01
     */
    @SerializedName("object_api_name")
    private String objectApiName;

    // builder 开始
    public JobDataCustomOrg() {
    }

    public JobDataCustomOrg(Builder builder) {
        /**
         * 生效时间
         * <p> 示例值：2024-07-02
         */
        this.effectiveTime = builder.effectiveTime;
        /**
         * 原因
         * <p> 示例值：新增人员
         */
        this.startReason = builder.startReason;
        /**
         * 自定义组织列表
         * <p> 示例值：
         */
        this.customOrgWithRates = builder.customOrgWithRates;
        /**
         * 自定义组织类型
         * <p> 示例值：custom_org_01
         */
        this.objectApiName = builder.objectApiName;
    }

    public static Builder newBuilder() {
        return new Builder();
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

    public CreateEmpCustomOrg[] getCustomOrgWithRates() {
        return this.customOrgWithRates;
    }

    public void setCustomOrgWithRates(CreateEmpCustomOrg[] customOrgWithRates) {
        this.customOrgWithRates = customOrgWithRates;
    }

    public String getObjectApiName() {
        return this.objectApiName;
    }

    public void setObjectApiName(String objectApiName) {
        this.objectApiName = objectApiName;
    }

    public static class Builder {
        /**
         * 生效时间
         * <p> 示例值：2024-07-02
         */
        private String effectiveTime;
        /**
         * 原因
         * <p> 示例值：新增人员
         */
        private String startReason;
        /**
         * 自定义组织列表
         * <p> 示例值：
         */
        private CreateEmpCustomOrg[] customOrgWithRates;
        /**
         * 自定义组织类型
         * <p> 示例值：custom_org_01
         */
        private String objectApiName;

        /**
         * 生效时间
         * <p> 示例值：2024-07-02
         *
         * @param effectiveTime
         * @return
         */
        public Builder effectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }


        /**
         * 原因
         * <p> 示例值：新增人员
         *
         * @param startReason
         * @return
         */
        public Builder startReason(String startReason) {
            this.startReason = startReason;
            return this;
        }


        /**
         * 自定义组织列表
         * <p> 示例值：
         *
         * @param customOrgWithRates
         * @return
         */
        public Builder customOrgWithRates(CreateEmpCustomOrg[] customOrgWithRates) {
            this.customOrgWithRates = customOrgWithRates;
            return this;
        }


        /**
         * 自定义组织类型
         * <p> 示例值：custom_org_01
         *
         * @param objectApiName
         * @return
         */
        public Builder objectApiName(String objectApiName) {
            this.objectApiName = objectApiName;
            return this;
        }


        public JobDataCustomOrg build() {
            return new JobDataCustomOrg(this);
        }
    }
}