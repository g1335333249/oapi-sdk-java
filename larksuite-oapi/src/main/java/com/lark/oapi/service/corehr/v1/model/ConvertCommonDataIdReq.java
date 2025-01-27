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

public class ConvertCommonDataIdReq {
    /**
     * ID 转换类型
     * <p> 示例值：1
     */
    @Query
    @SerializedName("id_transform_type")
    private Integer idTransformType;
    /**
     * 要转换的ID类型
     * <p> 示例值：employment_id
     */
    @Query
    @SerializedName("id_type")
    private String idType;
    /**
     * 用户 ID 类型
     * <p> 示例值：open_id
     */
    @Query
    @SerializedName("feishu_user_id_type")
    private String feishuUserIdType;
    /**
     * 此次调用中使用的部门 ID 类型
     * <p> 示例值：open_department_id
     */
    @Query
    @SerializedName("feishu_department_id_type")
    private String feishuDepartmentIdType;
    @Body
    private ConvertCommonDataIdReqBody body;

    // builder 开始
    public ConvertCommonDataIdReq() {
    }

    public ConvertCommonDataIdReq(Builder builder) {
        /**
         * ID 转换类型
         * <p> 示例值：1
         */
        this.idTransformType = builder.idTransformType;
        /**
         * 要转换的ID类型
         * <p> 示例值：employment_id
         */
        this.idType = builder.idType;
        /**
         * 用户 ID 类型
         * <p> 示例值：open_id
         */
        this.feishuUserIdType = builder.feishuUserIdType;
        /**
         * 此次调用中使用的部门 ID 类型
         * <p> 示例值：open_department_id
         */
        this.feishuDepartmentIdType = builder.feishuDepartmentIdType;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getIdTransformType() {
        return this.idTransformType;
    }

    public void setIdTransformType(Integer idTransformType) {
        this.idTransformType = idTransformType;
    }

    public String getIdType() {
        return this.idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getFeishuUserIdType() {
        return this.feishuUserIdType;
    }

    public void setFeishuUserIdType(String feishuUserIdType) {
        this.feishuUserIdType = feishuUserIdType;
    }

    public String getFeishuDepartmentIdType() {
        return this.feishuDepartmentIdType;
    }

    public void setFeishuDepartmentIdType(String feishuDepartmentIdType) {
        this.feishuDepartmentIdType = feishuDepartmentIdType;
    }

    public ConvertCommonDataIdReqBody getConvertCommonDataIdReqBody() {
        return this.body;
    }

    public void setConvertCommonDataIdReqBody(ConvertCommonDataIdReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private Integer idTransformType; // ID 转换类型
        private String idType; // 要转换的ID类型
        private String feishuUserIdType; // 用户 ID 类型
        private String feishuDepartmentIdType; // 此次调用中使用的部门 ID 类型
        private ConvertCommonDataIdReqBody body;

        /**
         * ID 转换类型
         * <p> 示例值：1
         *
         * @param idTransformType
         * @return
         */
        public Builder idTransformType(Integer idTransformType) {
            this.idTransformType = idTransformType;
            return this;
        }

        /**
         * ID 转换类型
         * <p> 示例值：1
         *
         * @param idTransformType {@link com.lark.oapi.service.corehr.v1.enums.ConvertCommonDataIdIdTransformTypeEnum}
         * @return
         */
        public Builder idTransformType(com.lark.oapi.service.corehr.v1.enums.ConvertCommonDataIdIdTransformTypeEnum idTransformType) {
            this.idTransformType = idTransformType.getValue();
            return this;
        }

        /**
         * 要转换的ID类型
         * <p> 示例值：employment_id
         *
         * @param idType
         * @return
         */
        public Builder idType(String idType) {
            this.idType = idType;
            return this;
        }

        /**
         * 要转换的ID类型
         * <p> 示例值：employment_id
         *
         * @param idType {@link com.lark.oapi.service.corehr.v1.enums.ConvertCommonDataIdIdTypeEnum}
         * @return
         */
        public Builder idType(com.lark.oapi.service.corehr.v1.enums.ConvertCommonDataIdIdTypeEnum idType) {
            this.idType = idType.getValue();
            return this;
        }

        /**
         * 用户 ID 类型
         * <p> 示例值：open_id
         *
         * @param feishuUserIdType
         * @return
         */
        public Builder feishuUserIdType(String feishuUserIdType) {
            this.feishuUserIdType = feishuUserIdType;
            return this;
        }

        /**
         * 用户 ID 类型
         * <p> 示例值：open_id
         *
         * @param feishuUserIdType {@link com.lark.oapi.service.corehr.v1.enums.ConvertCommonDataIdFeishuUserIdTypeEnum}
         * @return
         */
        public Builder feishuUserIdType(com.lark.oapi.service.corehr.v1.enums.ConvertCommonDataIdFeishuUserIdTypeEnum feishuUserIdType) {
            this.feishuUserIdType = feishuUserIdType.getValue();
            return this;
        }

        /**
         * 此次调用中使用的部门 ID 类型
         * <p> 示例值：open_department_id
         *
         * @param feishuDepartmentIdType
         * @return
         */
        public Builder feishuDepartmentIdType(String feishuDepartmentIdType) {
            this.feishuDepartmentIdType = feishuDepartmentIdType;
            return this;
        }

        /**
         * 此次调用中使用的部门 ID 类型
         * <p> 示例值：open_department_id
         *
         * @param feishuDepartmentIdType {@link com.lark.oapi.service.corehr.v1.enums.ConvertCommonDataIdFeishuDepartmentIdTypeEnum}
         * @return
         */
        public Builder feishuDepartmentIdType(com.lark.oapi.service.corehr.v1.enums.ConvertCommonDataIdFeishuDepartmentIdTypeEnum feishuDepartmentIdType) {
            this.feishuDepartmentIdType = feishuDepartmentIdType.getValue();
            return this;
        }

        public ConvertCommonDataIdReqBody getConvertCommonDataIdReqBody() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder convertCommonDataIdReqBody(ConvertCommonDataIdReqBody body) {
            this.body = body;
            return this;
        }

        public ConvertCommonDataIdReq build() {
            return new ConvertCommonDataIdReq(this);
        }
    }
}
