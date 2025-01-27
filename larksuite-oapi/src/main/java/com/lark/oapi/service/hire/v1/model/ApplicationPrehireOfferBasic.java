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

package com.lark.oapi.service.hire.v1.model;

import com.lark.oapi.core.response.EmptyData;
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

public class ApplicationPrehireOfferBasic {
    /**
     * <p> 示例值：11111
     */
    @SerializedName("offer_id")
    private String offerId;
    /**
     * <p> 示例值：11111
     */
    @SerializedName("application_id")
    private String applicationId;
    /**
     * <p> 示例值：11111
     */
    @SerializedName("talent_id")
    private String talentId;
    /**
     * <p> 示例值：11111
     */
    @SerializedName("job_id")
    private String jobId;
    /**
     * <p> 示例值：test
     */
    @SerializedName("remark")
    private String remark;
    /**
     * <p> 示例值：1111233344
     */
    @SerializedName("expire_time")
    private Integer expireTime;
    /**
     * <p> 示例值：1111233344
     */
    @SerializedName("onboard_time")
    private Integer onboardTime;
    /**
     * <p> 示例值：111
     */
    @SerializedName("time_zone")
    private String timeZone;
    /**
     * Offer类型 1=Social, 2=Campus, 3=Intern, 4=InternTransfer
     * <p> 示例值：1
     */
    @SerializedName("offer_type")
    private Integer offerType;
    /**
     * Offer状态
     * <p> 示例值：0
     */
    @SerializedName("offer_status")
    private Integer offerStatus;
    /**
     * <p> 示例值：
     */
    @SerializedName("owner")
    private AppliOfferBasicInfoUser owner;
    /**
     * <p> 示例值：test
     */
    @SerializedName("offer_job_title")
    private String offerJobTitle;

    // builder 开始
    public ApplicationPrehireOfferBasic() {
    }

    public ApplicationPrehireOfferBasic(Builder builder) {
        /**
         *
         * <p> 示例值：11111
         */
        this.offerId = builder.offerId;
        /**
         *
         * <p> 示例值：11111
         */
        this.applicationId = builder.applicationId;
        /**
         *
         * <p> 示例值：11111
         */
        this.talentId = builder.talentId;
        /**
         *
         * <p> 示例值：11111
         */
        this.jobId = builder.jobId;
        /**
         *
         * <p> 示例值：test
         */
        this.remark = builder.remark;
        /**
         *
         * <p> 示例值：1111233344
         */
        this.expireTime = builder.expireTime;
        /**
         *
         * <p> 示例值：1111233344
         */
        this.onboardTime = builder.onboardTime;
        /**
         *
         * <p> 示例值：111
         */
        this.timeZone = builder.timeZone;
        /**
         * Offer类型 1=Social, 2=Campus, 3=Intern, 4=InternTransfer
         * <p> 示例值：1
         */
        this.offerType = builder.offerType;
        /**
         * Offer状态
         * <p> 示例值：0
         */
        this.offerStatus = builder.offerStatus;
        /**
         *
         * <p> 示例值：
         */
        this.owner = builder.owner;
        /**
         *
         * <p> 示例值：test
         */
        this.offerJobTitle = builder.offerJobTitle;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getOfferId() {
        return this.offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getTalentId() {
        return this.talentId;
    }

    public void setTalentId(String talentId) {
        this.talentId = talentId;
    }

    public String getJobId() {
        return this.jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getExpireTime() {
        return this.expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }

    public Integer getOnboardTime() {
        return this.onboardTime;
    }

    public void setOnboardTime(Integer onboardTime) {
        this.onboardTime = onboardTime;
    }

    public String getTimeZone() {
        return this.timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Integer getOfferType() {
        return this.offerType;
    }

    public void setOfferType(Integer offerType) {
        this.offerType = offerType;
    }

    public Integer getOfferStatus() {
        return this.offerStatus;
    }

    public void setOfferStatus(Integer offerStatus) {
        this.offerStatus = offerStatus;
    }

    public AppliOfferBasicInfoUser getOwner() {
        return this.owner;
    }

    public void setOwner(AppliOfferBasicInfoUser owner) {
        this.owner = owner;
    }

    public String getOfferJobTitle() {
        return this.offerJobTitle;
    }

    public void setOfferJobTitle(String offerJobTitle) {
        this.offerJobTitle = offerJobTitle;
    }

    public static class Builder {
        /**
         * <p> 示例值：11111
         */
        private String offerId;
        /**
         * <p> 示例值：11111
         */
        private String applicationId;
        /**
         * <p> 示例值：11111
         */
        private String talentId;
        /**
         * <p> 示例值：11111
         */
        private String jobId;
        /**
         * <p> 示例值：test
         */
        private String remark;
        /**
         * <p> 示例值：1111233344
         */
        private Integer expireTime;
        /**
         * <p> 示例值：1111233344
         */
        private Integer onboardTime;
        /**
         * <p> 示例值：111
         */
        private String timeZone;
        /**
         * Offer类型 1=Social, 2=Campus, 3=Intern, 4=InternTransfer
         * <p> 示例值：1
         */
        private Integer offerType;
        /**
         * Offer状态
         * <p> 示例值：0
         */
        private Integer offerStatus;
        /**
         * <p> 示例值：
         */
        private AppliOfferBasicInfoUser owner;
        /**
         * <p> 示例值：test
         */
        private String offerJobTitle;

        /**
         * <p> 示例值：11111
         *
         * @param offerId
         * @return
         */
        public Builder offerId(String offerId) {
            this.offerId = offerId;
            return this;
        }


        /**
         * <p> 示例值：11111
         *
         * @param applicationId
         * @return
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }


        /**
         * <p> 示例值：11111
         *
         * @param talentId
         * @return
         */
        public Builder talentId(String talentId) {
            this.talentId = talentId;
            return this;
        }


        /**
         * <p> 示例值：11111
         *
         * @param jobId
         * @return
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }


        /**
         * <p> 示例值：test
         *
         * @param remark
         * @return
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }


        /**
         * <p> 示例值：1111233344
         *
         * @param expireTime
         * @return
         */
        public Builder expireTime(Integer expireTime) {
            this.expireTime = expireTime;
            return this;
        }


        /**
         * <p> 示例值：1111233344
         *
         * @param onboardTime
         * @return
         */
        public Builder onboardTime(Integer onboardTime) {
            this.onboardTime = onboardTime;
            return this;
        }


        /**
         * <p> 示例值：111
         *
         * @param timeZone
         * @return
         */
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }


        /**
         * Offer类型 1=Social, 2=Campus, 3=Intern, 4=InternTransfer
         * <p> 示例值：1
         *
         * @param offerType
         * @return
         */
        public Builder offerType(Integer offerType) {
            this.offerType = offerType;
            return this;
        }


        /**
         * Offer状态
         * <p> 示例值：0
         *
         * @param offerStatus
         * @return
         */
        public Builder offerStatus(Integer offerStatus) {
            this.offerStatus = offerStatus;
            return this;
        }


        /**
         * <p> 示例值：
         *
         * @param owner
         * @return
         */
        public Builder owner(AppliOfferBasicInfoUser owner) {
            this.owner = owner;
            return this;
        }


        /**
         * <p> 示例值：test
         *
         * @param offerJobTitle
         * @return
         */
        public Builder offerJobTitle(String offerJobTitle) {
            this.offerJobTitle = offerJobTitle;
            return this;
        }


        public ApplicationPrehireOfferBasic build() {
            return new ApplicationPrehireOfferBasic(this);
        }
    }
}
