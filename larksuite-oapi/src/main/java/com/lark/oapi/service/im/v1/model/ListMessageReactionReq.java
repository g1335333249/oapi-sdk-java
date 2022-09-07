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
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class ListMessageReactionReq {

  /**
   * 待查询消息reaction的类型[emoji类型列举](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message-reaction/emojis-introduce)。;;-
   * 不传入该参数，表示拉取所有类型reaction
   * <p> 示例值：LAUGH
   */
  @Query
  @SerializedName("reaction_type")
  private String reactionType;
  /**
   * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时，会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
   * <p> 示例值：YhljsPiGfUgnVAg9urvRFd-BvSqRL20wMZNAWfa9xXkud6UKCybPuUgQ1vM26dj6
   */
  @Query
  @SerializedName("page_token")
  private String pageToken;
  /**
   * 分页大小
   * <p> 示例值：10
   */
  @Query
  @SerializedName("page_size")
  private Integer pageSize;
  /**
   * 当操作人为用户时返回用户ID的类型
   * <p> 示例值：
   */
  @Query
  @SerializedName("user_id_type")
  private String userIdType;
  /**
   * 待获取reaction的消息ID
   * <p> 示例值：om_8964d1b4*********2b31383276113
   */
  @Path
  @SerializedName("message_id")
  private String messageId;

  // builder 开始
  public ListMessageReactionReq() {
  }

  public ListMessageReactionReq(Builder builder) {
    /**
     * 待查询消息reaction的类型[emoji类型列举](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message-reaction/emojis-introduce)。;;- 不传入该参数，表示拉取所有类型reaction
     * <p> 示例值：LAUGH
     */
    this.reactionType = builder.reactionType;
    /**
     * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时，会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
     * <p> 示例值：YhljsPiGfUgnVAg9urvRFd-BvSqRL20wMZNAWfa9xXkud6UKCybPuUgQ1vM26dj6
     */
    this.pageToken = builder.pageToken;
    /**
     * 分页大小
     * <p> 示例值：10
     */
    this.pageSize = builder.pageSize;
    /**
     * 当操作人为用户时返回用户ID的类型
     * <p> 示例值：
     */
    this.userIdType = builder.userIdType;
    /**
     * 待获取reaction的消息ID
     * <p> 示例值：om_8964d1b4*********2b31383276113
     */
    this.messageId = builder.messageId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getReactionType() {
    return this.reactionType;
  }

  public void setReactionType(String reactionType) {
    this.reactionType = reactionType;
  }

  public String getPageToken() {
    return this.pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }

  public Integer getPageSize() {
    return this.pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public String getUserIdType() {
    return this.userIdType;
  }

  public void setUserIdType(String userIdType) {
    this.userIdType = userIdType;
  }

  public String getMessageId() {
    return this.messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public static class Builder {

    private String reactionType; // 待查询消息reaction的类型[emoji类型列举](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message-reaction/emojis-introduce)。;;- 不传入该参数，表示拉取所有类型reaction
    private String pageToken; // 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时，会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
    private Integer pageSize; // 分页大小
    private String userIdType; // 当操作人为用户时返回用户ID的类型
    private String messageId; // 待获取reaction的消息ID

    /**
     * 待查询消息reaction的类型[emoji类型列举](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message-reaction/emojis-introduce)。;;-
     * 不传入该参数，表示拉取所有类型reaction
     * <p> 示例值：LAUGH
     *
     * @param reactionType
     * @return
     */
    public Builder reactionType(String reactionType) {
      this.reactionType = reactionType;
      return this;
    }

    /**
     * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时，会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
     * <p> 示例值：YhljsPiGfUgnVAg9urvRFd-BvSqRL20wMZNAWfa9xXkud6UKCybPuUgQ1vM26dj6
     *
     * @param pageToken
     * @return
     */
    public Builder pageToken(String pageToken) {
      this.pageToken = pageToken;
      return this;
    }

    /**
     * 分页大小
     * <p> 示例值：10
     *
     * @param pageSize
     * @return
     */
    public Builder pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * 当操作人为用户时返回用户ID的类型
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
     * 当操作人为用户时返回用户ID的类型
     * <p> 示例值：
     *
     * @param userIdType {@link com.lark.oapi.service.im.v1.enums.ListMessageReactionUserIdTypeEnum}
     * @return
     */
    public Builder userIdType(
        com.lark.oapi.service.im.v1.enums.ListMessageReactionUserIdTypeEnum userIdType) {
      this.userIdType = userIdType.getValue();
      return this;
    }

    /**
     * 待获取reaction的消息ID
     * <p> 示例值：om_8964d1b4*********2b31383276113
     *
     * @param messageId
     * @return
     */
    public Builder messageId(String messageId) {
      this.messageId = messageId;
      return this;
    }

    public ListMessageReactionReq build() {
      return new ListMessageReactionReq(this);
    }
  }
}
