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

package com.lark.oapi.service.attendance.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.attendance.v1.enums.*;
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

public class ScanWifiInfo {
    /**
     * <p> 示例值：
     */
    @SerializedName("ssid")
    private String ssid;
    /**
     * <p> 示例值：
     */
    @SerializedName("bssid")
    private String bssid;

    // builder 开始
    public ScanWifiInfo() {
    }

    public ScanWifiInfo(Builder builder) {
        /**
         *
         * <p> 示例值：
         */
        this.ssid = builder.ssid;
        /**
         *
         * <p> 示例值：
         */
        this.bssid = builder.bssid;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getSsid() {
        return this.ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public String getBssid() {
        return this.bssid;
    }

    public void setBssid(String bssid) {
        this.bssid = bssid;
    }

    public static class Builder {
        /**
         * <p> 示例值：
         */
        private String ssid;
        /**
         * <p> 示例值：
         */
        private String bssid;

        /**
         * <p> 示例值：
         *
         * @param ssid
         * @return
         */
        public Builder ssid(String ssid) {
            this.ssid = ssid;
            return this;
        }


        /**
         * <p> 示例值：
         *
         * @param bssid
         * @return
         */
        public Builder bssid(String bssid) {
            this.bssid = bssid;
            return this;
        }


        public ScanWifiInfo build() {
            return new ScanWifiInfo(this);
        }
    }
}
