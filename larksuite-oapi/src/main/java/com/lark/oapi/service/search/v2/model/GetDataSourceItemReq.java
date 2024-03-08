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
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class GetDataSourceItemReq {
    /**
     * 数据源的id
     * <p> 示例值：service_ticket
     */
    @Path
    @SerializedName("data_source_id")
    private String dataSourceId;
    /**
     * 数据记录的唯一标识
     * <p> 示例值：01010111
     */
    @Path
    @SerializedName("item_id")
    private String itemId;

    // builder 开始
    public GetDataSourceItemReq() {
    }

    public GetDataSourceItemReq(Builder builder) {
        /**
         * 数据源的id
         * <p> 示例值：service_ticket
         */
        this.dataSourceId = builder.dataSourceId;
        /**
         * 数据记录的唯一标识
         * <p> 示例值：01010111
         */
        this.itemId = builder.itemId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public static class Builder {

        private String dataSourceId; // 数据源的id
        private String itemId; // 数据记录的唯一标识

        /**
         * 数据源的id
         * <p> 示例值：service_ticket
         *
         * @param dataSourceId
         * @return
         */
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }


        /**
         * 数据记录的唯一标识
         * <p> 示例值：01010111
         *
         * @param itemId
         * @return
         */
        public Builder itemId(String itemId) {
            this.itemId = itemId;
            return this;
        }

        public GetDataSourceItemReq build() {
            return new GetDataSourceItemReq(this);
        }
    }
}
