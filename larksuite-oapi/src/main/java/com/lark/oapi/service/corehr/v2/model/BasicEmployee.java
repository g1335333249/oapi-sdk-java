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

public class BasicEmployee {
    /**
     * 雇佣 ID
     * <p> 示例值：6893014062142064135
     */
    @SerializedName("employment_id")
    private String employmentId;
    /**
     * 工号
     * <p> 示例值：1000000
     */
    @SerializedName("employee_number")
    private String employeeNumber;
    /**
     * 邮箱地址
     * <p> 示例值：test@163.com
     */
    @SerializedName("email_address")
    private String emailAddress;
    /**
     * 基本个人信息
     * <p> 示例值：
     */
    @SerializedName("person_info")
    private BasicPersonInfo personInfo;

    // builder 开始
    public BasicEmployee() {
    }

    public BasicEmployee(Builder builder) {
        /**
         * 雇佣 ID
         * <p> 示例值：6893014062142064135
         */
        this.employmentId = builder.employmentId;
        /**
         * 工号
         * <p> 示例值：1000000
         */
        this.employeeNumber = builder.employeeNumber;
        /**
         * 邮箱地址
         * <p> 示例值：test@163.com
         */
        this.emailAddress = builder.emailAddress;
        /**
         * 基本个人信息
         * <p> 示例值：
         */
        this.personInfo = builder.personInfo;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getEmploymentId() {
        return this.employmentId;
    }

    public void setEmploymentId(String employmentId) {
        this.employmentId = employmentId;
    }

    public String getEmployeeNumber() {
        return this.employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public BasicPersonInfo getPersonInfo() {
        return this.personInfo;
    }

    public void setPersonInfo(BasicPersonInfo personInfo) {
        this.personInfo = personInfo;
    }

    public static class Builder {
        /**
         * 雇佣 ID
         * <p> 示例值：6893014062142064135
         */
        private String employmentId;
        /**
         * 工号
         * <p> 示例值：1000000
         */
        private String employeeNumber;
        /**
         * 邮箱地址
         * <p> 示例值：test@163.com
         */
        private String emailAddress;
        /**
         * 基本个人信息
         * <p> 示例值：
         */
        private BasicPersonInfo personInfo;

        /**
         * 雇佣 ID
         * <p> 示例值：6893014062142064135
         *
         * @param employmentId
         * @return
         */
        public Builder employmentId(String employmentId) {
            this.employmentId = employmentId;
            return this;
        }


        /**
         * 工号
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
         * 邮箱地址
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
         * 基本个人信息
         * <p> 示例值：
         *
         * @param personInfo
         * @return
         */
        public Builder personInfo(BasicPersonInfo personInfo) {
            this.personInfo = personInfo;
            return this;
        }


        public BasicEmployee build() {
            return new BasicEmployee(this);
        }
    }
}