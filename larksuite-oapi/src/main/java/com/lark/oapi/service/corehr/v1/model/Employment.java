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
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class Employment {
    /**
     * 待入职ID
     * <p> 示例值：1
     */
    @SerializedName("prehire_id")
    private String prehireId;
    /**
     * 人员类型
     * <p> 示例值：1
     */
    @SerializedName("employee_type_id")
    private String employeeTypeId;
    /**
     * 司龄
     * <p> 示例值：1
     */
    @SerializedName("tenure")
    private String tenure;
    /**
     * 部门 ID，详细信息可通过【查询单个部门】接口获得
     * <p> 示例值：6893014062142064135
     */
    @SerializedName("department_id")
    private String departmentId;
    /**
     * 职级 ID，详细信息可通过【查询单个职务级别】接口获得
     * <p> 示例值：6893014062142064135
     */
    @SerializedName("job_level_id")
    private String jobLevelId;
    /**
     * 工作地点 ID，详细信息可通过【查询单个地点】接口获得
     * <p> 示例值：6893014062142064135
     */
    @SerializedName("work_location_id")
    private String workLocationId;
    /**
     * 序列 ID，详细信息可通过【查询单个职务序列】接口获得
     * <p> 示例值：6893014062142064135
     */
    @SerializedName("job_family_id")
    private String jobFamilyId;
    /**
     * 职务 ID，详细信息可通过【查询单个职务】接口获得
     * <p> 示例值：6893014062142064135
     */
    @SerializedName("job_id")
    private String jobId;
    /**
     * 法人主体 ID，详细信息可通过【查询单个公司】接口获得
     * <p> 示例值：6893014062142064135
     */
    @SerializedName("company_id")
    private String companyId;
    /**
     * 工时制度 ID，详细信息可通过【查询单个工时制度】接口获得
     * <p> 示例值：6893014062142064135
     */
    @SerializedName("working_hours_type_id")
    private String workingHoursTypeId;
    /**
     * 雇员ID
     * <p> 示例值：6893014062142064135
     */
    @SerializedName("id")
    private String id;
    /**
     * 资历起算日期
     * <p> 示例值：2020-01-01
     */
    @SerializedName("seniority_date")
    private String seniorityDate;
    /**
     * 员工编号
     * <p> 示例值：1000000
     */
    @SerializedName("employee_number")
    private String employeeNumber;
    /**
     * 入职日期
     * <p> 示例值：2020-01-01 00:00:00
     */
    @SerializedName("effective_time")
    private String effectiveTime;
    /**
     * 离职日期，即员工的最后一个工作日，最后一个工作日时员工的雇佣状态仍为“在职”，次日凌晨将更改为“离职”
     * <p> 示例值：2021-01-01 00:00:00
     */
    @SerializedName("expiration_time")
    private String expirationTime;
    /**
     * 雇佣类型，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)雇佣类型（employment_type）枚举定义获得
     * <p> 示例值：
     */
    @SerializedName("employment_type")
    private Enum employmentType;
    /**
     * 个人信息 ID，详细信息可通过【查询单个个人信息】接口获得
     * <p> 示例值：6919733936050406926
     */
    @SerializedName("person_id")
    private String personId;
    /**
     * 试用期时长（月份）
     * <p> 示例值：9999
     */
    @SerializedName("probation_period")
    private Integer probationPeriod;
    /**
     * 是否在试用期中;- 满足以下任一条件时，该字段值为`"true"`：;  - 预计试用结束日期非空，且实际结束日期为空;  - 预计试用结束日期非空，实际结束日期非空，且当日日期小于等于实际结束日期;- 其余情况下，该字段值为`"false"`；
     * <p> 示例值：true
     */
    @SerializedName("on_probation")
    private String onProbation;
    /**
     * 试用期结束日期（实际结束日期）
     * <p> 示例值：2022-01-01
     */
    @SerializedName("probation_end_date")
    private String probationEndDate;
    /**
     * 是否是主雇佣信息
     * <p> 示例值：true
     */
    @SerializedName("primary_employment")
    private Boolean primaryEmployment;
    /**
     * 雇员状态，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)雇员状态（employment_status）枚举定义获得
     * <p> 示例值：
     */
    @SerializedName("employment_status")
    private Enum employmentStatus;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("custom_fields")
    private ObjectFieldData[] customFields;
    /**
     * 工作邮箱列表，只有当邮箱下面所有条件时，才在个人信息页面可见： ;- is_primary = "true";- is_public = "true";- email_usage = "work"
     * <p> 示例值：
     */
    @SerializedName("work_email_list")
    private Email[] workEmailList;
    /**
     * 邮箱
     * <p> 示例值：test@163.com
     */
    @SerializedName("email_address")
    private String emailAddress;
    /**
     * 离职原因，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)离职原因（reason_for_offboarding）枚举定义部分获得
     * <p> 示例值：
     */
    @SerializedName("reason_for_offboarding")
    private Enum reasonForOffboarding;
    /**
     * 成本中心id列表
     * <p> 示例值：
     */
    @SerializedName("cost_center_list")
    private JobDataCostCenter[] costCenterList;
    /**
     * 招聘应用 ID
     * <p> 示例值：6838119494196871234
     */
    @SerializedName("ats_application_id")
    private String atsApplicationId;
    /**
     * 是否离职重聘
     * <p> 示例值：
     */
    @SerializedName("rehire")
    private Enum rehire;
    /**
     * 历史雇佣信息 ID，可以通过【查询单个雇佣信息】查询详细信息
     * <p> 示例值：7164286667866966659
     */
    @SerializedName("rehire_employment_id")
    private String rehireEmploymentId;

    // builder 开始
    public Employment() {
    }

    public Employment(Builder builder) {
        /**
         * 待入职ID
         * <p> 示例值：1
         */
        this.prehireId = builder.prehireId;
        /**
         * 人员类型
         * <p> 示例值：1
         */
        this.employeeTypeId = builder.employeeTypeId;
        /**
         * 司龄
         * <p> 示例值：1
         */
        this.tenure = builder.tenure;
        /**
         * 部门 ID，详细信息可通过【查询单个部门】接口获得
         * <p> 示例值：6893014062142064135
         */
        this.departmentId = builder.departmentId;
        /**
         * 职级 ID，详细信息可通过【查询单个职务级别】接口获得
         * <p> 示例值：6893014062142064135
         */
        this.jobLevelId = builder.jobLevelId;
        /**
         * 工作地点 ID，详细信息可通过【查询单个地点】接口获得
         * <p> 示例值：6893014062142064135
         */
        this.workLocationId = builder.workLocationId;
        /**
         * 序列 ID，详细信息可通过【查询单个职务序列】接口获得
         * <p> 示例值：6893014062142064135
         */
        this.jobFamilyId = builder.jobFamilyId;
        /**
         * 职务 ID，详细信息可通过【查询单个职务】接口获得
         * <p> 示例值：6893014062142064135
         */
        this.jobId = builder.jobId;
        /**
         * 法人主体 ID，详细信息可通过【查询单个公司】接口获得
         * <p> 示例值：6893014062142064135
         */
        this.companyId = builder.companyId;
        /**
         * 工时制度 ID，详细信息可通过【查询单个工时制度】接口获得
         * <p> 示例值：6893014062142064135
         */
        this.workingHoursTypeId = builder.workingHoursTypeId;
        /**
         * 雇员ID
         * <p> 示例值：6893014062142064135
         */
        this.id = builder.id;
        /**
         * 资历起算日期
         * <p> 示例值：2020-01-01
         */
        this.seniorityDate = builder.seniorityDate;
        /**
         * 员工编号
         * <p> 示例值：1000000
         */
        this.employeeNumber = builder.employeeNumber;
        /**
         * 入职日期
         * <p> 示例值：2020-01-01 00:00:00
         */
        this.effectiveTime = builder.effectiveTime;
        /**
         * 离职日期，即员工的最后一个工作日，最后一个工作日时员工的雇佣状态仍为“在职”，次日凌晨将更改为“离职”
         * <p> 示例值：2021-01-01 00:00:00
         */
        this.expirationTime = builder.expirationTime;
        /**
         * 雇佣类型，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)雇佣类型（employment_type）枚举定义获得
         * <p> 示例值：
         */
        this.employmentType = builder.employmentType;
        /**
         * 个人信息 ID，详细信息可通过【查询单个个人信息】接口获得
         * <p> 示例值：6919733936050406926
         */
        this.personId = builder.personId;
        /**
         * 试用期时长（月份）
         * <p> 示例值：9999
         */
        this.probationPeriod = builder.probationPeriod;
        /**
         * 是否在试用期中;- 满足以下任一条件时，该字段值为`"true"`：;  - 预计试用结束日期非空，且实际结束日期为空;  - 预计试用结束日期非空，实际结束日期非空，且当日日期小于等于实际结束日期;- 其余情况下，该字段值为`"false"`；
         * <p> 示例值：true
         */
        this.onProbation = builder.onProbation;
        /**
         * 试用期结束日期（实际结束日期）
         * <p> 示例值：2022-01-01
         */
        this.probationEndDate = builder.probationEndDate;
        /**
         * 是否是主雇佣信息
         * <p> 示例值：true
         */
        this.primaryEmployment = builder.primaryEmployment;
        /**
         * 雇员状态，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)雇员状态（employment_status）枚举定义获得
         * <p> 示例值：
         */
        this.employmentStatus = builder.employmentStatus;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customFields = builder.customFields;
        /**
         * 工作邮箱列表，只有当邮箱下面所有条件时，才在个人信息页面可见： ;- is_primary = "true";- is_public = "true";- email_usage = "work"
         * <p> 示例值：
         */
        this.workEmailList = builder.workEmailList;
        /**
         * 邮箱
         * <p> 示例值：test@163.com
         */
        this.emailAddress = builder.emailAddress;
        /**
         * 离职原因，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)离职原因（reason_for_offboarding）枚举定义部分获得
         * <p> 示例值：
         */
        this.reasonForOffboarding = builder.reasonForOffboarding;
        /**
         * 成本中心id列表
         * <p> 示例值：
         */
        this.costCenterList = builder.costCenterList;
        /**
         * 招聘应用 ID
         * <p> 示例值：6838119494196871234
         */
        this.atsApplicationId = builder.atsApplicationId;
        /**
         * 是否离职重聘
         * <p> 示例值：
         */
        this.rehire = builder.rehire;
        /**
         * 历史雇佣信息 ID，可以通过【查询单个雇佣信息】查询详细信息
         * <p> 示例值：7164286667866966659
         */
        this.rehireEmploymentId = builder.rehireEmploymentId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getPrehireId() {
        return this.prehireId;
    }

    public void setPrehireId(String prehireId) {
        this.prehireId = prehireId;
    }

    public String getEmployeeTypeId() {
        return this.employeeTypeId;
    }

    public void setEmployeeTypeId(String employeeTypeId) {
        this.employeeTypeId = employeeTypeId;
    }

    public String getTenure() {
        return this.tenure;
    }

    public void setTenure(String tenure) {
        this.tenure = tenure;
    }

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getJobLevelId() {
        return this.jobLevelId;
    }

    public void setJobLevelId(String jobLevelId) {
        this.jobLevelId = jobLevelId;
    }

    public String getWorkLocationId() {
        return this.workLocationId;
    }

    public void setWorkLocationId(String workLocationId) {
        this.workLocationId = workLocationId;
    }

    public String getJobFamilyId() {
        return this.jobFamilyId;
    }

    public void setJobFamilyId(String jobFamilyId) {
        this.jobFamilyId = jobFamilyId;
    }

    public String getJobId() {
        return this.jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getWorkingHoursTypeId() {
        return this.workingHoursTypeId;
    }

    public void setWorkingHoursTypeId(String workingHoursTypeId) {
        this.workingHoursTypeId = workingHoursTypeId;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSeniorityDate() {
        return this.seniorityDate;
    }

    public void setSeniorityDate(String seniorityDate) {
        this.seniorityDate = seniorityDate;
    }

    public String getEmployeeNumber() {
        return this.employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public String getExpirationTime() {
        return this.expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    public Enum getEmploymentType() {
        return this.employmentType;
    }

    public void setEmploymentType(Enum employmentType) {
        this.employmentType = employmentType;
    }

    public String getPersonId() {
        return this.personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public Integer getProbationPeriod() {
        return this.probationPeriod;
    }

    public void setProbationPeriod(Integer probationPeriod) {
        this.probationPeriod = probationPeriod;
    }

    public String getOnProbation() {
        return this.onProbation;
    }

    public void setOnProbation(String onProbation) {
        this.onProbation = onProbation;
    }

    public String getProbationEndDate() {
        return this.probationEndDate;
    }

    public void setProbationEndDate(String probationEndDate) {
        this.probationEndDate = probationEndDate;
    }

    public Boolean getPrimaryEmployment() {
        return this.primaryEmployment;
    }

    public void setPrimaryEmployment(Boolean primaryEmployment) {
        this.primaryEmployment = primaryEmployment;
    }

    public Enum getEmploymentStatus() {
        return this.employmentStatus;
    }

    public void setEmploymentStatus(Enum employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public ObjectFieldData[] getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(ObjectFieldData[] customFields) {
        this.customFields = customFields;
    }

    public Email[] getWorkEmailList() {
        return this.workEmailList;
    }

    public void setWorkEmailList(Email[] workEmailList) {
        this.workEmailList = workEmailList;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Enum getReasonForOffboarding() {
        return this.reasonForOffboarding;
    }

    public void setReasonForOffboarding(Enum reasonForOffboarding) {
        this.reasonForOffboarding = reasonForOffboarding;
    }

    public JobDataCostCenter[] getCostCenterList() {
        return this.costCenterList;
    }

    public void setCostCenterList(JobDataCostCenter[] costCenterList) {
        this.costCenterList = costCenterList;
    }

    public String getAtsApplicationId() {
        return this.atsApplicationId;
    }

    public void setAtsApplicationId(String atsApplicationId) {
        this.atsApplicationId = atsApplicationId;
    }

    public Enum getRehire() {
        return this.rehire;
    }

    public void setRehire(Enum rehire) {
        this.rehire = rehire;
    }

    public String getRehireEmploymentId() {
        return this.rehireEmploymentId;
    }

    public void setRehireEmploymentId(String rehireEmploymentId) {
        this.rehireEmploymentId = rehireEmploymentId;
    }

    public static class Builder {
        /**
         * 待入职ID
         * <p> 示例值：1
         */
        private String prehireId;
        /**
         * 人员类型
         * <p> 示例值：1
         */
        private String employeeTypeId;
        /**
         * 司龄
         * <p> 示例值：1
         */
        private String tenure;
        /**
         * 部门 ID，详细信息可通过【查询单个部门】接口获得
         * <p> 示例值：6893014062142064135
         */
        private String departmentId;
        /**
         * 职级 ID，详细信息可通过【查询单个职务级别】接口获得
         * <p> 示例值：6893014062142064135
         */
        private String jobLevelId;
        /**
         * 工作地点 ID，详细信息可通过【查询单个地点】接口获得
         * <p> 示例值：6893014062142064135
         */
        private String workLocationId;
        /**
         * 序列 ID，详细信息可通过【查询单个职务序列】接口获得
         * <p> 示例值：6893014062142064135
         */
        private String jobFamilyId;
        /**
         * 职务 ID，详细信息可通过【查询单个职务】接口获得
         * <p> 示例值：6893014062142064135
         */
        private String jobId;
        /**
         * 法人主体 ID，详细信息可通过【查询单个公司】接口获得
         * <p> 示例值：6893014062142064135
         */
        private String companyId;
        /**
         * 工时制度 ID，详细信息可通过【查询单个工时制度】接口获得
         * <p> 示例值：6893014062142064135
         */
        private String workingHoursTypeId;
        /**
         * 雇员ID
         * <p> 示例值：6893014062142064135
         */
        private String id;
        /**
         * 资历起算日期
         * <p> 示例值：2020-01-01
         */
        private String seniorityDate;
        /**
         * 员工编号
         * <p> 示例值：1000000
         */
        private String employeeNumber;
        /**
         * 入职日期
         * <p> 示例值：2020-01-01 00:00:00
         */
        private String effectiveTime;
        /**
         * 离职日期，即员工的最后一个工作日，最后一个工作日时员工的雇佣状态仍为“在职”，次日凌晨将更改为“离职”
         * <p> 示例值：2021-01-01 00:00:00
         */
        private String expirationTime;
        /**
         * 雇佣类型，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)雇佣类型（employment_type）枚举定义获得
         * <p> 示例值：
         */
        private Enum employmentType;
        /**
         * 个人信息 ID，详细信息可通过【查询单个个人信息】接口获得
         * <p> 示例值：6919733936050406926
         */
        private String personId;
        /**
         * 试用期时长（月份）
         * <p> 示例值：9999
         */
        private Integer probationPeriod;
        /**
         * 是否在试用期中;- 满足以下任一条件时，该字段值为`"true"`：;  - 预计试用结束日期非空，且实际结束日期为空;  - 预计试用结束日期非空，实际结束日期非空，且当日日期小于等于实际结束日期;- 其余情况下，该字段值为`"false"`；
         * <p> 示例值：true
         */
        private String onProbation;
        /**
         * 试用期结束日期（实际结束日期）
         * <p> 示例值：2022-01-01
         */
        private String probationEndDate;
        /**
         * 是否是主雇佣信息
         * <p> 示例值：true
         */
        private Boolean primaryEmployment;
        /**
         * 雇员状态，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)雇员状态（employment_status）枚举定义获得
         * <p> 示例值：
         */
        private Enum employmentStatus;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private ObjectFieldData[] customFields;
        /**
         * 工作邮箱列表，只有当邮箱下面所有条件时，才在个人信息页面可见： ;- is_primary = "true";- is_public = "true";- email_usage = "work"
         * <p> 示例值：
         */
        private Email[] workEmailList;
        /**
         * 邮箱
         * <p> 示例值：test@163.com
         */
        private String emailAddress;
        /**
         * 离职原因，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)离职原因（reason_for_offboarding）枚举定义部分获得
         * <p> 示例值：
         */
        private Enum reasonForOffboarding;
        /**
         * 成本中心id列表
         * <p> 示例值：
         */
        private JobDataCostCenter[] costCenterList;
        /**
         * 招聘应用 ID
         * <p> 示例值：6838119494196871234
         */
        private String atsApplicationId;
        /**
         * 是否离职重聘
         * <p> 示例值：
         */
        private Enum rehire;
        /**
         * 历史雇佣信息 ID，可以通过【查询单个雇佣信息】查询详细信息
         * <p> 示例值：7164286667866966659
         */
        private String rehireEmploymentId;

        /**
         * 待入职ID
         * <p> 示例值：1
         *
         * @param prehireId
         * @return
         */
        public Builder prehireId(String prehireId) {
            this.prehireId = prehireId;
            return this;
        }


        /**
         * 人员类型
         * <p> 示例值：1
         *
         * @param employeeTypeId
         * @return
         */
        public Builder employeeTypeId(String employeeTypeId) {
            this.employeeTypeId = employeeTypeId;
            return this;
        }


        /**
         * 司龄
         * <p> 示例值：1
         *
         * @param tenure
         * @return
         */
        public Builder tenure(String tenure) {
            this.tenure = tenure;
            return this;
        }


        /**
         * 部门 ID，详细信息可通过【查询单个部门】接口获得
         * <p> 示例值：6893014062142064135
         *
         * @param departmentId
         * @return
         */
        public Builder departmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }


        /**
         * 职级 ID，详细信息可通过【查询单个职务级别】接口获得
         * <p> 示例值：6893014062142064135
         *
         * @param jobLevelId
         * @return
         */
        public Builder jobLevelId(String jobLevelId) {
            this.jobLevelId = jobLevelId;
            return this;
        }


        /**
         * 工作地点 ID，详细信息可通过【查询单个地点】接口获得
         * <p> 示例值：6893014062142064135
         *
         * @param workLocationId
         * @return
         */
        public Builder workLocationId(String workLocationId) {
            this.workLocationId = workLocationId;
            return this;
        }


        /**
         * 序列 ID，详细信息可通过【查询单个职务序列】接口获得
         * <p> 示例值：6893014062142064135
         *
         * @param jobFamilyId
         * @return
         */
        public Builder jobFamilyId(String jobFamilyId) {
            this.jobFamilyId = jobFamilyId;
            return this;
        }


        /**
         * 职务 ID，详细信息可通过【查询单个职务】接口获得
         * <p> 示例值：6893014062142064135
         *
         * @param jobId
         * @return
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }


        /**
         * 法人主体 ID，详细信息可通过【查询单个公司】接口获得
         * <p> 示例值：6893014062142064135
         *
         * @param companyId
         * @return
         */
        public Builder companyId(String companyId) {
            this.companyId = companyId;
            return this;
        }


        /**
         * 工时制度 ID，详细信息可通过【查询单个工时制度】接口获得
         * <p> 示例值：6893014062142064135
         *
         * @param workingHoursTypeId
         * @return
         */
        public Builder workingHoursTypeId(String workingHoursTypeId) {
            this.workingHoursTypeId = workingHoursTypeId;
            return this;
        }


        /**
         * 雇员ID
         * <p> 示例值：6893014062142064135
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 资历起算日期
         * <p> 示例值：2020-01-01
         *
         * @param seniorityDate
         * @return
         */
        public Builder seniorityDate(String seniorityDate) {
            this.seniorityDate = seniorityDate;
            return this;
        }


        /**
         * 员工编号
         * <p> 示例值：1000000
         *
         * @param employeeNumber
         * @return
         */
        public Builder employeeNumber(String employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;
        }


        /**
         * 入职日期
         * <p> 示例值：2020-01-01 00:00:00
         *
         * @param effectiveTime
         * @return
         */
        public Builder effectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }


        /**
         * 离职日期，即员工的最后一个工作日，最后一个工作日时员工的雇佣状态仍为“在职”，次日凌晨将更改为“离职”
         * <p> 示例值：2021-01-01 00:00:00
         *
         * @param expirationTime
         * @return
         */
        public Builder expirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }


        /**
         * 雇佣类型，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)雇佣类型（employment_type）枚举定义获得
         * <p> 示例值：
         *
         * @param employmentType
         * @return
         */
        public Builder employmentType(Enum employmentType) {
            this.employmentType = employmentType;
            return this;
        }


        /**
         * 个人信息 ID，详细信息可通过【查询单个个人信息】接口获得
         * <p> 示例值：6919733936050406926
         *
         * @param personId
         * @return
         */
        public Builder personId(String personId) {
            this.personId = personId;
            return this;
        }


        /**
         * 试用期时长（月份）
         * <p> 示例值：9999
         *
         * @param probationPeriod
         * @return
         */
        public Builder probationPeriod(Integer probationPeriod) {
            this.probationPeriod = probationPeriod;
            return this;
        }


        /**
         * 是否在试用期中;- 满足以下任一条件时，该字段值为`"true"`：;  - 预计试用结束日期非空，且实际结束日期为空;  - 预计试用结束日期非空，实际结束日期非空，且当日日期小于等于实际结束日期;- 其余情况下，该字段值为`"false"`；
         * <p> 示例值：true
         *
         * @param onProbation
         * @return
         */
        public Builder onProbation(String onProbation) {
            this.onProbation = onProbation;
            return this;
        }


        /**
         * 试用期结束日期（实际结束日期）
         * <p> 示例值：2022-01-01
         *
         * @param probationEndDate
         * @return
         */
        public Builder probationEndDate(String probationEndDate) {
            this.probationEndDate = probationEndDate;
            return this;
        }


        /**
         * 是否是主雇佣信息
         * <p> 示例值：true
         *
         * @param primaryEmployment
         * @return
         */
        public Builder primaryEmployment(Boolean primaryEmployment) {
            this.primaryEmployment = primaryEmployment;
            return this;
        }


        /**
         * 雇员状态，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)雇员状态（employment_status）枚举定义获得
         * <p> 示例值：
         *
         * @param employmentStatus
         * @return
         */
        public Builder employmentStatus(Enum employmentStatus) {
            this.employmentStatus = employmentStatus;
            return this;
        }


        /**
         * 自定义字段
         * <p> 示例值：
         *
         * @param customFields
         * @return
         */
        public Builder customFields(ObjectFieldData[] customFields) {
            this.customFields = customFields;
            return this;
        }


        /**
         * 工作邮箱列表，只有当邮箱下面所有条件时，才在个人信息页面可见： ;- is_primary = "true";- is_public = "true";- email_usage = "work"
         * <p> 示例值：
         *
         * @param workEmailList
         * @return
         */
        public Builder workEmailList(Email[] workEmailList) {
            this.workEmailList = workEmailList;
            return this;
        }


        /**
         * 邮箱
         * <p> 示例值：test@163.com
         *
         * @param emailAddress
         * @return
         */
        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }


        /**
         * 离职原因，枚举值可通过文档[【飞书人事枚举常量】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/feishu-people-enum-constant)离职原因（reason_for_offboarding）枚举定义部分获得
         * <p> 示例值：
         *
         * @param reasonForOffboarding
         * @return
         */
        public Builder reasonForOffboarding(Enum reasonForOffboarding) {
            this.reasonForOffboarding = reasonForOffboarding;
            return this;
        }


        /**
         * 成本中心id列表
         * <p> 示例值：
         *
         * @param costCenterList
         * @return
         */
        public Builder costCenterList(JobDataCostCenter[] costCenterList) {
            this.costCenterList = costCenterList;
            return this;
        }


        /**
         * 招聘应用 ID
         * <p> 示例值：6838119494196871234
         *
         * @param atsApplicationId
         * @return
         */
        public Builder atsApplicationId(String atsApplicationId) {
            this.atsApplicationId = atsApplicationId;
            return this;
        }


        /**
         * 是否离职重聘
         * <p> 示例值：
         *
         * @param rehire
         * @return
         */
        public Builder rehire(Enum rehire) {
            this.rehire = rehire;
            return this;
        }


        /**
         * 历史雇佣信息 ID，可以通过【查询单个雇佣信息】查询详细信息
         * <p> 示例值：7164286667866966659
         *
         * @param rehireEmploymentId
         * @return
         */
        public Builder rehireEmploymentId(String rehireEmploymentId) {
            this.rehireEmploymentId = rehireEmploymentId;
            return this;
        }


        public Employment build() {
            return new Employment(this);
        }
    }
}
