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

public class ApprovalGroup {
    /**
     * 组织架构调整审批组 ID
     * <p> 示例值：6991776076699549697
     */
    @SerializedName("approval_group_id")
    private String approvalGroupId;
    /**
     * 组织架构调整流程 ID
     * <p> 示例值：6991776076699549697
     */
    @SerializedName("process_id")
    private String processId;
    /**
     * 组织架构调整流程状态
     * <p> 示例值：
     */
    @SerializedName("approval_group_status")
    private String approvalGroupStatus;
    /**
     * 调整主题
     * <p> 示例值：测试组织架构调整
     */
    @SerializedName("topic")
    private String topic;
    /**
     * 调整原因
     * <p> 示例值：测试
     */
    @SerializedName("adjust_reason")
    private String adjustReason;
    /**
     * 生效日期
     * <p> 示例值：2022-03-01
     */
    @SerializedName("effective_date")
    private String effectiveDate;
    /**
     * 发起人
     * <p> 示例值：6974641477444060708
     */
    @SerializedName("created_by")
    private String createdBy;
    /**
     * 组织架构调整任务 ID
     * <p> 示例值：6991776076699549697
     */
    @SerializedName("draft_id")
    private String draftId;
    /**
     * 组织架构调整任务状态
     * <p> 示例值：
     */
    @SerializedName("draft_status")
    private String draftStatus;
    /**
     * 关联的部门调整记录 ID 列表
     * <p> 示例值：
     */
    @SerializedName("department_changes")
    private String[] departmentChanges;
    /**
     * 关联的人员调整记录 ID 列表
     * <p> 示例值：
     */
    @SerializedName("job_changes")
    private String[] jobChanges;

    // builder 开始
    public ApprovalGroup() {
    }

