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

package com.lark.oapi.service.bitable.v1.resource;

import com.lark.oapi.core.Config;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.request.RequestOptions;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.token.AccessTokenType;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.core.utils.Sets;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.service.bitable.v1.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;

public class AppTableRecord {
    private static final Logger log = LoggerFactory.getLogger(AppTableRecord.class);
    private final Config config;

    public AppTableRecord(Config config) {
        this.config = config;
    }


    /**
     * 新增多条记录，该接口用于在数据表中新增多条记录，单次调用最多新增 500 条记录。
     * <p> 该接口支持调用频率上限为 10 QPS（Query Per Second，每秒请求率） ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/batch_create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/batch_create</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/BatchCreateAppTableRecordSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/BatchCreateAppTableRecordSample.java</a> ;
     */
    public BatchCreateAppTableRecordResp batchCreate(BatchCreateAppTableRecordReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/batch_create"
                , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                , req);

        // 反序列化
        BatchCreateAppTableRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, BatchCreateAppTableRecordResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/batch_create"
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
     * 新增多条记录，该接口用于在数据表中新增多条记录，单次调用最多新增 500 条记录。
     * <p> 该接口支持调用频率上限为 10 QPS（Query Per Second，每秒请求率） ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/batch_create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/batch_create</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/BatchCreateAppTableRecordSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/BatchCreateAppTableRecordSample.java</a> ;
     */
    public BatchCreateAppTableRecordResp batchCreate(BatchCreateAppTableRecordReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/batch_create"
                , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                , req);

        // 反序列化
        BatchCreateAppTableRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, BatchCreateAppTableRecordResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/batch_create"
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
     * 删除多条记录，该接口用于删除数据表中现有的多条记录，单次调用中最多删除 500 条记录。
     * <p> 该接口支持调用频率上限为 10 QPS ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/batch_delete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/batch_delete</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/BatchDeleteAppTableRecordSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/BatchDeleteAppTableRecordSample.java</a> ;
     */
    public BatchDeleteAppTableRecordResp batchDelete(BatchDeleteAppTableRecordReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/batch_delete"
                , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                , req);

        // 反序列化
        BatchDeleteAppTableRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, BatchDeleteAppTableRecordResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/batch_delete"
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
     * 删除多条记录，该接口用于删除数据表中现有的多条记录，单次调用中最多删除 500 条记录。
     * <p> 该接口支持调用频率上限为 10 QPS ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/batch_delete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/batch_delete</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/BatchDeleteAppTableRecordSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/BatchDeleteAppTableRecordSample.java</a> ;
     */
    public BatchDeleteAppTableRecordResp batchDelete(BatchDeleteAppTableRecordReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/batch_delete"
                , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                , req);

        // 反序列化
        BatchDeleteAppTableRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, BatchDeleteAppTableRecordResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/batch_delete"
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
     * 更新多条记录，该接口用于更新数据表中的多条记录，单次调用最多更新 500 条记录。
     * <p> 该接口支持调用频率上限为 10 QPS ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/batch_update">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/batch_update</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/BatchUpdateAppTableRecordSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/BatchUpdateAppTableRecordSample.java</a> ;
     */
    public BatchUpdateAppTableRecordResp batchUpdate(BatchUpdateAppTableRecordReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/batch_update"
                , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                , req);

        // 反序列化
        BatchUpdateAppTableRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, BatchUpdateAppTableRecordResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/batch_update"
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
     * 更新多条记录，该接口用于更新数据表中的多条记录，单次调用最多更新 500 条记录。
     * <p> 该接口支持调用频率上限为 10 QPS ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/batch_update">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/batch_update</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/BatchUpdateAppTableRecordSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/BatchUpdateAppTableRecordSample.java</a> ;
     */
    public BatchUpdateAppTableRecordResp batchUpdate(BatchUpdateAppTableRecordReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/batch_update"
                , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                , req);

        // 反序列化
        BatchUpdateAppTableRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, BatchUpdateAppTableRecordResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/batch_update"
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
     * 新增记录，该接口用于在数据表中新增一条记录
     * <p> 该接口支持调用频率上限为 10 QPS（Query Per Second，每秒请求率） ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/create</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/CreateAppTableRecordSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/CreateAppTableRecordSample.java</a> ;
     */
    public CreateAppTableRecordResp create(CreateAppTableRecordReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records"
                , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                , req);

        // 反序列化
        CreateAppTableRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateAppTableRecordResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records"
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
     * 新增记录，该接口用于在数据表中新增一条记录
     * <p> 该接口支持调用频率上限为 10 QPS（Query Per Second，每秒请求率） ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/create</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/CreateAppTableRecordSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/CreateAppTableRecordSample.java</a> ;
     */
    public CreateAppTableRecordResp create(CreateAppTableRecordReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records"
                , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                , req);

