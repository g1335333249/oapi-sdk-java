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

public class Task {
    private static final Logger log = LoggerFactory.getLogger(Task.class);
    private final Config config;

    public Task(Config config) {
        this.config = config;
    }


    /**
     * 批量删除执行者，该接口用于批量删除执行者
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/batch_delete_collaborator">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/batch_delete_collaborator</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/BatchDeleteCollaboratorTaskSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/BatchDeleteCollaboratorTaskSample.java</a> ;
     */
    public BatchDeleteCollaboratorTaskResp batchDeleteCollaborator(BatchDeleteCollaboratorTaskReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/task/v1/tasks/:task_id/batch_delete_collaborator"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        BatchDeleteCollaboratorTaskResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, BatchDeleteCollaboratorTaskResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/task/v1/tasks/:task_id/batch_delete_collaborator"
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
     * 批量删除执行者，该接口用于批量删除执行者
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/batch_delete_collaborator">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/batch_delete_collaborator</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/BatchDeleteCollaboratorTaskSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/BatchDeleteCollaboratorTaskSample.java</a> ;
     */
    public BatchDeleteCollaboratorTaskResp batchDeleteCollaborator(BatchDeleteCollaboratorTaskReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/task/v1/tasks/:task_id/batch_delete_collaborator"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        BatchDeleteCollaboratorTaskResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, BatchDeleteCollaboratorTaskResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/task/v1/tasks/:task_id/batch_delete_collaborator"
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
     * 批量删除关注人，该接口用于批量删除关注人
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/batch_delete_follower">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/batch_delete_follower</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/BatchDeleteFollowerTaskSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/BatchDeleteFollowerTaskSample.java</a> ;
     */
    public BatchDeleteFollowerTaskResp batchDeleteFollower(BatchDeleteFollowerTaskReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/task/v1/tasks/:task_id/batch_delete_follower"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        BatchDeleteFollowerTaskResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, BatchDeleteFollowerTaskResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/task/v1/tasks/:task_id/batch_delete_follower"
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
     * 批量删除关注人，该接口用于批量删除关注人
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/batch_delete_follower">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/batch_delete_follower</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/BatchDeleteFollowerTaskSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/BatchDeleteFollowerTaskSample.java</a> ;
     */
    public BatchDeleteFollowerTaskResp batchDeleteFollower(BatchDeleteFollowerTaskReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/task/v1/tasks/:task_id/batch_delete_follower"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        BatchDeleteFollowerTaskResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, BatchDeleteFollowerTaskResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/task/v1/tasks/:task_id/batch_delete_follower"
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
     * 完成任务，该接口用于将任务状态修改为“已完成”。;完成任务是指整个任务全部完成，而不支持执行者分别完成任务，执行成功后，任务对所有关联用户都变为完成状态。
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/complete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/complete</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/CompleteTaskSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/CompleteTaskSample.java</a> ;
     */
    public CompleteTaskResp complete(CompleteTaskReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/task/v1/tasks/:task_id/complete"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        CompleteTaskResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CompleteTaskResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/task/v1/tasks/:task_id/complete"
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
     * 完成任务，该接口用于将任务状态修改为“已完成”。;完成任务是指整个任务全部完成，而不支持执行者分别完成任务，执行成功后，任务对所有关联用户都变为完成状态。
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/complete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/complete</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/CompleteTaskSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/CompleteTaskSample.java</a> ;
     */
    public CompleteTaskResp complete(CompleteTaskReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/task/v1/tasks/:task_id/complete"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        CompleteTaskResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CompleteTaskResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/task/v1/tasks/:task_id/complete"
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
     * 创建任务，该接口可以创建一个任务，支持填写任务的基本信息，包括任务的标题，描述及协作者等。;在此基础上，创建任务时可以设置截止时间和重复规则，将任务设置为定期执行的重复任务。通过添加协作者，则可以让其他用户协同完成该任务。;此外，接口也提供了一些支持自定义内容的字段，调用方可以实现定制化效果，如完成任务后跳转到指定结束界面。
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/create</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/CreateTaskSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/CreateTaskSample.java</a> ;
     */
    public CreateTaskResp create(CreateTaskReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/task/v1/tasks"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        CreateTaskResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateTaskResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/task/v1/tasks"
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
     * 创建任务，该接口可以创建一个任务，支持填写任务的基本信息，包括任务的标题，描述及协作者等。;在此基础上，创建任务时可以设置截止时间和重复规则，将任务设置为定期执行的重复任务。通过添加协作者，则可以让其他用户协同完成该任务。;此外，接口也提供了一些支持自定义内容的字段，调用方可以实现定制化效果，如完成任务后跳转到指定结束界面。
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/create</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/CreateTaskSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/CreateTaskSample.java</a> ;
     */
    public CreateTaskResp create(CreateTaskReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/task/v1/tasks"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        CreateTaskResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateTaskResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/task/v1/tasks"
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
     * 删除任务，该接口用于删除任务
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/delete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/delete</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/DeleteTaskSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/DeleteTaskSample.java</a> ;
     */
    public DeleteTaskResp delete(DeleteTaskReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
                , "/open-apis/task/v1/tasks/:task_id"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        DeleteTaskResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteTaskResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/task/v1/tasks/:task_id"
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
     * 删除任务，该接口用于删除任务
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/delete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/delete</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/DeleteTaskSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/DeleteTaskSample.java</a> ;
     */
    public DeleteTaskResp delete(DeleteTaskReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
                , "/open-apis/task/v1/tasks/:task_id"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        DeleteTaskResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteTaskResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/task/v1/tasks/:task_id"
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
     * 获取任务详情，该接口用于获取任务详情，包括任务标题、描述、时间、来源等信息
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/get">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/get</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/GetTaskSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/GetTaskSample.java</a> ;
     */
    public GetTaskResp get(GetTaskReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/task/v1/tasks/:task_id"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        GetTaskResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetTaskResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/task/v1/tasks/:task_id"
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
     * 获取任务详情，该接口用于获取任务详情，包括任务标题、描述、时间、来源等信息
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/get">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/get</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/GetTaskSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/GetTaskSample.java</a> ;
     */
    public GetTaskResp get(GetTaskReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/task/v1/tasks/:task_id"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        GetTaskResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetTaskResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/task/v1/tasks/:task_id"
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
     * 获取任务列表，以分页的方式获取任务列表。当使用user_access_token时，获取与该用户身份相关的所有任务。当使用tenant_access_token时，获取以该应用身份通过“创建任务“接口创建的所有任务（并非获取该应用所在租户下所有用户创建的任务）。;本接口支持通过任务创建时间以及任务的完成状态对任务进行过滤。
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/list">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/list</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/ListTaskSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/ListTaskSample.java</a> ;
     */
    public ListTaskResp list(ListTaskReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/task/v1/tasks"
                , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                , req);

        // 反序列化
        ListTaskResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListTaskResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/task/v1/tasks"
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
     * 获取任务列表，以分页的方式获取任务列表。当使用user_access_token时，获取与该用户身份相关的所有任务。当使用tenant_access_token时，获取以该应用身份通过“创建任务“接口创建的所有任务（并非获取该应用所在租户下所有用户创建的任务）。;本接口支持通过任务创建时间以及任务的完成状态对任务进行过滤。
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/list">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/list</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/ListTaskSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/ListTaskSample.java</a> ;
     */
    public ListTaskResp list(ListTaskReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/task/v1/tasks"
                , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                , req);

        // 反序列化
        ListTaskResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListTaskResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/task/v1/tasks"
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
     * 更新任务，该接口用于修改任务的标题、描述、时间、来源等相关信息
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/patch">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/patch</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/PatchTaskSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/PatchTaskSample.java</a> ;
     */
    public PatchTaskResp patch(PatchTaskReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
                , "/open-apis/task/v1/tasks/:task_id"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        PatchTaskResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, PatchTaskResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/task/v1/tasks/:task_id"
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
     * 更新任务，该接口用于修改任务的标题、描述、时间、来源等相关信息
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/patch">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/patch</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/PatchTaskSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/PatchTaskSample.java</a> ;
     */
    public PatchTaskResp patch(PatchTaskReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
                , "/open-apis/task/v1/tasks/:task_id"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        PatchTaskResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, PatchTaskResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/task/v1/tasks/:task_id"
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
     * 取消完成任务，该接口用于取消任务的已完成状态
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/uncomplete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/uncomplete</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/UncompleteTaskSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/UncompleteTaskSample.java</a> ;
     */
    public UncompleteTaskResp uncomplete(UncompleteTaskReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/task/v1/tasks/:task_id/uncomplete"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        UncompleteTaskResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UncompleteTaskResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/task/v1/tasks/:task_id/uncomplete"
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
     * 取消完成任务，该接口用于取消任务的已完成状态
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/uncomplete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/task/uncomplete</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/UncompleteTaskSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/taskv1/UncompleteTaskSample.java</a> ;
     */
    public UncompleteTaskResp uncomplete(UncompleteTaskReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/task/v1/tasks/:task_id/uncomplete"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        UncompleteTaskResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UncompleteTaskResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/task/v1/tasks/:task_id/uncomplete"
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
