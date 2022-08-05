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

package com.lark.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;

public class AppTableForm {

  @SerializedName("name")
  private String name;
  @SerializedName("description")
  private String description;
  @SerializedName("shared")
  private Boolean shared;
  @SerializedName("shared_url")
  private String sharedUrl;
  @SerializedName("shared_limit")
  private Integer sharedLimit;
  @SerializedName("submit_limit_once")
  private Boolean submitLimitOnce;

  // builder 开始
  public AppTableForm() {
  }

  public AppTableForm(Builder builder) {
    this.name = builder.name;
    this.description = builder.description;
    this.shared = builder.shared;
    this.sharedUrl = builder.sharedUrl;
    this.sharedLimit = builder.sharedLimit;
    this.submitLimitOnce = builder.submitLimitOnce;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Boolean getShared() {
    return this.shared;
  }

  public void setShared(Boolean shared) {
    this.shared = shared;
  }

  public String getSharedUrl() {
    return this.sharedUrl;
  }

  public void setSharedUrl(String sharedUrl) {
    this.sharedUrl = sharedUrl;
  }

  public Integer getSharedLimit() {
    return this.sharedLimit;
  }

  public void setSharedLimit(Integer sharedLimit) {
    this.sharedLimit = sharedLimit;
  }

  public Boolean getSubmitLimitOnce() {
    return this.submitLimitOnce;
  }

  public void setSubmitLimitOnce(Boolean submitLimitOnce) {
    this.submitLimitOnce = submitLimitOnce;
  }

  public static class Builder {

    private String name;
    private String description;
    private Boolean shared;
    private String sharedUrl;
    private Integer sharedLimit;
    private Boolean submitLimitOnce;

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder description(String description) {
      this.description = description;
      return this;
    }

    public Builder shared(Boolean shared) {
      this.shared = shared;
      return this;
    }

    public Builder sharedUrl(String sharedUrl) {
      this.sharedUrl = sharedUrl;
      return this;
    }

    public Builder sharedLimit(Integer sharedLimit) {
      this.sharedLimit = sharedLimit;
      return this;
    }

    public Builder submitLimitOnce(Boolean submitLimitOnce) {
      this.submitLimitOnce = submitLimitOnce;
      return this;
    }


    public AppTableForm build() {
      return new AppTableForm(this);
    }
  }
}