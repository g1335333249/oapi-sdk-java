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

package com.lark.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;

public class ApprovalCreateExternal {

  /**
   * 列表中用于提示审批来自哪里，i18n key， 注意不需要“来自”前缀，审批中心会拼上前缀
   * <p> 示例值：@i18n@3
   */
  @SerializedName("biz_name")
  private String bizName;
  /**
   * 审批定义业务类别
   * <p> 示例值：permission
   */
  @SerializedName("biz_type")
  private String bizType;
  /**
   * 移动端发起链接，如果设置了该链接，则会在移动端审批发起页展示该审批，用户点击后会跳转到该链接进行发起； 如果不填，则在mobile端不显示该审批
   * <p> 示例值：https://applink.feishu.cn/client/mini_program/open?appId=cli_9c90fc38e07a9101&path=pages/approval-form/index?id=9999
   */
  @SerializedName("create_link_mobile")
  private String createLinkMobile;
  /**
   * PC端发起链接，如果设置了该链接，则会在PC端审批发起页展示该审批，用户点击后会跳转到该链接进行发起； 如果不填，则在PC端不显示该审批；
   * <p> 示例值：https://applink.feishu.cn/client/mini_program/open?mode=appCenter&appId=cli_9c90fc38e07a9101&path=pc/pages/create-form/index?id=9999
   */
  @SerializedName("create_link_pc")
  private String createLinkPc;
  /**
   * 审批实例、审批任务、审批抄送是否要在PC端展示，如果为 true，则PC端列表会展示该定义下的实例信息，否则，不展示
   * <p> 示例值：true
   */
  @SerializedName("support_pc")
  private Boolean supportPc;
  /**
   * 审批实例、审批任务、审批抄送是否要在移动端展示，如果为 true，则移动端列表会展示该定义下的实例信息，否则，不展示； support_pc和support_mobile不可都为false，否则不展示
   * <p> 示例值：true
   */
  @SerializedName("support_mobile")
  private Boolean supportMobile;
  /**
   * 是否支持批量已读
   * <p> 示例值：true
   */
  @SerializedName("support_batch_read")
  private Boolean supportBatchRead;
  /**
   * 是否支持标注可读（该字段无效）
   * <p> 示例值：true
   */
  @SerializedName("enable_mark_readed")
  private Boolean enableMarkReaded;
  /**
   * 是否支持快速操作
   * <p> 示例值：true
   */
  @SerializedName("enable_quick_operate")
  private Boolean enableQuickOperate;
  /**
   * 三方系统的操作回调 url，【待审批】列表的任务审批人点同意或拒绝操作后，审批中心调用该地址通知三方系统，回调地址相关信息可参见：[三方审批快捷审批回调](https://open.feishu.cn/document/ukTMukTMukTM/ukjNyYjL5YjM24SO2IjN/quick-approval-callback)
   * <p> 示例值：http://www.feishu.cn/approval/openapi/instanceOperate
   */
  @SerializedName("action_callback_url")
  private String actionCallbackUrl;
  /**
   * 回调时带的 token， 用于业务系统验证请求来自审批,具体参考 [开放平台文档](https://open.feishu.cn/document/ukTMukTMukTM/uUTNz4SN1MjL1UzM)
   * <p> 示例值：sdjkljkx9lsadf110
   */
  @SerializedName("action_callback_token")
  private String actionCallbackToken;
  /**
   * 请求参数加密密钥，如果配置了该参数，则会对请求参数进行加密，业务需要对请求进行解密，加解密算法参考 [关联外部选项说明](https://open.feishu.cn/document/ukTMukTMukTM/uADM4QjLwADO04CMwgDN)
   * <p> 示例值：gfdqedvsadfgfsd
   */
  @SerializedName("action_callback_key")
  private String actionCallbackKey;
  /**
   * 是否支持批量审批
   * <p> 示例值：true
   */
  @SerializedName("allow_batch_operate")
  private Boolean allowBatchOperate;
  /**
   * 审批流程数据是否不纳入效率统计
   * <p> 示例值：true
   */
  @SerializedName("exclude_efficiency_statistics")
  private Boolean excludeEfficiencyStatistics;

