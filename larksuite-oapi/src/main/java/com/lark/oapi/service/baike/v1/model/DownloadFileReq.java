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

package com.lark.oapi.service.baike.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;

public class DownloadFileReq {

  /**
   * 需要下载的文件 token
   * <p> 示例值：
   */
  @Path
  @SerializedName("file_token")
  private String fileToken;

  // builder 开始
  public DownloadFileReq() {
  }

  public DownloadFileReq(Builder builder) {
    /**
     * 需要下载的文件 token
     * <p> 示例值：
     */
    this.fileToken = builder.fileToken;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getFileToken() {
    return this.fileToken;
  }

  public void setFileToken(String fileToken) {
    this.fileToken = fileToken;
  }

  public static class Builder {

    private String fileToken; // 需要下载的文件 token

    /**
     * 需要下载的文件 token
     * <p> 示例值：
     *
     * @param fileToken
     * @return
     */
    public Builder fileToken(String fileToken) {
      this.fileToken = fileToken;
      return this;
    }

    public DownloadFileReq build() {
      return new DownloadFileReq(this);
    }
  }
}
