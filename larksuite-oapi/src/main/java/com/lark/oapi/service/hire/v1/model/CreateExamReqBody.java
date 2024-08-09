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

public class CreateExamReqBody {
    /**
     * 投递 ID
     * <p> 示例值：6891565253964859661
     */
    @SerializedName("application_id")
    private String applicationId;
    /**
     * 试卷名称
     * <p> 示例值：笔试试卷
     */
    @SerializedName("exam_resource_name")
    private String examResourceName;
    /**
     * 笔试分数
     * <p> 示例值：100
     */
    @SerializedName("score")
    private Double score;
    /**
     * 报告附件，使用[创建附件](https://open.feishu.cn/document/ukTMukTMukTM/uIDN1YjLyQTN24iM0UjN/create_attachment)上传，获取附件ID，支持的文件格式：JPG、JPEG、PNG、PDF，不超过 100MB。
     * <p> 示例值：6949805467799537964
     */
    @SerializedName("uuid")
    private String uuid;
    /**
     * 添加人 ID
     * <p> 示例值：ou_f476cb099ac9227c9bae09ce46112579
     */
    @SerializedName("operator_id")
    private String operatorId;

    // builder 开始
    public CreateExamReqBody() {
    }

    public CreateExamReqBody(Builder builder) {
        /**
         * 投递 ID
         * <p> 示例值：6891565253964859661
         */
        this.applicationId = builder.applicationId;
        /**
         * 试卷名称
         * <p> 示例值：笔试试卷
         */
        this.examResourceName = builder.examResourceName;
        /**
         * 笔试分数
         * <p> 示例值：100
         */
        this.score = builder.score;
        /**
         * 报告附件，使用[创建附件](https://open.feishu.cn/document/ukTMukTMukTM/uIDN1YjLyQTN24iM0UjN/create_attachment)上传，获取附件ID，支持的文件格式：JPG、JPEG、PNG、PDF，不超过 100MB。
         * <p> 示例值：6949805467799537964
         */
        this.uuid = builder.uuid;
        /**
         * 添加人 ID
         * <p> 示例值：ou_f476cb099ac9227c9bae09ce46112579
         */
        this.operatorId = builder.operatorId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getExamResourceName() {
        return this.examResourceName;
    }

    public void setExamResourceName(String examResourceName) {
        this.examResourceName = examResourceName;
    }

    public Double getScore() {
        return this.score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getOperatorId() {
        return this.operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public static class Builder {
        /**
         * 投递 ID
         * <p> 示例值：6891565253964859661
         */
        private String applicationId;
        /**
         * 试卷名称
         * <p> 示例值：笔试试卷
         */
        private String examResourceName;
        /**
         * 笔试分数
         * <p> 示例值：100
         */
        private Double score;
        /**
         * 报告附件，使用[创建附件](https://open.feishu.cn/document/ukTMukTMukTM/uIDN1YjLyQTN24iM0UjN/create_attachment)上传，获取附件ID，支持的文件格式：JPG、JPEG、PNG、PDF，不超过 100MB。
         * <p> 示例值：6949805467799537964
         */
        private String uuid;
        /**
         * 添加人 ID
         * <p> 示例值：ou_f476cb099ac9227c9bae09ce46112579
         */
        private String operatorId;

        /**
         * 投递 ID
         * <p> 示例值：6891565253964859661
         *
         * @param applicationId
         * @return
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }


        /**
         * 试卷名称
         * <p> 示例值：笔试试卷
         *
         * @param examResourceName
         * @return
         */
        public Builder examResourceName(String examResourceName) {
            this.examResourceName = examResourceName;
            return this;
        }


        /**
         * 笔试分数
         * <p> 示例值：100
         *
         * @param score
         * @return
         */
        public Builder score(Double score) {
            this.score = score;
            return this;
        }


        /**
         * 报告附件，使用[创建附件](https://open.feishu.cn/document/ukTMukTMukTM/uIDN1YjLyQTN24iM0UjN/create_attachment)上传，获取附件ID，支持的文件格式：JPG、JPEG、PNG、PDF，不超过 100MB。
         * <p> 示例值：6949805467799537964
         *
         * @param uuid
         * @return
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }


        /**
         * 添加人 ID
         * <p> 示例值：ou_f476cb099ac9227c9bae09ce46112579
         *
         * @param operatorId
         * @return
         */
        public Builder operatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }


        public CreateExamReqBody build() {
            return new CreateExamReqBody(this);
        }
    }
}