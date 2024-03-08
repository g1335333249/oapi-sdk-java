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

package com.lark.oapi.service.corehr.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class MatchCompensationStandardReq {
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：open_id
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 此次调用中使用的部门 ID 类型
     * <p> 示例值：
     */
    @Query
    @SerializedName("department_id_type")
    private String departmentIdType;
    /**
     * 雇员ID
     * <p> 示例值：7124293751317038636
     */
    @Query
    @SerializedName("employment_id")
    private String employmentId;
    /**
     * 薪资标准的关联对象，项目或者指标
     * <p> 示例值：
     */
    @Query
    @SerializedName("reference_object_api")
    private String referenceObjectApi;
    /**
     * 薪资标准关联对象ID
     * <p> 示例值：7156853394442044972
     */
    @Query
    @SerializedName("reference_object_id")
    private String referenceObjectId;
    /**
     * 部门ID
     * <p> 示例值：od-53899868dd0da32292a2d809f0518c8f
     */
    @Query
    @SerializedName("department_id")
    private String departmentId;
    /**
     * 工作地点ID
     * <p> 示例值：7094869485965870636
     */
    @Query
    @SerializedName("work_location_id")
    private String workLocationId;
    /**
     * 公司ID
     * <p> 示例值：7091599096804394540
     */
    @Query
    @SerializedName("company_id")
    private String companyId;
    /**
     * 职务序列ID
     * <p> 示例值：7039313681989502508
     */
    @Query
    @SerializedName("job_family_id")
    private String jobFamilyId;
    /**
     * 职级ID
     * <p> 示例值：7086415175263258156
     */
    @Query
    @SerializedName("job_level_id")
    private String jobLevelId;
    /**
     * 人员类型ID
     * <p> 示例值：7039310401359775276
     */
    @Query
    @SerializedName("employee_type_id")
    private String employeeTypeId;
    /**
     * 招聘类型
     * <p> 示例值：experienced_professionals
     */
    @Query
    @SerializedName("recruitment_type")
    private String recruitmentType;
    /**
     * 定调薪原因ID
     * <p> 示例值：6967639606963471117
     */
    @Query
    @SerializedName("cpst_change_reason_id")
    private String cpstChangeReasonId;
    /**
     * 薪资方案ID
     * <p> 示例值：6967639606963471118
     */
    @Query
    @SerializedName("cpst_plan_id")
    private String cpstPlanId;
    /**
     * 薪级薪等ID
     * <p> 示例值：6967639606963471119
     */
    @Query
    @SerializedName("cpst_salary_level_id")
    private String cpstSalaryLevelId;
    /**
     * 生效时间
     * <p> 示例值：1660924800000
     */
    @Query
    @SerializedName("effective_time")
    private String effectiveTime;

    // builder 开始
    public MatchCompensationStandardReq() {
    }

    public MatchCompensationStandardReq(Builder builder) {
        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：open_id
         */
        this.userIdType = builder.userIdType;
        /**
         * 此次调用中使用的部门 ID 类型
         * <p> 示例值：
         */
        this.departmentIdType = builder.departmentIdType;
        /**
         * 雇员ID
         * <p> 示例值：7124293751317038636
         */
        this.employmentId = builder.employmentId;
        /**
         * 薪资标准的关联对象，项目或者指标
         * <p> 示例值：
         */
        this.referenceObjectApi = builder.referenceObjectApi;
        /**
         * 薪资标准关联对象ID
         * <p> 示例值：7156853394442044972
         */
        this.referenceObjectId = builder.referenceObjectId;
        /**
         * 部门ID
         * <p> 示例值：od-53899868dd0da32292a2d809f0518c8f
         */
        this.departmentId = builder.departmentId;
        /**
         * 工作地点ID
         * <p> 示例值：7094869485965870636
         */
        this.workLocationId = builder.workLocationId;
        /**
         * 公司ID
         * <p> 示例值：7091599096804394540
         */
        this.companyId = builder.companyId;
        /**
         * 职务序列ID
         * <p> 示例值：7039313681989502508
         */
        this.jobFamilyId = builder.jobFamilyId;
        /**
         * 职级ID
         * <p> 示例值：7086415175263258156
         */
        this.jobLevelId = builder.jobLevelId;
        /**
         * 人员类型ID
         * <p> 示例值：7039310401359775276
         */
        this.employeeTypeId = builder.employeeTypeId;
        /**
         * 招聘类型
         * <p> 示例值：experienced_professionals
         */
        this.recruitmentType = builder.recruitmentType;
        /**
         * 定调薪原因ID
         * <p> 示例值：6967639606963471117
         */
        this.cpstChangeReasonId = builder.cpstChangeReasonId;
        /**
         * 薪资方案ID
         * <p> 示例值：6967639606963471118
         */
        this.cpstPlanId = builder.cpstPlanId;
        /**
         * 薪级薪等ID
         * <p> 示例值：6967639606963471119
         */
        this.cpstSalaryLevelId = builder.cpstSalaryLevelId;
        /**
         * 生效时间
         * <p> 示例值：1660924800000
         */
        this.effectiveTime = builder.effectiveTime;
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

    public String getDepartmentIdType() {
        return this.departmentIdType;
    }

    public void setDepartmentIdType(String departmentIdType) {
        this.departmentIdType = departmentIdType;
    }

    public String getEmploymentId() {
        return this.employmentId;
    }

    public void setEmploymentId(String employmentId) {
        this.employmentId = employmentId;
    }

    public String getReferenceObjectApi() {
        return this.referenceObjectApi;
    }

    public void setReferenceObjectApi(String referenceObjectApi) {
        this.referenceObjectApi = referenceObjectApi;
    }

    public String getReferenceObjectId() {
        return this.referenceObjectId;
    }

    public void setReferenceObjectId(String referenceObjectId) {
        this.referenceObjectId = referenceObjectId;
    }

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getWorkLocationId() {
        return this.workLocationId;
    }

    public void setWorkLocationId(String workLocationId) {
        this.workLocationId = workLocationId;
    }

    public String getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getJobFamilyId() {
        return this.jobFamilyId;
    }

    public void setJobFamilyId(String jobFamilyId) {
        this.jobFamilyId = jobFamilyId;
    }

    public String getJobLevelId() {
        return this.jobLevelId;
    }

    public void setJobLevelId(String jobLevelId) {
        this.jobLevelId = jobLevelId;
    }

    public String getEmployeeTypeId() {
        return this.employeeTypeId;
    }

    public void setEmployeeTypeId(String employeeTypeId) {
        this.employeeTypeId = employeeTypeId;
    }

    public String getRecruitmentType() {
        return this.recruitmentType;
    }

    public void setRecruitmentType(String recruitmentType) {
        this.recruitmentType = recruitmentType;
    }

    public String getCpstChangeReasonId() {
        return this.cpstChangeReasonId;
    }

    public void setCpstChangeReasonId(String cpstChangeReasonId) {
        this.cpstChangeReasonId = cpstChangeReasonId;
    }

    public String getCpstPlanId() {
        return this.cpstPlanId;
    }

    public void setCpstPlanId(String cpstPlanId) {
        this.cpstPlanId = cpstPlanId;
    }

    public String getCpstSalaryLevelId() {
        return this.cpstSalaryLevelId;
    }

    public void setCpstSalaryLevelId(String cpstSalaryLevelId) {
        this.cpstSalaryLevelId = cpstSalaryLevelId;
    }

    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public static class Builder {
        private String userIdType; // 此次调用中使用的用户ID的类型
        private String departmentIdType; // 此次调用中使用的部门 ID 类型
        private String employmentId; // 雇员ID
        private String referenceObjectApi; // 薪资标准的关联对象，项目或者指标
        private String referenceObjectId; // 薪资标准关联对象ID
        private String departmentId; // 部门ID
        private String workLocationId; // 工作地点ID
        private String companyId; // 公司ID
        private String jobFamilyId; // 职务序列ID
        private String jobLevelId; // 职级ID
        private String employeeTypeId; // 人员类型ID
        private String recruitmentType; // 招聘类型
        private String cpstChangeReasonId; // 定调薪原因ID
        private String cpstPlanId; // 薪资方案ID
        private String cpstSalaryLevelId; // 薪级薪等ID
        private String effectiveTime; // 生效时间


        /**
         * 此次调用中使用的用户ID的类型
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
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：open_id
         *
         * @param userIdType {@link com.lark.oapi.service.corehr.v1.enums.MatchCompensationStandardUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.corehr.v1.enums.MatchCompensationStandardUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }


        /**
         * 此次调用中使用的部门 ID 类型
         * <p> 示例值：
         *
         * @param departmentIdType
         * @return
         */
        public Builder departmentIdType(String departmentIdType) {
            this.departmentIdType = departmentIdType;
            return this;
        }

        /**
         * 此次调用中使用的部门 ID 类型
         * <p> 示例值：
         *
         * @param departmentIdType {@link com.lark.oapi.service.corehr.v1.enums.MatchCompensationStandardDepartmentIdTypeEnum}
         * @return
         */
        public Builder departmentIdType(com.lark.oapi.service.corehr.v1.enums.MatchCompensationStandardDepartmentIdTypeEnum departmentIdType) {
            this.departmentIdType = departmentIdType.getValue();
            return this;
        }


        /**
         * 雇员ID
         * <p> 示例值：7124293751317038636
         *
         * @param employmentId
         * @return
         */
        public Builder employmentId(String employmentId) {
            this.employmentId = employmentId;
            return this;
        }


        /**
         * 薪资标准的关联对象，项目或者指标
         * <p> 示例值：
         *
         * @param referenceObjectApi
         * @return
         */
        public Builder referenceObjectApi(String referenceObjectApi) {
            this.referenceObjectApi = referenceObjectApi;
            return this;
        }

        /**
         * 薪资标准的关联对象，项目或者指标
         * <p> 示例值：
         *
         * @param referenceObjectApi {@link com.lark.oapi.service.corehr.v1.enums.MatchCompensationStandardReferenceObjectApiEnum}
         * @return
         */
        public Builder referenceObjectApi(com.lark.oapi.service.corehr.v1.enums.MatchCompensationStandardReferenceObjectApiEnum referenceObjectApi) {
            this.referenceObjectApi = referenceObjectApi.getValue();
            return this;
        }


        /**
         * 薪资标准关联对象ID
         * <p> 示例值：7156853394442044972
         *
         * @param referenceObjectId
         * @return
         */
        public Builder referenceObjectId(String referenceObjectId) {
            this.referenceObjectId = referenceObjectId;
            return this;
        }


        /**
         * 部门ID
         * <p> 示例值：od-53899868dd0da32292a2d809f0518c8f
         *
         * @param departmentId
         * @return
         */
        public Builder departmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }


        /**
         * 工作地点ID
         * <p> 示例值：7094869485965870636
         *
         * @param workLocationId
         * @return
         */
        public Builder workLocationId(String workLocationId) {
            this.workLocationId = workLocationId;
            return this;
        }


        /**
         * 公司ID
         * <p> 示例值：7091599096804394540
         *
         * @param companyId
         * @return
         */
        public Builder companyId(String companyId) {
            this.companyId = companyId;
            return this;
        }


        /**
         * 职务序列ID
         * <p> 示例值：7039313681989502508
         *
         * @param jobFamilyId
         * @return
         */
        public Builder jobFamilyId(String jobFamilyId) {
            this.jobFamilyId = jobFamilyId;
            return this;
        }


        /**
         * 职级ID
         * <p> 示例值：7086415175263258156
         *
         * @param jobLevelId
         * @return
         */
        public Builder jobLevelId(String jobLevelId) {
            this.jobLevelId = jobLevelId;
            return this;
        }


        /**
         * 人员类型ID
         * <p> 示例值：7039310401359775276
         *
         * @param employeeTypeId
         * @return
         */
        public Builder employeeTypeId(String employeeTypeId) {
            this.employeeTypeId = employeeTypeId;
            return this;
        }


        /**
         * 招聘类型
         * <p> 示例值：experienced_professionals
         *
         * @param recruitmentType
         * @return
         */
        public Builder recruitmentType(String recruitmentType) {
            this.recruitmentType = recruitmentType;
            return this;
        }

        /**
         * 招聘类型
         * <p> 示例值：experienced_professionals
         *
         * @param recruitmentType {@link com.lark.oapi.service.corehr.v1.enums.MatchCompensationStandardRecruitmentTypeEnum}
         * @return
         */
        public Builder recruitmentType(com.lark.oapi.service.corehr.v1.enums.MatchCompensationStandardRecruitmentTypeEnum recruitmentType) {
            this.recruitmentType = recruitmentType.getValue();
            return this;
        }


        /**
         * 定调薪原因ID
         * <p> 示例值：6967639606963471117
         *
         * @param cpstChangeReasonId
         * @return
         */
        public Builder cpstChangeReasonId(String cpstChangeReasonId) {
            this.cpstChangeReasonId = cpstChangeReasonId;
            return this;
        }


        /**
         * 薪资方案ID
         * <p> 示例值：6967639606963471118
         *
         * @param cpstPlanId
         * @return
         */
        public Builder cpstPlanId(String cpstPlanId) {
            this.cpstPlanId = cpstPlanId;
            return this;
        }


        /**
         * 薪级薪等ID
         * <p> 示例值：6967639606963471119
         *
         * @param cpstSalaryLevelId
         * @return
         */
        public Builder cpstSalaryLevelId(String cpstSalaryLevelId) {
            this.cpstSalaryLevelId = cpstSalaryLevelId;
            return this;
        }


        /**
         * 生效时间
         * <p> 示例值：1660924800000
         *
         * @param effectiveTime
         * @return
         */
        public Builder effectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }

        public MatchCompensationStandardReq build() {
            return new MatchCompensationStandardReq(this);
        }
    }
}
