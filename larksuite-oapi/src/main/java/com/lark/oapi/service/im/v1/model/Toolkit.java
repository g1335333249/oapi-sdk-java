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

public class Toolkit {

  /**
   * 快捷组件ID
   * <p> 示例值：7101214603622940671
   */
  @SerializedName("toolkit_id")
  private String toolkitId;
  /**
   * 快捷组件小图标 ;;上传message类型的图片[上传图片](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/image/create)
   * <p> 示例值：img_v2_2995edd9-a22c-44ca-9559-71bbc1e661bg
   */
  @SerializedName("image_key")
  private String imageKey;
  /**
   * 快捷组件名称
   * <p> 示例值：群组
   */
  @SerializedName("toolkit_name")
  private String toolkitName;
  /**
   * 国际化名称
   * <p> 示例值：
   */
  @SerializedName("i18n_name")
  private I18nNames i18nName;
  /**
   * 快捷组件类型
   * <p> 示例值：redirect_link
   */
  @SerializedName("toolkit_type")
  private String toolkitType;
  /**
   * 跳转类型快捷组件
   * <p> 示例值：
   */
  @SerializedName("redirect_link")
  private ToolkitRedirectLink redirectLink;
  /**
   * 回调类型快捷组件
   * <p> 示例值：
   */
  @SerializedName("callback")
  private ToolkitCallback callback;

  // builder 开始
  public Toolkit() {
  }

  public Toolkit(Builder builder) {
    /**
     * 快捷组件ID
     * <p> 示例值：7101214603622940671
     */
    this.toolkitId = builder.toolkitId;
    /**
     * 快捷组件小图标 ;;上传message类型的图片[上传图片](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/image/create)
     * <p> 示例值：img_v2_2995edd9-a22c-44ca-9559-71bbc1e661bg
     */
    this.imageKey = builder.imageKey;
    /**
     * 快捷组件名称
     * <p> 示例值：群组
     */
    this.toolkitName = builder.toolkitName;
    /**
     * 国际化名称
     * <p> 示例值：
     */
    this.i18nName = builder.i18nName;
    /**
     * 快捷组件类型
     * <p> 示例值：redirect_link
     */
    this.toolkitType = builder.toolkitType;
    /**
     * 跳转类型快捷组件
     * <p> 示例值：
     */
    this.redirectLink = builder.redirectLink;
    /**
     * 回调类型快捷组件
     * <p> 示例值：
     */
    this.callback = builder.callback;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getToolkitId() {
    return this.toolkitId;
  }

  public void setToolkitId(String toolkitId) {
    this.toolkitId = toolkitId;
  }

  public String getImageKey() {
    return this.imageKey;
  }

  public void setImageKey(String imageKey) {
    this.imageKey = imageKey;
  }

  public String getToolkitName() {
    return this.toolkitName;
  }

  public void setToolkitName(String toolkitName) {
    this.toolkitName = toolkitName;
  }

  public I18nNames getI18nName() {
    return this.i18nName;
  }

  public void setI18nName(I18nNames i18nName) {
    this.i18nName = i18nName;
  }

  public String getToolkitType() {
    return this.toolkitType;
  }

  public void setToolkitType(String toolkitType) {
    this.toolkitType = toolkitType;
  }

  public ToolkitRedirectLink getRedirectLink() {
    return this.redirectLink;
  }

  public void setRedirectLink(ToolkitRedirectLink redirectLink) {
    this.redirectLink = redirectLink;
  }

  public ToolkitCallback getCallback() {
    return this.callback;
  }

  public void setCallback(ToolkitCallback callback) {
    this.callback = callback;
  }

  public static class Builder {

    /**
     * 快捷组件ID
     * <p> 示例值：7101214603622940671
     */
    private String toolkitId;
    /**
     * 快捷组件小图标 ;;上传message类型的图片[上传图片](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/image/create)
     * <p> 示例值：img_v2_2995edd9-a22c-44ca-9559-71bbc1e661bg
     */
    private String imageKey;
    /**
     * 快捷组件名称
     * <p> 示例值：群组
     */
    private String toolkitName;
    /**
     * 国际化名称
     * <p> 示例值：
     */
    private I18nNames i18nName;
    /**
     * 快捷组件类型
     * <p> 示例值：redirect_link
     */
    private String toolkitType;
    /**
     * 跳转类型快捷组件
     * <p> 示例值：
     */
    private ToolkitRedirectLink redirectLink;
    /**
     * 回调类型快捷组件
     * <p> 示例值：
     */
    private ToolkitCallback callback;

    /**
     * 快捷组件ID
     * <p> 示例值：7101214603622940671
     *
     * @param toolkitId
     * @return
     */
    public Builder toolkitId(String toolkitId) {
      this.toolkitId = toolkitId;
      return this;
    }


    /**
     * 快捷组件小图标 ;;上传message类型的图片[上传图片](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/image/create)
     * <p> 示例值：img_v2_2995edd9-a22c-44ca-9559-71bbc1e661bg
     *
     * @param imageKey
     * @return
     */
    public Builder imageKey(String imageKey) {
      this.imageKey = imageKey;
      return this;
    }


    /**
     * 快捷组件名称
     * <p> 示例值：群组
     *
     * @param toolkitName
     * @return
     */
    public Builder toolkitName(String toolkitName) {
      this.toolkitName = toolkitName;
      return this;
    }


    /**
     * 国际化名称
     * <p> 示例值：
     *
     * @param i18nName
     * @return
     */
    public Builder i18nName(I18nNames i18nName) {
      this.i18nName = i18nName;
      return this;
    }


    /**
     * 快捷组件类型
     * <p> 示例值：redirect_link
     *
     * @param toolkitType
     * @return
     */
    public Builder toolkitType(String toolkitType) {
      this.toolkitType = toolkitType;
      return this;
    }

    /**
     * 快捷组件类型
     * <p> 示例值：redirect_link
     *
     * @param toolkitType {@link com.lark.oapi.service.im.v1.enums.ToolkitToolkitTypeEnum}
     * @return
     */
    public Builder toolkitType(
        com.lark.oapi.service.im.v1.enums.ToolkitToolkitTypeEnum toolkitType) {
      this.toolkitType = toolkitType.getValue();
      return this;
    }


    /**
     * 跳转类型快捷组件
     * <p> 示例值：
     *
     * @param redirectLink
     * @return
     */
    public Builder redirectLink(ToolkitRedirectLink redirectLink) {
      this.redirectLink = redirectLink;
      return this;
    }


    /**
     * 回调类型快捷组件
     * <p> 示例值：
     *
     * @param callback
     * @return
     */
    public Builder callback(ToolkitCallback callback) {
      this.callback = callback;
      return this;
    }


    public Toolkit build() {
      return new Toolkit(this);
    }
  }
}
