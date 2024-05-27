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

package com.lark.oapi.service.im.v1.resource;

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

import com.lark.oapi.service.im.v1.model.*;

import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class MessageReaction {
    private static final Logger log = LoggerFactory.getLogger(MessageReaction.class);
    private final Config config;

    public MessageReaction(Config config) {
        this.config = config;
    }


    /**
     * 添加消息表情回复，给指定消息添加指定类型的表情回复（reaction即表情回复，本文档统一用“reaction”代称）。
     * <p> 注意事项:;- 需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability)  ;- 待添加reaction的消息要真实存在，不能被撤回;- 给消息添加reaction，需要reaction的发送方（机器人或者用户）在消息所在的会话内 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message-reaction/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message-reaction/create</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/CreateMessageReactionSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/CreateMessageReactionSample.java</a> ;
     */
    public CreateMessageReactionResp create(CreateMessageReactionReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/im/v1/messages/:message_id/reactions"
                , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                , req);

        // 反序列化
        CreateMessageReactionResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateMessageReactionResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/messages/:message_id/reactions"
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
     * 添加消息表情回复，给指定消息添加指定类型的表情回复（reaction即表情回复，本文档统一用“reaction”代称）。
     * <p> 注意事项:;- 需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability)  ;- 待添加reaction的消息要真实存在，不能被撤回;- 给消息添加reaction，需要reaction的发送方（机器人或者用户）在消息所在的会话内 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message-reaction/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message-reaction/create</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/CreateMessageReactionSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/CreateMessageReactionSample.java</a> ;
     */
    public CreateMessageReactionResp create(CreateMessageReactionReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/im/v1/messages/:message_id/reactions"
                , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                , req);

        // 反序列化
        CreateMessageReactionResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateMessageReactionResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/messages/:message_id/reactions"
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
     * 删除消息表情回复，删除指定消息的表情回复（reaction即表情回复，本文档统一用“reaction”代称）。
     * <p> 注意事项:;- 需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability)  ;- 只能删除真实存在的reaction，并且删除reaction请求的操作者必须是reaction的原始添加者 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message-reaction/delete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message-reaction/delete</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/DeleteMessageReactionSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/DeleteMessageReactionSample.java</a> ;
     */
    public DeleteMessageReactionResp delete(DeleteMessageReactionReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
                , "/open-apis/im/v1/messages/:message_id/reactions/:reaction_id"
                , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                , req);

        // 反序列化
        DeleteMessageReactionResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteMessageReactionResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/messages/:message_id/reactions/:reaction_id"
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
     * 删除消息表情回复，删除指定消息的表情回复（reaction即表情回复，本文档统一用“reaction”代称）。
     * <p> 注意事项:;- 需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability)  ;- 只能删除真实存在的reaction，并且删除reaction请求的操作者必须是reaction的原始添加者 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message-reaction/delete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message-reaction/delete</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/DeleteMessageReactionSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/DeleteMessageReactionSample.java</a> ;
     */
    public DeleteMessageReactionResp delete(DeleteMessageReactionReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
                , "/open-apis/im/v1/messages/:message_id/reactions/:reaction_id"
                , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                , req);

        // 反序列化
        DeleteMessageReactionResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteMessageReactionResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/messages/:message_id/reactions/:reaction_id"
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
     * 获取消息表情回复，获取指定消息的特定类型表情回复列表（reaction即表情回复，本文档统一用“reaction”代称）。
     * <p> 注意事项:;- 需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability)  ;- 待获取reaction信息的消息要真实存在，不能被撤回;- 获取消息的reaction，需要request的授权主体（机器人或者用户）在消息所在的会话内 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message-reaction/list">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message-reaction/list</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/ListMessageReactionSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/ListMessageReactionSample.java</a> ;
     */
    public ListMessageReactionResp list(ListMessageReactionReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/im/v1/messages/:message_id/reactions"
                , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                , req);

        // 反序列化
        ListMessageReactionResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListMessageReactionResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/messages/:message_id/reactions"
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
     * 获取消息表情回复，获取指定消息的特定类型表情回复列表（reaction即表情回复，本文档统一用“reaction”代称）。
     * <p> 注意事项:;- 需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability)  ;- 待获取reaction信息的消息要真实存在，不能被撤回;- 获取消息的reaction，需要request的授权主体（机器人或者用户）在消息所在的会话内 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message-reaction/list">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message-reaction/list</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/ListMessageReactionSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/ListMessageReactionSample.java</a> ;
     */
    public ListMessageReactionResp list(ListMessageReactionReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/im/v1/messages/:message_id/reactions"
                , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                , req);

        // 反序列化
        ListMessageReactionResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListMessageReactionResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/messages/:message_id/reactions"
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