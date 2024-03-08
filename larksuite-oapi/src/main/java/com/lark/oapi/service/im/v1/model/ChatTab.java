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

package com.lark.oapi.service.im.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.im.v1.enums.*;
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

public class ChatTab {
    /**
     * Tab ID
     * <p> 示例值：7101214603622940671
     */
    @SerializedName("tab_id")
    private String tabId;
    /**
     * Tab名称;;**注意**：会话标签页的名称不能超过30个字符
     * <p> 示例值：文档
     */
    @SerializedName("tab_name")
    private String tabName;
    /**
     * Tab类型
     * <p> 示例值：doc
     */
    @SerializedName("tab_type")
    private String tabType;
    /**
     * Tab内容
     * <p> 示例值：
     */
    @SerializedName("tab_content")
    private ChatTabContent tabContent;
    /**
     * Tab的配置
     * <p> 示例值：
     */
    @SerializedName("tab_config")
    private ChatTabConfig tabConfig;

    // builder 开始
    public ChatTab() {
    }

    public ChatTab(Builder builder) {
        /**
         * Tab ID
         * <p> 示例值：7101214603622940671
         */
        this.tabId = builder.tabId;
        /**
         * Tab名称;;**注意**：会话标签页的名称不能超过30个字符
         * <p> 示例值：文档
         */
        this.tabName = builder.tabName;
        /**
         * Tab类型
         * <p> 示例值：doc
         */
        this.tabType = builder.tabType;
        /**
         * Tab内容
         * <p> 示例值：
         */
        this.tabContent = builder.tabContent;
        /**
         * Tab的配置
         * <p> 示例值：
         */
        this.tabConfig = builder.tabConfig;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getTabId() {
        return this.tabId;
    }

    public void setTabId(String tabId) {
        this.tabId = tabId;
    }

    public String getTabName() {
        return this.tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    public String getTabType() {
        return this.tabType;
    }

    public void setTabType(String tabType) {
        this.tabType = tabType;
    }

    public ChatTabContent getTabContent() {
        return this.tabContent;
    }

    public void setTabContent(ChatTabContent tabContent) {
        this.tabContent = tabContent;
    }

    public ChatTabConfig getTabConfig() {
        return this.tabConfig;
    }

    public void setTabConfig(ChatTabConfig tabConfig) {
        this.tabConfig = tabConfig;
    }

    public static class Builder {
        /**
         * Tab ID
         * <p> 示例值：7101214603622940671
         */
        private String tabId;
        /**
         * Tab名称;;**注意**：会话标签页的名称不能超过30个字符
         * <p> 示例值：文档
         */
        private String tabName;
        /**
         * Tab类型
         * <p> 示例值：doc
         */
        private String tabType;
        /**
         * Tab内容
         * <p> 示例值：
         */
        private ChatTabContent tabContent;
        /**
         * Tab的配置
         * <p> 示例值：
         */
        private ChatTabConfig tabConfig;

        /**
         * Tab ID
         * <p> 示例值：7101214603622940671
         *
         * @param tabId
         * @return
         */
        public Builder tabId(String tabId) {
            this.tabId = tabId;
            return this;
        }


        /**
         * Tab名称;;**注意**：会话标签页的名称不能超过30个字符
         * <p> 示例值：文档
         *
         * @param tabName
         * @return
         */
        public Builder tabName(String tabName) {
            this.tabName = tabName;
            return this;
        }


        /**
         * Tab类型
         * <p> 示例值：doc
         *
         * @param tabType
         * @return
         */
        public Builder tabType(String tabType) {
            this.tabType = tabType;
            return this;
        }

        /**
         * Tab类型
         * <p> 示例值：doc
         *
         * @param tabType {@link com.lark.oapi.service.im.v1.enums.ChatTabTabTypeEnum}
         * @return
         */
        public Builder tabType(com.lark.oapi.service.im.v1.enums.ChatTabTabTypeEnum tabType) {
            this.tabType = tabType.getValue();
            return this;
        }


        /**
         * Tab内容
         * <p> 示例值：
         *
         * @param tabContent
         * @return
         */
        public Builder tabContent(ChatTabContent tabContent) {
            this.tabContent = tabContent;
            return this;
        }


        /**
         * Tab的配置
         * <p> 示例值：
         *
         * @param tabConfig
         * @return
         */
        public Builder tabConfig(ChatTabConfig tabConfig) {
            this.tabConfig = tabConfig;
            return this;
        }


        public ChatTab build() {
            return new ChatTab(this);
        }
    }
}
