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

package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;

public class BatchCreateUserDailyShiftReqBody {

  /**
   * 班表信息列表
   * <p> 示例值：
   */
  @SerializedName("user_daily_shifts")
  private UserDailyShift[] userDailyShifts;
  /**
   * 操作人uid，如果您未操作[考勤管理后台“API 接入”流程](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/attendance-development-guidelines)，则此字段为必填字段
   * <p> 示例值：dd31248a
   */
  @SerializedName("operator_id")
  private String operatorId;

  // builder 开始
  public BatchCreateUserDailyShiftReqBody() {
  }

  public BatchCreateUserDailyShiftReqBody(Builder builder) {
    /**
     * 班表信息列表
     * <p> 示例值：
     */
    this.userDailyShifts = builder.userDailyShifts;
    /**
     * 操作人uid，如果您未操作[考勤管理后台“API 接入”流程](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/attendance-development-guidelines)，则此字段为必填字段
     * <p> 示例值：dd31248a
     */
    this.operatorId = builder.operatorId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public UserDailyShift[] getUserDailyShifts() {
    return this.userDailyShifts;
  }

  public void setUserDailyShifts(UserDailyShift[] userDailyShifts) {
    this.userDailyShifts = userDailyShifts;
  }

  public String getOperatorId() {
    return this.operatorId;
  }

  public void setOperatorId(String operatorId) {
    this.operatorId = operatorId;
  }

  public static class Builder {

    /**
     * 班表信息列表
     * <p> 示例值：
     */
    private UserDailyShift[] userDailyShifts;
    /**
     * 操作人uid，如果您未操作[考勤管理后台“API 接入”流程](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/attendance-development-guidelines)，则此字段为必填字段
     * <p> 示例值：dd31248a
     */
    private String operatorId;

    /**
     * 班表信息列表
     * <p> 示例值：
     *
     * @param userDailyShifts
     * @return
     */
    public Builder userDailyShifts(UserDailyShift[] userDailyShifts) {
      this.userDailyShifts = userDailyShifts;
      return this;
    }


    /**
     * 操作人uid，如果您未操作[考勤管理后台“API 接入”流程](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/attendance-development-guidelines)，则此字段为必填字段
     * <p> 示例值：dd31248a
     *
     * @param operatorId
     * @return
     */
    public Builder operatorId(String operatorId) {
      this.operatorId = operatorId;
      return this;
    }


    public BatchCreateUserDailyShiftReqBody build() {
      return new BatchCreateUserDailyShiftReqBody(this);
    }
  }
}
