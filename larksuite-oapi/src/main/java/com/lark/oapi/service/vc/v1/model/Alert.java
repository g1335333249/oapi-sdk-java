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

package com.lark.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;

public class Alert {

  /**
   * 告警ID
   * <p> 示例值：7115030004018184212
   */
  @SerializedName("alert_id")
  private String alertId;
  /**
   * 触发告警规则的会议室/服务器具体的名称
   * <p> 示例值：XX层级
   */
  @SerializedName("resource_scope")
  private String resourceScope;
  /**
   * 触发告警规则的监控对象
   * <p> 示例值：2
   */
  @SerializedName("monitor_target")
  private Integer monitorTarget;
  /**
   * 告警规则的规则描述
   * <p> 示例值：连续1个周期（共1分钟），控制器电量 < 50%，则告警
   */
  @SerializedName("alert_strategy")
  private String alertStrategy;
  /**
   * 告警通知发生时间（unix时间，单位sec）
   * <p> 示例值：1656914944
   */
  @SerializedName("alert_time")
  private String alertTime;
  /**
   * 告警等级：严重/警告/提醒
   * <p> 示例值：2
   */
  @SerializedName("alert_level")
  private Integer alertLevel;
  /**
   * 告警联系人
   * <p> 示例值：
   */
  @SerializedName("contacts")
  private Contact[] contacts;
  /**
   * 通知方式
   * <p> 示例值：[0,1]
   */
  @SerializedName("notifyMethods")
  private Integer[] notifyMethods;
  /**
   * 规则名称
   * <p> 示例值：签到板断开连接
   */
  @SerializedName("alertRule")
  private String alertRule;

  // builder 开始
  public Alert() {
  }