    public ApprovalGroup(Builder builder) {
        /**
         * 组织架构调整审批组 ID
         * <p> 示例值：6991776076699549697
         */
        this.approvalGroupId = builder.approvalGroupId;
        /**
         * 组织架构调整流程 ID
         * <p> 示例值：6991776076699549697
         */
        this.processId = builder.processId;
        /**
         * 组织架构调整流程状态
         * <p> 示例值：
         */
        this.approvalGroupStatus = builder.approvalGroupStatus;
        /**
         * 调整主题
         * <p> 示例值：测试组织架构调整
         */
        this.topic = builder.topic;
        /**
         * 调整原因
         * <p> 示例值：测试
         */
        this.adjustReason = builder.adjustReason;
        /**
         * 生效日期
         * <p> 示例值：2022-03-01
         */
        this.effectiveDate = builder.effectiveDate;
        /**
         * 发起人
         * <p> 示例值：6974641477444060708
         */
        this.createdBy = builder.createdBy;
        /**
         * 组织架构调整任务 ID
         * <p> 示例值：6991776076699549697
         */
        this.draftId = builder.draftId;
        /**
         * 组织架构调整任务状态
         * <p> 示例值：
         */
        this.draftStatus = builder.draftStatus;
        /**
         * 关联的部门调整记录 ID 列表
         * <p> 示例值：
         */
        this.departmentChanges = builder.departmentChanges;
        /**
         * 关联的人员调整记录 ID 列表
         * <p> 示例值：
         */
        this.jobChanges = builder.jobChanges;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getApprovalGroupId() {
        return this.approvalGroupId;
    }

    public void setApprovalGroupId(String approvalGroupId) {
        this.approvalGroupId = approvalGroupId;
    }

    public String getProcessId() {
        return this.processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getApprovalGroupStatus() {
        return this.approvalGroupStatus;
    }

    public void setApprovalGroupStatus(String approvalGroupStatus) {
        this.approvalGroupStatus = approvalGroupStatus;
    }

    public String getTopic() {
        return this.topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getAdjustReason() {
        return this.adjustReason;
    }

    public void setAdjustReason(String adjustReason) {
        this.adjustReason = adjustReason;
    }

    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDraftId() {
        return this.draftId;
    }

    public void setDraftId(String draftId) {
        this.draftId = draftId;
    }

    public String getDraftStatus() {
        return this.draftStatus;
    }

    public void setDraftStatus(String draftStatus) {
        this.draftStatus = draftStatus;
    }

    public String[] getDepartmentChanges() {
        return this.departmentChanges;
    }

    public void setDepartmentChanges(String[] departmentChanges) {
        this.departmentChanges = departmentChanges;
    }

    public String[] getJobChanges() {
        return this.jobChanges;
    }

    public void setJobChanges(String[] jobChanges) {
        this.jobChanges = jobChanges;
    }

    public static class Builder {
        /**
         * 组织架构调整审批组 ID
         * <p> 示例值：6991776076699549697
         */
        private String approvalGroupId;
        /**
         * 组织架构调整流程 ID
         * <p> 示例值：6991776076699549697
         */
        private String processId;
        /**
         * 组织架构调整流程状态
         * <p> 示例值：
         */
        private String approvalGroupStatus;
        /**
         * 调整主题
         * <p> 示例值：测试组织架构调整
         */
        private String topic;
        /**
         * 调整原因
         * <p> 示例值：测试
         */
        private String adjustReason;
        /**
         * 生效日期
         * <p> 示例值：2022-03-01
         */
        private String effectiveDate;
        /**
         * 发起人
         * <p> 示例值：6974641477444060708
         */
        private String createdBy;
        /**
         * 组织架构调整任务 ID
         * <p> 示例值：6991776076699549697
         */
        private String draftId;
        /**
         * 组织架构调整任务状态
         * <p> 示例值：
         */
        private String draftStatus;
        /**
         * 关联的部门调整记录 ID 列表
         * <p> 示例值：
         */
        private String[] departmentChanges;
        /**
         * 关联的人员调整记录 ID 列表
         * <p> 示例值：
         */
        private String[] jobChanges;

        /**
         * 组织架构调整审批组 ID
         * <p> 示例值：6991776076699549697
         *
         * @param approvalGroupId
         * @return
         */
        public Builder approvalGroupId(String approvalGroupId) {
            this.approvalGroupId = approvalGroupId;
            return this;
        }


        /**
         * 组织架构调整流程 ID
         * <p> 示例值：6991776076699549697
         *
         * @param processId
         * @return
         */
        public Builder processId(String processId) {
            this.processId = processId;
            return this;
        }


        /**
         * 组织架构调整流程状态
         * <p> 示例值：
         *
         * @param approvalGroupStatus
         * @return
         */
        public Builder approvalGroupStatus(String approvalGroupStatus) {
            this.approvalGroupStatus = approvalGroupStatus;
            return this;
        }

        /**
         * 组织架构调整流程状态
         * <p> 示例值：
         *
         * @param approvalGroupStatus {@link com.lark.oapi.service.corehr.v2.enums.ApprovalGroupApprovalGroupStatusEnum}
         * @return
         */
        public Builder approvalGroupStatus(com.lark.oapi.service.corehr.v2.enums.ApprovalGroupApprovalGroupStatusEnum approvalGroupStatus) {
            this.approvalGroupStatus = approvalGroupStatus.getValue();
            return this;
        }


        /**
         * 调整主题
         * <p> 示例值：测试组织架构调整
         *
         * @param topic
         * @return
         */
        public Builder topic(String topic) {
            this.topic = topic;
            return this;
        }


        /**
         * 调整原因
         * <p> 示例值：测试
         *
         * @param adjustReason
         * @return
         */
        public Builder adjustReason(String adjustReason) {
            this.adjustReason = adjustReason;
            return this;
        }


        /**
         * 生效日期
         * <p> 示例值：2022-03-01
         *
         * @param effectiveDate
         * @return
         */
        public Builder effectiveDate(String effectiveDate) {
            this.effectiveDate = effectiveDate;
            return this;
        }


        /**
         * 发起人
         * <p> 示例值：6974641477444060708
         *
         * @param createdBy
         * @return
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }


        /**
         * 组织架构调整任务 ID
         * <p> 示例值：6991776076699549697
         *
         * @param draftId
         * @return
         */
        public Builder draftId(String draftId) {
            this.draftId = draftId;
            return this;
        }


        /**
         * 组织架构调整任务状态
         * <p> 示例值：
         *
         * @param draftStatus
         * @return
         */
        public Builder draftStatus(String draftStatus) {
            this.draftStatus = draftStatus;
            return this;
        }

        /**
         * 组织架构调整任务状态
         * <p> 示例值：
         *
         * @param draftStatus {@link com.lark.oapi.service.corehr.v2.enums.ApprovalGroupDraftStatusEnum}
         * @return
         */
        public Builder draftStatus(com.lark.oapi.service.corehr.v2.enums.ApprovalGroupDraftStatusEnum draftStatus) {
            this.draftStatus = draftStatus.getValue();
            return this;
        }


        /**
         * 关联的部门调整记录 ID 列表
         * <p> 示例值：
         *
         * @param departmentChanges
         * @return
         */
        public Builder departmentChanges(String[] departmentChanges) {
            this.departmentChanges = departmentChanges;
            return this;
        }


        /**
         * 关联的人员调整记录 ID 列表
         * <p> 示例值：
         *
         * @param jobChanges
         * @return
         */
        public Builder jobChanges(String[] jobChanges) {
            this.jobChanges = jobChanges;
            return this;
        }


        public ApprovalGroup build() {
            return new ApprovalGroup(this);
        }
    }
}