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

package com.lark.oapi.service.document_ai.v1.enums;

/**
 * 学历对应ID
 */
public enum ResumeEducationResumeEducationQualificationTypeEnum {
    PRIMARYSCHOOL(1), // 小学
    JUNIORHIGHSCHOOL(2), // 初中
    SPECIALIZEDSECONDARYSCHOOL(3), // 中职
    SENIORHIGHSCHOOL(4), // 高中
    JUNIORCOLLEGE(5), // 专科
    BACHELOR(6), // 本科
    MASTER(7), // 硕士
    DOCTOR(8), // 博士
    OTHER(9), // 其他
    ;
    private Integer value;

    ResumeEducationResumeEducationQualificationTypeEnum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }
}