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

public class PositionCreate {
    /**
     * 编码
     * <p> 示例值：A01234
     */
    @SerializedName("code")
    private String code;
    /**
     * 名称
     * <p> 示例值：
     */
    @SerializedName("names")
    private I18n[] names;
    /**
     * 描述
     * <p> 示例值：
     */
    @SerializedName("descriptions")
    private I18n[] descriptions;
    /**
     * 序列
     * <p> 示例值：
     */
    @SerializedName("job_family_ids")
    private String[] jobFamilyIds;
    /**
     * 成本中心
     * <p> 示例值：4719519211875096301
     */
    @SerializedName("cost_center_id")
    private String costCenterId;
    /**
     * 职务
     * <p> 示例值：4719519211875096301
     */
    @SerializedName("job_id")
    private String jobId;
    /**
     * 职级
     * <p> 示例值：
     */
    @SerializedName("job_level_ids")
    private String[] jobLevelIds;
    /**
     * 人员类型
     * <p> 示例值：
     */
    @SerializedName("employee_type_ids")
    private String[] employeeTypeIds;
    /**
     * 职等
     * <p> 示例值：
     */
    @SerializedName("job_grade_ids")
    private String[] jobGradeIds;
    /**
     * 工作地点
     * <p> 示例值：
     */
    @SerializedName("work_location_ids")
    private String[] workLocationIds;
    /**
     * 工时制度
     * <p> 示例值：4719519211875096301
     */
    @SerializedName("working_hours_type_id")
    private String workingHoursTypeId;
    /**
     * 部门
     * <p> 示例值：4719519211875096301
     */
    @SerializedName("department_id")
    private String departmentId;
    /**
     * 直属上级岗位
     * <p> 示例值：4719519211875096301
     */
    @SerializedName("direct_leader_id")
    private String directLeaderId;
    /**
     * 虚线上级岗位
     * <p> 示例值：4719519211875096301
     */
    @SerializedName("dotted_line_leader_id")
    private String dottedLineLeaderId;
    /**
     * 是否关键岗位
     * <p> 示例值：true
     */
    @SerializedName("is_key_position")
    private Boolean isKeyPosition;
    /**
     * 生效日期
     * <p> 示例值：2020-05-01
     */
    @SerializedName("effective_time")
    private String effectiveTime;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("custom_fields")
    private CustomFieldData[] customFields;

    // builder 开始
    public PositionCreate() {
    }

