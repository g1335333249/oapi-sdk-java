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

package com.lark.oapi.service.face_detection.v1.model;

import com.google.gson.annotations.SerializedName;

public class FaceInfo {

  @SerializedName("position")
  private FacePosition position;
  @SerializedName("attribute")
  private FaceAttribute attribute;
  @SerializedName("quality")
  private FaceQuality quality;

  // builder 开始
  public FaceInfo() {
  }

  public FaceInfo(Builder builder) {
    this.position = builder.position;
    this.attribute = builder.attribute;
    this.quality = builder.quality;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public FacePosition getPosition() {
    return this.position;
  }

  public void setPosition(FacePosition position) {
    this.position = position;
  }

  public FaceAttribute getAttribute() {
    return this.attribute;
  }

  public void setAttribute(FaceAttribute attribute) {
    this.attribute = attribute;
  }

  public FaceQuality getQuality() {
    return this.quality;
  }

  public void setQuality(FaceQuality quality) {
    this.quality = quality;
  }

  public static class Builder {

    private FacePosition position;
    private FaceAttribute attribute;
    private FaceQuality quality;

    public Builder position(FacePosition position) {
      this.position = position;
      return this;
    }

    public Builder attribute(FaceAttribute attribute) {
      this.attribute = attribute;
      return this;
    }

    public Builder quality(FaceQuality quality) {
      this.quality = quality;
      return this;
    }


    public FaceInfo build() {
      return new FaceInfo(this);
    }
  }
}