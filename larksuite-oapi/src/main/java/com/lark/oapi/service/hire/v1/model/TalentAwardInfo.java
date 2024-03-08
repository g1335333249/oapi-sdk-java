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

public class TalentAwardInfo {
    /**
     * ID
     * <p> 示例值：6891560630172518670
     */
    @SerializedName("id")
    private String id;
    /**
     * 获奖名称
     * <p> 示例值：最佳新人奖
     */
    @SerializedName("title")
    private String title;
    /**
     * 获奖时间
     * <p> 示例值：1991
     */
    @SerializedName("award_time")
    private String awardTime;
    /**
     * 描述
     * <p> 示例值：最优秀的新人奖
     */
    @SerializedName("desc")
    private String desc;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("customized_data_list")
    private TalentCustomizedDataChild[] customizedDataList;

    // builder 开始
    public TalentAwardInfo() {
    }

    public TalentAwardInfo(Builder builder) {
        /**
         * ID
         * <p> 示例值：6891560630172518670
         */
        this.id = builder.id;
        /**
         * 获奖名称
         * <p> 示例值：最佳新人奖
         */
        this.title = builder.title;
        /**
         * 获奖时间
         * <p> 示例值：1991
         */
        this.awardTime = builder.awardTime;
        /**
         * 描述
         * <p> 示例值：最优秀的新人奖
         */
        this.desc = builder.desc;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customizedDataList = builder.customizedDataList;
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

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAwardTime() {
        return this.awardTime;
    }

    public void setAwardTime(String awardTime) {
        this.awardTime = awardTime;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public TalentCustomizedDataChild[] getCustomizedDataList() {
        return this.customizedDataList;
    }

    public void setCustomizedDataList(TalentCustomizedDataChild[] customizedDataList) {
        this.customizedDataList = customizedDataList;
    }

    public static class Builder {
        /**
         * ID
         * <p> 示例值：6891560630172518670
         */
        private String id;
        /**
         * 获奖名称
         * <p> 示例值：最佳新人奖
         */
        private String title;
        /**
         * 获奖时间
         * <p> 示例值：1991
         */
        private String awardTime;
        /**
         * 描述
         * <p> 示例值：最优秀的新人奖
         */
        private String desc;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private TalentCustomizedDataChild[] customizedDataList;

        /**
         * ID
         * <p> 示例值：6891560630172518670
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 获奖名称
         * <p> 示例值：最佳新人奖
         *
         * @param title
         * @return
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }


        /**
         * 获奖时间
         * <p> 示例值：1991
         *
         * @param awardTime
         * @return
         */
        public Builder awardTime(String awardTime) {
            this.awardTime = awardTime;
            return this;
        }


        /**
         * 描述
         * <p> 示例值：最优秀的新人奖
         *
         * @param desc
         * @return
         */
        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }


        /**
         * 自定义字段
         * <p> 示例值：
         *
         * @param customizedDataList
         * @return
         */
        public Builder customizedDataList(TalentCustomizedDataChild[] customizedDataList) {
            this.customizedDataList = customizedDataList;
            return this;
        }


        public TalentAwardInfo build() {
            return new TalentAwardInfo(this);
        }
    }
}
