package com.lark.oapi.sample.apiall.contactv3;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.contact.v3.model.Department;
import com.lark.oapi.service.contact.v3.model.DepartmentI18nName;
import com.lark.oapi.service.contact.v3.model.PatchDepartmentReq;
import com.lark.oapi.service.contact.v3.model.PatchDepartmentResp;

// HTTP PATH: /open-apis/contact/v3/departments/:department_id"
public class PatchDepartmentSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    PatchDepartmentReq req = PatchDepartmentReq.newBuilder()
        .departmentId("")
        .userIdType("open_id")
        .departmentIdType("open_department_id")
        .department(Department.newBuilder()
            .name("")
            .i18nName(DepartmentI18nName.newBuilder().build())
            .parentDepartmentId("")
            .leaderUserId("")
            .order("")
            .unitIds(new String[]{})
            .createGroupChat(false)
            .build())
        .build();

    // 发起请求
    PatchDepartmentResp resp = client.contact().department().patch(req);

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