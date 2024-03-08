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

package com.lark.oapi.service.search.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.search.v2.enums.*;
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

public class DialogSearchRequest {
    /**
     * 用户问题
     * <p> 示例值：帮我找一下昨天发的文档
     */
    @SerializedName("tool_raw_instruction")
    private String toolRawInstruction;
    /**
     * 场景上下文的schema版本号
     * <p> 示例值：v1
     */
    @SerializedName("scenario_context_schema_version")
    private String scenarioContextSchemaVersion;
    /**
     * 场景上下文
     * <p> 示例值：
     */
    @SerializedName("scenario_context")
    private ScenarioContext scenarioContext;

    // builder 开始
    public DialogSearchRequest() {
    }

    public DialogSearchRequest(Builder builder) {
        /**
         * 用户问题
         * <p> 示例值：帮我找一下昨天发的文档
         */
        this.toolRawInstruction = builder.toolRawInstruction;
        /**
         * 场景上下文的schema版本号
         * <p> 示例值：v1
         */
        this.scenarioContextSchemaVersion = builder.scenarioContextSchemaVersion;
        /**
         * 场景上下文
         * <p> 示例值：
         */
        this.scenarioContext = builder.scenarioContext;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getToolRawInstruction() {
        return this.toolRawInstruction;
    }

    public void setToolRawInstruction(String toolRawInstruction) {
        this.toolRawInstruction = toolRawInstruction;
    }

    public String getScenarioContextSchemaVersion() {
        return this.scenarioContextSchemaVersion;
    }

    public void setScenarioContextSchemaVersion(String scenarioContextSchemaVersion) {
        this.scenarioContextSchemaVersion = scenarioContextSchemaVersion;
    }

    public ScenarioContext getScenarioContext() {
        return this.scenarioContext;
    }

    public void setScenarioContext(ScenarioContext scenarioContext) {
        this.scenarioContext = scenarioContext;
    }

    public static class Builder {
        /**
         * 用户问题
         * <p> 示例值：帮我找一下昨天发的文档
         */
        private String toolRawInstruction;
        /**
         * 场景上下文的schema版本号
         * <p> 示例值：v1
         */
        private String scenarioContextSchemaVersion;
        /**
         * 场景上下文
         * <p> 示例值：
         */
        private ScenarioContext scenarioContext;

        /**
         * 用户问题
         * <p> 示例值：帮我找一下昨天发的文档
         *
         * @param toolRawInstruction
         * @return
         */
        public Builder toolRawInstruction(String toolRawInstruction) {
            this.toolRawInstruction = toolRawInstruction;
            return this;
        }


        /**
         * 场景上下文的schema版本号
         * <p> 示例值：v1
         *
         * @param scenarioContextSchemaVersion
         * @return
         */
        public Builder scenarioContextSchemaVersion(String scenarioContextSchemaVersion) {
            this.scenarioContextSchemaVersion = scenarioContextSchemaVersion;
            return this;
        }


        /**
         * 场景上下文
         * <p> 示例值：
         *
         * @param scenarioContext
         * @return
         */
        public Builder scenarioContext(ScenarioContext scenarioContext) {
            this.scenarioContext = scenarioContext;
            return this;
        }


        public DialogSearchRequest build() {
            return new DialogSearchRequest(this);
        }
    }
}
