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

package com.lark.oapi.service.task.v1.resource;

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

import com.lark.oapi.service.task.v1.model.*;

import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class TaskCollaborator {
    private static final Logger log = LoggerFactory.getLogger(TaskCollaborator.class);
    private final Config config;

    public TaskCollaborator(Config config) {
        this.config = config;
    }


    /**
     * 新增执行者，该接口用于新增任务执行者，一次性可以添加多个执行者。;只有任务的创建者和执行者才能添加执行者，关注人无权限添加。
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task-collaborator/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task-collaborator/create</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/CreateTaskCollaboratorSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/CreateTaskCollaboratorSample.java</a> ;
     */
    public CreateTaskCollaboratorResp create(CreateTaskCollaboratorReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/task/v1/tasks/:task_id/collaborators"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        CreateTaskCollaboratorResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateTaskCollaboratorResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/task/v1/tasks/:task_id/collaborators"
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
     * 新增执行者，该接口用于新增任务执行者，一次性可以添加多个执行者。;只有任务的创建者和执行者才能添加执行者，关注人无权限添加。
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task-collaborator/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task-collaborator/create</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/CreateTaskCollaboratorSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/CreateTaskCollaboratorSample.java</a> ;
     */
    public CreateTaskCollaboratorResp create(CreateTaskCollaboratorReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/task/v1/tasks/:task_id/collaborators"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        CreateTaskCollaboratorResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateTaskCollaboratorResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/task/v1/tasks/:task_id/collaborators"
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
     * 删除执行者，该接口用于删除任务执行者
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task-collaborator/delete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task-collaborator/delete</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/DeleteTaskCollaboratorSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/DeleteTaskCollaboratorSample.java</a> ;
     */
    public DeleteTaskCollaboratorResp delete(DeleteTaskCollaboratorReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
                , "/open-apis/task/v1/tasks/:task_id/collaborators/:collaborator_id"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        DeleteTaskCollaboratorResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteTaskCollaboratorResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/task/v1/tasks/:task_id/collaborators/:collaborator_id"
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
     * 删除执行者，该接口用于删除任务执行者
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task-collaborator/delete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task-collaborator/delete</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/DeleteTaskCollaboratorSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/DeleteTaskCollaboratorSample.java</a> ;
     */
    public DeleteTaskCollaboratorResp delete(DeleteTaskCollaboratorReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
                , "/open-apis/task/v1/tasks/:task_id/collaborators/:collaborator_id"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        DeleteTaskCollaboratorResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteTaskCollaboratorResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/task/v1/tasks/:task_id/collaborators/:collaborator_id"
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
     * 获取一个任务的执行者列表，该接口用于查询任务执行者列表，支持分页，最大值为50
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task-collaborator/list">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task-collaborator/list</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/ListTaskCollaboratorSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/ListTaskCollaboratorSample.java</a> ;
     */
    public ListTaskCollaboratorResp list(ListTaskCollaboratorReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/task/v1/tasks/:task_id/collaborators"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        ListTaskCollaboratorResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListTaskCollaboratorResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/task/v1/tasks/:task_id/collaborators"
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
     * 获取一个任务的执行者列表，该接口用于查询任务执行者列表，支持分页，最大值为50
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task-collaborator/list">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task-collaborator/list</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/ListTaskCollaboratorSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/ListTaskCollaboratorSample.java</a> ;
     */
    public ListTaskCollaboratorResp list(ListTaskCollaboratorReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/task/v1/tasks/:task_id/collaborators"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        ListTaskCollaboratorResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListTaskCollaboratorResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/task/v1/tasks/:task_id/collaborators"
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