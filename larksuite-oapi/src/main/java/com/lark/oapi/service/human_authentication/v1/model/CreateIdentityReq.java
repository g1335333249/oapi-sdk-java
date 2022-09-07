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

package com.lark.oapi.service.human_authentication.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Query;

public class CreateIdentityReq {

  /**
   * 用户的唯一标识（使用的ID类型见下一参数描述，不同ID类型的区别和获取，参考文档：[如何获得 User ID、Open ID 和 Union
   * ID？](https://open.feishu.cn/document/home/user-identity-introduction/how-to-get)）
   * <p> 示例值：ou_2eb5483cb377daa5054bc6f86e2089a5
   */
  @Query
  @SerializedName("user_id")
  private String userId;
  /**
   * 用户ID类型 open_id/user_id/union_id
   * <p> 示例值：
   */
  @Query
  @SerializedName("user_id_type")
  private String userIdType;
  @Body
  private CreateIdentityReqBody body;

  // builder 开始
  public CreateIdentityReq() {
  }

  public CreateIdentityReq(Builder builder) {
    /**
     * 用户的唯一标识（使用的ID类型见下一参数描述，不同ID类型的区别和获取，参考文档：[如何获得 User ID、Open ID 和 Union ID？](https://open.feishu.cn/document/home/user-identity-introduction/how-to-get)）
     * <p> 示例值：ou_2eb5483cb377daa5054bc6f86e2089a5
     */
    this.userId = builder.userId;
    /**
     * 用户ID类型 open_id/user_id/union_id
     * <p> 示例值：
     */
    this.userIdType = builder.userIdType;
    this.body = builder.body;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUserIdType() {
    return this.userIdType;
  }

  public void setUserIdType(String userIdType) {
    this.userIdType = userIdType;
  }

  public CreateIdentityReqBody getCreateIdentityReqBody() {
    return this.body;
  }

  public void setCreateIdentityReqBody(CreateIdentityReqBody body) {
    this.body = body;
  }

  public static class Builder {

    private String userId; // 用户的唯一标识（使用的ID类型见下一参数描述，不同ID类型的区别和获取，参考文档：[如何获得 User ID、Open ID 和 Union ID？](https://open.feishu.cn/document/home/user-identity-introduction/how-to-get)）
    private String userIdType; // 用户ID类型 open_id/user_id/union_id
    private CreateIdentityReqBody body;

    /**
     * 用户的唯一标识（使用的ID类型见下一参数描述，不同ID类型的区别和获取，参考文档：[如何获得 User ID、Open ID 和 Union
     * ID？](https://open.feishu.cn/document/home/user-identity-introduction/how-to-get)）
     * <p> 示例值：ou_2eb5483cb377daa5054bc6f86e2089a5
     *
     * @param userId
     * @return
     */
    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }

    /**
     * 用户ID类型 open_id/user_id/union_id
     * <p> 示例值：
     *
     * @param userIdType
     * @return
     */
    public Builder userIdType(String userIdType) {
      this.userIdType = userIdType;
      return this;
    }

    /**
     * 用户ID类型 open_id/user_id/union_id
     * <p> 示例值：
     *
     * @param userIdType {@link com.lark.oapi.service.human_authentication.v1.enums.CreateIdentityUserIdTypeEnum}
     * @return
     */
    public Builder userIdType(
        com.lark.oapi.service.human_authentication.v1.enums.CreateIdentityUserIdTypeEnum userIdType) {
      this.userIdType = userIdType.getValue();
      return this;
    }

    public CreateIdentityReqBody getCreateIdentityReqBody() {
      return this.body;
    }

    /**
     * body
     *
     * @param body
     * @return
     */
    public Builder createIdentityReqBody(CreateIdentityReqBody body) {
      this.body = body;
      return this;
    }

    public CreateIdentityReq build() {
      return new CreateIdentityReq(this);
    }
  }
}
