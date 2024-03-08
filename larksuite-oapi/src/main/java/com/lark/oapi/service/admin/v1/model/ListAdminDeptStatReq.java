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

package com.lark.oapi.service.admin.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.admin.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class ListAdminDeptStatReq {
    /**
     * 部门ID类型
     * <p> 示例值：open_department_id
     */
    @Query
    @SerializedName("department_id_type")
    private String departmentIdType;
    /**
     * 起始日期（包含），格式是YYYY-mm-dd
     * <p> 示例值：2020-02-15
     */
    @Query
    @SerializedName("start_date")
    private String startDate;
    /**
     * 终止日期（包含），格式是YYYY-mm-dd，起止日期之间相差不能超过91天（包含91天）
     * <p> 示例值：2020-02-15
     */
    @Query
    @SerializedName("end_date")
    private String endDate;
    /**
     * 部门的 ID，取决于department_id_type，仅支持根部门及其下前4级子部门
     * <p> 示例值：od-382e2793cfc9471f892e8a672987654c
     */
    @Query
    @SerializedName("department_id")
    private String departmentId;
    /**
     * 是否包含子部门，如果该值为false，则只查出本部门直属用户活跃和功能使用数据；如果该值为true，则查出该部门以及其子部门（子部门层级最多不超过根部门下的前4级）的用户活跃和功能使用数据
     * <p> 示例值：false
     */
    @Query
    @SerializedName("contains_child_dept")
    private Boolean containsChildDept;
    /**
     * 分页大小，默认是10
     * <p> 示例值：10
     */
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    /**
     * 分页标记，第一次请求不填，表示从头开始遍历；当返回的has_more为true时，会返回新的page_token，再次调用接口，传入这个page_token，将获得下一页数据
     * <p> 示例值：2
     */
    @Query
    @SerializedName("page_token")
    private String pageToken;

    // builder 开始
    public ListAdminDeptStatReq() {
    }

    public ListAdminDeptStatReq(Builder builder) {
        /**
         * 部门ID类型
         * <p> 示例值：open_department_id
         */
        this.departmentIdType = builder.departmentIdType;
        /**
         * 起始日期（包含），格式是YYYY-mm-dd
         * <p> 示例值：2020-02-15
         */
        this.startDate = builder.startDate;
        /**
         * 终止日期（包含），格式是YYYY-mm-dd，起止日期之间相差不能超过91天（包含91天）
         * <p> 示例值：2020-02-15
         */
        this.endDate = builder.endDate;
        /**
         * 部门的 ID，取决于department_id_type，仅支持根部门及其下前4级子部门
         * <p> 示例值：od-382e2793cfc9471f892e8a672987654c
         */
        this.departmentId = builder.departmentId;
        /**
         * 是否包含子部门，如果该值为false，则只查出本部门直属用户活跃和功能使用数据；如果该值为true，则查出该部门以及其子部门（子部门层级最多不超过根部门下的前4级）的用户活跃和功能使用数据
         * <p> 示例值：false
         */
        this.containsChildDept = builder.containsChildDept;
        /**
         * 分页大小，默认是10
         * <p> 示例值：10
         */
        this.pageSize = builder.pageSize;
        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；当返回的has_more为true时，会返回新的page_token，再次调用接口，传入这个page_token，将获得下一页数据
         * <p> 示例值：2
         */
        this.pageToken = builder.pageToken;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getDepartmentIdType() {
        return this.departmentIdType;
    }

    public void setDepartmentIdType(String departmentIdType) {
        this.departmentIdType = departmentIdType;
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

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public Boolean getContainsChildDept() {
        return this.containsChildDept;
    }

    public void setContainsChildDept(Boolean containsChildDept) {
        this.containsChildDept = containsChildDept;
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

    public static class Builder {
        private String departmentIdType; // 部门ID类型
        private String startDate; // 起始日期（包含），格式是YYYY-mm-dd
        private String endDate; // 终止日期（包含），格式是YYYY-mm-dd，起止日期之间相差不能超过91天（包含91天）
        private String departmentId; // 部门的 ID，取决于department_id_type，仅支持根部门及其下前4级子部门
        private Boolean containsChildDept; // 是否包含子部门，如果该值为false，则只查出本部门直属用户活跃和功能使用数据；如果该值为true，则查出该部门以及其子部门（子部门层级最多不超过根部门下的前4级）的用户活跃和功能使用数据
        private Integer pageSize; // 分页大小，默认是10
        private String pageToken; // 分页标记，第一次请求不填，表示从头开始遍历；当返回的has_more为true时，会返回新的page_token，再次调用接口，传入这个page_token，将获得下一页数据


        /**
         * 部门ID类型
         * <p> 示例值：open_department_id
         *
         * @param departmentIdType
         * @return
         */
        public Builder departmentIdType(String departmentIdType) {
            this.departmentIdType = departmentIdType;
            return this;
        }

        /**
         * 部门ID类型
         * <p> 示例值：open_department_id
         *
         * @param departmentIdType {@link com.lark.oapi.service.admin.v1.enums.ListAdminDeptStatDepartmentIdTypeEnum}
         * @return
         */
        public Builder departmentIdType(com.lark.oapi.service.admin.v1.enums.ListAdminDeptStatDepartmentIdTypeEnum departmentIdType) {
            this.departmentIdType = departmentIdType.getValue();
            return this;
        }


        /**
         * 起始日期（包含），格式是YYYY-mm-dd
         * <p> 示例值：2020-02-15
         *
         * @param startDate
         * @return
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }


        /**
         * 终止日期（包含），格式是YYYY-mm-dd，起止日期之间相差不能超过91天（包含91天）
         * <p> 示例值：2020-02-15
         *
         * @param endDate
         * @return
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }


        /**
         * 部门的 ID，取决于department_id_type，仅支持根部门及其下前4级子部门
         * <p> 示例值：od-382e2793cfc9471f892e8a672987654c
         *
         * @param departmentId
         * @return
         */
        public Builder departmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }


        /**
         * 是否包含子部门，如果该值为false，则只查出本部门直属用户活跃和功能使用数据；如果该值为true，则查出该部门以及其子部门（子部门层级最多不超过根部门下的前4级）的用户活跃和功能使用数据
         * <p> 示例值：false
         *
         * @param containsChildDept
         * @return
         */
        public Builder containsChildDept(Boolean containsChildDept) {
            this.containsChildDept = containsChildDept;
            return this;
        }


        /**
         * 分页大小，默认是10
         * <p> 示例值：10
         *
         * @param pageSize
         * @return
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }


        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；当返回的has_more为true时，会返回新的page_token，再次调用接口，传入这个page_token，将获得下一页数据
         * <p> 示例值：2
         *
         * @param pageToken
         * @return
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }

        public ListAdminDeptStatReq build() {
            return new ListAdminDeptStatReq(this);
        }
    }
}
