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

package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class P2ChatUpdatedV1Data {

  /**
   * 群组 ID，详情参见[群ID 说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-id-description)
   * <p> 示例值：oc_413871888e0d5492e25b173f0812efb7
   */
  @SerializedName("chat_id")
  private String chatId;
  /**
   * 用户 ID
   * <p> 示例值：
   */
  @SerializedName("operator_id")
  private UserId operatorId;
  /**
   * 是否是外部群
   * <p> 示例值：false
   */
  @SerializedName("external")
  private Boolean external;
  /**
   * 操作者租户 Key
   * <p> 示例值：86gwe65
   */
  @SerializedName("operator_tenant_key")
  private String operatorTenantKey;
  /**
   * 更新后的群信息
   * <p> 示例值：
   */
  @SerializedName("after_change")
  private ChatChange afterChange;
  /**
   * 更新前的群信息
   * <p> 示例值：
   */
  @SerializedName("before_change")
  private ChatChange beforeChange;
  /**
   * 群可发言成员名单的变更信息
   * <p> 示例值：
   */
  @SerializedName("moderator_list")
  private ModeratorList moderatorList;

  public String getChatId() {
    return this.chatId;
  }

  public void setChatId(String chatId) {
    this.chatId = chatId;
  }

  public UserId getOperatorId() {
    return this.operatorId;
  }

  public void setOperatorId(UserId operatorId) {
    this.operatorId = operatorId;
  }

  public Boolean getExternal() {
    return this.external;
  }

  public void setExternal(Boolean external) {
    this.external = external;
  }

  public String getOperatorTenantKey() {
    return this.operatorTenantKey;
  }

  public void setOperatorTenantKey(String operatorTenantKey) {
    this.operatorTenantKey = operatorTenantKey;
  }

  public ChatChange getAfterChange() {
    return this.afterChange;
  }

  public void setAfterChange(ChatChange afterChange) {
    this.afterChange = afterChange;
  }

  public ChatChange getBeforeChange() {
    return this.beforeChange;
  }

  public void setBeforeChange(ChatChange beforeChange) {
    this.beforeChange = beforeChange;
  }

  public ModeratorList getModeratorList() {
    return this.moderatorList;
  }

  public void setModeratorList(ModeratorList moderatorList) {
    this.moderatorList = moderatorList;
  }

}
