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

public class Education {
    /**
     * 学校
     * <p> 示例值：
     */
    @SerializedName("school")
    private I18n[] school;
    /**
     * 学历
     * <p> 示例值：
     */
    @SerializedName("level_of_education")
    private Enum levelOfEducation;
    /**
     * 开始日期
     * <p> 示例值：2011-09-01
     */
    @SerializedName("start_date")
    private String startDate;
    /**
     * 结束日期
     * <p> 示例值：2015-06-30
     */
    @SerializedName("end_date")
    private String endDate;
    /**
     * 专业
     * <p> 示例值：
     */
    @SerializedName("field_of_study")
    private I18n[] fieldOfStudy;
    /**
     * 学位
     * <p> 示例值：
     */
    @SerializedName("degree")
    private Enum degree;
    /**
     * 学校名称
     * <p> 示例值：
     */
    @SerializedName("school_name")
    private Enum schoolName;
    /**
     * 专业名称
     * <p> 示例值：
     */
    @SerializedName("field_of_study_name")
    private Enum fieldOfStudyName;
    /**
     * 国家地区ID
     * <p> 示例值：1
     */
    @SerializedName("country_region_id")
    private String countryRegionId;
    /**
     * 预期结束日期
     * <p> 示例值：2011-09-01
     */
    @SerializedName("expected_end_date")
    private String expectedEndDate;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("custom_fields")
    private CustomFieldData[] customFields;

    // builder 开始
    public Education() {
    }

    public Education(Builder builder) {
        /**
         * 学校
         * <p> 示例值：
         */
        this.school = builder.school;
        /**
         * 学历
         * <p> 示例值：
         */
        this.levelOfEducation = builder.levelOfEducation;
        /**
         * 开始日期
         * <p> 示例值：2011-09-01
         */
        this.startDate = builder.startDate;
        /**
         * 结束日期
         * <p> 示例值：2015-06-30
         */
        this.endDate = builder.endDate;
        /**
         * 专业
         * <p> 示例值：
         */
        this.fieldOfStudy = builder.fieldOfStudy;
        /**
         * 学位
         * <p> 示例值：
         */
        this.degree = builder.degree;
        /**
         * 学校名称
         * <p> 示例值：
         */
        this.schoolName = builder.schoolName;
        /**
         * 专业名称
         * <p> 示例值：
         */
        this.fieldOfStudyName = builder.fieldOfStudyName;
        /**
         * 国家地区ID
         * <p> 示例值：1
         */
        this.countryRegionId = builder.countryRegionId;
        /**
         * 预期结束日期
         * <p> 示例值：2011-09-01
         */
        this.expectedEndDate = builder.expectedEndDate;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customFields = builder.customFields;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public I18n[] getSchool() {
        return this.school;
    }

    public void setSchool(I18n[] school) {
        this.school = school;
    }

    public Enum getLevelOfEducation() {
        return this.levelOfEducation;
    }

    public void setLevelOfEducation(Enum levelOfEducation) {
        this.levelOfEducation = levelOfEducation;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public I18n[] getFieldOfStudy() {
        return this.fieldOfStudy;
    }

    public void setFieldOfStudy(I18n[] fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public Enum getDegree() {
        return this.degree;
    }

    public void setDegree(Enum degree) {
        this.degree = degree;
    }

    public Enum getSchoolName() {
        return this.schoolName;
    }

    public void setSchoolName(Enum schoolName) {
        this.schoolName = schoolName;
    }

    public Enum getFieldOfStudyName() {
        return this.fieldOfStudyName;
    }

    public void setFieldOfStudyName(Enum fieldOfStudyName) {
        this.fieldOfStudyName = fieldOfStudyName;
    }

    public String getCountryRegionId() {
        return this.countryRegionId;
    }

    public void setCountryRegionId(String countryRegionId) {
        this.countryRegionId = countryRegionId;
    }

    public String getExpectedEndDate() {
        return this.expectedEndDate;
    }

    public void setExpectedEndDate(String expectedEndDate) {
        this.expectedEndDate = expectedEndDate;
    }

    public CustomFieldData[] getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(CustomFieldData[] customFields) {
        this.customFields = customFields;
    }

    public static class Builder {
        /**
         * 学校
         * <p> 示例值：
         */
        private I18n[] school;
        /**
         * 学历
         * <p> 示例值：
         */
        private Enum levelOfEducation;
        /**
         * 开始日期
         * <p> 示例值：2011-09-01
         */
        private String startDate;
        /**
         * 结束日期
         * <p> 示例值：2015-06-30
         */
        private String endDate;
        /**
         * 专业
         * <p> 示例值：
         */
        private I18n[] fieldOfStudy;
        /**
         * 学位
         * <p> 示例值：
         */
        private Enum degree;
        /**
         * 学校名称
         * <p> 示例值：
         */
        private Enum schoolName;
        /**
         * 专业名称
         * <p> 示例值：
         */
        private Enum fieldOfStudyName;
        /**
         * 国家地区ID
         * <p> 示例值：1
         */
        private String countryRegionId;
        /**
         * 预期结束日期
         * <p> 示例值：2011-09-01
         */
        private String expectedEndDate;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private CustomFieldData[] customFields;

        /**
         * 学校
         * <p> 示例值：
         *
         * @param school
         * @return
         */
        public Builder school(I18n[] school) {
            this.school = school;
            return this;
        }


        /**
         * 学历
         * <p> 示例值：
         *
         * @param levelOfEducation
         * @return
         */
        public Builder levelOfEducation(Enum levelOfEducation) {
            this.levelOfEducation = levelOfEducation;
            return this;
        }


        /**
         * 开始日期
         * <p> 示例值：2011-09-01
         *
         * @param startDate
         * @return
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }


        /**
         * 结束日期
         * <p> 示例值：2015-06-30
         *
         * @param endDate
         * @return
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }


        /**
         * 专业
         * <p> 示例值：
         *
         * @param fieldOfStudy
         * @return
         */
        public Builder fieldOfStudy(I18n[] fieldOfStudy) {
            this.fieldOfStudy = fieldOfStudy;
            return this;
        }


        /**
         * 学位
         * <p> 示例值：
         *
         * @param degree
         * @return
         */
        public Builder degree(Enum degree) {
            this.degree = degree;
            return this;
        }


        /**
         * 学校名称
         * <p> 示例值：
         *
         * @param schoolName
         * @return
         */
        public Builder schoolName(Enum schoolName) {
            this.schoolName = schoolName;
            return this;
        }


        /**
         * 专业名称
         * <p> 示例值：
         *
         * @param fieldOfStudyName
         * @return
         */
        public Builder fieldOfStudyName(Enum fieldOfStudyName) {
            this.fieldOfStudyName = fieldOfStudyName;
            return this;
        }


        /**
         * 国家地区ID
         * <p> 示例值：1
         *
         * @param countryRegionId
         * @return
         */
        public Builder countryRegionId(String countryRegionId) {
            this.countryRegionId = countryRegionId;
            return this;
        }


        /**
         * 预期结束日期
         * <p> 示例值：2011-09-01
         *
         * @param expectedEndDate
         * @return
         */
        public Builder expectedEndDate(String expectedEndDate) {
            this.expectedEndDate = expectedEndDate;
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


        public Education build() {
            return new Education(this);
        }
    }
}