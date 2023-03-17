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

import com.google.gson.annotations.SerializedName;

public class PatchReserveConfigReqBody {
    /**
     * 1 代表层级，2 代表会议室
     * <p> 示例值：2
     */
    @SerializedName("scope_type")
    private String scopeType;
    /**
     * 预定审批设置
     * <p> 示例值：
     */
    @SerializedName("approval_config")
    private ApprovalConfig approvalConfig;
    /**
     * 预定时间设置
     * <p> 示例值：
     */
    @SerializedName("time_config")
    private TimeConfig timeConfig;
    /**
     * 预定范围设置
     * <p> 示例值：
     */
    @SerializedName("reserve_scope_config")
    private ReserveScopeConfig reserveScopeConfig;

    // builder 开始
    public PatchReserveConfigReqBody() {
    }

    public PatchReserveConfigReqBody(Builder builder) {
        /**
         * 1 代表层级，2 代表会议室
         * <p> 示例值：2
         */
        this.scopeType = builder.scopeType;
        /**
         * 预定审批设置
         * <p> 示例值：
         */
        this.approvalConfig = builder.approvalConfig;
        /**
         * 预定时间设置
         * <p> 示例值：
         */
        this.timeConfig = builder.timeConfig;
        /**
         * 预定范围设置
         * <p> 示例值：
         */
        this.reserveScopeConfig = builder.reserveScopeConfig;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getScopeType() {
        return this.scopeType;
    }

    public void setScopeType(String scopeType) {
        this.scopeType = scopeType;
    }

    public ApprovalConfig getApprovalConfig() {
        return this.approvalConfig;
    }

    public void setApprovalConfig(ApprovalConfig approvalConfig) {
        this.approvalConfig = approvalConfig;
    }

    public TimeConfig getTimeConfig() {
        return this.timeConfig;
    }

    public void setTimeConfig(TimeConfig timeConfig) {
        this.timeConfig = timeConfig;
    }

    public ReserveScopeConfig getReserveScopeConfig() {
        return this.reserveScopeConfig;
    }

    public void setReserveScopeConfig(ReserveScopeConfig reserveScopeConfig) {
        this.reserveScopeConfig = reserveScopeConfig;
    }

    public static class Builder {
        /**
         * 1 代表层级，2 代表会议室
         * <p> 示例值：2
         */
        private String scopeType;
        /**
         * 预定审批设置
         * <p> 示例值：
         */
        private ApprovalConfig approvalConfig;
        /**
         * 预定时间设置
         * <p> 示例值：
         */
        private TimeConfig timeConfig;
        /**
         * 预定范围设置
         * <p> 示例值：
         */
        private ReserveScopeConfig reserveScopeConfig;

        /**
         * 1 代表层级，2 代表会议室
         * <p> 示例值：2
         *
         * @param scopeType
         * @return
         */
        public Builder scopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }


        /**
         * 预定审批设置
         * <p> 示例值：
         *
         * @param approvalConfig
         * @return
         */
        public Builder approvalConfig(ApprovalConfig approvalConfig) {
            this.approvalConfig = approvalConfig;
            return this;
        }


        /**
         * 预定时间设置
         * <p> 示例值：
         *
         * @param timeConfig
         * @return
         */
        public Builder timeConfig(TimeConfig timeConfig) {
            this.timeConfig = timeConfig;
            return this;
        }


        /**
         * 预定范围设置
         * <p> 示例值：
         *
         * @param reserveScopeConfig
         * @return
         */
        public Builder reserveScopeConfig(ReserveScopeConfig reserveScopeConfig) {
            this.reserveScopeConfig = reserveScopeConfig;
            return this;
        }


        public PatchReserveConfigReqBody build() {
            return new PatchReserveConfigReqBody(this);
        }
    }
}