  // builder 开始
  public ApprovalCreateExternal() {
  }

  public ApprovalCreateExternal(Builder builder) {
    /**
     * 列表中用于提示审批来自哪里，i18n key， 注意不需要“来自”前缀，审批中心会拼上前缀
     * <p> 示例值：@i18n@3
     */
    this.bizName = builder.bizName;
    /**
     * 审批定义业务类别
     * <p> 示例值：permission
     */
    this.bizType = builder.bizType;
    /**
     * 移动端发起链接，如果设置了该链接，则会在移动端审批发起页展示该审批，用户点击后会跳转到该链接进行发起； 如果不填，则在mobile端不显示该审批
     * <p> 示例值：https://applink.feishu.cn/client/mini_program/open?appId=cli_9c90fc38e07a9101&path=pages/approval-form/index?id=9999
     */
    this.createLinkMobile = builder.createLinkMobile;
    /**
     * PC端发起链接，如果设置了该链接，则会在PC端审批发起页展示该审批，用户点击后会跳转到该链接进行发起； 如果不填，则在PC端不显示该审批；
     * <p> 示例值：https://applink.feishu.cn/client/mini_program/open?mode=appCenter&appId=cli_9c90fc38e07a9101&path=pc/pages/create-form/index?id=9999
     */
    this.createLinkPc = builder.createLinkPc;
    /**
     * 审批实例、审批任务、审批抄送是否要在PC端展示，如果为 true，则PC端列表会展示该定义下的实例信息，否则，不展示
     * <p> 示例值：true
     */
    this.supportPc = builder.supportPc;
    /**
     * 审批实例、审批任务、审批抄送是否要在移动端展示，如果为 true，则移动端列表会展示该定义下的实例信息，否则，不展示； support_pc和support_mobile不可都为false，否则不展示
     * <p> 示例值：true
     */
    this.supportMobile = builder.supportMobile;
    /**
     * 是否支持批量已读
     * <p> 示例值：true
     */
    this.supportBatchRead = builder.supportBatchRead;
    /**
     * 是否支持标注可读（该字段无效）
     * <p> 示例值：true
     */
    this.enableMarkReaded = builder.enableMarkReaded;
    /**
     * 是否支持快速操作
     * <p> 示例值：true
     */
    this.enableQuickOperate = builder.enableQuickOperate;
    /**
     * 三方系统的操作回调 url，【待审批】列表的任务审批人点同意或拒绝操作后，审批中心调用该地址通知三方系统，回调地址相关信息可参见：[三方审批快捷审批回调](https://open.feishu.cn/document/ukTMukTMukTM/ukjNyYjL5YjM24SO2IjN/quick-approval-callback)
     * <p> 示例值：http://www.feishu.cn/approval/openapi/instanceOperate
     */
    this.actionCallbackUrl = builder.actionCallbackUrl;
    /**
     * 回调时带的 token， 用于业务系统验证请求来自审批,具体参考 [开放平台文档](https://open.feishu.cn/document/ukTMukTMukTM/uUTNz4SN1MjL1UzM)
     * <p> 示例值：sdjkljkx9lsadf110
     */
    this.actionCallbackToken = builder.actionCallbackToken;
    /**
     * 请求参数加密密钥，如果配置了该参数，则会对请求参数进行加密，业务需要对请求进行解密，加解密算法参考 [关联外部选项说明](https://open.feishu.cn/document/ukTMukTMukTM/uADM4QjLwADO04CMwgDN)
     * <p> 示例值：gfdqedvsadfgfsd
     */
    this.actionCallbackKey = builder.actionCallbackKey;
    /**
     * 是否支持批量审批
     * <p> 示例值：true
     */
    this.allowBatchOperate = builder.allowBatchOperate;
    /**
     * 审批流程数据是否不纳入效率统计
     * <p> 示例值：true
     */
    this.excludeEfficiencyStatistics = builder.excludeEfficiencyStatistics;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getBizName() {
    return this.bizName;
  }

  public void setBizName(String bizName) {
    this.bizName = bizName;
  }

  public String getBizType() {
    return this.bizType;
  }

  public void setBizType(String bizType) {
    this.bizType = bizType;
  }

  public String getCreateLinkMobile() {
    return this.createLinkMobile;
  }

  public void setCreateLinkMobile(String createLinkMobile) {
    this.createLinkMobile = createLinkMobile;
  }

  public String getCreateLinkPc() {
    return this.createLinkPc;
  }

  public void setCreateLinkPc(String createLinkPc) {
    this.createLinkPc = createLinkPc;
  }

  public Boolean getSupportPc() {
    return this.supportPc;
  }

  public void setSupportPc(Boolean supportPc) {
    this.supportPc = supportPc;
  }

  public Boolean getSupportMobile() {
    return this.supportMobile;
  }

  public void setSupportMobile(Boolean supportMobile) {
    this.supportMobile = supportMobile;
  }

  public Boolean getSupportBatchRead() {
    return this.supportBatchRead;
  }

  public void setSupportBatchRead(Boolean supportBatchRead) {
    this.supportBatchRead = supportBatchRead;
  }

  public Boolean getEnableMarkReaded() {
    return this.enableMarkReaded;
  }

  public void setEnableMarkReaded(Boolean enableMarkReaded) {
    this.enableMarkReaded = enableMarkReaded;
  }

  public Boolean getEnableQuickOperate() {
    return this.enableQuickOperate;
  }

  public void setEnableQuickOperate(Boolean enableQuickOperate) {
    this.enableQuickOperate = enableQuickOperate;
  }

  public String getActionCallbackUrl() {
    return this.actionCallbackUrl;
  }

  public void setActionCallbackUrl(String actionCallbackUrl) {
    this.actionCallbackUrl = actionCallbackUrl;
  }

  public String getActionCallbackToken() {
    return this.actionCallbackToken;
  }

  public void setActionCallbackToken(String actionCallbackToken) {
    this.actionCallbackToken = actionCallbackToken;
  }

  public String getActionCallbackKey() {
    return this.actionCallbackKey;
  }

  public void setActionCallbackKey(String actionCallbackKey) {
    this.actionCallbackKey = actionCallbackKey;
  }

  public Boolean getAllowBatchOperate() {
    return this.allowBatchOperate;
  }

  public void setAllowBatchOperate(Boolean allowBatchOperate) {
    this.allowBatchOperate = allowBatchOperate;
  }

  public Boolean getExcludeEfficiencyStatistics() {
    return this.excludeEfficiencyStatistics;
  }

  public void setExcludeEfficiencyStatistics(Boolean excludeEfficiencyStatistics) {
    this.excludeEfficiencyStatistics = excludeEfficiencyStatistics;
  }

  public static class Builder {

    /**
     * 列表中用于提示审批来自哪里，i18n key， 注意不需要“来自”前缀，审批中心会拼上前缀
     * <p> 示例值：@i18n@3
     */
    private String bizName;
    /**
     * 审批定义业务类别
     * <p> 示例值：permission
     */
    private String bizType;
    /**
     * 移动端发起链接，如果设置了该链接，则会在移动端审批发起页展示该审批，用户点击后会跳转到该链接进行发起； 如果不填，则在mobile端不显示该审批
     * <p> 示例值：https://applink.feishu.cn/client/mini_program/open?appId=cli_9c90fc38e07a9101&path=pages/approval-form/index?id=9999
     */
    private String createLinkMobile;
    /**
     * PC端发起链接，如果设置了该链接，则会在PC端审批发起页展示该审批，用户点击后会跳转到该链接进行发起； 如果不填，则在PC端不显示该审批；
     * <p> 示例值：https://applink.feishu.cn/client/mini_program/open?mode=appCenter&appId=cli_9c90fc38e07a9101&path=pc/pages/create-form/index?id=9999
     */
    private String createLinkPc;
    /**
     * 审批实例、审批任务、审批抄送是否要在PC端展示，如果为 true，则PC端列表会展示该定义下的实例信息，否则，不展示
     * <p> 示例值：true
     */
    private Boolean supportPc;
    /**
     * 审批实例、审批任务、审批抄送是否要在移动端展示，如果为 true，则移动端列表会展示该定义下的实例信息，否则，不展示； support_pc和support_mobile不可都为false，否则不展示
     * <p> 示例值：true
     */
    private Boolean supportMobile;
    /**
     * 是否支持批量已读
     * <p> 示例值：true
     */
    private Boolean supportBatchRead;
    /**
     * 是否支持标注可读（该字段无效）
     * <p> 示例值：true
     */
    private Boolean enableMarkReaded;
    /**
     * 是否支持快速操作
     * <p> 示例值：true
     */
    private Boolean enableQuickOperate;
    /**
     * 三方系统的操作回调 url，【待审批】列表的任务审批人点同意或拒绝操作后，审批中心调用该地址通知三方系统，回调地址相关信息可参见：[三方审批快捷审批回调](https://open.feishu.cn/document/ukTMukTMukTM/ukjNyYjL5YjM24SO2IjN/quick-approval-callback)
     * <p> 示例值：http://www.feishu.cn/approval/openapi/instanceOperate
     */
    private String actionCallbackUrl;
    /**
     * 回调时带的 token， 用于业务系统验证请求来自审批,具体参考 [开放平台文档](https://open.feishu.cn/document/ukTMukTMukTM/uUTNz4SN1MjL1UzM)
     * <p> 示例值：sdjkljkx9lsadf110
     */
    private String actionCallbackToken;
    /**
     * 请求参数加密密钥，如果配置了该参数，则会对请求参数进行加密，业务需要对请求进行解密，加解密算法参考 [关联外部选项说明](https://open.feishu.cn/document/ukTMukTMukTM/uADM4QjLwADO04CMwgDN)
     * <p> 示例值：gfdqedvsadfgfsd
     */
    private String actionCallbackKey;
    /**
     * 是否支持批量审批
     * <p> 示例值：true
     */
    private Boolean allowBatchOperate;
    /**
     * 审批流程数据是否不纳入效率统计
     * <p> 示例值：true
     */
    private Boolean excludeEfficiencyStatistics;

    /**
     * 列表中用于提示审批来自哪里，i18n key， 注意不需要“来自”前缀，审批中心会拼上前缀
     * <p> 示例值：@i18n@3
     *
     * @param bizName
     * @return
     */
    public Builder bizName(String bizName) {
      this.bizName = bizName;
      return this;
    }


    /**
     * 审批定义业务类别
     * <p> 示例值：permission
     *
     * @param bizType
     * @return
     */
    public Builder bizType(String bizType) {
      this.bizType = bizType;
      return this;
    }


    /**
     * 移动端发起链接，如果设置了该链接，则会在移动端审批发起页展示该审批，用户点击后会跳转到该链接进行发起； 如果不填，则在mobile端不显示该审批
     * <p> 示例值：https://applink.feishu.cn/client/mini_program/open?appId=cli_9c90fc38e07a9101&path=pages/approval-form/index?id=9999
     *
     * @param createLinkMobile
     * @return
     */
    public Builder createLinkMobile(String createLinkMobile) {
      this.createLinkMobile = createLinkMobile;
      return this;
    }


    /**
     * PC端发起链接，如果设置了该链接，则会在PC端审批发起页展示该审批，用户点击后会跳转到该链接进行发起； 如果不填，则在PC端不显示该审批；
     * <p> 示例值：https://applink.feishu.cn/client/mini_program/open?mode=appCenter&appId=cli_9c90fc38e07a9101&path=pc/pages/create-form/index?id=9999
     *
     * @param createLinkPc
     * @return
     */
    public Builder createLinkPc(String createLinkPc) {
      this.createLinkPc = createLinkPc;
      return this;
    }


    /**
     * 审批实例、审批任务、审批抄送是否要在PC端展示，如果为 true，则PC端列表会展示该定义下的实例信息，否则，不展示
     * <p> 示例值：true
     *
     * @param supportPc
     * @return
     */
    public Builder supportPc(Boolean supportPc) {
      this.supportPc = supportPc;
      return this;
    }


    /**
     * 审批实例、审批任务、审批抄送是否要在移动端展示，如果为 true，则移动端列表会展示该定义下的实例信息，否则，不展示； support_pc和support_mobile不可都为false，否则不展示
     * <p> 示例值：true
     *
     * @param supportMobile
     * @return
     */
    public Builder supportMobile(Boolean supportMobile) {
      this.supportMobile = supportMobile;
      return this;
    }


    /**
     * 是否支持批量已读
     * <p> 示例值：true
     *
     * @param supportBatchRead
     * @return
     */
    public Builder supportBatchRead(Boolean supportBatchRead) {
      this.supportBatchRead = supportBatchRead;
      return this;
    }


    /**
     * 是否支持标注可读（该字段无效）
     * <p> 示例值：true
     *
     * @param enableMarkReaded
     * @return
     */
    public Builder enableMarkReaded(Boolean enableMarkReaded) {
      this.enableMarkReaded = enableMarkReaded;
      return this;
    }


    /**
     * 是否支持快速操作
     * <p> 示例值：true
     *
     * @param enableQuickOperate
     * @return
     */
    public Builder enableQuickOperate(Boolean enableQuickOperate) {
      this.enableQuickOperate = enableQuickOperate;
      return this;
    }


    /**
     * 三方系统的操作回调 url，【待审批】列表的任务审批人点同意或拒绝操作后，审批中心调用该地址通知三方系统，回调地址相关信息可参见：[三方审批快捷审批回调](https://open.feishu.cn/document/ukTMukTMukTM/ukjNyYjL5YjM24SO2IjN/quick-approval-callback)
     * <p> 示例值：http://www.feishu.cn/approval/openapi/instanceOperate
     *
     * @param actionCallbackUrl
     * @return
     */
    public Builder actionCallbackUrl(String actionCallbackUrl) {
      this.actionCallbackUrl = actionCallbackUrl;
      return this;
    }


    /**
     * 回调时带的 token， 用于业务系统验证请求来自审批,具体参考 [开放平台文档](https://open.feishu.cn/document/ukTMukTMukTM/uUTNz4SN1MjL1UzM)
     * <p> 示例值：sdjkljkx9lsadf110
     *
     * @param actionCallbackToken
     * @return
     */
    public Builder actionCallbackToken(String actionCallbackToken) {
      this.actionCallbackToken = actionCallbackToken;
      return this;
    }


    /**
     * 请求参数加密密钥，如果配置了该参数，则会对请求参数进行加密，业务需要对请求进行解密，加解密算法参考 [关联外部选项说明](https://open.feishu.cn/document/ukTMukTMukTM/uADM4QjLwADO04CMwgDN)
     * <p> 示例值：gfdqedvsadfgfsd
     *
     * @param actionCallbackKey
     * @return
     */
    public Builder actionCallbackKey(String actionCallbackKey) {
      this.actionCallbackKey = actionCallbackKey;
      return this;
    }


    /**
     * 是否支持批量审批
     * <p> 示例值：true
     *
     * @param allowBatchOperate
     * @return
     */
    public Builder allowBatchOperate(Boolean allowBatchOperate) {
      this.allowBatchOperate = allowBatchOperate;
      return this;
    }


    /**
     * 审批流程数据是否不纳入效率统计
     * <p> 示例值：true
     *
     * @param excludeEfficiencyStatistics
     * @return
     */
    public Builder excludeEfficiencyStatistics(Boolean excludeEfficiencyStatistics) {
      this.excludeEfficiencyStatistics = excludeEfficiencyStatistics;
      return this;
    }


    public ApprovalCreateExternal build() {
      return new ApprovalCreateExternal(this);
    }
  }
}
