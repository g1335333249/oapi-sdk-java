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

package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;

public class RequestDoc {

  /**
   * 文件的 token，获取方式见[如何获取云文档资源相关 token](https://open.feishu.cn/document/ukTMukTMukTM/uczNzUjL3czM14yN3MTN#08bb5df6)
   * <p> 示例值：doccnfYZzTlvXqZIGTdAHKabcef
   */
  @SerializedName("doc_token")
  private String docToken;
  /**
   * 文件类型
   * <p> 示例值：doc
   */
  @SerializedName("doc_type")
  private String docType;

  // builder 开始
  public RequestDoc() {
  }

  public RequestDoc(Builder builder) {
    /**
     * 文件的 token，获取方式见[如何获取云文档资源相关 token](https://open.feishu.cn/document/ukTMukTMukTM/uczNzUjL3czM14yN3MTN#08bb5df6)
     * <p> 示例值：doccnfYZzTlvXqZIGTdAHKabcef
     */
    this.docToken = builder.docToken;
    /**
     * 文件类型
     * <p> 示例值：doc
     */
    this.docType = builder.docType;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getDocToken() {
    return this.docToken;
  }

  public void setDocToken(String docToken) {
    this.docToken = docToken;
  }

  public String getDocType() {
    return this.docType;
  }

  public void setDocType(String docType) {
    this.docType = docType;
  }

  public static class Builder {

    /**
     * 文件的 token，获取方式见[如何获取云文档资源相关 token](https://open.feishu.cn/document/ukTMukTMukTM/uczNzUjL3czM14yN3MTN#08bb5df6)
     * <p> 示例值：doccnfYZzTlvXqZIGTdAHKabcef
     */
    private String docToken;
    /**
     * 文件类型
     * <p> 示例值：doc
     */
    private String docType;

    /**
     * 文件的 token，获取方式见[如何获取云文档资源相关 token](https://open.feishu.cn/document/ukTMukTMukTM/uczNzUjL3czM14yN3MTN#08bb5df6)
     * <p> 示例值：doccnfYZzTlvXqZIGTdAHKabcef
     *
     * @param docToken
     * @return
     */
    public Builder docToken(String docToken) {
      this.docToken = docToken;
      return this;
    }


    /**
     * 文件类型
     * <p> 示例值：doc
     *
     * @param docType
     * @return
     */
    public Builder docType(String docType) {
      this.docType = docType;
      return this;
    }

    /**
     * 文件类型
     * <p> 示例值：doc
     *
     * @param docType {@link com.lark.oapi.service.drive.v1.enums.RequestDocDocTypeEnum}
     * @return
     */
    public Builder docType(com.lark.oapi.service.drive.v1.enums.RequestDocDocTypeEnum docType) {
      this.docType = docType.getValue();
      return this;
    }


    public RequestDoc build() {
      return new RequestDoc(this);
    }
  }
}