    public PositionCreate(Builder builder) {
        /**
         * 编码
         * <p> 示例值：A01234
         */
        this.code = builder.code;
        /**
         * 名称
         * <p> 示例值：
         */
        this.names = builder.names;
        /**
         * 描述
         * <p> 示例值：
         */
        this.descriptions = builder.descriptions;
        /**
         * 序列
         * <p> 示例值：
         */
        this.jobFamilyIds = builder.jobFamilyIds;
        /**
         * 成本中心
         * <p> 示例值：4719519211875096301
         */
        this.costCenterId = builder.costCenterId;
        /**
         * 职务
         * <p> 示例值：4719519211875096301
         */
        this.jobId = builder.jobId;
        /**
         * 职级
         * <p> 示例值：
         */
        this.jobLevelIds = builder.jobLevelIds;
        /**
         * 人员类型
         * <p> 示例值：
         */
        this.employeeTypeIds = builder.employeeTypeIds;
        /**
         * 职等
         * <p> 示例值：
         */
        this.jobGradeIds = builder.jobGradeIds;
        /**
         * 工作地点
         * <p> 示例值：
         */
        this.workLocationIds = builder.workLocationIds;
        /**
         * 工时制度
         * <p> 示例值：4719519211875096301
         */
        this.workingHoursTypeId = builder.workingHoursTypeId;
        /**
         * 部门
         * <p> 示例值：4719519211875096301
         */
        this.departmentId = builder.departmentId;
        /**
         * 直属上级岗位
         * <p> 示例值：4719519211875096301
         */
        this.directLeaderId = builder.directLeaderId;
        /**
         * 虚线上级岗位
         * <p> 示例值：4719519211875096301
         */
        this.dottedLineLeaderId = builder.dottedLineLeaderId;
        /**
         * 是否关键岗位
         * <p> 示例值：true
         */
        this.isKeyPosition = builder.isKeyPosition;
        /**
         * 生效日期
         * <p> 示例值：2020-05-01
         */
        this.effectiveTime = builder.effectiveTime;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customFields = builder.customFields;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public I18n[] getNames() {
        return this.names;
    }

    public void setNames(I18n[] names) {
        this.names = names;
    }

    public I18n[] getDescriptions() {
        return this.descriptions;
    }

    public void setDescriptions(I18n[] descriptions) {
        this.descriptions = descriptions;
    }

    public String[] getJobFamilyIds() {
        return this.jobFamilyIds;
    }

    public void setJobFamilyIds(String[] jobFamilyIds) {
        this.jobFamilyIds = jobFamilyIds;
    }

    public String getCostCenterId() {
        return this.costCenterId;
    }

    public void setCostCenterId(String costCenterId) {
        this.costCenterId = costCenterId;
    }

    public String getJobId() {
        return this.jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String[] getJobLevelIds() {
        return this.jobLevelIds;
    }

    public void setJobLevelIds(String[] jobLevelIds) {
        this.jobLevelIds = jobLevelIds;
    }

    public String[] getEmployeeTypeIds() {
        return this.employeeTypeIds;
    }

    public void setEmployeeTypeIds(String[] employeeTypeIds) {
        this.employeeTypeIds = employeeTypeIds;
    }

    public String[] getJobGradeIds() {
        return this.jobGradeIds;
    }

    public void setJobGradeIds(String[] jobGradeIds) {
        this.jobGradeIds = jobGradeIds;
    }

    public String[] getWorkLocationIds() {
        return this.workLocationIds;
    }

    public void setWorkLocationIds(String[] workLocationIds) {
        this.workLocationIds = workLocationIds;
    }

    public String getWorkingHoursTypeId() {
        return this.workingHoursTypeId;
    }

    public void setWorkingHoursTypeId(String workingHoursTypeId) {
        this.workingHoursTypeId = workingHoursTypeId;
    }

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDirectLeaderId() {
        return this.directLeaderId;
    }

    public void setDirectLeaderId(String directLeaderId) {
        this.directLeaderId = directLeaderId;
    }

    public String getDottedLineLeaderId() {
        return this.dottedLineLeaderId;
    }

    public void setDottedLineLeaderId(String dottedLineLeaderId) {
        this.dottedLineLeaderId = dottedLineLeaderId;
    }

    public Boolean getIsKeyPosition() {
        return this.isKeyPosition;
    }

    public void setIsKeyPosition(Boolean isKeyPosition) {
        this.isKeyPosition = isKeyPosition;
    }

    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public CustomFieldData[] getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(CustomFieldData[] customFields) {
        this.customFields = customFields;
    }

    public static class Builder {
        /**
         * 编码
         * <p> 示例值：A01234
         */
        private String code;
        /**
         * 名称
         * <p> 示例值：
         */
        private I18n[] names;
        /**
         * 描述
         * <p> 示例值：
         */
        private I18n[] descriptions;
        /**
         * 序列
         * <p> 示例值：
         */
        private String[] jobFamilyIds;
        /**
         * 成本中心
         * <p> 示例值：4719519211875096301
         */
        private String costCenterId;
        /**
         * 职务
         * <p> 示例值：4719519211875096301
         */
        private String jobId;
        /**
         * 职级
         * <p> 示例值：
         */
        private String[] jobLevelIds;
        /**
         * 人员类型
         * <p> 示例值：
         */
        private String[] employeeTypeIds;
        /**
         * 职等
         * <p> 示例值：
         */
        private String[] jobGradeIds;
        /**
         * 工作地点
         * <p> 示例值：
         */
        private String[] workLocationIds;
        /**
         * 工时制度
         * <p> 示例值：4719519211875096301
         */
        private String workingHoursTypeId;
        /**
         * 部门
         * <p> 示例值：4719519211875096301
         */
        private String departmentId;
        /**
         * 直属上级岗位
         * <p> 示例值：4719519211875096301
         */
        private String directLeaderId;
        /**
         * 虚线上级岗位
         * <p> 示例值：4719519211875096301
         */
        private String dottedLineLeaderId;
        /**
         * 是否关键岗位
         * <p> 示例值：true
         */
        private Boolean isKeyPosition;
        /**
         * 生效日期
         * <p> 示例值：2020-05-01
         */
        private String effectiveTime;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private CustomFieldData[] customFields;

        /**
         * 编码
         * <p> 示例值：A01234
         *
         * @param code
         * @return
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }


        /**
         * 名称
         * <p> 示例值：
         *
         * @param names
         * @return
         */
        public Builder names(I18n[] names) {
            this.names = names;
            return this;
        }


        /**
         * 描述
         * <p> 示例值：
         *
         * @param descriptions
         * @return
         */
        public Builder descriptions(I18n[] descriptions) {
            this.descriptions = descriptions;
            return this;
        }


        /**
         * 序列
         * <p> 示例值：
         *
         * @param jobFamilyIds
         * @return
         */
        public Builder jobFamilyIds(String[] jobFamilyIds) {
            this.jobFamilyIds = jobFamilyIds;
            return this;
        }


        /**
         * 成本中心
         * <p> 示例值：4719519211875096301
         *
         * @param costCenterId
         * @return
         */
        public Builder costCenterId(String costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }


        /**
         * 职务
         * <p> 示例值：4719519211875096301
         *
         * @param jobId
         * @return
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }


        /**
         * 职级
         * <p> 示例值：
         *
         * @param jobLevelIds
         * @return
         */
        public Builder jobLevelIds(String[] jobLevelIds) {
            this.jobLevelIds = jobLevelIds;
            return this;
        }


        /**
         * 人员类型
         * <p> 示例值：
         *
         * @param employeeTypeIds
         * @return
         */
        public Builder employeeTypeIds(String[] employeeTypeIds) {
            this.employeeTypeIds = employeeTypeIds;
            return this;
        }


        /**
         * 职等
         * <p> 示例值：
         *
         * @param jobGradeIds
         * @return
         */
        public Builder jobGradeIds(String[] jobGradeIds) {
            this.jobGradeIds = jobGradeIds;
            return this;
        }


        /**
         * 工作地点
         * <p> 示例值：
         *
         * @param workLocationIds
         * @return
         */
        public Builder workLocationIds(String[] workLocationIds) {
            this.workLocationIds = workLocationIds;
            return this;
        }


        /**
         * 工时制度
         * <p> 示例值：4719519211875096301
         *
         * @param workingHoursTypeId
         * @return
         */
        public Builder workingHoursTypeId(String workingHoursTypeId) {
            this.workingHoursTypeId = workingHoursTypeId;
            return this;
        }


        /**
         * 部门
         * <p> 示例值：4719519211875096301
         *
         * @param departmentId
         * @return
         */
        public Builder departmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }


        /**
         * 直属上级岗位
         * <p> 示例值：4719519211875096301
         *
         * @param directLeaderId
         * @return
         */
        public Builder directLeaderId(String directLeaderId) {
            this.directLeaderId = directLeaderId;
            return this;
        }


        /**
         * 虚线上级岗位
         * <p> 示例值：4719519211875096301
         *
         * @param dottedLineLeaderId
         * @return
         */
        public Builder dottedLineLeaderId(String dottedLineLeaderId) {
            this.dottedLineLeaderId = dottedLineLeaderId;
            return this;
        }


        /**
         * 是否关键岗位
         * <p> 示例值：true
         *
         * @param isKeyPosition
         * @return
         */
        public Builder isKeyPosition(Boolean isKeyPosition) {
            this.isKeyPosition = isKeyPosition;
            return this;
        }


        /**
         * 生效日期
         * <p> 示例值：2020-05-01
         *
         * @param effectiveTime
         * @return
         */
        public Builder effectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }


        /**
         * 自定义字段
         * <p> 示例值：
         *
         * @param customFields
         * @return
         */
        public Builder customFields(CustomFieldData[] customFields) {
            this.customFields = customFields;
            return this;
        }


        public PositionCreate build() {
            return new PositionCreate(this);
        }
    }
}
