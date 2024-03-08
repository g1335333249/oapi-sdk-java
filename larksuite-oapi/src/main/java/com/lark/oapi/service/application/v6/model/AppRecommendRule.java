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

public class AppRecommendRule {
    /**
     * 推荐规则 ID
     * <p> 示例值：7137896480337641492
     */
    @SerializedName("id")
    private String id;
    /**
     * 推荐规则名称
     * <p> 示例值：管理员小白的推荐规则
     */
    @SerializedName("name")
    private String name;
    /**
     * 推荐规则启用状态
     * <p> 示例值：open
     */
    @SerializedName("status")
    private String status;
    /**
     * 推荐规则可见性信息
     * <p> 示例值：
     */
    @SerializedName("visibility_info")
    private AppRecommendRuleVisibilityInfo visibilityInfo;
    /**
     * 不可移除推荐应用项列表
     * <p> 示例值：
     */
    @SerializedName("recommend_item_infos")
    private AppRecommendRuleItemInfo[] recommendItemInfos;
    /**
     * 可移除推荐应用项列表
     * <p> 示例值：
     */
    @SerializedName("distributed_recommend_item_infos")
    private AppRecommendRuleItemInfo[] distributedRecommendItemInfos;

    // builder 开始
    public AppRecommendRule() {
    }

    public AppRecommendRule(Builder builder) {
        /**
         * 推荐规则 ID
         * <p> 示例值：7137896480337641492
         */
        this.id = builder.id;
        /**
         * 推荐规则名称
         * <p> 示例值：管理员小白的推荐规则
         */
        this.name = builder.name;
        /**
         * 推荐规则启用状态
         * <p> 示例值：open
         */
        this.status = builder.status;
        /**
         * 推荐规则可见性信息
         * <p> 示例值：
         */
        this.visibilityInfo = builder.visibilityInfo;
        /**
         * 不可移除推荐应用项列表
         * <p> 示例值：
         */
        this.recommendItemInfos = builder.recommendItemInfos;
        /**
         * 可移除推荐应用项列表
         * <p> 示例值：
         */
        this.distributedRecommendItemInfos = builder.distributedRecommendItemInfos;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AppRecommendRuleVisibilityInfo getVisibilityInfo() {
        return this.visibilityInfo;
    }

    public void setVisibilityInfo(AppRecommendRuleVisibilityInfo visibilityInfo) {
        this.visibilityInfo = visibilityInfo;
    }

    public AppRecommendRuleItemInfo[] getRecommendItemInfos() {
        return this.recommendItemInfos;
    }

    public void setRecommendItemInfos(AppRecommendRuleItemInfo[] recommendItemInfos) {
        this.recommendItemInfos = recommendItemInfos;
    }

    public AppRecommendRuleItemInfo[] getDistributedRecommendItemInfos() {
        return this.distributedRecommendItemInfos;
    }

    public void setDistributedRecommendItemInfos(AppRecommendRuleItemInfo[] distributedRecommendItemInfos) {
        this.distributedRecommendItemInfos = distributedRecommendItemInfos;
    }

    public static class Builder {
        /**
         * 推荐规则 ID
         * <p> 示例值：7137896480337641492
         */
        private String id;
        /**
         * 推荐规则名称
         * <p> 示例值：管理员小白的推荐规则
         */
        private String name;
        /**
         * 推荐规则启用状态
         * <p> 示例值：open
         */
        private String status;
        /**
         * 推荐规则可见性信息
         * <p> 示例值：
         */
        private AppRecommendRuleVisibilityInfo visibilityInfo;
        /**
         * 不可移除推荐应用项列表
         * <p> 示例值：
         */
        private AppRecommendRuleItemInfo[] recommendItemInfos;
        /**
         * 可移除推荐应用项列表
         * <p> 示例值：
         */
        private AppRecommendRuleItemInfo[] distributedRecommendItemInfos;

        /**
         * 推荐规则 ID
         * <p> 示例值：7137896480337641492
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 推荐规则名称
         * <p> 示例值：管理员小白的推荐规则
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 推荐规则启用状态
         * <p> 示例值：open
         *
         * @param status
         * @return
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * 推荐规则启用状态
         * <p> 示例值：open
         *
         * @param status {@link com.lark.oapi.service.application.v6.enums.AppRecommendRuleAppRecommendRuleStatusEnum}
         * @return
         */
        public Builder status(com.lark.oapi.service.application.v6.enums.AppRecommendRuleAppRecommendRuleStatusEnum status) {
            this.status = status.getValue();
            return this;
        }


        /**
         * 推荐规则可见性信息
         * <p> 示例值：
         *
         * @param visibilityInfo
         * @return
         */
        public Builder visibilityInfo(AppRecommendRuleVisibilityInfo visibilityInfo) {
            this.visibilityInfo = visibilityInfo;
            return this;
        }


        /**
         * 不可移除推荐应用项列表
         * <p> 示例值：
         *
         * @param recommendItemInfos
         * @return
         */
        public Builder recommendItemInfos(AppRecommendRuleItemInfo[] recommendItemInfos) {
            this.recommendItemInfos = recommendItemInfos;
            return this;
        }


        /**
         * 可移除推荐应用项列表
         * <p> 示例值：
         *
         * @param distributedRecommendItemInfos
         * @return
         */
        public Builder distributedRecommendItemInfos(AppRecommendRuleItemInfo[] distributedRecommendItemInfos) {
            this.distributedRecommendItemInfos = distributedRecommendItemInfos;
            return this;
        }


        public AppRecommendRule build() {
            return new AppRecommendRule(this);
        }
    }
}
