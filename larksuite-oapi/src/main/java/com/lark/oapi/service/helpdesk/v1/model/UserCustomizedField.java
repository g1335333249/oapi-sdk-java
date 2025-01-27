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

package com.lark.oapi.service.helpdesk.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.helpdesk.v1.enums.*;
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

public class UserCustomizedField {
    /**
     * 字段ID
     * <p> 示例值：6746384425543548981
     */
    @SerializedName("user_customized_field_id")
    private String userCustomizedFieldId;
    /**
     * 旧字段ID，向后兼容用
     * <p> 示例值：6746384425543548981
     */
    @SerializedName("id")
    private String id;
    /**
     * 服务台ID
     * <p> 示例值：1542164574896126
     */
    @SerializedName("helpdesk_id")
    private String helpdeskId;
    /**
     * 字段键
     * <p> 示例值：company_id3
     */
    @SerializedName("key_name")
    private String keyName;
    /**
     * 字段展示名称
     * <p> 示例值：Company ID
     */
    @SerializedName("display_name")
    private String displayName;
    /**
     * 字段在列表中的展示位置
     * <p> 示例值：1
     */
    @SerializedName("position")
    private String position;
    /**
     * 字段类型
     * <p> 示例值：string
     */
    @SerializedName("field_type")
    private String fieldType;
    /**
     * 字段描述信息
     * <p> 示例值：租户ID
     */
    @SerializedName("description")
    private String description;
    /**
     * 字段是否可见
     * <p> 示例值：false
     */
    @SerializedName("visible")
    private Boolean visible;
    /**
     * 字段是否可编辑
     * <p> 示例值：false
     */
    @SerializedName("editable")
    private Boolean editable;
    /**
     * 字段是否必填
     * <p> 示例值：false
     */
    @SerializedName("required")
    private Boolean required;
    /**
     * 字段创建时间
     * <p> 示例值：1574040677000
     */
    @SerializedName("created_at")
    private String createdAt;
    /**
     * 字段修改时间
     * <p> 示例值：1574040677000
     */
    @SerializedName("updated_at")
    private String updatedAt;

    // builder 开始
    public UserCustomizedField() {
    }

