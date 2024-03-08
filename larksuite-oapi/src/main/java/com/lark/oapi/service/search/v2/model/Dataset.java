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

public class Dataset {
    /**
     * 数据集的唯一标识
     * <p> 示例值：6953903108179099667
     */
    @SerializedName("dataset_id")
    private String datasetId;
    /**
     * 该数据集对应的开放平台应用id
     * <p> 示例值：cli_a1306bed4738d01b
     */
    @SerializedName("app_id")
    private String appId;
    /**
     * 创建时间，精确到秒级
     * <p> 示例值：1990-12-31T23:59:60Z
     */
    @SerializedName("create_time")
    private String createTime;
    /**
     * 更新时间
     * <p> 示例值：1990-12-31T23:59:60Z
     */
    @SerializedName("update_time")
    private String updateTime;
    /**
     * 数据集中的索引数据的数量
     * <p> 示例值：1000
     */
    @SerializedName("chunk_num")
    private Integer chunkNum;
    /**
     * 数据集中的数据项的数量
     * <p> 示例值：100
     */
    @SerializedName("doc_num")
    private Integer docNum;
    /**
     * 数据源的名字，只允许英文字母、数字和下划线，需要保证应用内部的唯一性。
     * <p> 示例值：feishu_web_1
     */
    @SerializedName("name")
    private String name;
    /**
     * 描述该数据集的具体内容以及相关用途
     * <p> 示例值：飞书官网等网页上的数据，主要用于搜索问答
     */
    @SerializedName("description")
    private String description;
    /**
     * 过滤字段，每个数据集支持多个过滤字段
     * <p> 示例值：
     */
    @SerializedName("filter_schemas")
    private FilterSchema[] filterSchemas;
    /**
     * 模型配置
     * <p> 示例值：
     */
    @SerializedName("model_config")
    private ModelConfig modelConfig;
    /**
     * 被授权可搜/可见的应用
     * <p> 示例值：
     */
    @SerializedName("viewer_app_ids")
    private String[] viewerAppIds;

    // builder 开始
    public Dataset() {
    }