        // 反序列化
        CreateAppTableRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateAppTableRecordResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records"
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
     * 删除记录，该接口用于删除数据表中的一条记录
     * <p> 该接口支持调用频率上限为 10 QPS ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/delete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/delete</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/DeleteAppTableRecordSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/DeleteAppTableRecordSample.java</a> ;
     */
    public DeleteAppTableRecordResp delete(DeleteAppTableRecordReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
                , "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/:record_id"
                , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                , req);

        // 反序列化
        DeleteAppTableRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteAppTableRecordResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/:record_id"
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
     * 删除记录，该接口用于删除数据表中的一条记录
     * <p> 该接口支持调用频率上限为 10 QPS ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/delete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/delete</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/DeleteAppTableRecordSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/DeleteAppTableRecordSample.java</a> ;
     */
    public DeleteAppTableRecordResp delete(DeleteAppTableRecordReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
                , "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/:record_id"
                , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                , req);

        // 反序列化
        DeleteAppTableRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteAppTableRecordResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/:record_id"
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
     * 检索记录，该接口用于根据 record_id 的值检索现有记录
     * <p> 该接口支持调用频率上限为 20 QPS ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/get">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/get</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/GetAppTableRecordSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/GetAppTableRecordSample.java</a> ;
     */
    public GetAppTableRecordResp get(GetAppTableRecordReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/:record_id"
                , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                , req);

        // 反序列化
        GetAppTableRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetAppTableRecordResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/:record_id"
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
     * 检索记录，该接口用于根据 record_id 的值检索现有记录
     * <p> 该接口支持调用频率上限为 20 QPS ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/get">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/get</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/GetAppTableRecordSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/GetAppTableRecordSample.java</a> ;
     */
    public GetAppTableRecordResp get(GetAppTableRecordReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/:record_id"
                , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                , req);

        // 反序列化
        GetAppTableRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetAppTableRecordResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/:record_id"
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
     * 列出记录，该接口用于列出数据表中的现有记录，单次最多列出 500 行记录，支持分页获取。
     * <p> 该接口支持调用频率上限为 10 QPS（Query Per Second，每秒请求率），1000 QPM（Query Per Minute，每分钟请求率） ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/list">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/list</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/ListAppTableRecordSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/ListAppTableRecordSample.java</a> ;
     */
    public ListAppTableRecordResp list(ListAppTableRecordReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records"
                , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                , req);

        // 反序列化
        ListAppTableRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListAppTableRecordResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records"
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
     * 列出记录，该接口用于列出数据表中的现有记录，单次最多列出 500 行记录，支持分页获取。
     * <p> 该接口支持调用频率上限为 10 QPS（Query Per Second，每秒请求率），1000 QPM（Query Per Minute，每分钟请求率） ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/list">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/list</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/ListAppTableRecordSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/ListAppTableRecordSample.java</a> ;
     */
    public ListAppTableRecordResp list(ListAppTableRecordReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records"
                , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                , req);

        // 反序列化
        ListAppTableRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListAppTableRecordResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records"
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
     * ，查找多维表格记录
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=search&project=bitable&resource=app.table.record&version=v1">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=search&project=bitable&resource=app.table.record&version=v1</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/SearchAppTableRecordSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/SearchAppTableRecordSample.java</a> ;
     */
    public SearchAppTableRecordResp search(SearchAppTableRecordReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/search"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        SearchAppTableRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, SearchAppTableRecordResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/search"
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
     * ，查找多维表格记录
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=search&project=bitable&resource=app.table.record&version=v1">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=search&project=bitable&resource=app.table.record&version=v1</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/SearchAppTableRecordSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/SearchAppTableRecordSample.java</a> ;
     */
    public SearchAppTableRecordResp search(SearchAppTableRecordReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/search"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        SearchAppTableRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, SearchAppTableRecordResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/search"
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
     * 更新记录，该接口用于更新数据表中的一条记录
     * <p> 该接口支持调用频率上限为 10 QPS（Query Per Second，每秒请求率） ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/update">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/update</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/UpdateAppTableRecordSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/UpdateAppTableRecordSample.java</a> ;
     */
    public UpdateAppTableRecordResp update(UpdateAppTableRecordReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "PUT"
                , "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/:record_id"
                , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                , req);

        // 反序列化
        UpdateAppTableRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UpdateAppTableRecordResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/:record_id"
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
     * 更新记录，该接口用于更新数据表中的一条记录
     * <p> 该接口支持调用频率上限为 10 QPS（Query Per Second，每秒请求率） ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/update">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table-record/update</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/UpdateAppTableRecordSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/bitablev1/UpdateAppTableRecordSample.java</a> ;
     */
    public UpdateAppTableRecordResp update(UpdateAppTableRecordReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "PUT"
                , "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/:record_id"
                , Sets.newHashSet(AccessTokenType.User, AccessTokenType.Tenant)
                , req);

        // 反序列化
        UpdateAppTableRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UpdateAppTableRecordResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/bitable/v1/apps/:app_token/tables/:table_id/records/:record_id"
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
