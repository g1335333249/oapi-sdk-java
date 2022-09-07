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

package com.lark.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;

public class TimeoffEvent {

  /**
   * 请假日程ID。参见[请假日程ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/timeoff_event/introduction#b6611a02)
   * <p> 示例值：timeoff:XXXXXX-XXXX-0917-1623-aa493d591a39-XXXXXX
   */
  @SerializedName("timeoff_event_id")
  private String timeoffEventId;
  /**
   * 用户id，参见[用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
   * <p> 示例值：ou_XXXXXXXXXX
   */
  @SerializedName("user_id")
  private String userId;
  /**
   * 时区
   * <p> 示例值：Asia/Shanghai
   */
  @SerializedName("timezone")
  private String timezone;
  /**
   * 休假开始时间：;有时间戳(1609430400)和日期(2021-01-01)两种格式，其它格式无效；;时间戳格式是按小时休假日程，日期格式是全天休假日程；;start_time与end_time格式需保持一致，否则无效。
   * <p> 示例值：2021-01-01
   */
  @SerializedName("start_time")
  private String startTime;
  /**
   * 休假结束时间：;有时间戳(1609430400)和日期(2021-01-01)两种格式，其它格式无效；;时间戳格式是按小时休假日程，日期格式是全天休假日程；;start_time与end_time格式需保持一致，否则无效。
   * <p> 示例值：2021-01-01
   */
  @SerializedName("end_time")
  private String endTime;
  /**
   * 自定义请假日程标题，没有设置则为默认日程标题
   * <p> 示例值：请假中(全天) / 1-Day Time Off
   */
  @SerializedName("title")
  private String title;
  /**
   * 自定义请假日程描述，没有设置则为默认日程描述
   * <p> 示例值：若删除此日程，飞书中相应的“请假”标签将自动消失，而请假系统中的休假申请不会被撤销。
   */
  @SerializedName("description")
  private String description;

  // builder 开始
  public TimeoffEvent() {
  }

