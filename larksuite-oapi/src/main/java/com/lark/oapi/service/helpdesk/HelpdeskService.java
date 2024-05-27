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
package com.lark.oapi.service.helpdesk;

import com.lark.oapi.core.Config;
import com.lark.oapi.event.IEventHandler;
import com.lark.oapi.service.helpdesk.v1.V1;
import com.lark.oapi.service.helpdesk.v1.model.*;
import com.lark.oapi.service.helpdesk.v1.resource.Agent;
import com.lark.oapi.service.helpdesk.v1.resource.AgentSchedules;
import com.lark.oapi.service.helpdesk.v1.resource.AgentSchedule;
import com.lark.oapi.service.helpdesk.v1.resource.AgentSkill;
import com.lark.oapi.service.helpdesk.v1.resource.AgentSkillRule;
import com.lark.oapi.service.helpdesk.v1.resource.BotMessage;
import com.lark.oapi.service.helpdesk.v1.resource.Category;
import com.lark.oapi.service.helpdesk.v1.resource.Event;
import com.lark.oapi.service.helpdesk.v1.resource.Faq;
import com.lark.oapi.service.helpdesk.v1.resource.Notification;
import com.lark.oapi.service.helpdesk.v1.resource.Ticket;
import com.lark.oapi.service.helpdesk.v1.resource.TicketMessage;
import com.lark.oapi.service.helpdesk.v1.resource.TicketCustomizedField;

public class HelpdeskService {
    private final V1 v1;
    private final Agent agent; // 客服
    private final AgentSchedules agentSchedules; // 客服工作日程
    private final AgentSchedule agentSchedule; // agent_schedule
    private final AgentSkill agentSkill; // 客服技能
    private final AgentSkillRule agentSkillRule; // 客服技能规则
    private final BotMessage botMessage; // 机器人消息
    private final Category category; // 知识库分类
    private final Event event; // 事件订阅
    private final Faq faq; // 知识库
    private final Notification notification; // 推送中心
    private final Ticket ticket; // 工单
    private final TicketMessage ticketMessage; // 工单消息
    private final TicketCustomizedField ticketCustomizedField; // 工单自定义字段

    public HelpdeskService(Config config) {
        this.v1 = new V1(config);
        this.agent = new Agent(config);
        this.agentSchedules = new AgentSchedules(config);
        this.agentSchedule = new AgentSchedule(config);
        this.agentSkill = new AgentSkill(config);
        this.agentSkillRule = new AgentSkillRule(config);
        this.botMessage = new BotMessage(config);
        this.category = new Category(config);
        this.event = new Event(config);
        this.faq = new Faq(config);
        this.notification = new Notification(config);
        this.ticket = new Ticket(config);
        this.ticketMessage = new TicketMessage(config);
        this.ticketCustomizedField = new TicketCustomizedField(config);
    }

    public V1 v1() {
        return v1;
    }

    public Agent agent() {
        return agent;
    }

    public AgentSchedules agentSchedules() {
        return agentSchedules;
    }

    public AgentSchedule agentSchedule() {
        return agentSchedule;
    }

    public AgentSkill agentSkill() {
        return agentSkill;
    }

    public AgentSkillRule agentSkillRule() {
        return agentSkillRule;
    }

    public BotMessage botMessage() {
        return botMessage;
    }

    public Category category() {
        return category;
    }

    public Event event() {
        return event;
    }

    public Faq faq() {
        return faq;
    }

    public Notification notification() {
        return notification;
    }

    public Ticket ticket() {
        return ticket;
    }

    public TicketMessage ticketMessage() {
        return ticketMessage;
    }

    public TicketCustomizedField ticketCustomizedField() {
        return ticketCustomizedField;
    }

    public abstract static class P2NotificationApproveV1Handler implements IEventHandler<P2NotificationApproveV1> {
        @Override
        public P2NotificationApproveV1 getEvent() {
            return new P2NotificationApproveV1();
        }
    }

    public abstract static class P2TicketCreatedV1Handler implements IEventHandler<P2TicketCreatedV1> {
        @Override
        public P2TicketCreatedV1 getEvent() {
            return new P2TicketCreatedV1();
        }
    }

    public abstract static class P2TicketUpdatedV1Handler implements IEventHandler<P2TicketUpdatedV1> {
        @Override
        public P2TicketUpdatedV1 getEvent() {
            return new P2TicketUpdatedV1();
        }
    }

    public abstract static class P2TicketMessageCreatedV1Handler implements IEventHandler<P2TicketMessageCreatedV1> {
        @Override
        public P2TicketMessageCreatedV1 getEvent() {
            return new P2TicketMessageCreatedV1();
        }
    }
}