    public Dataset(Builder builder) {
        /**
         * 数据集的唯一标识
         * <p> 示例值：6953903108179099667
         */
        this.datasetId = builder.datasetId;
        /**
         * 该数据集对应的开放平台应用id
         * <p> 示例值：cli_a1306bed4738d01b
         */
        this.appId = builder.appId;
        /**
         * 创建时间，精确到秒级
         * <p> 示例值：1990-12-31T23:59:60Z
         */
        this.createTime = builder.createTime;
        /**
         * 更新时间
         * <p> 示例值：1990-12-31T23:59:60Z
         */
        this.updateTime = builder.updateTime;
        /**
         * 数据集中的索引数据的数量
         * <p> 示例值：1000
         */
        this.chunkNum = builder.chunkNum;
        /**
         * 数据集中的数据项的数量
         * <p> 示例值：100
         */
        this.docNum = builder.docNum;
        /**
         * 数据源的名字，只允许英文字母、数字和下划线，需要保证应用内部的唯一性。
         * <p> 示例值：feishu_web_1
         */
        this.name = builder.name;
        /**
         * 描述该数据集的具体内容以及相关用途
         * <p> 示例值：飞书官网等网页上的数据，主要用于搜索问答
         */
        this.description = builder.description;
        /**
         * 过滤字段，每个数据集支持多个过滤字段
         * <p> 示例值：
         */
        this.filterSchemas = builder.filterSchemas;
        /**
         * 模型配置
         * <p> 示例值：
         */
        this.modelConfig = builder.modelConfig;
        /**
         * 被授权可搜/可见的应用
         * <p> 示例值：
         */
        this.viewerAppIds = builder.viewerAppIds;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getDatasetId() {
        return this.datasetId;
    }

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getChunkNum() {
        return this.chunkNum;
    }

    public void setChunkNum(Integer chunkNum) {
        this.chunkNum = chunkNum;
    }

    public Integer getDocNum() {
        return this.docNum;
    }

    public void setDocNum(Integer docNum) {
        this.docNum = docNum;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FilterSchema[] getFilterSchemas() {
        return this.filterSchemas;
    }

    public void setFilterSchemas(FilterSchema[] filterSchemas) {
        this.filterSchemas = filterSchemas;
    }

    public ModelConfig getModelConfig() {
        return this.modelConfig;
    }

    public void setModelConfig(ModelConfig modelConfig) {
        this.modelConfig = modelConfig;
    }

    public String[] getViewerAppIds() {
        return this.viewerAppIds;
    }

    public void setViewerAppIds(String[] viewerAppIds) {
        this.viewerAppIds = viewerAppIds;
    }

    public static class Builder {
        /**
         * 数据集的唯一标识
         * <p> 示例值：6953903108179099667
         */
        private String datasetId;
        /**
         * 该数据集对应的开放平台应用id
         * <p> 示例值：cli_a1306bed4738d01b
         */
        private String appId;
        /**
         * 创建时间，精确到秒级
         * <p> 示例值：1990-12-31T23:59:60Z
         */
        private String createTime;
        /**
         * 更新时间
         * <p> 示例值：1990-12-31T23:59:60Z
         */
        private String updateTime;
        /**
         * 数据集中的索引数据的数量
         * <p> 示例值：1000
         */
        private Integer chunkNum;
        /**
         * 数据集中的数据项的数量
         * <p> 示例值：100
         */
        private Integer docNum;
        /**
         * 数据源的名字，只允许英文字母、数字和下划线，需要保证应用内部的唯一性。
         * <p> 示例值：feishu_web_1
         */
        private String name;
        /**
         * 描述该数据集的具体内容以及相关用途
         * <p> 示例值：飞书官网等网页上的数据，主要用于搜索问答
         */
        private String description;
        /**
         * 过滤字段，每个数据集支持多个过滤字段
         * <p> 示例值：
         */
        private FilterSchema[] filterSchemas;
        /**
         * 模型配置
         * <p> 示例值：
         */
        private ModelConfig modelConfig;
        /**
         * 被授权可搜/可见的应用
         * <p> 示例值：
         */
        private String[] viewerAppIds;

        /**
         * 数据集的唯一标识
         * <p> 示例值：6953903108179099667
         *
         * @param datasetId
         * @return
         */
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }


        /**
         * 该数据集对应的开放平台应用id
         * <p> 示例值：cli_a1306bed4738d01b
         *
         * @param appId
         * @return
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }


        /**
         * 创建时间，精确到秒级
         * <p> 示例值：1990-12-31T23:59:60Z
         *
         * @param createTime
         * @return
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }


        /**
         * 更新时间
         * <p> 示例值：1990-12-31T23:59:60Z
         *
         * @param updateTime
         * @return
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }


        /**
         * 数据集中的索引数据的数量
         * <p> 示例值：1000
         *
         * @param chunkNum
         * @return
         */
        public Builder chunkNum(Integer chunkNum) {
            this.chunkNum = chunkNum;
            return this;
        }


        /**
         * 数据集中的数据项的数量
         * <p> 示例值：100
         *
         * @param docNum
         * @return
         */
        public Builder docNum(Integer docNum) {
            this.docNum = docNum;
            return this;
        }


        /**
         * 数据源的名字，只允许英文字母、数字和下划线，需要保证应用内部的唯一性。
         * <p> 示例值：feishu_web_1
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 描述该数据集的具体内容以及相关用途
         * <p> 示例值：飞书官网等网页上的数据，主要用于搜索问答
         *
         * @param description
         * @return
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }


        /**
         * 过滤字段，每个数据集支持多个过滤字段
         * <p> 示例值：
         *
         * @param filterSchemas
         * @return
         */
        public Builder filterSchemas(FilterSchema[] filterSchemas) {
            this.filterSchemas = filterSchemas;
            return this;
        }


        /**
         * 模型配置
         * <p> 示例值：
         *
         * @param modelConfig
         * @return
         */
        public Builder modelConfig(ModelConfig modelConfig) {
            this.modelConfig = modelConfig;
            return this;
        }


        /**
         * 被授权可搜/可见的应用
         * <p> 示例值：
         *
         * @param viewerAppIds
         * @return
         */
        public Builder viewerAppIds(String[] viewerAppIds) {
            this.viewerAppIds = viewerAppIds;
            return this;
        }


        public Dataset build() {
            return new Dataset(this);
        }
    }
}
