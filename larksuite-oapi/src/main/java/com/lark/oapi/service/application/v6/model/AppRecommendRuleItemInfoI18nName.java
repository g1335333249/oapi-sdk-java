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

public class AppRecommendRuleItemInfoI18nName {

  /**
   * 应用项的简体中文名称
   * <p> 示例值：审批
   */
  @SerializedName("zh_cn")
  private String zhCn;
  /**
   * 应用项的繁体中文（中国香港）名称
   * <p> 示例值：審批
   */
  @SerializedName("zh_hk")
  private String zhHk;
  /**
   * 应用项的繁体中文（中国台湾）名称
   * <p> 示例值：審批
   */
  @SerializedName("zh_tw")
  private String zhTw;
  /**
   * 应用项的英文名称
   * <p> 示例值：Approval
   */
  @SerializedName("en_us")
  private String enUs;
  /**
   * 应用项的日文名称
   * <p> 示例值：承認
   */
  @SerializedName("ja_jp")
  private String jaJp;

  // builder 开始
  public AppRecommendRuleItemInfoI18nName() {
  }

  public AppRecommendRuleItemInfoI18nName(Builder builder) {
    /**
     * 应用项的简体中文名称
     * <p> 示例值：审批
     */
    this.zhCn = builder.zhCn;
    /**
     * 应用项的繁体中文（中国香港）名称
     * <p> 示例值：審批
     */
    this.zhHk = builder.zhHk;
    /**
     * 应用项的繁体中文（中国台湾）名称
     * <p> 示例值：審批
     */
    this.zhTw = builder.zhTw;
    /**
     * 应用项的英文名称
     * <p> 示例值：Approval
     */
    this.enUs = builder.enUs;
    /**
     * 应用项的日文名称
     * <p> 示例值：承認
     */
    this.jaJp = builder.jaJp;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getZhCn() {
    return this.zhCn;
  }

  public void setZhCn(String zhCn) {
    this.zhCn = zhCn;
  }

  public String getZhHk() {
    return this.zhHk;
  }

  public void setZhHk(String zhHk) {
    this.zhHk = zhHk;
  }

  public String getZhTw() {
    return this.zhTw;
  }

  public void setZhTw(String zhTw) {
    this.zhTw = zhTw;
  }

  public String getEnUs() {
    return this.enUs;
  }

  public void setEnUs(String enUs) {
    this.enUs = enUs;
  }

  public String getJaJp() {
    return this.jaJp;
  }

  public void setJaJp(String jaJp) {
    this.jaJp = jaJp;
  }

  public static class Builder {

    /**
     * 应用项的简体中文名称
     * <p> 示例值：审批
     */
    private String zhCn;
    /**
     * 应用项的繁体中文（中国香港）名称
     * <p> 示例值：審批
     */
    private String zhHk;
    /**
     * 应用项的繁体中文（中国台湾）名称
     * <p> 示例值：審批
     */
    private String zhTw;
    /**
     * 应用项的英文名称
     * <p> 示例值：Approval
     */
    private String enUs;
    /**
     * 应用项的日文名称
     * <p> 示例值：承認
     */
    private String jaJp;

    /**
     * 应用项的简体中文名称
     * <p> 示例值：审批
     *
     * @param zhCn
     * @return
     */
    public Builder zhCn(String zhCn) {
      this.zhCn = zhCn;
      return this;
    }


    /**
     * 应用项的繁体中文（中国香港）名称
     * <p> 示例值：審批
     *
     * @param zhHk
     * @return
     */
    public Builder zhHk(String zhHk) {
      this.zhHk = zhHk;
      return this;
    }


    /**
     * 应用项的繁体中文（中国台湾）名称
     * <p> 示例值：審批
     *
     * @param zhTw
     * @return
     */
    public Builder zhTw(String zhTw) {
      this.zhTw = zhTw;
      return this;
    }


    /**
     * 应用项的英文名称
     * <p> 示例值：Approval
     *
     * @param enUs
     * @return
     */
    public Builder enUs(String enUs) {
      this.enUs = enUs;
      return this;
    }


    /**
     * 应用项的日文名称
     * <p> 示例值：承認
     *
     * @param jaJp
     * @return
     */
    public Builder jaJp(String jaJp) {
      this.jaJp = jaJp;
      return this;
    }


    public AppRecommendRuleItemInfoI18nName build() {
      return new AppRecommendRuleItemInfoI18nName(this);
    }
  }
}
