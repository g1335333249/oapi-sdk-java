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

package com.lark.oapi.service.application.v6.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.application.v6.enums.*;
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

public class ApplicationFeedback {
    /**
     * 应用反馈 ID，应用反馈记录唯一标识
     * <p> 示例值：7057888018203574291
     */
    @SerializedName("feedback_id")
    private String feedbackId;
    /**
     * 被反馈应用ID
     * <p> 示例值：cli_9b445f5258795107
     */
    @SerializedName("app_id")
    private String appId;
    /**
     * 反馈提交时间，格式为yyyy-mm-dd hh:mm:ss
     * <p> 示例值：2022-01-30 11:30:12
     */
    @SerializedName("feedback_time")
    private String feedbackTime;
    /**
     * 反馈用户的租户名， 查询 isv 应用时返回
     * <p> 示例值：字节跳动
     */
    @SerializedName("tenant_name")
    private String tenantName;
    /**
     * 反馈类型
     * <p> 示例值：1
     */
    @SerializedName("feedback_type")
    private Integer feedbackType;
    /**
     * 反馈处理状态
     * <p> 示例值：0
     */
    @SerializedName("status")
    private Integer status;
    /**
     * 故障类型列表：1: 黑屏 2: 白屏 3: 无法打开小程序  4: 卡顿 5: 小程序闪退 6: 页面加载慢 7: 死机 8: 其他异常
     * <p> 示例值：[1,2,3]
     */
    @SerializedName("fault_type")
    private Integer[] faultType;
    /**
     * 故障时间，格式为yyyy-mm-dd hh:mm:ss
     * <p> 示例值：2022-01-30 11:30:12
     */
    @SerializedName("fault_time")
    private String faultTime;
    /**
     * 反馈来源：1： 小程序 2：网页应用 3：机器人 4：webSDK
     * <p> 示例值：1
     */
    @SerializedName("source")
    private Integer source;
    /**
     * 用户联系方式，只有用户填写联系方式后返回
     * <p> 示例值：wang@bytedance.com
     */
    @SerializedName("contact")
    private String contact;
    /**
     * 反馈处理时间，格式为yyyy-mm-dd hh:mm:ss
     * <p> 示例值：2022-01-30 11:30:12
     */
    @SerializedName("update_time")
    private String updateTime;
    /**
     * 反馈问题描述
     * <p> 示例值：反馈描述
     */
    @SerializedName("description")
    private String description;
    /**
     * 反馈用户id，租户内用户的唯一标识 ，ID值与查询参数中的user_id_type对应
     * <p> 示例值：ou_9565b69967831233761cc2f11b4c089f
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 操作者id，租户内用户的唯一标识， ID值与查询参数中的user_id_type 对应
     * <p> 示例值：ou_9565b69967831233761cc2f11b4c089f
     */
    @SerializedName("operator_id")
    private String operatorId;
    /**
     * 反馈图片url列表，url 过期时间三天
     * <p> 示例值：
     */
    @SerializedName("images")
    private String[] images;
    /**
     * 反馈页面路径;- 如触发反馈的应用类型为小程序，则上报小程序当前页面的path信息;- 如触发反馈的应用类型为网页或网页应用，则上报当前网页的url信息;- 如为其他应用类型，则字段返回值为空
     * <p> 示例值：index/page
     */
    @SerializedName("feedback_path")
    private String feedbackPath;

    // builder 开始
    public ApplicationFeedback() {
    }

