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

public class CommonSchemaConfig {
    /**
     * 文本配置信息
     * <p> 示例值：
     */
    @SerializedName("text_field_setting")
    private TextFieldSetting textFieldSetting;
    /**
     * 数字配置信息
     * <p> 示例值：
     */
    @SerializedName("number_field_setting")
    private NumberFieldSetting numberFieldSetting;
    /**
     * 选项配置信息
     * <p> 示例值：
     */
    @SerializedName("enum_field_setting")
    private EnumFieldSetting enumFieldSetting;
    /**
     * 查找字段配置信息
     * <p> 示例值：
     */
    @SerializedName("lookup_field_setting")
    private LookupFieldSetting lookupFieldSetting;
    /**
     * 日期时间配置信息
     * <p> 示例值：
     */
    @SerializedName("date_time_field_setting")
    private DateTimeFieldSetting dateTimeFieldSetting;
    /**
     * 附件配置信息
     * <p> 示例值：
     */
    @SerializedName("attachment_field_setting")
    private AttachmentFieldSetting attachmentFieldSetting;
    /**
     * 图片配置信息
     * <p> 示例值：
     */
    @SerializedName("image_field_setting")
    private ImageFieldSetting imageFieldSetting;

    // builder 开始
    public CommonSchemaConfig() {
    }

    public CommonSchemaConfig(Builder builder) {
        /**
         * 文本配置信息
         * <p> 示例值：
         */
        this.textFieldSetting = builder.textFieldSetting;
        /**
         * 数字配置信息
         * <p> 示例值：
         */
        this.numberFieldSetting = builder.numberFieldSetting;
        /**
         * 选项配置信息
         * <p> 示例值：
         */
        this.enumFieldSetting = builder.enumFieldSetting;
        /**
         * 查找字段配置信息
         * <p> 示例值：
         */
        this.lookupFieldSetting = builder.lookupFieldSetting;
        /**
         * 日期时间配置信息
         * <p> 示例值：
         */
        this.dateTimeFieldSetting = builder.dateTimeFieldSetting;
        /**
         * 附件配置信息
         * <p> 示例值：
         */
        this.attachmentFieldSetting = builder.attachmentFieldSetting;
        /**
         * 图片配置信息
         * <p> 示例值：
         */
        this.imageFieldSetting = builder.imageFieldSetting;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public TextFieldSetting getTextFieldSetting() {
        return this.textFieldSetting;
    }

    public void setTextFieldSetting(TextFieldSetting textFieldSetting) {
        this.textFieldSetting = textFieldSetting;
    }

    public NumberFieldSetting getNumberFieldSetting() {
        return this.numberFieldSetting;
    }

    public void setNumberFieldSetting(NumberFieldSetting numberFieldSetting) {
        this.numberFieldSetting = numberFieldSetting;
    }

    public EnumFieldSetting getEnumFieldSetting() {
        return this.enumFieldSetting;
    }

    public void setEnumFieldSetting(EnumFieldSetting enumFieldSetting) {
        this.enumFieldSetting = enumFieldSetting;
    }

    public LookupFieldSetting getLookupFieldSetting() {
        return this.lookupFieldSetting;
    }

    public void setLookupFieldSetting(LookupFieldSetting lookupFieldSetting) {
        this.lookupFieldSetting = lookupFieldSetting;
    }

    public DateTimeFieldSetting getDateTimeFieldSetting() {
        return this.dateTimeFieldSetting;
    }

    public void setDateTimeFieldSetting(DateTimeFieldSetting dateTimeFieldSetting) {
        this.dateTimeFieldSetting = dateTimeFieldSetting;
    }

    public AttachmentFieldSetting getAttachmentFieldSetting() {
        return this.attachmentFieldSetting;
    }

    public void setAttachmentFieldSetting(AttachmentFieldSetting attachmentFieldSetting) {
        this.attachmentFieldSetting = attachmentFieldSetting;
    }

    public ImageFieldSetting getImageFieldSetting() {
        return this.imageFieldSetting;
    }

    public void setImageFieldSetting(ImageFieldSetting imageFieldSetting) {
        this.imageFieldSetting = imageFieldSetting;
    }

    public static class Builder {
        /**
         * 文本配置信息
         * <p> 示例值：
         */
        private TextFieldSetting textFieldSetting;
        /**
         * 数字配置信息
         * <p> 示例值：
         */
        private NumberFieldSetting numberFieldSetting;
        /**
         * 选项配置信息
         * <p> 示例值：
         */
        private EnumFieldSetting enumFieldSetting;
        /**
         * 查找字段配置信息
         * <p> 示例值：
         */
        private LookupFieldSetting lookupFieldSetting;
        /**
         * 日期时间配置信息
         * <p> 示例值：
         */
        private DateTimeFieldSetting dateTimeFieldSetting;
        /**
         * 附件配置信息
         * <p> 示例值：
         */
        private AttachmentFieldSetting attachmentFieldSetting;
        /**
         * 图片配置信息
         * <p> 示例值：
         */
        private ImageFieldSetting imageFieldSetting;

        /**
         * 文本配置信息
         * <p> 示例值：
         *
         * @param textFieldSetting
         * @return
         */
        public Builder textFieldSetting(TextFieldSetting textFieldSetting) {
            this.textFieldSetting = textFieldSetting;
            return this;
        }


        /**
         * 数字配置信息
         * <p> 示例值：
         *
         * @param numberFieldSetting
         * @return
         */
        public Builder numberFieldSetting(NumberFieldSetting numberFieldSetting) {
            this.numberFieldSetting = numberFieldSetting;
            return this;
        }


        /**
         * 选项配置信息
         * <p> 示例值：
         *
         * @param enumFieldSetting
         * @return
         */
        public Builder enumFieldSetting(EnumFieldSetting enumFieldSetting) {
            this.enumFieldSetting = enumFieldSetting;
            return this;
        }


        /**
         * 查找字段配置信息
         * <p> 示例值：
         *
         * @param lookupFieldSetting
         * @return
         */
        public Builder lookupFieldSetting(LookupFieldSetting lookupFieldSetting) {
            this.lookupFieldSetting = lookupFieldSetting;
            return this;
        }


        /**
         * 日期时间配置信息
         * <p> 示例值：
         *
         * @param dateTimeFieldSetting
         * @return
         */
        public Builder dateTimeFieldSetting(DateTimeFieldSetting dateTimeFieldSetting) {
            this.dateTimeFieldSetting = dateTimeFieldSetting;
            return this;
        }


        /**
         * 附件配置信息
         * <p> 示例值：
         *
         * @param attachmentFieldSetting
         * @return
         */
        public Builder attachmentFieldSetting(AttachmentFieldSetting attachmentFieldSetting) {
            this.attachmentFieldSetting = attachmentFieldSetting;
            return this;
        }


        /**
         * 图片配置信息
         * <p> 示例值：
         *
         * @param imageFieldSetting
         * @return
         */
        public Builder imageFieldSetting(ImageFieldSetting imageFieldSetting) {
            this.imageFieldSetting = imageFieldSetting;
            return this;
        }


        public CommonSchemaConfig build() {
            return new CommonSchemaConfig(this);
        }
    }
}