  public Alert(Builder builder) {
    /**
     * 告警ID
     * <p> 示例值：7115030004018184212
     */
    this.alertId = builder.alertId;
    /**
     * 触发告警规则的会议室/服务器具体的名称
     * <p> 示例值：XX层级
     */
    this.resourceScope = builder.resourceScope;
    /**
     * 触发告警规则的监控对象
     * <p> 示例值：2
     */
    this.monitorTarget = builder.monitorTarget;
    /**
     * 告警规则的规则描述
     * <p> 示例值：连续1个周期（共1分钟），控制器电量 < 50%，则告警
     */
    this.alertStrategy = builder.alertStrategy;
    /**
     * 告警通知发生时间（unix时间，单位sec）
     * <p> 示例值：1656914944
     */
    this.alertTime = builder.alertTime;
    /**
     * 告警等级：严重/警告/提醒
     * <p> 示例值：2
     */
    this.alertLevel = builder.alertLevel;
    /**
     * 告警联系人
     * <p> 示例值：
     */
    this.contacts = builder.contacts;
    /**
     * 通知方式
     * <p> 示例值：[0,1]
     */
    this.notifyMethods = builder.notifyMethods;
    /**
     * 规则名称
     * <p> 示例值：签到板断开连接
     */
    this.alertRule = builder.alertRule;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getAlertId() {
    return this.alertId;
  }

  public void setAlertId(String alertId) {
    this.alertId = alertId;
  }

  public String getResourceScope() {
    return this.resourceScope;
  }

  public void setResourceScope(String resourceScope) {
    this.resourceScope = resourceScope;
  }

  public Integer getMonitorTarget() {
    return this.monitorTarget;
  }

  public void setMonitorTarget(Integer monitorTarget) {
    this.monitorTarget = monitorTarget;
  }

  public String getAlertStrategy() {
    return this.alertStrategy;
  }

  public void setAlertStrategy(String alertStrategy) {
    this.alertStrategy = alertStrategy;
  }

  public String getAlertTime() {
    return this.alertTime;
  }

  public void setAlertTime(String alertTime) {
    this.alertTime = alertTime;
  }

  public Integer getAlertLevel() {
    return this.alertLevel;
  }

  public void setAlertLevel(Integer alertLevel) {
    this.alertLevel = alertLevel;
  }

  public Contact[] getContacts() {
    return this.contacts;
  }

  public void setContacts(Contact[] contacts) {
    this.contacts = contacts;
  }

  public Integer[] getNotifyMethods() {
    return this.notifyMethods;
  }

  public void setNotifyMethods(Integer[] notifyMethods) {
    this.notifyMethods = notifyMethods;
  }

  public String getAlertRule() {
    return this.alertRule;
  }

  public void setAlertRule(String alertRule) {
    this.alertRule = alertRule;
  }

  public static class Builder {

    /**
     * 告警ID
     * <p> 示例值：7115030004018184212
     */
    private String alertId;
    /**
     * 触发告警规则的会议室/服务器具体的名称
     * <p> 示例值：XX层级
     */
    private String resourceScope;
    /**
     * 触发告警规则的监控对象
     * <p> 示例值：2
     */
    private Integer monitorTarget;
    /**
     * 告警规则的规则描述
     * <p> 示例值：连续1个周期（共1分钟），控制器电量 < 50%，则告警
     */
    private String alertStrategy;
    /**
     * 告警通知发生时间（unix时间，单位sec）
     * <p> 示例值：1656914944
     */
    private String alertTime;
    /**
     * 告警等级：严重/警告/提醒
     * <p> 示例值：2
     */
    private Integer alertLevel;
    /**
     * 告警联系人
     * <p> 示例值：
     */
    private Contact[] contacts;
    /**
     * 通知方式
     * <p> 示例值：[0,1]
     */
    private Integer[] notifyMethods;
    /**
     * 规则名称
     * <p> 示例值：签到板断开连接
     */
    private String alertRule;

    /**
     * 告警ID
     * <p> 示例值：7115030004018184212
     *
     * @param alertId
     * @return
     */
    public Builder alertId(String alertId) {
      this.alertId = alertId;
      return this;
    }


    /**
     * 触发告警规则的会议室/服务器具体的名称
     * <p> 示例值：XX层级
     *
     * @param resourceScope
     * @return
     */
    public Builder resourceScope(String resourceScope) {
      this.resourceScope = resourceScope;
      return this;
    }


    /**
     * 触发告警规则的监控对象
     * <p> 示例值：2
     *
     * @param monitorTarget
     * @return
     */
    public Builder monitorTarget(Integer monitorTarget) {
      this.monitorTarget = monitorTarget;
      return this;
    }

    /**
     * 触发告警规则的监控对象
     * <p> 示例值：2
     *
     * @param monitorTarget {@link com.lark.oapi.service.vc.v1.enums.AlertMonitorTargetEnum}
     * @return
     */
    public Builder monitorTarget(
        com.lark.oapi.service.vc.v1.enums.AlertMonitorTargetEnum monitorTarget) {
      this.monitorTarget = monitorTarget.getValue();
      return this;
    }


    /**
     * 告警规则的规则描述
     * <p> 示例值：连续1个周期（共1分钟），控制器电量 < 50%，则告警
     *
     * @param alertStrategy
     * @return
     */
    public Builder alertStrategy(String alertStrategy) {
      this.alertStrategy = alertStrategy;
      return this;
    }


    /**
     * 告警通知发生时间（unix时间，单位sec）
     * <p> 示例值：1656914944
     *
     * @param alertTime
     * @return
     */
    public Builder alertTime(String alertTime) {
      this.alertTime = alertTime;
      return this;
    }


    /**
     * 告警等级：严重/警告/提醒
     * <p> 示例值：2
     *
     * @param alertLevel
     * @return
     */
    public Builder alertLevel(Integer alertLevel) {
      this.alertLevel = alertLevel;
      return this;
    }

    /**
     * 告警等级：严重/警告/提醒
     * <p> 示例值：2
     *
     * @param alertLevel {@link com.lark.oapi.service.vc.v1.enums.AlertAlertLevelEnum}
     * @return
     */
    public Builder alertLevel(com.lark.oapi.service.vc.v1.enums.AlertAlertLevelEnum alertLevel) {
      this.alertLevel = alertLevel.getValue();
      return this;
    }


    /**
     * 告警联系人
     * <p> 示例值：
     *
     * @param contacts
     * @return
     */
    public Builder contacts(Contact[] contacts) {
      this.contacts = contacts;
      return this;
    }


    /**
     * 通知方式
     * <p> 示例值：[0,1]
     *
     * @param notifyMethods
     * @return
     */
    public Builder notifyMethods(Integer[] notifyMethods) {
      this.notifyMethods = notifyMethods;
      return this;
    }


    /**
     * 规则名称
     * <p> 示例值：签到板断开连接
     *
     * @param alertRule
     * @return
     */
    public Builder alertRule(String alertRule) {
      this.alertRule = alertRule;
      return this;
    }


    public Alert build() {
      return new Alert(this);
    }
  }
}