    public ApplicationFeedback(Builder builder) {
        /**
         * 应用反馈 ID，应用反馈记录唯一标识
         * <p> 示例值：7057888018203574291
         */
        this.feedbackId = builder.feedbackId;
        /**
         * 被反馈应用ID
         * <p> 示例值：cli_9b445f5258795107
         */
        this.appId = builder.appId;
        /**
         * 反馈提交时间，格式为yyyy-mm-dd hh:mm:ss
         * <p> 示例值：2022-01-30 11:30:12
         */
        this.feedbackTime = builder.feedbackTime;
        /**
         * 反馈用户的租户名， 查询 isv 应用时返回
         * <p> 示例值：字节跳动
         */
        this.tenantName = builder.tenantName;
        /**
         * 反馈类型
         * <p> 示例值：1
         */
        this.feedbackType = builder.feedbackType;
        /**
         * 反馈处理状态
         * <p> 示例值：0
         */
        this.status = builder.status;
        /**
         * 故障类型列表：1: 黑屏 2: 白屏 3: 无法打开小程序  4: 卡顿 5: 小程序闪退 6: 页面加载慢 7: 死机 8: 其他异常
         * <p> 示例值：[1,2,3]
         */
        this.faultType = builder.faultType;
        /**
         * 故障时间，格式为yyyy-mm-dd hh:mm:ss
         * <p> 示例值：2022-01-30 11:30:12
         */
        this.faultTime = builder.faultTime;
        /**
         * 反馈来源：1： 小程序 2：网页应用 3：机器人 4：webSDK
         * <p> 示例值：1
         */
        this.source = builder.source;
        /**
         * 用户联系方式，只有用户填写联系方式后返回
         * <p> 示例值：wang@bytedance.com
         */
        this.contact = builder.contact;
        /**
         * 反馈处理时间，格式为yyyy-mm-dd hh:mm:ss
         * <p> 示例值：2022-01-30 11:30:12
         */
        this.updateTime = builder.updateTime;
        /**
         * 反馈问题描述
         * <p> 示例值：反馈描述
         */
        this.description = builder.description;
        /**
         * 反馈用户id，租户内用户的唯一标识 ，ID值与查询参数中的user_id_type对应
         * <p> 示例值：ou_9565b69967831233761cc2f11b4c089f
         */
        this.userId = builder.userId;
        /**
         * 操作者id，租户内用户的唯一标识， ID值与查询参数中的user_id_type 对应
         * <p> 示例值：ou_9565b69967831233761cc2f11b4c089f
         */
        this.operatorId = builder.operatorId;
        /**
         * 反馈图片url列表，url 过期时间三天
         * <p> 示例值：
         */
        this.images = builder.images;
        /**
         * 反馈页面路径;- 如触发反馈的应用类型为小程序，则上报小程序当前页面的path信息;- 如触发反馈的应用类型为网页或网页应用，则上报当前网页的url信息;- 如为其他应用类型，则字段返回值为空
         * <p> 示例值：index/page
         */
        this.feedbackPath = builder.feedbackPath;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFeedbackId() {
        return this.feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getFeedbackTime() {
        return this.feedbackTime;
    }

    public void setFeedbackTime(String feedbackTime) {
        this.feedbackTime = feedbackTime;
    }

    public String getTenantName() {
        return this.tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public Integer getFeedbackType() {
        return this.feedbackType;
    }

    public void setFeedbackType(Integer feedbackType) {
        this.feedbackType = feedbackType;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer[] getFaultType() {
        return this.faultType;
    }

    public void setFaultType(Integer[] faultType) {
        this.faultType = faultType;
    }

    public String getFaultTime() {
        return this.faultTime;
    }

    public void setFaultTime(String faultTime) {
        this.faultTime = faultTime;
    }

    public Integer getSource() {
        return this.source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOperatorId() {
        return this.operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String[] getImages() {
        return this.images;
    }

    public void setImages(String[] images) {
        this.images = images;
    }

    public String getFeedbackPath() {
        return this.feedbackPath;
    }

    public void setFeedbackPath(String feedbackPath) {
        this.feedbackPath = feedbackPath;
    }

    public static class Builder {
        /**
         * 应用反馈 ID，应用反馈记录唯一标识
         * <p> 示例值：7057888018203574291
         */
        private String feedbackId;
        /**
         * 被反馈应用ID
         * <p> 示例值：cli_9b445f5258795107
         */
        private String appId;
        /**
         * 反馈提交时间，格式为yyyy-mm-dd hh:mm:ss
         * <p> 示例值：2022-01-30 11:30:12
         */
        private String feedbackTime;
        /**
         * 反馈用户的租户名， 查询 isv 应用时返回
         * <p> 示例值：字节跳动
         */
        private String tenantName;
        /**
         * 反馈类型
         * <p> 示例值：1
         */
        private Integer feedbackType;
        /**
         * 反馈处理状态
         * <p> 示例值：0
         */
        private Integer status;
        /**
         * 故障类型列表：1: 黑屏 2: 白屏 3: 无法打开小程序  4: 卡顿 5: 小程序闪退 6: 页面加载慢 7: 死机 8: 其他异常
         * <p> 示例值：[1,2,3]
         */
        private Integer[] faultType;
        /**
         * 故障时间，格式为yyyy-mm-dd hh:mm:ss
         * <p> 示例值：2022-01-30 11:30:12
         */
        private String faultTime;
        /**
         * 反馈来源：1： 小程序 2：网页应用 3：机器人 4：webSDK
         * <p> 示例值：1
         */
        private Integer source;
        /**
         * 用户联系方式，只有用户填写联系方式后返回
         * <p> 示例值：wang@bytedance.com
         */
        private String contact;
        /**
         * 反馈处理时间，格式为yyyy-mm-dd hh:mm:ss
         * <p> 示例值：2022-01-30 11:30:12
         */
        private String updateTime;
        /**
         * 反馈问题描述
         * <p> 示例值：反馈描述
         */
        private String description;
        /**
         * 反馈用户id，租户内用户的唯一标识 ，ID值与查询参数中的user_id_type对应
         * <p> 示例值：ou_9565b69967831233761cc2f11b4c089f
         */
        private String userId;
        /**
         * 操作者id，租户内用户的唯一标识， ID值与查询参数中的user_id_type 对应
         * <p> 示例值：ou_9565b69967831233761cc2f11b4c089f
         */
        private String operatorId;
        /**
         * 反馈图片url列表，url 过期时间三天
         * <p> 示例值：
         */
        private String[] images;
        /**
         * 反馈页面路径;- 如触发反馈的应用类型为小程序，则上报小程序当前页面的path信息;- 如触发反馈的应用类型为网页或网页应用，则上报当前网页的url信息;- 如为其他应用类型，则字段返回值为空
         * <p> 示例值：index/page
         */
        private String feedbackPath;

        /**
         * 应用反馈 ID，应用反馈记录唯一标识
         * <p> 示例值：7057888018203574291
         *
         * @param feedbackId
         * @return
         */
        public Builder feedbackId(String feedbackId) {
            this.feedbackId = feedbackId;
            return this;
        }


        /**
         * 被反馈应用ID
         * <p> 示例值：cli_9b445f5258795107
         *
         * @param appId
         * @return
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }


        /**
         * 反馈提交时间，格式为yyyy-mm-dd hh:mm:ss
         * <p> 示例值：2022-01-30 11:30:12
         *
         * @param feedbackTime
         * @return
         */
        public Builder feedbackTime(String feedbackTime) {
            this.feedbackTime = feedbackTime;
            return this;
        }


        /**
         * 反馈用户的租户名， 查询 isv 应用时返回
         * <p> 示例值：字节跳动
         *
         * @param tenantName
         * @return
         */
        public Builder tenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }


        /**
         * 反馈类型
         * <p> 示例值：1
         *
         * @param feedbackType
         * @return
         */
        public Builder feedbackType(Integer feedbackType) {
            this.feedbackType = feedbackType;
            return this;
        }

        /**
         * 反馈类型
         * <p> 示例值：1
         *
         * @param feedbackType {@link com.lark.oapi.service.application.v6.enums.ApplicationFeedbackOpenFeedbackTypeEnum}
         * @return
         */
        public Builder feedbackType(com.lark.oapi.service.application.v6.enums.ApplicationFeedbackOpenFeedbackTypeEnum feedbackType) {
            this.feedbackType = feedbackType.getValue();
            return this;
        }


        /**
         * 反馈处理状态
         * <p> 示例值：0
         *
         * @param status
         * @return
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * 反馈处理状态
         * <p> 示例值：0
         *
         * @param status {@link com.lark.oapi.service.application.v6.enums.ApplicationFeedbackOpenMarkStatusEnum}
         * @return
         */
        public Builder status(com.lark.oapi.service.application.v6.enums.ApplicationFeedbackOpenMarkStatusEnum status) {
            this.status = status.getValue();
            return this;
        }


        /**
         * 故障类型列表：1: 黑屏 2: 白屏 3: 无法打开小程序  4: 卡顿 5: 小程序闪退 6: 页面加载慢 7: 死机 8: 其他异常
         * <p> 示例值：[1,2,3]
         *
         * @param faultType
         * @return
         */
        public Builder faultType(Integer[] faultType) {
            this.faultType = faultType;
            return this;
        }


        /**
         * 故障时间，格式为yyyy-mm-dd hh:mm:ss
         * <p> 示例值：2022-01-30 11:30:12
         *
         * @param faultTime
         * @return
         */
        public Builder faultTime(String faultTime) {
            this.faultTime = faultTime;
            return this;
        }


        /**
         * 反馈来源：1： 小程序 2：网页应用 3：机器人 4：webSDK
         * <p> 示例值：1
         *
         * @param source
         * @return
         */
        public Builder source(Integer source) {
            this.source = source;
            return this;
        }

        /**
         * 反馈来源：1： 小程序 2：网页应用 3：机器人 4：webSDK
         * <p> 示例值：1
         *
         * @param source {@link com.lark.oapi.service.application.v6.enums.ApplicationFeedbackOpenFeedbackSourceEnum}
         * @return
         */
        public Builder source(com.lark.oapi.service.application.v6.enums.ApplicationFeedbackOpenFeedbackSourceEnum source) {
            this.source = source.getValue();
            return this;
        }


        /**
         * 用户联系方式，只有用户填写联系方式后返回
         * <p> 示例值：wang@bytedance.com
         *
         * @param contact
         * @return
         */
        public Builder contact(String contact) {
            this.contact = contact;
            return this;
        }


        /**
         * 反馈处理时间，格式为yyyy-mm-dd hh:mm:ss
         * <p> 示例值：2022-01-30 11:30:12
         *
         * @param updateTime
         * @return
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }


        /**
         * 反馈问题描述
         * <p> 示例值：反馈描述
         *
         * @param description
         * @return
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }


        /**
         * 反馈用户id，租户内用户的唯一标识 ，ID值与查询参数中的user_id_type对应
         * <p> 示例值：ou_9565b69967831233761cc2f11b4c089f
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 操作者id，租户内用户的唯一标识， ID值与查询参数中的user_id_type 对应
         * <p> 示例值：ou_9565b69967831233761cc2f11b4c089f
         *
         * @param operatorId
         * @return
         */
        public Builder operatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }


        /**
         * 反馈图片url列表，url 过期时间三天
         * <p> 示例值：
         *
         * @param images
         * @return
         */
        public Builder images(String[] images) {
            this.images = images;
            return this;
        }


        /**
         * 反馈页面路径;- 如触发反馈的应用类型为小程序，则上报小程序当前页面的path信息;- 如触发反馈的应用类型为网页或网页应用，则上报当前网页的url信息;- 如为其他应用类型，则字段返回值为空
         * <p> 示例值：index/page
         *
         * @param feedbackPath
         * @return
         */
        public Builder feedbackPath(String feedbackPath) {
            this.feedbackPath = feedbackPath;
            return this;
        }


        public ApplicationFeedback build() {
            return new ApplicationFeedback(this);
        }
    }
}
