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

package com.lark.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;

public class ConnectorLogData {
    /**
     * 时间
     * <p> 示例值：2023-03-23 10:05:11
     */
    @SerializedName("date_time")
    private String dateTime;
    /**
     * 数据（脱敏）
     * <p> 示例值：cwyFtNZSO7wKZ2Bi+WHJVbb6uZ3G2hlsje
     */
    @SerializedName("data")
    private String data;
    /**
     * 数据等级
     * <p> 示例值：INFO
     */
    @SerializedName("level")
    private String level;
    /**
     * 机器名称
     * <p> 示例值：C02GD65CMD6R
     */
    @SerializedName("pod")
    private String pod;
    /**
     * 打印位置（脱敏）
     * <p> 示例值：K+GFMIO+2aTIX8yXkPLK2hoEPof4
     */
    @SerializedName("location")
    private String location;
    /**
     * 数据类型
     * <p> 示例值：MONITOR
     */
    @SerializedName("type")
    private String type;
    /**
     * 版本号
     * <p> 示例值：2.0.1
     */
    @SerializedName("version")
    private String version;

    // builder 开始
    public ConnectorLogData() {
    }

    public ConnectorLogData(Builder builder) {
        /**
         * 时间
         * <p> 示例值：2023-03-23 10:05:11
         */
        this.dateTime = builder.dateTime;
        /**
         * 数据（脱敏）
         * <p> 示例值：cwyFtNZSO7wKZ2Bi+WHJVbb6uZ3G2hlsje
         */
        this.data = builder.data;
        /**
         * 数据等级
         * <p> 示例值：INFO
         */
        this.level = builder.level;
        /**
         * 机器名称
         * <p> 示例值：C02GD65CMD6R
         */
        this.pod = builder.pod;
        /**
         * 打印位置（脱敏）
         * <p> 示例值：K+GFMIO+2aTIX8yXkPLK2hoEPof4
         */
        this.location = builder.location;
        /**
         * 数据类型
         * <p> 示例值：MONITOR
         */
        this.type = builder.type;
        /**
         * 版本号
         * <p> 示例值：2.0.1
         */
        this.version = builder.version;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getDateTime() {
        return this.dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPod() {
        return this.pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public static class Builder {
        /**
         * 时间
         * <p> 示例值：2023-03-23 10:05:11
         */
        private String dateTime;
        /**
         * 数据（脱敏）
         * <p> 示例值：cwyFtNZSO7wKZ2Bi+WHJVbb6uZ3G2hlsje
         */
        private String data;
        /**
         * 数据等级
         * <p> 示例值：INFO
         */
        private String level;
        /**
         * 机器名称
         * <p> 示例值：C02GD65CMD6R
         */
        private String pod;
        /**
         * 打印位置（脱敏）
         * <p> 示例值：K+GFMIO+2aTIX8yXkPLK2hoEPof4
         */
        private String location;
        /**
         * 数据类型
         * <p> 示例值：MONITOR
         */
        private String type;
        /**
         * 版本号
         * <p> 示例值：2.0.1
         */
        private String version;

        /**
         * 时间
         * <p> 示例值：2023-03-23 10:05:11
         *
         * @param dateTime
         * @return
         */
        public Builder dateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }


        /**
         * 数据（脱敏）
         * <p> 示例值：cwyFtNZSO7wKZ2Bi+WHJVbb6uZ3G2hlsje
         *
         * @param data
         * @return
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }


        /**
         * 数据等级
         * <p> 示例值：INFO
         *
         * @param level
         * @return
         */
        public Builder level(String level) {
            this.level = level;
            return this;
        }


        /**
         * 机器名称
         * <p> 示例值：C02GD65CMD6R
         *
         * @param pod
         * @return
         */
        public Builder pod(String pod) {
            this.pod = pod;
            return this;
        }


        /**
         * 打印位置（脱敏）
         * <p> 示例值：K+GFMIO+2aTIX8yXkPLK2hoEPof4
         *
         * @param location
         * @return
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }


        /**
         * 数据类型
         * <p> 示例值：MONITOR
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }


        /**
         * 版本号
         * <p> 示例值：2.0.1
         *
         * @param version
         * @return
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }


        public ConnectorLogData build() {
            return new ConnectorLogData(this);
        }
    }
}