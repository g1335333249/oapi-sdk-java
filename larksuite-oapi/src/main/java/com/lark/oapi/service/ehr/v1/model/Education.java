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

package com.lark.oapi.service.ehr.v1.model;

import com.google.gson.annotations.SerializedName;

public class Education {

  @SerializedName("level")
  private Integer level;
  @SerializedName("school")
  private String school;
  @SerializedName("major")
  private String major;
  @SerializedName("degree")
  private Integer degree;
  @SerializedName("start")
  private String start;
  @SerializedName("end")
  private String end;

  // builder 开始
  public Education() {
  }

  public Education(Builder builder) {
    this.level = builder.level;
    this.school = builder.school;
    this.major = builder.major;
    this.degree = builder.degree;
    this.start = builder.start;
    this.end = builder.end;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Integer getLevel() {
    return this.level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public String getSchool() {
    return this.school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public String getMajor() {
    return this.major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public Integer getDegree() {
    return this.degree;
  }

  public void setDegree(Integer degree) {
    this.degree = degree;
  }

  public String getStart() {
    return this.start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public String getEnd() {
    return this.end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public static class Builder {

    private Integer level;
    private String school;
    private String major;
    private Integer degree;
    private String start;
    private String end;

    public Builder level(Integer level) {
      this.level = level;
      return this;
    }

    public Builder level(com.lark.oapi.service.ehr.v1.enums.LevelEnum level) {
      this.level = level.getValue();
      return this;
    }

    public Builder school(String school) {
      this.school = school;
      return this;
    }

    public Builder major(String major) {
      this.major = major;
      return this;
    }

    public Builder degree(Integer degree) {
      this.degree = degree;
      return this;
    }

    public Builder degree(com.lark.oapi.service.ehr.v1.enums.DegreeEnum degree) {
      this.degree = degree.getValue();
      return this;
    }

    public Builder start(String start) {
      this.start = start;
      return this;
    }

    public Builder end(String end) {
      this.end = end;
      return this;
    }


    public Education build() {
      return new Education(this);
    }
  }
}