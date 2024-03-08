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

package com.lark.oapi.service.approval.v4.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.approval.v4.enums.*;
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

public class TrusteeshipUrls {
    /**
     * 获取表单schema相关数据的url地址
     * <p> 示例值：https://#{your_domain}/api/form_detail
     */
    @SerializedName("form_detail_url")
    private String formDetailUrl;
    /**
     * 表示获取审批操作区数据的url地址
     * <p> 示例值：https://#{your_domain}/api/action_definition
     */
    @SerializedName("action_definition_url")
    private String actionDefinitionUrl;
    /**
     * 获取审批记录相关数据的url地址
     * <p> 示例值：https://#{your_domain}/api/approval_node
     */
    @SerializedName("approval_node_url")
    private String approvalNodeUrl;
    /**
     * 进行审批操作时回调的url地址
     * <p> 示例值：https://#{your_domain}/api/approval_node
     */
    @SerializedName("action_callback_url")
    private String actionCallbackUrl;
    /**
     * 获取托管动态数据URL,使用该接口时必须要保证历史托管单据的数据中都同步了该接口地址,如果历史单据中没有该接口需要重新同步历史托管单据的数据来更新该URL
     * <p> 示例值：https://#{your_domain}/api/pull_business_data
     */
    @SerializedName("pull_business_data_url")
    private String pullBusinessDataUrl;

    // builder 开始
    public TrusteeshipUrls() {
    }

    public TrusteeshipUrls(Builder builder) {
        /**
         * 获取表单schema相关数据的url地址
         * <p> 示例值：https://#{your_domain}/api/form_detail
         */
        this.formDetailUrl = builder.formDetailUrl;
        /**
         * 表示获取审批操作区数据的url地址
         * <p> 示例值：https://#{your_domain}/api/action_definition
         */
        this.actionDefinitionUrl = builder.actionDefinitionUrl;
        /**
         * 获取审批记录相关数据的url地址
         * <p> 示例值：https://#{your_domain}/api/approval_node
         */
        this.approvalNodeUrl = builder.approvalNodeUrl;
        /**
         * 进行审批操作时回调的url地址
         * <p> 示例值：https://#{your_domain}/api/approval_node
         */
        this.actionCallbackUrl = builder.actionCallbackUrl;
        /**
         * 获取托管动态数据URL,使用该接口时必须要保证历史托管单据的数据中都同步了该接口地址,如果历史单据中没有该接口需要重新同步历史托管单据的数据来更新该URL
         * <p> 示例值：https://#{your_domain}/api/pull_business_data
         */
        this.pullBusinessDataUrl = builder.pullBusinessDataUrl;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFormDetailUrl() {
        return this.formDetailUrl;
    }

    public void setFormDetailUrl(String formDetailUrl) {
        this.formDetailUrl = formDetailUrl;
    }

    public String getActionDefinitionUrl() {
        return this.actionDefinitionUrl;
    }

    public void setActionDefinitionUrl(String actionDefinitionUrl) {
        this.actionDefinitionUrl = actionDefinitionUrl;
    }

    public String getApprovalNodeUrl() {
        return this.approvalNodeUrl;
    }

    public void setApprovalNodeUrl(String approvalNodeUrl) {
        this.approvalNodeUrl = approvalNodeUrl;
    }

    public String getActionCallbackUrl() {
        return this.actionCallbackUrl;
    }

    public void setActionCallbackUrl(String actionCallbackUrl) {
        this.actionCallbackUrl = actionCallbackUrl;
    }

    public String getPullBusinessDataUrl() {
        return this.pullBusinessDataUrl;
    }

    public void setPullBusinessDataUrl(String pullBusinessDataUrl) {
        this.pullBusinessDataUrl = pullBusinessDataUrl;
    }

    public static class Builder {
        /**
         * 获取表单schema相关数据的url地址
         * <p> 示例值：https://#{your_domain}/api/form_detail
         */
        private String formDetailUrl;
        /**
         * 表示获取审批操作区数据的url地址
         * <p> 示例值：https://#{your_domain}/api/action_definition
         */
        private String actionDefinitionUrl;
        /**
         * 获取审批记录相关数据的url地址
         * <p> 示例值：https://#{your_domain}/api/approval_node
         */
        private String approvalNodeUrl;
        /**
         * 进行审批操作时回调的url地址
         * <p> 示例值：https://#{your_domain}/api/approval_node
         */
        private String actionCallbackUrl;
        /**
         * 获取托管动态数据URL,使用该接口时必须要保证历史托管单据的数据中都同步了该接口地址,如果历史单据中没有该接口需要重新同步历史托管单据的数据来更新该URL
         * <p> 示例值：https://#{your_domain}/api/pull_business_data
         */
        private String pullBusinessDataUrl;

        /**
         * 获取表单schema相关数据的url地址
         * <p> 示例值：https://#{your_domain}/api/form_detail
         *
         * @param formDetailUrl
         * @return
         */
        public Builder formDetailUrl(String formDetailUrl) {
            this.formDetailUrl = formDetailUrl;
            return this;
        }


        /**
         * 表示获取审批操作区数据的url地址
         * <p> 示例值：https://#{your_domain}/api/action_definition
         *
         * @param actionDefinitionUrl
         * @return
         */
        public Builder actionDefinitionUrl(String actionDefinitionUrl) {
            this.actionDefinitionUrl = actionDefinitionUrl;
            return this;
        }


        /**
         * 获取审批记录相关数据的url地址
         * <p> 示例值：https://#{your_domain}/api/approval_node
         *
         * @param approvalNodeUrl
         * @return
         */
        public Builder approvalNodeUrl(String approvalNodeUrl) {
            this.approvalNodeUrl = approvalNodeUrl;
            return this;
        }


        /**
         * 进行审批操作时回调的url地址
         * <p> 示例值：https://#{your_domain}/api/approval_node
         *
         * @param actionCallbackUrl
         * @return
         */
        public Builder actionCallbackUrl(String actionCallbackUrl) {
            this.actionCallbackUrl = actionCallbackUrl;
            return this;
        }


        /**
         * 获取托管动态数据URL,使用该接口时必须要保证历史托管单据的数据中都同步了该接口地址,如果历史单据中没有该接口需要重新同步历史托管单据的数据来更新该URL
         * <p> 示例值：https://#{your_domain}/api/pull_business_data
         *
         * @param pullBusinessDataUrl
         * @return
         */
        public Builder pullBusinessDataUrl(String pullBusinessDataUrl) {
            this.pullBusinessDataUrl = pullBusinessDataUrl;
            return this;
        }


        public TrusteeshipUrls build() {
            return new TrusteeshipUrls(this);
        }
    }
}
