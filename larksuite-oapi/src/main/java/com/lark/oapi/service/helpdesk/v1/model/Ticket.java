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

package com.lark.oapi.service.helpdesk.v1.model;

import com.google.gson.annotations.SerializedName;

public class Ticket {
    /**
     * 工单ID;;[可以从工单列表里面取](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/ticket/list);;[也可以订阅工单创建事件获取](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/ticket/events/created)
     * <p> 示例值：6626871355780366331
     */
    @SerializedName("ticket_id")
    private String ticketId;
    /**
     * 服务台ID
     * <p> 示例值：6626871355780366330
     */
    @SerializedName("helpdesk_id")
    private String helpdeskId;
    /**
     * 工单创建用户
     * <p> 示例值：
     */
    @SerializedName("guest")
    private TicketUser guest;
    /**
     * 备注
     * <p> 示例值：
     */
    @SerializedName("comments")
    private Comments comments;
    /**
     * 工单阶段：1. 机器人 2. 人工
     * <p> 示例值：1
     */
    @SerializedName("ticket_type")
    private Integer ticketType;
    /**
     * 工单状态，1：已创建 2: 处理中 3: 排队中 4：待定 5：待用户响应 50: 被机器人关闭 51: 被客服关闭 52: 用户自己关闭
     * <p> 示例值：50
     */
    @SerializedName("status")
    private Integer status;
    /**
     * 工单评分，1：不满意，2:一般，3:满意
     * <p> 示例值：1
     */
    @SerializedName("score")
    private Integer score;
    /**
     * 工单创建时间
     * <p> 示例值：1616920429000
     */
    @SerializedName("created_at")
    private Long createdAt;
    /**
     * 工单更新时间，没有值时为-1
     * <p> 示例值：1616920429000
     */
    @SerializedName("updated_at")
    private Long updatedAt;
    /**
     * 工单结束时间
     * <p> 示例值：1616920429000
     */
    @SerializedName("closed_at")
    private Long closedAt;
    /**
     * 不满意原因
     * <p> 示例值：
     */
    @SerializedName("dissatisfaction_reason")
    private I18n dissatisfactionReason;
    /**
     * 工单客服
     * <p> 示例值：
     */
    @SerializedName("agents")
    private TicketUser[] agents;
    /**
     * 工单渠道，描述：;9：Open API 2：二维码 14：分享 13：搜索 其他数字：其他渠道
     * <p> 示例值：0
     */
    @SerializedName("channel")
    private Integer channel;
    /**
     * 工单是否解决 1:没解决 2:已解决
     * <p> 示例值：1
     */
    @SerializedName("solve")
    private Integer solve;
    /**
     * 关单用户ID
     * <p> 示例值：
     */
    @SerializedName("closed_by")
    private TicketUser closedBy;
    /**
     * 工单协作者
     * <p> 示例值：
     */
    @SerializedName("collaborators")
    private TicketUser[] collaborators;
    /**
     * 自定义字段列表，没有值时不设置  ;下拉菜单的value对应工单字段里面的children.display_name;[获取全部工单自定义字段](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/ticket_customized_field/list-ticket-customized-fields)
     * <p> 示例值：
     */
    @SerializedName("customized_fields")
    private CustomizedFieldDisplayItem[] customizedFields;
    /**
     * 客服服务时长，客服最后一次回复时间距离客服进入时间间隔，单位分钟
     * <p> 示例值：42624.95
     */
    @SerializedName("agent_service_duration")
    private Double agentServiceDuration;
    /**
     * 客服首次回复时间距离客服进入时间的间隔(秒)
     * <p> 示例值：1616920429000
     */
    @SerializedName("agent_first_response_duration")
    private Long agentFirstResponseDuration;
    /**
     * 机器人服务时间：客服进入时间距离工单创建时间的间隔，单位秒
     * <p> 示例值：1616920429000
     */
    @SerializedName("bot_service_duration")
    private Long botServiceDuration;
    /**
     * 客服解决时长，关单时间距离客服进入时间的间隔，单位秒
     * <p> 示例值：1616920429000
     */
    @SerializedName("agent_resolution_time")
    private Long agentResolutionTime;
    /**
     * 工单实际处理时间：从客服进入到关单，单位秒
     * <p> 示例值：1616920429000
     */
    @SerializedName("actual_processing_time")
    private Long actualProcessingTime;
    /**
     * 客服进入时间，单位毫秒
     * <p> 示例值：1616920429000
     */
    @SerializedName("agent_entry_time")
    private Long agentEntryTime;
    /**
     * 客服首次回复时间，单位毫秒
     * <p> 示例值：1616920429000
     */
    @SerializedName("agent_first_response_time")
    private Long agentFirstResponseTime;
    /**
     * 客服最后回复时间，单位毫秒
     * <p> 示例值：1616920429000
     */
    @SerializedName("agent_last_response_time")
    private Long agentLastResponseTime;
    /**
     * 主责客服
     * <p> 示例值：
     */
    @SerializedName("agent_owner")
    private TicketUser agentOwner;

