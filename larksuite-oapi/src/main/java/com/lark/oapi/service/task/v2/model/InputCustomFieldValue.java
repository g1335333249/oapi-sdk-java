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

public class InputCustomFieldValue {
    /**
     * 自定义字段guid
     * <p> 示例值：73b21903-0041-4796-a11e-f8be919a7063
     */
    @SerializedName("guid")
    private String guid;
    /**
     * 数字类型的自定义字段值，填写一个合法数字的字符串表示，空字符串表示设为空。
     * <p> 示例值：10.23
     */
    @SerializedName("number_value")
    private String numberValue;
    /**
     * 人员类型的自定义字段值。可以设置1个或多个用户的id（遵循member格式，只支持user类型）。当字段设为只不能多选时只能输入一个值。设为空数组表示设为空。
     * <p> 示例值：
     */
    @SerializedName("member_value")
    private Member[] memberValue;
    /**
     * 日期类型自定义字段值，可以输入一个表示日期的以毫秒为单位的字符串。设为空字符串表示设为空。
     * <p> 示例值：1698192000000
     */
    @SerializedName("datetime_value")
    private String datetimeValue;
    /**
     * 单选类型字段值，填写一个字段选项的option_guid。设置为空字符串表示设为空。
     * <p> 示例值：73b21903-0041-4796-a11e-f8be919a7063
     */
    @SerializedName("single_select_value")
    private String singleSelectValue;
    /**
     * 多选类型字段值，可以填写一个或多个本字段的option_guid。设为空数组表示设为空。
     * <p> 示例值：
     */
    @SerializedName("multi_select_value")
    private String[] multiSelectValue;
    /**
     * 文本类型字段值。可以填写最多3000字符。使用空字符串表示设为空。
     * <p> 示例值：文本类型字段值。可以输入一段文本。空字符串表示清空。
     */
    @SerializedName("text_value")
    private String textValue;

    // builder 开始
    public InputCustomFieldValue() {
    }

