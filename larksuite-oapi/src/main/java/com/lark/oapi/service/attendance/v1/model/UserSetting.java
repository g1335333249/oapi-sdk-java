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

public class UserSetting {

  /**
   * 用户 ID
   * <p> 示例值：abd754f7
   */
  @SerializedName("user_id")
  private String userId;
  /**
   * 人脸照片文件 ID，获取方式：[文件上传](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/file/upload)
   * <p> 示例值：xxxxxb306842b1c189bc5212eefxxxxx
   */
  @SerializedName("face_key")
  private String faceKey;
  /**
   * 人脸照片更新时间，精确到秒的时间戳
   * <p> 示例值：1625681917
   */
  @SerializedName("face_key_update_time")
  private String faceKeyUpdateTime;

  // builder 开始
  public UserSetting() {
  }

  public UserSetting(Builder builder) {
    /**
     * 用户 ID
     * <p> 示例值：abd754f7
     */
    this.userId = builder.userId;
    /**
     * 人脸照片文件 ID，获取方式：[文件上传](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/file/upload)
     * <p> 示例值：xxxxxb306842b1c189bc5212eefxxxxx
     */
    this.faceKey = builder.faceKey;
    /**
     * 人脸照片更新时间，精确到秒的时间戳
     * <p> 示例值：1625681917
     */
    this.faceKeyUpdateTime = builder.faceKeyUpdateTime;
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

  public String getFaceKey() {
    return this.faceKey;
  }

  public void setFaceKey(String faceKey) {
    this.faceKey = faceKey;
  }

  public String getFaceKeyUpdateTime() {
    return this.faceKeyUpdateTime;
  }

  public void setFaceKeyUpdateTime(String faceKeyUpdateTime) {
    this.faceKeyUpdateTime = faceKeyUpdateTime;
  }

  public static class Builder {

    /**
     * 用户 ID
     * <p> 示例值：abd754f7
     */
    private String userId;
    /**
     * 人脸照片文件 ID，获取方式：[文件上传](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/file/upload)
     * <p> 示例值：xxxxxb306842b1c189bc5212eefxxxxx
     */
    private String faceKey;
    /**
     * 人脸照片更新时间，精确到秒的时间戳
     * <p> 示例值：1625681917
     */
    private String faceKeyUpdateTime;

    /**
     * 用户 ID
     * <p> 示例值：abd754f7
     *
     * @param userId
     * @return
     */
    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }


    /**
     * 人脸照片文件 ID，获取方式：[文件上传](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/attendance-v1/file/upload)
     * <p> 示例值：xxxxxb306842b1c189bc5212eefxxxxx
     *
     * @param faceKey
     * @return
     */
    public Builder faceKey(String faceKey) {
      this.faceKey = faceKey;
      return this;
    }


    /**
     * 人脸照片更新时间，精确到秒的时间戳
     * <p> 示例值：1625681917
     *
     * @param faceKeyUpdateTime
     * @return
     */
    public Builder faceKeyUpdateTime(String faceKeyUpdateTime) {
      this.faceKeyUpdateTime = faceKeyUpdateTime;
      return this;
    }


    public UserSetting build() {
      return new UserSetting(this);
    }
  }
}
