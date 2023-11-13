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
 * 识别的字段种类
 */
public enum HkmMainlandTravelPermitEntityHKMMainlandTravelPermitEntityTypeEnum {
    FULLNAMECN("full_name_cn"), // 中文姓名
    FULLNAMEEN("full_name_en"), // 英文格式姓名
    DATEOFBIRTH("date_of_birth"), // 出生日期
    DATEOFEXPIRY("date_of_expiry"), // 有效期至
    CARDNUMBER("card_number"), // 证件号码
    ;
    private String value;

    HkmMainlandTravelPermitEntityHKMMainlandTravelPermitEntityTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}