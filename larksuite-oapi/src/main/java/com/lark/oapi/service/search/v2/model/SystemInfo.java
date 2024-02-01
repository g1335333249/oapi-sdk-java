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

import com.google.gson.annotations.SerializedName;

public class SystemInfo {
    /**
     * 用户时间
     * <p> 示例值：2006-01-02 15:04:05
     */
    @SerializedName("time")
    private String time;
    /**
     * 用户时区
     * <p> 示例值：Asia/Shanghai
     */
    @SerializedName("time_zone")
    private String timeZone;
    /**
     * 用户问题的语种
     * <p> 示例值：en
     */
    @SerializedName("lang")
    private String lang;
    /**
     * 客户端品牌
     * <p> 示例值：feishu
     */
    @SerializedName("brand")
    private String brand;
    /**
     * 星期信息
     * <p> 示例值：Monday
     */
    @SerializedName("weekday")
    private String weekday;
    /**
     * 一次话题的唯一标识
     * <p> 示例值：123456
     */
    @SerializedName("session_id")
    private String sessionId;
    /**
     * 用户赋予飞飞的名字
     * <p> 示例值：Bob
     */
    @SerializedName("shadow_name")
    private String shadowName;
    /**
     * 消息 ID
     * <p> 示例值：om_0c1e199622cec22ffcc490392b12cdac
     */
    @SerializedName("msg_id")
    private String msgId;
    /**
     * 场景 ID
     * <p> 示例值：7302361858671902739
     */
    @SerializedName("agent_id")
    private String agentId;

    // builder 开始
    public SystemInfo() {
    }

    public SystemInfo(Builder builder) {
        /**
         * 用户时间
         * <p> 示例值：2006-01-02 15:04:05
         */
        this.time = builder.time;
        /**
         * 用户时区
         * <p> 示例值：Asia/Shanghai
         */
        this.timeZone = builder.timeZone;
        /**
         * 用户问题的语种
         * <p> 示例值：en
         */
        this.lang = builder.lang;
        /**
         * 客户端品牌
         * <p> 示例值：feishu
         */
        this.brand = builder.brand;
        /**
         * 星期信息
         * <p> 示例值：Monday
         */
        this.weekday = builder.weekday;
        /**
         * 一次话题的唯一标识
         * <p> 示例值：123456
         */
        this.sessionId = builder.sessionId;
        /**
         * 用户赋予飞飞的名字
         * <p> 示例值：Bob
         */
        this.shadowName = builder.shadowName;
        /**
         * 消息 ID
         * <p> 示例值：om_0c1e199622cec22ffcc490392b12cdac
         */
        this.msgId = builder.msgId;
        /**
         * 场景 ID
         * <p> 示例值：7302361858671902739
         */
        this.agentId = builder.agentId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTimeZone() {
        return this.timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getLang() {
        return this.lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getWeekday() {
        return this.weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getShadowName() {
        return this.shadowName;
    }

    public void setShadowName(String shadowName) {
        this.shadowName = shadowName;
    }

    public String getMsgId() {
        return this.msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getAgentId() {
        return this.agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public static class Builder {
        /**
         * 用户时间
         * <p> 示例值：2006-01-02 15:04:05
         */
        private String time;
        /**
         * 用户时区
         * <p> 示例值：Asia/Shanghai
         */
        private String timeZone;
        /**
         * 用户问题的语种
         * <p> 示例值：en
         */
        private String lang;
        /**
         * 客户端品牌
         * <p> 示例值：feishu
         */
        private String brand;
        /**
         * 星期信息
         * <p> 示例值：Monday
         */
        private String weekday;
        /**
         * 一次话题的唯一标识
         * <p> 示例值：123456
         */
        private String sessionId;
        /**
         * 用户赋予飞飞的名字
         * <p> 示例值：Bob
         */
        private String shadowName;
        /**
         * 消息 ID
         * <p> 示例值：om_0c1e199622cec22ffcc490392b12cdac
         */
        private String msgId;
        /**
         * 场景 ID
         * <p> 示例值：7302361858671902739
         */
        private String agentId;

        /**
         * 用户时间
         * <p> 示例值：2006-01-02 15:04:05
         *
         * @param time
         * @return
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }


        /**
         * 用户时区
         * <p> 示例值：Asia/Shanghai
         *
         * @param timeZone
         * @return
         */
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }


        /**
         * 用户问题的语种
         * <p> 示例值：en
         *
         * @param lang
         * @return
         */
        public Builder lang(String lang) {
            this.lang = lang;
            return this;
        }


        /**
         * 客户端品牌
         * <p> 示例值：feishu
         *
         * @param brand
         * @return
         */
        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        /**
         * 客户端品牌
         * <p> 示例值：feishu
         *
         * @param brand {@link com.lark.oapi.service.search.v2.enums.SystemInfoBrandEnum}
         * @return
         */
        public Builder brand(com.lark.oapi.service.search.v2.enums.SystemInfoBrandEnum brand) {
            this.brand = brand.getValue();
            return this;
        }


        /**
         * 星期信息
         * <p> 示例值：Monday
         *
         * @param weekday
         * @return
         */
        public Builder weekday(String weekday) {
            this.weekday = weekday;
            return this;
        }


        /**
         * 一次话题的唯一标识
         * <p> 示例值：123456
         *
         * @param sessionId
         * @return
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }


        /**
         * 用户赋予飞飞的名字
         * <p> 示例值：Bob
         *
         * @param shadowName
         * @return
         */
        public Builder shadowName(String shadowName) {
            this.shadowName = shadowName;
            return this;
        }


        /**
         * 消息 ID
         * <p> 示例值：om_0c1e199622cec22ffcc490392b12cdac
         *
         * @param msgId
         * @return
         */
        public Builder msgId(String msgId) {
            this.msgId = msgId;
            return this;
        }


        /**
         * 场景 ID
         * <p> 示例值：7302361858671902739
         *
         * @param agentId
         * @return
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }


        public SystemInfo build() {
            return new SystemInfo(this);
        }
    }
}
