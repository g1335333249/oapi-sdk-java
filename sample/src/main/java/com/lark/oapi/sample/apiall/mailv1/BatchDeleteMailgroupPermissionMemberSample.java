package com.lark.oapi.sample.apiall.mailv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.mail.v1.model.BatchDeleteMailgroupPermissionMemberReq;
import com.lark.oapi.service.mail.v1.model.BatchDeleteMailgroupPermissionMemberReqBody;
import com.lark.oapi.service.mail.v1.model.BatchDeleteMailgroupPermissionMemberResp;

// DELETE /open-apis/mail/v1/mailgroups/:mailgroup_id/permission_members/batch_delete
public class BatchDeleteMailgroupPermissionMemberSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        BatchDeleteMailgroupPermissionMemberReq req = BatchDeleteMailgroupPermissionMemberReq.newBuilder()
                .mailgroupId("xxxxxxxxxxxxxxx or test_mail_group@xxx.xx")
                .batchDeleteMailgroupPermissionMemberReqBody(BatchDeleteMailgroupPermissionMemberReqBody.newBuilder()
                        .permissionMemberIdList(new String[]{})
                        .build())
                .build();

        // 发起请求
        BatchDeleteMailgroupPermissionMemberResp resp = client.mail().mailgroupPermissionMember().batchDelete(req);

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
