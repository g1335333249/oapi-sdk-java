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

package com.lark.oapi.service.corehr.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v2.enums.*;
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

public class EnableDisableAssessmentProbationReqBody {
    /**
     * 启用 / 停用状态。启用后可在试用期管理页面中可见试用期考核相关的字段。
     * <p> 示例值：true
     */
    @SerializedName("active")
    private Boolean active;
    /**
     * 试用期考核系统入口链接，当启用功能时该字段必填。
     * <p> 示例值：https://qwe111.feishuapp.bytedance.net/ae/ui/apps/176612345027111/appPages/l11bsrwss13yt?dataGrid%41pye4fsbajo21l=%7B%7D&key=ffm41o1&dataGrid%41wmv98t29vif3kj=%1B%7D
     */
    @SerializedName("app_url")
    private String appUrl;

    // builder 开始
    public EnableDisableAssessmentProbationReqBody() {
    }

    public EnableDisableAssessmentProbationReqBody(Builder builder) {
        /**
         * 启用 / 停用状态。启用后可在试用期管理页面中可见试用期考核相关的字段。
         * <p> 示例值：true
         */
        this.active = builder.active;
        /**
         * 试用期考核系统入口链接，当启用功能时该字段必填。
         * <p> 示例值：https://qwe111.feishuapp.bytedance.net/ae/ui/apps/176612345027111/appPages/l11bsrwss13yt?dataGrid%41pye4fsbajo21l=%7B%7D&key=ffm41o1&dataGrid%41wmv98t29vif3kj=%1B%7D
         */
        this.appUrl = builder.appUrl;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getAppUrl() {
        return this.appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    public static class Builder {
        /**
         * 启用 / 停用状态。启用后可在试用期管理页面中可见试用期考核相关的字段。
         * <p> 示例值：true
         */
        private Boolean active;
        /**
         * 试用期考核系统入口链接，当启用功能时该字段必填。
         * <p> 示例值：https://qwe111.feishuapp.bytedance.net/ae/ui/apps/176612345027111/appPages/l11bsrwss13yt?dataGrid%41pye4fsbajo21l=%7B%7D&key=ffm41o1&dataGrid%41wmv98t29vif3kj=%1B%7D
         */
        private String appUrl;

        /**
         * 启用 / 停用状态。启用后可在试用期管理页面中可见试用期考核相关的字段。
         * <p> 示例值：true
         *
         * @param active
         * @return
         */
        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }


        /**
         * 试用期考核系统入口链接，当启用功能时该字段必填。
         * <p> 示例值：https://qwe111.feishuapp.bytedance.net/ae/ui/apps/176612345027111/appPages/l11bsrwss13yt?dataGrid%41pye4fsbajo21l=%7B%7D&key=ffm41o1&dataGrid%41wmv98t29vif3kj=%1B%7D
         *
         * @param appUrl
         * @return
         */
        public Builder appUrl(String appUrl) {
            this.appUrl = appUrl;
            return this;
        }


        public EnableDisableAssessmentProbationReqBody build() {
            return new EnableDisableAssessmentProbationReqBody(this);
        }
    }
}