  public TimeoffEvent(Builder builder) {
    /**
     * 请假日程ID。参见[请假日程ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/timeoff_event/introduction#b6611a02)
     * <p> 示例值：timeoff:XXXXXX-XXXX-0917-1623-aa493d591a39-XXXXXX
     */
    this.timeoffEventId = builder.timeoffEventId;
    /**
     * 用户id，参见[用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
     * <p> 示例值：ou_XXXXXXXXXX
     */
    this.userId = builder.userId;
    /**
     * 时区
     * <p> 示例值：Asia/Shanghai
     */
    this.timezone = builder.timezone;
    /**
     * 休假开始时间：;有时间戳(1609430400)和日期(2021-01-01)两种格式，其它格式无效；;时间戳格式是按小时休假日程，日期格式是全天休假日程；;start_time与end_time格式需保持一致，否则无效。
     * <p> 示例值：2021-01-01
     */
    this.startTime = builder.startTime;
    /**
     * 休假结束时间：;有时间戳(1609430400)和日期(2021-01-01)两种格式，其它格式无效；;时间戳格式是按小时休假日程，日期格式是全天休假日程；;start_time与end_time格式需保持一致，否则无效。
     * <p> 示例值：2021-01-01
     */
    this.endTime = builder.endTime;
    /**
     * 自定义请假日程标题，没有设置则为默认日程标题
     * <p> 示例值：请假中(全天) / 1-Day Time Off
     */
    this.title = builder.title;
    /**
     * 自定义请假日程描述，没有设置则为默认日程描述
     * <p> 示例值：若删除此日程，飞书中相应的“请假”标签将自动消失，而请假系统中的休假申请不会被撤销。
     */
    this.description = builder.description;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getTimeoffEventId() {
    return this.timeoffEventId;
  }

  public void setTimeoffEventId(String timeoffEventId) {
    this.timeoffEventId = timeoffEventId;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getTimezone() {
    return this.timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public String getStartTime() {
    return this.startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getEndTime() {
    return this.endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public static class Builder {

    /**
     * 请假日程ID。参见[请假日程ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/timeoff_event/introduction#b6611a02)
     * <p> 示例值：timeoff:XXXXXX-XXXX-0917-1623-aa493d591a39-XXXXXX
     */
    private String timeoffEventId;
    /**
     * 用户id，参见[用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
     * <p> 示例值：ou_XXXXXXXXXX
     */
    private String userId;
    /**
     * 时区
     * <p> 示例值：Asia/Shanghai
     */
    private String timezone;
    /**
     * 休假开始时间：;有时间戳(1609430400)和日期(2021-01-01)两种格式，其它格式无效；;时间戳格式是按小时休假日程，日期格式是全天休假日程；;start_time与end_time格式需保持一致，否则无效。
     * <p> 示例值：2021-01-01
     */
    private String startTime;
    /**
     * 休假结束时间：;有时间戳(1609430400)和日期(2021-01-01)两种格式，其它格式无效；;时间戳格式是按小时休假日程，日期格式是全天休假日程；;start_time与end_time格式需保持一致，否则无效。
     * <p> 示例值：2021-01-01
     */
    private String endTime;
    /**
     * 自定义请假日程标题，没有设置则为默认日程标题
     * <p> 示例值：请假中(全天) / 1-Day Time Off
     */
    private String title;
    /**
     * 自定义请假日程描述，没有设置则为默认日程描述
     * <p> 示例值：若删除此日程，飞书中相应的“请假”标签将自动消失，而请假系统中的休假申请不会被撤销。
     */
    private String description;

    /**
     * 请假日程ID。参见[请假日程ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/timeoff_event/introduction#b6611a02)
     * <p> 示例值：timeoff:XXXXXX-XXXX-0917-1623-aa493d591a39-XXXXXX
     *
     * @param timeoffEventId
     * @return
     */
    public Builder timeoffEventId(String timeoffEventId) {
      this.timeoffEventId = timeoffEventId;
      return this;
    }


    /**
     * 用户id，参见[用户相关的 ID 概念](https://open.feishu.cn/document/home/user-identity-introduction/introduction)
     * <p> 示例值：ou_XXXXXXXXXX
     *
     * @param userId
     * @return
     */
    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }


    /**
     * 时区
     * <p> 示例值：Asia/Shanghai
     *
     * @param timezone
     * @return
     */
    public Builder timezone(String timezone) {
      this.timezone = timezone;
      return this;
    }


    /**
     * 休假开始时间：;有时间戳(1609430400)和日期(2021-01-01)两种格式，其它格式无效；;时间戳格式是按小时休假日程，日期格式是全天休假日程；;start_time与end_time格式需保持一致，否则无效。
     * <p> 示例值：2021-01-01
     *
     * @param startTime
     * @return
     */
    public Builder startTime(String startTime) {
      this.startTime = startTime;
      return this;
    }


    /**
     * 休假结束时间：;有时间戳(1609430400)和日期(2021-01-01)两种格式，其它格式无效；;时间戳格式是按小时休假日程，日期格式是全天休假日程；;start_time与end_time格式需保持一致，否则无效。
     * <p> 示例值：2021-01-01
     *
     * @param endTime
     * @return
     */
    public Builder endTime(String endTime) {
      this.endTime = endTime;
      return this;
    }


    /**
     * 自定义请假日程标题，没有设置则为默认日程标题
     * <p> 示例值：请假中(全天) / 1-Day Time Off
     *
     * @param title
     * @return
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }


    /**
     * 自定义请假日程描述，没有设置则为默认日程描述
     * <p> 示例值：若删除此日程，飞书中相应的“请假”标签将自动消失，而请假系统中的休假申请不会被撤销。
     *
     * @param description
     * @return
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }


    public TimeoffEvent build() {
      return new TimeoffEvent(this);
    }
  }
}