    public InputCustomFieldValue(Builder builder) {
        /**
         * 自定义字段guid
         * <p> 示例值：73b21903-0041-4796-a11e-f8be919a7063
         */
        this.guid = builder.guid;
        /**
         * 数字类型的自定义字段值，填写一个合法数字的字符串表示，空字符串表示设为空。
         * <p> 示例值：10.23
         */
        this.numberValue = builder.numberValue;
        /**
         * 人员类型的自定义字段值。可以设置1个或多个用户的id（遵循member格式，只支持user类型）。当字段设为只不能多选时只能输入一个值。设为空数组表示设为空。
         * <p> 示例值：
         */
        this.memberValue = builder.memberValue;
        /**
         * 日期类型自定义字段值，可以输入一个表示日期的以毫秒为单位的字符串。设为空字符串表示设为空。
         * <p> 示例值：1698192000000
         */
        this.datetimeValue = builder.datetimeValue;
        /**
         * 单选类型字段值，填写一个字段选项的option_guid。设置为空字符串表示设为空。
         * <p> 示例值：73b21903-0041-4796-a11e-f8be919a7063
         */
        this.singleSelectValue = builder.singleSelectValue;
        /**
         * 多选类型字段值，可以填写一个或多个本字段的option_guid。设为空数组表示设为空。
         * <p> 示例值：
         */
        this.multiSelectValue = builder.multiSelectValue;
        /**
         * 文本类型字段值。可以填写最多3000字符。使用空字符串表示设为空。
         * <p> 示例值：文本类型字段值。可以输入一段文本。空字符串表示清空。
         */
        this.textValue = builder.textValue;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getGuid() {
        return this.guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getNumberValue() {
        return this.numberValue;
    }

    public void setNumberValue(String numberValue) {
        this.numberValue = numberValue;
    }

    public Member[] getMemberValue() {
        return this.memberValue;
    }

    public void setMemberValue(Member[] memberValue) {
        this.memberValue = memberValue;
    }

    public String getDatetimeValue() {
        return this.datetimeValue;
    }

    public void setDatetimeValue(String datetimeValue) {
        this.datetimeValue = datetimeValue;
    }

    public String getSingleSelectValue() {
        return this.singleSelectValue;
    }

    public void setSingleSelectValue(String singleSelectValue) {
        this.singleSelectValue = singleSelectValue;
    }

    public String[] getMultiSelectValue() {
        return this.multiSelectValue;
    }

    public void setMultiSelectValue(String[] multiSelectValue) {
        this.multiSelectValue = multiSelectValue;
    }

    public String getTextValue() {
        return this.textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public static class Builder {
        /**
         * 自定义字段guid
         * <p> 示例值：73b21903-0041-4796-a11e-f8be919a7063
         */
        private String guid;
        /**
         * 数字类型的自定义字段值，填写一个合法数字的字符串表示，空字符串表示设为空。
         * <p> 示例值：10.23
         */
        private String numberValue;
        /**
         * 人员类型的自定义字段值。可以设置1个或多个用户的id（遵循member格式，只支持user类型）。当字段设为只不能多选时只能输入一个值。设为空数组表示设为空。
         * <p> 示例值：
         */
        private Member[] memberValue;
        /**
         * 日期类型自定义字段值，可以输入一个表示日期的以毫秒为单位的字符串。设为空字符串表示设为空。
         * <p> 示例值：1698192000000
         */
        private String datetimeValue;
        /**
         * 单选类型字段值，填写一个字段选项的option_guid。设置为空字符串表示设为空。
         * <p> 示例值：73b21903-0041-4796-a11e-f8be919a7063
         */
        private String singleSelectValue;
        /**
         * 多选类型字段值，可以填写一个或多个本字段的option_guid。设为空数组表示设为空。
         * <p> 示例值：
         */
        private String[] multiSelectValue;
        /**
         * 文本类型字段值。可以填写最多3000字符。使用空字符串表示设为空。
         * <p> 示例值：文本类型字段值。可以输入一段文本。空字符串表示清空。
         */
        private String textValue;

        /**
         * 自定义字段guid
         * <p> 示例值：73b21903-0041-4796-a11e-f8be919a7063
         *
         * @param guid
         * @return
         */
        public Builder guid(String guid) {
            this.guid = guid;
            return this;
        }


        /**
         * 数字类型的自定义字段值，填写一个合法数字的字符串表示，空字符串表示设为空。
         * <p> 示例值：10.23
         *
         * @param numberValue
         * @return
         */
        public Builder numberValue(String numberValue) {
            this.numberValue = numberValue;
            return this;
        }


        /**
         * 人员类型的自定义字段值。可以设置1个或多个用户的id（遵循member格式，只支持user类型）。当字段设为只不能多选时只能输入一个值。设为空数组表示设为空。
         * <p> 示例值：
         *
         * @param memberValue
         * @return
         */
        public Builder memberValue(Member[] memberValue) {
            this.memberValue = memberValue;
            return this;
        }


        /**
         * 日期类型自定义字段值，可以输入一个表示日期的以毫秒为单位的字符串。设为空字符串表示设为空。
         * <p> 示例值：1698192000000
         *
         * @param datetimeValue
         * @return
         */
        public Builder datetimeValue(String datetimeValue) {
            this.datetimeValue = datetimeValue;
            return this;
        }


        /**
         * 单选类型字段值，填写一个字段选项的option_guid。设置为空字符串表示设为空。
         * <p> 示例值：73b21903-0041-4796-a11e-f8be919a7063
         *
         * @param singleSelectValue
         * @return
         */
        public Builder singleSelectValue(String singleSelectValue) {
            this.singleSelectValue = singleSelectValue;
            return this;
        }


        /**
         * 多选类型字段值，可以填写一个或多个本字段的option_guid。设为空数组表示设为空。
         * <p> 示例值：
         *
         * @param multiSelectValue
         * @return
         */
        public Builder multiSelectValue(String[] multiSelectValue) {
            this.multiSelectValue = multiSelectValue;
            return this;
        }


        /**
         * 文本类型字段值。可以填写最多3000字符。使用空字符串表示设为空。
         * <p> 示例值：文本类型字段值。可以输入一段文本。空字符串表示清空。
         *
         * @param textValue
         * @return
         */
        public Builder textValue(String textValue) {
            this.textValue = textValue;
            return this;
        }


        public InputCustomFieldValue build() {
            return new InputCustomFieldValue(this);
        }
    }
}