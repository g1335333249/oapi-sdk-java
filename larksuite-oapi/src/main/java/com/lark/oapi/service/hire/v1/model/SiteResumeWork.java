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

package com.lark.oapi.service.hire.v1.model;

import com.google.gson.annotations.SerializedName;

public class SiteResumeWork {

  /**
   * 作品链接
   * <p> 示例值：
   */
  @SerializedName("link")
  private String link;
  /**
   * 描述
   * <p> 示例值：
   */
  @SerializedName("description")
  private String description;
  /**
   * 作品附件id
   * <p> 示例值：
   */
  @SerializedName("site_attachment_id")
  private String siteAttachmentId;

  // builder 开始
  public SiteResumeWork() {
  }

  public SiteResumeWork(Builder builder) {
    /**
     * 作品链接
     * <p> 示例值：
     */
    this.link = builder.link;
    /**
     * 描述
     * <p> 示例值：
     */
    this.description = builder.description;
    /**
     * 作品附件id
     * <p> 示例值：
     */
    this.siteAttachmentId = builder.siteAttachmentId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getLink() {
    return this.link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getSiteAttachmentId() {
    return this.siteAttachmentId;
  }

  public void setSiteAttachmentId(String siteAttachmentId) {
    this.siteAttachmentId = siteAttachmentId;
  }

  public static class Builder {

    /**
     * 作品链接
     * <p> 示例值：
     */
    private String link;
    /**
     * 描述
     * <p> 示例值：
     */
    private String description;
    /**
     * 作品附件id
     * <p> 示例值：
     */
    private String siteAttachmentId;

    /**
     * 作品链接
     * <p> 示例值：
     *
     * @param link
     * @return
     */
    public Builder link(String link) {
      this.link = link;
      return this;
    }


    /**
     * 描述
     * <p> 示例值：
     *
     * @param description
     * @return
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }


    /**
     * 作品附件id
     * <p> 示例值：
     *
     * @param siteAttachmentId
     * @return
     */
    public Builder siteAttachmentId(String siteAttachmentId) {
      this.siteAttachmentId = siteAttachmentId;
      return this;
    }


    public SiteResumeWork build() {
      return new SiteResumeWork(this);
    }
  }
}