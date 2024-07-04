package com.lark.oapi.sample.apiall.corehrv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.corehr.v1.model.*;

import java.util.HashMap;

import com.lark.oapi.service.corehr.v1.model.Enum;

// POST /open-apis/corehr/v1/authorizations/remove_role_assign
public class RemoveRoleAssignAuthorizationSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        RemoveRoleAssignAuthorizationReq req = RemoveRoleAssignAuthorizationReq.newBuilder()
                .employmentId("67489937334909845")
                .userIdType("people_corehr_id")
                .roleId("67489937334909845")
                .build();

        // 发起请求
        RemoveRoleAssignAuthorizationResp resp = client.corehr().v1().authorization().removeRoleAssign(req);

        // 处理服务端错误
        if (!resp.success()) {
            System.out.println(String.format("code:%s,msg:%s,reqId:%s"
                    , resp.getCode(), resp.getMsg(), resp.getRequestId()));
            return;
        }

        // 业务数据处理
        System.out.println(Jsons.DEFAULT.toJson(resp.getData()));
    }
}