    public UserCustomizedField(Builder builder) {
        /**
         * 字段ID
         * <p> 示例值：6746384425543548981
         */
        this.userCustomizedFieldId = builder.userCustomizedFieldId;
        /**
         * 旧字段ID，向后兼容用
         * <p> 示例值：6746384425543548981
         */
        this.id = builder.id;
        /**
         * 服务台ID
         * <p> 示例值：1542164574896126
         */
        this.helpdeskId = builder.helpdeskId;
        /**
         * 字段键
         * <p> 示例值：company_id3
         */
        this.keyName = builder.keyName;
        /**
         * 字段展示名称
         * <p> 示例值：Company ID
         */
        this.displayName = builder.displayName;
        /**
         * 字段在列表中的展示位置
         * <p> 示例值：1
         */
        this.position = builder.position;
        /**
         * 字段类型
         * <p> 示例值：string
         */
        this.fieldType = builder.fieldType;
        /**
         * 字段描述信息
         * <p> 示例值：租户ID
         */
        this.description = builder.description;
        /**
         * 字段是否可见
         * <p> 示例值：false
         */
        this.visible = builder.visible;
        /**
         * 字段是否可编辑
         * <p> 示例值：false
         */
        this.editable = builder.editable;
        /**
         * 字段是否必填
         * <p> 示例值：false
         */
        this.required = builder.required;
        /**
         * 字段创建时间
         * <p> 示例值：1574040677000
         */
        this.createdAt = builder.createdAt;
        /**
         * 字段修改时间
         * <p> 示例值：1574040677000
         */
        this.updatedAt = builder.updatedAt;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserCustomizedFieldId() {
        return this.userCustomizedFieldId;
    }

    public void setUserCustomizedFieldId(String userCustomizedFieldId) {
        this.userCustomizedFieldId = userCustomizedFieldId;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHelpdeskId() {
        return this.helpdeskId;
    }

    public void setHelpdeskId(String helpdeskId) {
        this.helpdeskId = helpdeskId;
    }

    public String getKeyName() {
        return this.keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFieldType() {
        return this.fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getVisible() {
        return this.visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Boolean getEditable() {
        return this.editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    public Boolean getRequired() {
        return this.required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public static class Builder {
        /**
         * 字段ID
         * <p> 示例值：6746384425543548981
         */
        private String userCustomizedFieldId;
        /**
         * 旧字段ID，向后兼容用
         * <p> 示例值：6746384425543548981
         */
        private String id;
        /**
         * 服务台ID
         * <p> 示例值：1542164574896126
         */
        private String helpdeskId;
        /**
         * 字段键
         * <p> 示例值：company_id3
         */
        private String keyName;
        /**
         * 字段展示名称
         * <p> 示例值：Company ID
         */
        private String displayName;
        /**
         * 字段在列表中的展示位置
         * <p> 示例值：1
         */
        private String position;
        /**
         * 字段类型
         * <p> 示例值：string
         */
        private String fieldType;
        /**
         * 字段描述信息
         * <p> 示例值：租户ID
         */
        private String description;
        /**
         * 字段是否可见
         * <p> 示例值：false
         */
        private Boolean visible;
        /**
         * 字段是否可编辑
         * <p> 示例值：false
         */
        private Boolean editable;
        /**
         * 字段是否必填
         * <p> 示例值：false
         */
        private Boolean required;
        /**
         * 字段创建时间
         * <p> 示例值：1574040677000
         */
        private String createdAt;
        /**
         * 字段修改时间
         * <p> 示例值：1574040677000
         */
        private String updatedAt;

        /**
         * 字段ID
         * <p> 示例值：6746384425543548981
         *
         * @param userCustomizedFieldId
         * @return
         */
        public Builder userCustomizedFieldId(String userCustomizedFieldId) {
            this.userCustomizedFieldId = userCustomizedFieldId;
            return this;
        }


        /**
         * 旧字段ID，向后兼容用
         * <p> 示例值：6746384425543548981
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 服务台ID
         * <p> 示例值：1542164574896126
         *
         * @param helpdeskId
         * @return
         */
        public Builder helpdeskId(String helpdeskId) {
            this.helpdeskId = helpdeskId;
            return this;
        }


        /**
         * 字段键
         * <p> 示例值：company_id3
         *
         * @param keyName
         * @return
         */
        public Builder keyName(String keyName) {
            this.keyName = keyName;
            return this;
        }


        /**
         * 字段展示名称
         * <p> 示例值：Company ID
         *
         * @param displayName
         * @return
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }


        /**
         * 字段在列表中的展示位置
         * <p> 示例值：1
         *
         * @param position
         * @return
         */
        public Builder position(String position) {
            this.position = position;
            return this;
        }


        /**
         * 字段类型
         * <p> 示例值：string
         *
         * @param fieldType
         * @return
         */
        public Builder fieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }


        /**
         * 字段描述信息
         * <p> 示例值：租户ID
         *
         * @param description
         * @return
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }


        /**
         * 字段是否可见
         * <p> 示例值：false
         *
         * @param visible
         * @return
         */
        public Builder visible(Boolean visible) {
            this.visible = visible;
            return this;
        }


        /**
         * 字段是否可编辑
         * <p> 示例值：false
         *
         * @param editable
         * @return
         */
        public Builder editable(Boolean editable) {
            this.editable = editable;
            return this;
        }


        /**
         * 字段是否必填
         * <p> 示例值：false
         *
         * @param required
         * @return
         */
        public Builder required(Boolean required) {
            this.required = required;
            return this;
        }


        /**
         * 字段创建时间
         * <p> 示例值：1574040677000
         *
         * @param createdAt
         * @return
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }


        /**
         * 字段修改时间
         * <p> 示例值：1574040677000
         *
         * @param updatedAt
         * @return
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }


        public UserCustomizedField build() {
            return new UserCustomizedField(this);
        }
    }
}
