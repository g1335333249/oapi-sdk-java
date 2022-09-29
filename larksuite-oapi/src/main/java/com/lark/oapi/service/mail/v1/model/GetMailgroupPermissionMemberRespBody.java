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

package com.lark.oapi.service.mail.v1.model;

import com.google.gson.annotations.SerializedName;

public class GetMailgroupPermissionMemberRespBody {

  /**
   * The unique ID of a member in this permission group
   * <p> 示例值：xxxxxxxxxxxxxxx
   */
  @SerializedName("permission_member_id")
  private String permissionMemberId;
  /**
   * The member's user id. Value is valid when type is USER
   * <p> 示例值：xxxxxxxxxx
   */
  @SerializedName("user_id")
  private String userId;
  /**
   * The member's department id. Value is valid when type is DEPARTMENT
   * <p> 示例值：xxxxxxxxxx
   */
  @SerializedName("department_id")
  private String departmentId;
  /**
   * The member's email address. Value is valid when type is MAIL_GROUP/PUBLIC_MAILBOX
   * <p> 示例值：xxx@xx.x
   */
  @SerializedName("email")
  private String email;
  /**
   * The type of member. Possible values are:;- USER: internal user in the team;- DEPARTMENT: member
   * is a department
   * <p> 示例值：USER
   */
  @SerializedName("type")
  private String type;

  public String getPermissionMemberId() {
    return this.permissionMemberId;
  }

  public void setPermissionMemberId(String permissionMemberId) {
    this.permissionMemberId = permissionMemberId;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getDepartmentId() {
    return this.departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

}