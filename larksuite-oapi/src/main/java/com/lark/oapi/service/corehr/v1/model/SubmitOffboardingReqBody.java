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

public class SubmitOffboardingReqBody {
    /**
     * 离职方式
     * <p> 示例值：1
     */
    @SerializedName("offboarding_mode")
    private Integer offboardingMode;
    /**
     * 雇员 id
     * <p> 示例值：6982509313466189342
     */
    @SerializedName("employment_id")
    private String employmentId;
    /**
     * 离职日期
     * <p> 示例值：2022-05-18
     */
    @SerializedName("offboarding_date")
    private String offboardingDate;
    /**
     * 离职原因，可通过接口;[【查询员工离职原因列表】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/offboarding/query)获取
     * <p> 示例值：reason_for_offboarding_option8
     */
    @SerializedName("offboarding_reason_unique_identifier")
    private String offboardingReasonUniqueIdentifier;
    /**
     * 离职原因说明，长度限制6000
     * <p> 示例值：离职原因说明
     */
    @SerializedName("offboarding_reason_explanation")
    private String offboardingReasonExplanation;
    /**
     * 操作发起人 ID（employment_id），为空默认为系统发起。注意：只有操作发起人可以撤销流程
     * <p> 示例值：6982509313466189341
     */
    @SerializedName("initiator_id")
    private String initiatorId;
    /**
     * 是否加入离职屏蔽名单
     * <p> 示例值：false
     */
    @SerializedName("add_block_list")
    private Boolean addBlockList;
    /**
     * 屏蔽原因
     * <p> 示例值：红线
     */
    @SerializedName("block_reason")
    private String blockReason;
    /**
     * 屏蔽原因说明
     * <p> 示例值：xx 年 xx 月 xx 日因 xx 原因红线
     */
    @SerializedName("block_reason_explanation")
    private String blockReasonExplanation;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("custom_fields")
    private ObjectFieldData[] customFields;

    // builder 开始
    public SubmitOffboardingReqBody() {
    }