    // builder 开始
    public Ticket() {
    }

    public Ticket(Builder builder) {
        /**
         * 工单ID;;[可以从工单列表里面取](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/ticket/list);;[也可以订阅工单创建事件获取](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/ticket/events/created)
         * <p> 示例值：6626871355780366331
         */
        this.ticketId = builder.ticketId;
        /**
         * 服务台ID
         * <p> 示例值：6626871355780366330
         */
        this.helpdeskId = builder.helpdeskId;
        /**
         * 工单创建用户
         * <p> 示例值：
         */
        this.guest = builder.guest;
        /**
         * 备注
         * <p> 示例值：
         */
        this.comments = builder.comments;
        /**
         * 工单阶段：1. 机器人 2. 人工
         * <p> 示例值：1
         */
        this.ticketType = builder.ticketType;
        /**
         * 工单状态，1：已创建 2: 处理中 3: 排队中 4：待定 5：待用户响应 50: 被机器人关闭 51: 被客服关闭 52: 用户自己关闭
         * <p> 示例值：50
         */
        this.status = builder.status;
        /**
         * 工单评分，1：不满意，2:一般，3:满意
         * <p> 示例值：1
         */
        this.score = builder.score;
        /**
         * 工单创建时间
         * <p> 示例值：1616920429000
         */
        this.createdAt = builder.createdAt;
        /**
         * 工单更新时间，没有值时为-1
         * <p> 示例值：1616920429000
         */
        this.updatedAt = builder.updatedAt;
        /**
         * 工单结束时间
         * <p> 示例值：1616920429000
         */
        this.closedAt = builder.closedAt;
        /**
         * 不满意原因
         * <p> 示例值：
         */
        this.dissatisfactionReason = builder.dissatisfactionReason;
        /**
         * 工单客服
         * <p> 示例值：
         */
        this.agents = builder.agents;
        /**
         * 工单渠道，描述：;9：Open API 2：二维码 14：分享 13：搜索 其他数字：其他渠道
         * <p> 示例值：0
         */
        this.channel = builder.channel;
        /**
         * 工单是否解决 1:没解决 2:已解决
         * <p> 示例值：1
         */
        this.solve = builder.solve;
        /**
         * 关单用户ID
         * <p> 示例值：
         */
        this.closedBy = builder.closedBy;
        /**
         * 工单协作者
         * <p> 示例值：
         */
        this.collaborators = builder.collaborators;
        /**
         * 自定义字段列表，没有值时不设置  ;下拉菜单的value对应工单字段里面的children.display_name;[获取全部工单自定义字段](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/ticket_customized_field/list-ticket-customized-fields)
         * <p> 示例值：
         */
        this.customizedFields = builder.customizedFields;
        /**
         * 客服服务时长，客服最后一次回复时间距离客服进入时间间隔，单位分钟
         * <p> 示例值：42624.95
         */
        this.agentServiceDuration = builder.agentServiceDuration;
        /**
         * 客服首次回复时间距离客服进入时间的间隔(秒)
         * <p> 示例值：1616920429000
         */
        this.agentFirstResponseDuration = builder.agentFirstResponseDuration;
        /**
         * 机器人服务时间：客服进入时间距离工单创建时间的间隔，单位秒
         * <p> 示例值：1616920429000
         */
        this.botServiceDuration = builder.botServiceDuration;
        /**
         * 客服解决时长，关单时间距离客服进入时间的间隔，单位秒
         * <p> 示例值：1616920429000
         */
        this.agentResolutionTime = builder.agentResolutionTime;
        /**
         * 工单实际处理时间：从客服进入到关单，单位秒
         * <p> 示例值：1616920429000
         */
        this.actualProcessingTime = builder.actualProcessingTime;
        /**
         * 客服进入时间，单位毫秒
         * <p> 示例值：1616920429000
         */
        this.agentEntryTime = builder.agentEntryTime;
        /**
         * 客服首次回复时间，单位毫秒
         * <p> 示例值：1616920429000
         */
        this.agentFirstResponseTime = builder.agentFirstResponseTime;
        /**
         * 客服最后回复时间，单位毫秒
         * <p> 示例值：1616920429000
         */
        this.agentLastResponseTime = builder.agentLastResponseTime;
        /**
         * 主责客服
         * <p> 示例值：
         */
        this.agentOwner = builder.agentOwner;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getTicketId() {
        return this.ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getHelpdeskId() {
        return this.helpdeskId;
    }

    public void setHelpdeskId(String helpdeskId) {
        this.helpdeskId = helpdeskId;
    }

    public TicketUser getGuest() {
        return this.guest;
    }

    public void setGuest(TicketUser guest) {
        this.guest = guest;
    }

    public Comments getComments() {
        return this.comments;
    }

    public void setComments(Comments comments) {
        this.comments = comments;
    }

    public Integer getTicketType() {
        return this.ticketType;
    }

    public void setTicketType(Integer ticketType) {
        this.ticketType = ticketType;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getScore() {
        return this.score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Long getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getClosedAt() {
        return this.closedAt;
    }

    public void setClosedAt(Long closedAt) {
        this.closedAt = closedAt;
    }

    public I18n getDissatisfactionReason() {
        return this.dissatisfactionReason;
    }

    public void setDissatisfactionReason(I18n dissatisfactionReason) {
        this.dissatisfactionReason = dissatisfactionReason;
    }

    public TicketUser[] getAgents() {
        return this.agents;
    }

    public void setAgents(TicketUser[] agents) {
        this.agents = agents;
    }

    public Integer getChannel() {
        return this.channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Integer getSolve() {
        return this.solve;
    }

    public void setSolve(Integer solve) {
        this.solve = solve;
    }

    public TicketUser getClosedBy() {
        return this.closedBy;
    }

    public void setClosedBy(TicketUser closedBy) {
        this.closedBy = closedBy;
    }

    public TicketUser[] getCollaborators() {
        return this.collaborators;
    }

    public void setCollaborators(TicketUser[] collaborators) {
        this.collaborators = collaborators;
    }

    public CustomizedFieldDisplayItem[] getCustomizedFields() {
        return this.customizedFields;
    }

    public void setCustomizedFields(CustomizedFieldDisplayItem[] customizedFields) {
        this.customizedFields = customizedFields;
    }

    public Double getAgentServiceDuration() {
        return this.agentServiceDuration;
    }

    public void setAgentServiceDuration(Double agentServiceDuration) {
        this.agentServiceDuration = agentServiceDuration;
    }

    public Long getAgentFirstResponseDuration() {
        return this.agentFirstResponseDuration;
    }

    public void setAgentFirstResponseDuration(Long agentFirstResponseDuration) {
        this.agentFirstResponseDuration = agentFirstResponseDuration;
    }

    public Long getBotServiceDuration() {
        return this.botServiceDuration;
    }

    public void setBotServiceDuration(Long botServiceDuration) {
        this.botServiceDuration = botServiceDuration;
    }

    public Long getAgentResolutionTime() {
        return this.agentResolutionTime;
    }

    public void setAgentResolutionTime(Long agentResolutionTime) {
        this.agentResolutionTime = agentResolutionTime;
    }

    public Long getActualProcessingTime() {
        return this.actualProcessingTime;
    }

    public void setActualProcessingTime(Long actualProcessingTime) {
        this.actualProcessingTime = actualProcessingTime;
    }

    public Long getAgentEntryTime() {
        return this.agentEntryTime;
    }

    public void setAgentEntryTime(Long agentEntryTime) {
        this.agentEntryTime = agentEntryTime;
    }

    public Long getAgentFirstResponseTime() {
        return this.agentFirstResponseTime;
    }

    public void setAgentFirstResponseTime(Long agentFirstResponseTime) {
        this.agentFirstResponseTime = agentFirstResponseTime;
    }

    public Long getAgentLastResponseTime() {
        return this.agentLastResponseTime;
    }

    public void setAgentLastResponseTime(Long agentLastResponseTime) {
        this.agentLastResponseTime = agentLastResponseTime;
    }

    public TicketUser getAgentOwner() {
        return this.agentOwner;
    }

    public void setAgentOwner(TicketUser agentOwner) {
        this.agentOwner = agentOwner;
    }

    public static class Builder {
        /**
         * 工单ID;;[可以从工单列表里面取](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/ticket/list);;[也可以订阅工单创建事件获取](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/ticket/events/created)
         * <p> 示例值：6626871355780366331
         */
        private String ticketId;
        /**
         * 服务台ID
         * <p> 示例值：6626871355780366330
         */
        private String helpdeskId;
        /**
         * 工单创建用户
         * <p> 示例值：
         */
        private TicketUser guest;
        /**
         * 备注
         * <p> 示例值：
         */
        private Comments comments;
        /**
         * 工单阶段：1. 机器人 2. 人工
         * <p> 示例值：1
         */
        private Integer ticketType;
        /**
         * 工单状态，1：已创建 2: 处理中 3: 排队中 4：待定 5：待用户响应 50: 被机器人关闭 51: 被客服关闭 52: 用户自己关闭
         * <p> 示例值：50
         */
        private Integer status;
        /**
         * 工单评分，1：不满意，2:一般，3:满意
         * <p> 示例值：1
         */
        private Integer score;
        /**
         * 工单创建时间
         * <p> 示例值：1616920429000
         */
        private Long createdAt;
        /**
         * 工单更新时间，没有值时为-1
         * <p> 示例值：1616920429000
         */
        private Long updatedAt;
        /**
         * 工单结束时间
         * <p> 示例值：1616920429000
         */
        private Long closedAt;
        /**
         * 不满意原因
         * <p> 示例值：
         */
        private I18n dissatisfactionReason;
        /**
         * 工单客服
         * <p> 示例值：
         */
        private TicketUser[] agents;
        /**
         * 工单渠道，描述：;9：Open API 2：二维码 14：分享 13：搜索 其他数字：其他渠道
         * <p> 示例值：0
         */
        private Integer channel;
        /**
         * 工单是否解决 1:没解决 2:已解决
         * <p> 示例值：1
         */
        private Integer solve;
        /**
         * 关单用户ID
         * <p> 示例值：
         */
        private TicketUser closedBy;
        /**
         * 工单协作者
         * <p> 示例值：
         */
        private TicketUser[] collaborators;
        /**
         * 自定义字段列表，没有值时不设置  ;下拉菜单的value对应工单字段里面的children.display_name;[获取全部工单自定义字段](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/ticket_customized_field/list-ticket-customized-fields)
         * <p> 示例值：
         */
        private CustomizedFieldDisplayItem[] customizedFields;
        /**
         * 客服服务时长，客服最后一次回复时间距离客服进入时间间隔，单位分钟
         * <p> 示例值：42624.95
         */
        private Double agentServiceDuration;
        /**
         * 客服首次回复时间距离客服进入时间的间隔(秒)
         * <p> 示例值：1616920429000
         */
        private Long agentFirstResponseDuration;
        /**
         * 机器人服务时间：客服进入时间距离工单创建时间的间隔，单位秒
         * <p> 示例值：1616920429000
         */
        private Long botServiceDuration;
        /**
         * 客服解决时长，关单时间距离客服进入时间的间隔，单位秒
         * <p> 示例值：1616920429000
         */
        private Long agentResolutionTime;
        /**
         * 工单实际处理时间：从客服进入到关单，单位秒
         * <p> 示例值：1616920429000
         */
        private Long actualProcessingTime;
        /**
         * 客服进入时间，单位毫秒
         * <p> 示例值：1616920429000
         */
        private Long agentEntryTime;
        /**
         * 客服首次回复时间，单位毫秒
         * <p> 示例值：1616920429000
         */
        private Long agentFirstResponseTime;
        /**
         * 客服最后回复时间，单位毫秒
         * <p> 示例值：1616920429000
         */
        private Long agentLastResponseTime;
        /**
         * 主责客服
         * <p> 示例值：
         */
        private TicketUser agentOwner;

        /**
         * 工单ID;;[可以从工单列表里面取](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/ticket/list);;[也可以订阅工单创建事件获取](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/ticket/events/created)
         * <p> 示例值：6626871355780366331
         *
         * @param ticketId
         * @return
         */
        public Builder ticketId(String ticketId) {
            this.ticketId = ticketId;
            return this;
        }


        /**
         * 服务台ID
         * <p> 示例值：6626871355780366330
         *
         * @param helpdeskId
         * @return
         */
        public Builder helpdeskId(String helpdeskId) {
            this.helpdeskId = helpdeskId;
            return this;
        }


        /**
         * 工单创建用户
         * <p> 示例值：
         *
         * @param guest
         * @return
         */
        public Builder guest(TicketUser guest) {
            this.guest = guest;
            return this;
        }


        /**
         * 备注
         * <p> 示例值：
         *
         * @param comments
         * @return
         */
        public Builder comments(Comments comments) {
            this.comments = comments;
            return this;
        }


        /**
         * 工单阶段：1. 机器人 2. 人工
         * <p> 示例值：1
         *
         * @param ticketType
         * @return
         */
        public Builder ticketType(Integer ticketType) {
            this.ticketType = ticketType;
            return this;
        }


        /**
         * 工单状态，1：已创建 2: 处理中 3: 排队中 4：待定 5：待用户响应 50: 被机器人关闭 51: 被客服关闭 52: 用户自己关闭
         * <p> 示例值：50
         *
         * @param status
         * @return
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }


        /**
         * 工单评分，1：不满意，2:一般，3:满意
         * <p> 示例值：1
         *
         * @param score
         * @return
         */
        public Builder score(Integer score) {
            this.score = score;
            return this;
        }


        /**
         * 工单创建时间
         * <p> 示例值：1616920429000
         *
         * @param createdAt
         * @return
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }


        /**
         * 工单更新时间，没有值时为-1
         * <p> 示例值：1616920429000
         *
         * @param updatedAt
         * @return
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }


        /**
         * 工单结束时间
         * <p> 示例值：1616920429000
         *
         * @param closedAt
         * @return
         */
        public Builder closedAt(Long closedAt) {
            this.closedAt = closedAt;
            return this;
        }


        /**
         * 不满意原因
         * <p> 示例值：
         *
         * @param dissatisfactionReason
         * @return
         */
        public Builder dissatisfactionReason(I18n dissatisfactionReason) {
            this.dissatisfactionReason = dissatisfactionReason;
            return this;
        }


        /**
         * 工单客服
         * <p> 示例值：
         *
         * @param agents
         * @return
         */
        public Builder agents(TicketUser[] agents) {
            this.agents = agents;
            return this;
        }


        /**
         * 工单渠道，描述：;9：Open API 2：二维码 14：分享 13：搜索 其他数字：其他渠道
         * <p> 示例值：0
         *
         * @param channel
         * @return
         */
        public Builder channel(Integer channel) {
            this.channel = channel;
            return this;
        }


        /**
         * 工单是否解决 1:没解决 2:已解决
         * <p> 示例值：1
         *
         * @param solve
         * @return
         */
        public Builder solve(Integer solve) {
            this.solve = solve;
            return this;
        }


        /**
         * 关单用户ID
         * <p> 示例值：
         *
         * @param closedBy
         * @return
         */
        public Builder closedBy(TicketUser closedBy) {
            this.closedBy = closedBy;
            return this;
        }


        /**
         * 工单协作者
         * <p> 示例值：
         *
         * @param collaborators
         * @return
         */
        public Builder collaborators(TicketUser[] collaborators) {
            this.collaborators = collaborators;
            return this;
        }


        /**
         * 自定义字段列表，没有值时不设置  ;下拉菜单的value对应工单字段里面的children.display_name;[获取全部工单自定义字段](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/ticket_customized_field/list-ticket-customized-fields)
         * <p> 示例值：
         *
         * @param customizedFields
         * @return
         */
        public Builder customizedFields(CustomizedFieldDisplayItem[] customizedFields) {
            this.customizedFields = customizedFields;
            return this;
        }


        /**
         * 客服服务时长，客服最后一次回复时间距离客服进入时间间隔，单位分钟
         * <p> 示例值：42624.95
         *
         * @param agentServiceDuration
         * @return
         */
        public Builder agentServiceDuration(Double agentServiceDuration) {
            this.agentServiceDuration = agentServiceDuration;
            return this;
        }


        /**
         * 客服首次回复时间距离客服进入时间的间隔(秒)
         * <p> 示例值：1616920429000
         *
         * @param agentFirstResponseDuration
         * @return
         */
        public Builder agentFirstResponseDuration(Long agentFirstResponseDuration) {
            this.agentFirstResponseDuration = agentFirstResponseDuration;
            return this;
        }


        /**
         * 机器人服务时间：客服进入时间距离工单创建时间的间隔，单位秒
         * <p> 示例值：1616920429000
         *
         * @param botServiceDuration
         * @return
         */
        public Builder botServiceDuration(Long botServiceDuration) {
            this.botServiceDuration = botServiceDuration;
            return this;
        }


        /**
         * 客服解决时长，关单时间距离客服进入时间的间隔，单位秒
         * <p> 示例值：1616920429000
         *
         * @param agentResolutionTime
         * @return
         */
        public Builder agentResolutionTime(Long agentResolutionTime) {
            this.agentResolutionTime = agentResolutionTime;
            return this;
        }


        /**
         * 工单实际处理时间：从客服进入到关单，单位秒
         * <p> 示例值：1616920429000
         *
         * @param actualProcessingTime
         * @return
         */
        public Builder actualProcessingTime(Long actualProcessingTime) {
            this.actualProcessingTime = actualProcessingTime;
            return this;
        }


        /**
         * 客服进入时间，单位毫秒
         * <p> 示例值：1616920429000
         *
         * @param agentEntryTime
         * @return
         */
        public Builder agentEntryTime(Long agentEntryTime) {
            this.agentEntryTime = agentEntryTime;
            return this;
        }


        /**
         * 客服首次回复时间，单位毫秒
         * <p> 示例值：1616920429000
         *
         * @param agentFirstResponseTime
         * @return
         */
        public Builder agentFirstResponseTime(Long agentFirstResponseTime) {
            this.agentFirstResponseTime = agentFirstResponseTime;
            return this;
        }


        /**
         * 客服最后回复时间，单位毫秒
         * <p> 示例值：1616920429000
         *
         * @param agentLastResponseTime
         * @return
         */
        public Builder agentLastResponseTime(Long agentLastResponseTime) {
            this.agentLastResponseTime = agentLastResponseTime;
            return this;
        }


        /**
         * 主责客服
         * <p> 示例值：
         *
         * @param agentOwner
         * @return
         */
        public Builder agentOwner(TicketUser agentOwner) {
            this.agentOwner = agentOwner;
            return this;
        }


        public Ticket build() {
            return new Ticket(this);
        }
    }
}
