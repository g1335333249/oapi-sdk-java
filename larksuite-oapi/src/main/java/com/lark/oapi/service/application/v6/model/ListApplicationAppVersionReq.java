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

package com.lark.oapi.service.application.v6.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class ListApplicationAppVersionReq {

  /**
   * 应用信息的语言版本
   * <p> 示例值：zh_cn
   */
  @Query
  @SerializedName("lang")
  private String lang;
  /**
   * 分页大小
   * <p> 示例值：10
   */
  @Query
  @SerializedName("page_size")
  private Integer pageSize;
  /**
   * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
   * <p> 示例值：new-e3c5a0627cdf0c2e057da7257b90376a
   */
  @Query
  @SerializedName("page_token")
  private String pageToken;
  /**
   * 0：按照时间倒序 1：按照时间正序
   * <p> 示例值：0
   */
  @Query
  @SerializedName("order")
  private Integer order;
  /**
   * 此次调用中使用的用户ID的类型
   * <p> 示例值：
   */
  @Query
  @SerializedName("user_id_type")
  private String userIdType;
  /**
   * 如果查询自身应用信息，可填入 "me" 或者应用自身 app_id。对应权限仅需申请“管理应用自身资源”。如需查询其他应用信息，必须申请获取应用信息权限，仅支持查询所在租户开发的自建应用。需要填入对应应用的appID。
   * <p> 示例值：cli_9b445f5258795107
   */
  @Path
  @SerializedName("app_id")
  private String appId;

  // builder 开始
  public ListApplicationAppVersionReq() {
  }

  public ListApplicationAppVersionReq(Builder builder) {
    /**
     * 应用信息的语言版本
     * <p> 示例值：zh_cn
     */
    this.lang = builder.lang;
    /**
     * 分页大小
     * <p> 示例值：10
     */
    this.pageSize = builder.pageSize;
    /**
     * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
     * <p> 示例值：new-e3c5a0627cdf0c2e057da7257b90376a
     */
    this.pageToken = builder.pageToken;
    /**
     * 0：按照时间倒序 1：按照时间正序
     * <p> 示例值：0
     */
    this.order = builder.order;
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     */
    this.userIdType = builder.userIdType;
    /**
     * 如果查询自身应用信息，可填入 "me" 或者应用自身 app_id。对应权限仅需申请“管理应用自身资源”。如需查询其他应用信息，必须申请获取应用信息权限，仅支持查询所在租户开发的自建应用。需要填入对应应用的appID。
     * <p> 示例值：cli_9b445f5258795107
     */
    this.appId = builder.appId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getLang() {
    return this.lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public Integer getPageSize() {
    return this.pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public String getPageToken() {
    return this.pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }

  public Integer getOrder() {
    return this.order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public String getUserIdType() {
    return this.userIdType;
  }

  public void setUserIdType(String userIdType) {
    this.userIdType = userIdType;
  }

  public String getAppId() {
    return this.appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public static class Builder {

    private String lang; // 应用信息的语言版本
    private Integer pageSize; // 分页大小
    private String pageToken; // 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
    private Integer order; // 0：按照时间倒序 1：按照时间正序
    private String userIdType; // 此次调用中使用的用户ID的类型
    private String appId; // 如果查询自身应用信息，可填入 "me" 或者应用自身 app_id。对应权限仅需申请“管理应用自身资源”。如需查询其他应用信息，必须申请获取应用信息权限，仅支持查询所在租户开发的自建应用。需要填入对应应用的appID。

    /**
     * 应用信息的语言版本
     * <p> 示例值：zh_cn
     *
     * @param lang
     * @return
     */
    public Builder lang(String lang) {
      this.lang = lang;
      return this;
    }

    /**
     * 应用信息的语言版本
     * <p> 示例值：zh_cn
     *
     * @param lang {@link com.lark.oapi.service.application.v6.enums.ListApplicationAppVersionI18nKeyEnum}
     * @return
     */
    public Builder lang(
        com.lark.oapi.service.application.v6.enums.ListApplicationAppVersionI18nKeyEnum lang) {
      this.lang = lang.getValue();
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
     * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
     * <p> 示例值：new-e3c5a0627cdf0c2e057da7257b90376a
     *
     * @param pageToken
     * @return
     */
    public Builder pageToken(String pageToken) {
      this.pageToken = pageToken;
      return this;
    }

    /**
     * 0：按照时间倒序 1：按照时间正序
     * <p> 示例值：0
     *
     * @param order
     * @return
     */
    public Builder order(Integer order) {
      this.order = order;
      return this;
    }

    /**
     * 此次调用中使用的用户ID的类型
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
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     *
     * @param userIdType {@link com.lark.oapi.service.application.v6.enums.ListApplicationAppVersionUserIdTypeEnum}
     * @return
     */
    public Builder userIdType(
        com.lark.oapi.service.application.v6.enums.ListApplicationAppVersionUserIdTypeEnum userIdType) {
      this.userIdType = userIdType.getValue();
      return this;
    }

    /**
     * 如果查询自身应用信息，可填入 "me" 或者应用自身 app_id。对应权限仅需申请“管理应用自身资源”。如需查询其他应用信息，必须申请获取应用信息权限，仅支持查询所在租户开发的自建应用。需要填入对应应用的appID。
     * <p> 示例值：cli_9b445f5258795107
     *
     * @param appId
     * @return
     */
    public Builder appId(String appId) {
      this.appId = appId;
      return this;
    }

    public ListApplicationAppVersionReq build() {
      return new ListApplicationAppVersionReq(this);
    }
  }
}