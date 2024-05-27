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

package com.lark.oapi.service.task.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.task.v2.enums.*;
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

public class AddCustomFieldReqBody {
    /**
     * 要将自定义字段添加到一个资源的资源类型。目前只支持tasklist
     * <p> 示例值：tasklist
     */
    @SerializedName("resource_type")
    private String resourceType;
    /**
     * 要将自定义字段添加到的资源id，目前只支持tasklist_guid
     * <p> 示例值：0110a4bd-f24b-4a93-8c1a-1732b94f9593
     */
    @SerializedName("resource_id")
    private String resourceId;

    // builder 开始
    public AddCustomFieldReqBody() {
    }

    public AddCustomFieldReqBody(Builder builder) {
        /**
         * 要将自定义字段添加到一个资源的资源类型。目前只支持tasklist
         * <p> 示例值：tasklist
         */
        this.resourceType = builder.resourceType;
        /**
         * 要将自定义字段添加到的资源id，目前只支持tasklist_guid
         * <p> 示例值：0110a4bd-f24b-4a93-8c1a-1732b94f9593
         */
        this.resourceId = builder.resourceId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getResourceType() {
        return this.resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public static class Builder {
        /**
         * 要将自定义字段添加到一个资源的资源类型。目前只支持tasklist
         * <p> 示例值：tasklist
         */
        private String resourceType;
        /**
         * 要将自定义字段添加到的资源id，目前只支持tasklist_guid
         * <p> 示例值：0110a4bd-f24b-4a93-8c1a-1732b94f9593
         */
        private String resourceId;

        /**
         * 要将自定义字段添加到一个资源的资源类型。目前只支持tasklist
         * <p> 示例值：tasklist
         *
         * @param resourceType
         * @return
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }


        /**
         * 要将自定义字段添加到的资源id，目前只支持tasklist_guid
         * <p> 示例值：0110a4bd-f24b-4a93-8c1a-1732b94f9593
         *
         * @param resourceId
         * @return
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }


        public AddCustomFieldReqBody build() {
            return new AddCustomFieldReqBody(this);
        }
    }
}