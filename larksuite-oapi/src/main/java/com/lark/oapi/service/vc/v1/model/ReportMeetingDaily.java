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

public class ReportMeetingDaily {

  @SerializedName("date")
  private String date;
  @SerializedName("meeting_count")
  private String meetingCount;
  @SerializedName("meeting_duration")
  private String meetingDuration;
  @SerializedName("participant_count")
  private String participantCount;

  // builder 开始
  public ReportMeetingDaily() {
  }

  public ReportMeetingDaily(Builder builder) {
    this.date = builder.date;
    this.meetingCount = builder.meetingCount;
    this.meetingDuration = builder.meetingDuration;
    this.participantCount = builder.participantCount;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getMeetingCount() {
    return this.meetingCount;
  }

  public void setMeetingCount(String meetingCount) {
    this.meetingCount = meetingCount;
  }

  public String getMeetingDuration() {
    return this.meetingDuration;
  }

  public void setMeetingDuration(String meetingDuration) {
    this.meetingDuration = meetingDuration;
  }

  public String getParticipantCount() {
    return this.participantCount;
  }

  public void setParticipantCount(String participantCount) {
    this.participantCount = participantCount;
  }

  public static class Builder {

    private String date;
    private String meetingCount;
    private String meetingDuration;
    private String participantCount;

    public Builder date(String date) {
      this.date = date;
      return this;
    }

    public Builder meetingCount(String meetingCount) {
      this.meetingCount = meetingCount;
      return this;
    }

    public Builder meetingDuration(String meetingDuration) {
      this.meetingDuration = meetingDuration;
      return this;
    }

    public Builder participantCount(String participantCount) {
      this.participantCount = participantCount;
      return this;
    }


    public ReportMeetingDaily build() {
      return new ReportMeetingDaily(this);
    }
  }
}