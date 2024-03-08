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

package com.lark.oapi.service.okr.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.okr.v1.enums.*;
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

public class Okr {
    /**
     * OKR ID
     * <p> 示例值：6976173067307927084
     */
    @SerializedName("okr_id")
    private String okrId;
    /**
     * 周期 ID
     * <p> 示例值：6974586812973581868
     */
    @SerializedName("period_id")
    private String periodId;
    /**
     * 周期类型：1、月周期；2、年周期
     * <p> 示例值：1
     */
    @SerializedName("period_type")
    private String periodType;
    /**
     * 周期展示名称
     * <p> 示例值：
     */
    @SerializedName("name")
    private OkrName name;
    /**
     * 创建时间 毫秒
     * <p> 示例值：1624267575928
     */
    @SerializedName("create_time")
    private Integer createTime;
    /**
     * 修改时间 毫秒
     * <p> 示例值：1624329170463
     */
    @SerializedName("modify_time")
    private Integer modifyTime;
    /**
     * objective 列表
     * <p> 示例值：
     */
    @SerializedName("objective_list")
    private OkrDetailObjective[] objectiveList;
    /**
     * 打分
     * <p> 示例值：0.5
     */
    @SerializedName("okr_score")
    private Integer okrScore;

    // builder 开始
    public Okr() {
    }

    public Okr(Builder builder) {
        /**
         * OKR ID
         * <p> 示例值：6976173067307927084
         */
        this.okrId = builder.okrId;
        /**
         * 周期 ID
         * <p> 示例值：6974586812973581868
         */
        this.periodId = builder.periodId;
        /**
         * 周期类型：1、月周期；2、年周期
         * <p> 示例值：1
         */
        this.periodType = builder.periodType;
        /**
         * 周期展示名称
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 创建时间 毫秒
         * <p> 示例值：1624267575928
         */
        this.createTime = builder.createTime;
        /**
         * 修改时间 毫秒
         * <p> 示例值：1624329170463
         */
        this.modifyTime = builder.modifyTime;
        /**
         * objective 列表
         * <p> 示例值：
         */
        this.objectiveList = builder.objectiveList;
        /**
         * 打分
         * <p> 示例值：0.5
         */
        this.okrScore = builder.okrScore;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getOkrId() {
        return this.okrId;
    }

    public void setOkrId(String okrId) {
        this.okrId = okrId;
    }

    public String getPeriodId() {
        return this.periodId;
    }

    public void setPeriodId(String periodId) {
        this.periodId = periodId;
    }

    public String getPeriodType() {
        return this.periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public OkrName getName() {
        return this.name;
    }

    public void setName(OkrName name) {
        this.name = name;
    }

    public Integer getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getModifyTime() {
        return this.modifyTime;
    }

    public void setModifyTime(Integer modifyTime) {
        this.modifyTime = modifyTime;
    }

    public OkrDetailObjective[] getObjectiveList() {
        return this.objectiveList;
    }

    public void setObjectiveList(OkrDetailObjective[] objectiveList) {
        this.objectiveList = objectiveList;
    }

    public Integer getOkrScore() {
        return this.okrScore;
    }

    public void setOkrScore(Integer okrScore) {
        this.okrScore = okrScore;
    }

    public static class Builder {
        /**
         * OKR ID
         * <p> 示例值：6976173067307927084
         */
        private String okrId;
        /**
         * 周期 ID
         * <p> 示例值：6974586812973581868
         */
        private String periodId;
        /**
         * 周期类型：1、月周期；2、年周期
         * <p> 示例值：1
         */
        private String periodType;
        /**
         * 周期展示名称
         * <p> 示例值：
         */
        private OkrName name;
        /**
         * 创建时间 毫秒
         * <p> 示例值：1624267575928
         */
        private Integer createTime;
        /**
         * 修改时间 毫秒
         * <p> 示例值：1624329170463
         */
        private Integer modifyTime;
        /**
         * objective 列表
         * <p> 示例值：
         */
        private OkrDetailObjective[] objectiveList;
        /**
         * 打分
         * <p> 示例值：0.5
         */
        private Integer okrScore;

        /**
         * OKR ID
         * <p> 示例值：6976173067307927084
         *
         * @param okrId
         * @return
         */
        public Builder okrId(String okrId) {
            this.okrId = okrId;
            return this;
        }


        /**
         * 周期 ID
         * <p> 示例值：6974586812973581868
         *
         * @param periodId
         * @return
         */
        public Builder periodId(String periodId) {
            this.periodId = periodId;
            return this;
        }


        /**
         * 周期类型：1、月周期；2、年周期
         * <p> 示例值：1
         *
         * @param periodType
         * @return
         */
        public Builder periodType(String periodType) {
            this.periodType = periodType;
            return this;
        }


        /**
         * 周期展示名称
         * <p> 示例值：
         *
         * @param name
         * @return
         */
        public Builder name(OkrName name) {
            this.name = name;
            return this;
        }


        /**
         * 创建时间 毫秒
         * <p> 示例值：1624267575928
         *
         * @param createTime
         * @return
         */
        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }


        /**
         * 修改时间 毫秒
         * <p> 示例值：1624329170463
         *
         * @param modifyTime
         * @return
         */
        public Builder modifyTime(Integer modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }


        /**
         * objective 列表
         * <p> 示例值：
         *
         * @param objectiveList
         * @return
         */
        public Builder objectiveList(OkrDetailObjective[] objectiveList) {
            this.objectiveList = objectiveList;
            return this;
        }


        /**
         * 打分
         * <p> 示例值：0.5
         *
         * @param okrScore
         * @return
         */
        public Builder okrScore(Integer okrScore) {
            this.okrScore = okrScore;
            return this;
        }


        public Okr build() {
            return new Okr(this);
        }
    }
}