    public SubmitOffboardingReqBody(Builder builder) {
        /**
         * 离职方式
         * <p> 示例值：1
         */
        this.offboardingMode = builder.offboardingMode;
        /**
         * 雇员 id
         * <p> 示例值：6982509313466189342
         */
        this.employmentId = builder.employmentId;
        /**
         * 离职日期
         * <p> 示例值：2022-05-18
         */
        this.offboardingDate = builder.offboardingDate;
        /**
         * 离职原因，可通过接口;[【查询员工离职原因列表】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/offboarding/query)获取
         * <p> 示例值：reason_for_offboarding_option8
         */
        this.offboardingReasonUniqueIdentifier = builder.offboardingReasonUniqueIdentifier;
        /**
         * 离职原因说明，长度限制6000
         * <p> 示例值：离职原因说明
         */
        this.offboardingReasonExplanation = builder.offboardingReasonExplanation;
        /**
         * 操作发起人 ID（employment_id），为空默认为系统发起。注意：只有操作发起人可以撤销流程
         * <p> 示例值：6982509313466189341
         */
        this.initiatorId = builder.initiatorId;
        /**
         * 是否加入离职屏蔽名单
         * <p> 示例值：false
         */
        this.addBlockList = builder.addBlockList;
        /**
         * 屏蔽原因
         * <p> 示例值：红线
         */
        this.blockReason = builder.blockReason;
        /**
         * 屏蔽原因说明
         * <p> 示例值：xx 年 xx 月 xx 日因 xx 原因红线
         */
        this.blockReasonExplanation = builder.blockReasonExplanation;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customFields = builder.customFields;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getOffboardingMode() {
        return this.offboardingMode;
    }

    public void setOffboardingMode(Integer offboardingMode) {
        this.offboardingMode = offboardingMode;
    }

    public String getEmploymentId() {
        return this.employmentId;
    }

    public void setEmploymentId(String employmentId) {
        this.employmentId = employmentId;
    }

    public String getOffboardingDate() {
        return this.offboardingDate;
    }

    public void setOffboardingDate(String offboardingDate) {
        this.offboardingDate = offboardingDate;
    }

    public String getOffboardingReasonUniqueIdentifier() {
        return this.offboardingReasonUniqueIdentifier;
    }

    public void setOffboardingReasonUniqueIdentifier(String offboardingReasonUniqueIdentifier) {
        this.offboardingReasonUniqueIdentifier = offboardingReasonUniqueIdentifier;
    }

    public String getOffboardingReasonExplanation() {
        return this.offboardingReasonExplanation;
    }

    public void setOffboardingReasonExplanation(String offboardingReasonExplanation) {
        this.offboardingReasonExplanation = offboardingReasonExplanation;
    }

    public String getInitiatorId() {
        return this.initiatorId;
    }

    public void setInitiatorId(String initiatorId) {
        this.initiatorId = initiatorId;
    }

    public Boolean getAddBlockList() {
        return this.addBlockList;
    }

    public void setAddBlockList(Boolean addBlockList) {
        this.addBlockList = addBlockList;
    }

    public String getBlockReason() {
        return this.blockReason;
    }

    public void setBlockReason(String blockReason) {
        this.blockReason = blockReason;
    }

    public String getBlockReasonExplanation() {
        return this.blockReasonExplanation;
    }

    public void setBlockReasonExplanation(String blockReasonExplanation) {
        this.blockReasonExplanation = blockReasonExplanation;
    }

    public ObjectFieldData[] getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(ObjectFieldData[] customFields) {
        this.customFields = customFields;
    }

    public static class Builder {
        /**
         * 离职方式
         * <p> 示例值：1
         */
        private Integer offboardingMode;
        /**
         * 雇员 id
         * <p> 示例值：6982509313466189342
         */
        private String employmentId;
        /**
         * 离职日期
         * <p> 示例值：2022-05-18
         */
        private String offboardingDate;
        /**
         * 离职原因，可通过接口;[【查询员工离职原因列表】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/offboarding/query)获取
         * <p> 示例值：reason_for_offboarding_option8
         */
        private String offboardingReasonUniqueIdentifier;
        /**
         * 离职原因说明，长度限制6000
         * <p> 示例值：离职原因说明
         */
        private String offboardingReasonExplanation;
        /**
         * 操作发起人 ID（employment_id），为空默认为系统发起。注意：只有操作发起人可以撤销流程
         * <p> 示例值：6982509313466189341
         */
        private String initiatorId;
        /**
         * 是否加入离职屏蔽名单
         * <p> 示例值：false
         */
        private Boolean addBlockList;
        /**
         * 屏蔽原因
         * <p> 示例值：红线
         */
        private String blockReason;
        /**
         * 屏蔽原因说明
         * <p> 示例值：xx 年 xx 月 xx 日因 xx 原因红线
         */
        private String blockReasonExplanation;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private ObjectFieldData[] customFields;

        /**
         * 离职方式
         * <p> 示例值：1
         *
         * @param offboardingMode
         * @return
         */
        public Builder offboardingMode(Integer offboardingMode) {
            this.offboardingMode = offboardingMode;
            return this;
        }

        /**
         * 离职方式
         * <p> 示例值：1
         *
         * @param offboardingMode {@link com.lark.oapi.service.corehr.v1.enums.SubmitOffboardingOffboardingModeEnum}
         * @return
         */
        public Builder offboardingMode(com.lark.oapi.service.corehr.v1.enums.SubmitOffboardingOffboardingModeEnum offboardingMode) {
            this.offboardingMode = offboardingMode.getValue();
            return this;
        }


        /**
         * 雇员 id
         * <p> 示例值：6982509313466189342
         *
         * @param employmentId
         * @return
         */
        public Builder employmentId(String employmentId) {
            this.employmentId = employmentId;
            return this;
        }


        /**
         * 离职日期
         * <p> 示例值：2022-05-18
         *
         * @param offboardingDate
         * @return
         */
        public Builder offboardingDate(String offboardingDate) {
            this.offboardingDate = offboardingDate;
            return this;
        }


        /**
         * 离职原因，可通过接口;[【查询员工离职原因列表】](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/corehr-v1/offboarding/query)获取
         * <p> 示例值：reason_for_offboarding_option8
         *
         * @param offboardingReasonUniqueIdentifier
         * @return
         */
        public Builder offboardingReasonUniqueIdentifier(String offboardingReasonUniqueIdentifier) {
            this.offboardingReasonUniqueIdentifier = offboardingReasonUniqueIdentifier;
            return this;
        }


        /**
         * 离职原因说明，长度限制6000
         * <p> 示例值：离职原因说明
         *
         * @param offboardingReasonExplanation
         * @return
         */
        public Builder offboardingReasonExplanation(String offboardingReasonExplanation) {
            this.offboardingReasonExplanation = offboardingReasonExplanation;
            return this;
        }


        /**
         * 操作发起人 ID（employment_id），为空默认为系统发起。注意：只有操作发起人可以撤销流程
         * <p> 示例值：6982509313466189341
         *
         * @param initiatorId
         * @return
         */
        public Builder initiatorId(String initiatorId) {
            this.initiatorId = initiatorId;
            return this;
        }


        /**
         * 是否加入离职屏蔽名单
         * <p> 示例值：false
         *
         * @param addBlockList
         * @return
         */
        public Builder addBlockList(Boolean addBlockList) {
            this.addBlockList = addBlockList;
            return this;
        }


        /**
         * 屏蔽原因
         * <p> 示例值：红线
         *
         * @param blockReason
         * @return
         */
        public Builder blockReason(String blockReason) {
            this.blockReason = blockReason;
            return this;
        }


        /**
         * 屏蔽原因说明
         * <p> 示例值：xx 年 xx 月 xx 日因 xx 原因红线
         *
         * @param blockReasonExplanation
         * @return
         */
        public Builder blockReasonExplanation(String blockReasonExplanation) {
            this.blockReasonExplanation = blockReasonExplanation;
            return this;
        }


        /**
         * 自定义字段
         * <p> 示例值：
         *
         * @param customFields
         * @return
         */
        public Builder customFields(ObjectFieldData[] customFields) {
            this.customFields = customFields;
            return this;
        }


        public SubmitOffboardingReqBody build() {
            return new SubmitOffboardingReqBody(this);
        }
    }
}
