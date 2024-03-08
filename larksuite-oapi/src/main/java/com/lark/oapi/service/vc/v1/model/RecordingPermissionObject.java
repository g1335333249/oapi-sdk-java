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

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.vc.v1.enums.*;
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

public class RecordingPermissionObject {
    /**
     * 授权对象ID
     * <p> 示例值：ou_3ec3f6a28a0d08c45d895276e8e5e19b
     */
    @SerializedName("id")
    private String id;
    /**
     * 授权对象类型
     * <p> 示例值：1
     */
    @SerializedName("type")
    private Integer type;
    /**
     * 权限
     * <p> 示例值：1
     */
    @SerializedName("permission")
    private Integer permission;

    // builder 开始
    public RecordingPermissionObject() {
    }

    public RecordingPermissionObject(Builder builder) {
        /**
         * 授权对象ID
         * <p> 示例值：ou_3ec3f6a28a0d08c45d895276e8e5e19b
         */
        this.id = builder.id;
        /**
         * 授权对象类型
         * <p> 示例值：1
         */
        this.type = builder.type;
        /**
         * 权限
         * <p> 示例值：1
         */
        this.permission = builder.permission;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPermission() {
        return this.permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    public static class Builder {
        /**
         * 授权对象ID
         * <p> 示例值：ou_3ec3f6a28a0d08c45d895276e8e5e19b
         */
        private String id;
        /**
         * 授权对象类型
         * <p> 示例值：1
         */
        private Integer type;
        /**
         * 权限
         * <p> 示例值：1
         */
        private Integer permission;

        /**
         * 授权对象ID
         * <p> 示例值：ou_3ec3f6a28a0d08c45d895276e8e5e19b
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 授权对象类型
         * <p> 示例值：1
         *
         * @param type
         * @return
         */
        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        /**
         * 授权对象类型
         * <p> 示例值：1
         *
         * @param type {@link com.lark.oapi.service.vc.v1.enums.RecordingPermissionObjectAuthTypeEnum}
         * @return
         */
        public Builder type(com.lark.oapi.service.vc.v1.enums.RecordingPermissionObjectAuthTypeEnum type) {
            this.type = type.getValue();
            return this;
        }


        /**
         * 权限
         * <p> 示例值：1
         *
         * @param permission
         * @return
         */
        public Builder permission(Integer permission) {
            this.permission = permission;
            return this;
        }

        /**
         * 权限
         * <p> 示例值：1
         *
         * @param permission {@link com.lark.oapi.service.vc.v1.enums.RecordingPermissionObjectPermTypeEnum}
         * @return
         */
        public Builder permission(com.lark.oapi.service.vc.v1.enums.RecordingPermissionObjectPermTypeEnum permission) {
            this.permission = permission.getValue();
            return this;
        }


        public RecordingPermissionObject build() {
            return new RecordingPermissionObject(this);
        }
    }
}
