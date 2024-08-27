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

package com.lark.oapi.service.helpdesk.v1.resource;

import com.lark.oapi.core.token.AccessTokenType;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.core.utils.Sets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;

import com.lark.oapi.core.Config;
import com.lark.oapi.core.request.RequestOptions;

import java.io.ByteArrayOutputStream;

import com.lark.oapi.service.helpdesk.v1.model.*;

import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class AgentSchedule {
    private static final Logger log = LoggerFactory.getLogger(AgentSchedule.class);
    private final Config config;

    public AgentSchedule(Config config) {
        this.config = config;
    }


    /**
     * 创建客服，该接口用于创建客服
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_schedule/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_schedule/create</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/CreateAgentScheduleSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/CreateAgentScheduleSample.java</a> ;
     */
    public CreateAgentScheduleResp create(CreateAgentScheduleReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }
        reqOptions.setNeedHelpDeskAuth(true);

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/helpdesk/v1/agent_schedules"
                , Sets.newHashSet(AccessTokenType.User)
                , req);

        // 反序列化
        CreateAgentScheduleResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateAgentScheduleResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/helpdesk/v1/agent_schedules"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /**
     * 创建客服，该接口用于创建客服
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_schedule/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_schedule/create</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/CreateAgentScheduleSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/CreateAgentScheduleSample.java</a> ;
     */
    public CreateAgentScheduleResp create(CreateAgentScheduleReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();
        reqOptions.setNeedHelpDeskAuth(true);

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/helpdesk/v1/agent_schedules"
                , Sets.newHashSet(AccessTokenType.User)
                , req);

        // 反序列化
        CreateAgentScheduleResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateAgentScheduleResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/helpdesk/v1/agent_schedules"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /**
     * 获取全部客服工作日程，该接口用于获取所有客服信息
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_schedule/list">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_schedule/list</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/ListAgentScheduleSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/ListAgentScheduleSample.java</a> ;
     */
    public ListAgentScheduleResp list(ListAgentScheduleReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }
        reqOptions.setNeedHelpDeskAuth(true);

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/helpdesk/v1/agent_schedules"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        ListAgentScheduleResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListAgentScheduleResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/helpdesk/v1/agent_schedules"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /**
     * 获取全部客服工作日程，该接口用于获取所有客服信息
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_schedule/list">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/agent_schedule/list</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/ListAgentScheduleSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/helpdeskv1/ListAgentScheduleSample.java</a> ;
     */
    public ListAgentScheduleResp list(ListAgentScheduleReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();
        reqOptions.setNeedHelpDeskAuth(true);

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/helpdesk/v1/agent_schedules"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        ListAgentScheduleResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListAgentScheduleResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/helpdesk/v1/agent_schedules"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }
}
