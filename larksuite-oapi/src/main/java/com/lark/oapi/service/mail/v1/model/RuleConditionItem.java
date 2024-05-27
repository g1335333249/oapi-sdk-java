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

package com.lark.oapi.service.mail.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.mail.v1.enums.*;
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

public class RuleConditionItem {
    /**
     * 匹配条件左值
     * <p> 示例值：1
     */
    @SerializedName("type")
    private Integer type;
    /**
     * 匹配条件操作符
     * <p> 示例值：1
     */
    @SerializedName("operator")
    private Integer operator;
    /**
     * 匹配条件右值
     * <p> 示例值：hello@world.com
     */
    @SerializedName("input")
    private String input;

    // builder 开始
    public RuleConditionItem() {
    }

    public RuleConditionItem(Builder builder) {
        /**
         * 匹配条件左值
         * <p> 示例值：1
         */
        this.type = builder.type;
        /**
         * 匹配条件操作符
         * <p> 示例值：1
         */
        this.operator = builder.operator;
        /**
         * 匹配条件右值
         * <p> 示例值：hello@world.com
         */
        this.input = builder.input;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getOperator() {
        return this.operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    public String getInput() {
        return this.input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public static class Builder {
        /**
         * 匹配条件左值
         * <p> 示例值：1
         */
        private Integer type;
        /**
         * 匹配条件操作符
         * <p> 示例值：1
         */
        private Integer operator;
        /**
         * 匹配条件右值
         * <p> 示例值：hello@world.com
         */
        private String input;

        /**
         * 匹配条件左值
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
         * 匹配条件左值
         * <p> 示例值：1
         *
         * @param type {@link com.lark.oapi.service.mail.v1.enums.RuleConditionItemRuleConditionItemTypeEnum}
         * @return
         */
        public Builder type(com.lark.oapi.service.mail.v1.enums.RuleConditionItemRuleConditionItemTypeEnum type) {
            this.type = type.getValue();
            return this;
        }


        /**
         * 匹配条件操作符
         * <p> 示例值：1
         *
         * @param operator
         * @return
         */
        public Builder operator(Integer operator) {
            this.operator = operator;
            return this;
        }

        /**
         * 匹配条件操作符
         * <p> 示例值：1
         *
         * @param operator {@link com.lark.oapi.service.mail.v1.enums.RuleConditionItemRuleConditionItemOperatorEnum}
         * @return
         */
        public Builder operator(com.lark.oapi.service.mail.v1.enums.RuleConditionItemRuleConditionItemOperatorEnum operator) {
            this.operator = operator.getValue();
            return this;
        }


        /**
         * 匹配条件右值
         * <p> 示例值：hello@world.com
         *
         * @param input
         * @return
         */
        public Builder input(String input) {
            this.input = input;
            return this;
        }


        public RuleConditionItem build() {
            return new RuleConditionItem(this);
        }
    }
}