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

package com.lark.oapi.service.helpdesk.v1.model;

import com.google.gson.annotations.SerializedName;

public class FaqUpdateInfo {

  /**
   * 知识库分类ID
   * <p> 示例值：6836004780707807251
   */
  @SerializedName("category_id")
  private String categoryId;
  /**
   * 问题
   * <p> 示例值：问题
   */
  @SerializedName("question")
  private String question;
  /**
   * 答案
   * <p> 示例值：答案
   */
  @SerializedName("answer")
  private String answer;
  /**
   * 富文本答案和答案必须有一个必填。Json Array格式，富文本结构请见[了解更多: 富文本](https://open.feishu.cn/document/ukTMukTMukTM/uITM0YjLyEDN24iMxQjN)
   * <p> 示例值：[{;                        "content": "这只是一个测试，医保问题",;                        "type":
   * "text";                    }]
   */
  @SerializedName("answer_richtext")
  private String answerRichtext;
  /**
   * 相似问题
   * <p> 示例值：["tag1","tag2","tag3"]
   */
  @SerializedName("tags")
  private String[] tags;

  // builder 开始
  public FaqUpdateInfo() {
  }

  public FaqUpdateInfo(Builder builder) {
    /**
     * 知识库分类ID
     * <p> 示例值：6836004780707807251
     */
    this.categoryId = builder.categoryId;
    /**
     * 问题
     * <p> 示例值：问题
     */
    this.question = builder.question;
    /**
     * 答案
     * <p> 示例值：答案
     */
    this.answer = builder.answer;
    /**
     * 富文本答案和答案必须有一个必填。Json Array格式，富文本结构请见[了解更多: 富文本](https://open.feishu.cn/document/ukTMukTMukTM/uITM0YjLyEDN24iMxQjN)
     * <p> 示例值：[{;                        "content": "这只是一个测试，医保问题",;                        "type": "text";                    }]
     */
    this.answerRichtext = builder.answerRichtext;
    /**
     * 相似问题
     * <p> 示例值：["tag1","tag2","tag3"]
     */
    this.tags = builder.tags;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getCategoryId() {
    return this.categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  public String getQuestion() {
    return this.question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public String getAnswer() {
    return this.answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public String getAnswerRichtext() {
    return this.answerRichtext;
  }

  public void setAnswerRichtext(String answerRichtext) {
    this.answerRichtext = answerRichtext;
  }

  public String[] getTags() {
    return this.tags;
  }

  public void setTags(String[] tags) {
    this.tags = tags;
  }

  public static class Builder {

    /**
     * 知识库分类ID
     * <p> 示例值：6836004780707807251
     */
    private String categoryId;
    /**
     * 问题
     * <p> 示例值：问题
     */
    private String question;
    /**
     * 答案
     * <p> 示例值：答案
     */
    private String answer;
    /**
     * 富文本答案和答案必须有一个必填。Json Array格式，富文本结构请见[了解更多: 富文本](https://open.feishu.cn/document/ukTMukTMukTM/uITM0YjLyEDN24iMxQjN)
     * <p> 示例值：[{;                        "content": "这只是一个测试，医保问题",;                        "type":
     * "text";                    }]
     */
    private String answerRichtext;
    /**
     * 相似问题
     * <p> 示例值：["tag1","tag2","tag3"]
     */
    private String[] tags;

    /**
     * 知识库分类ID
     * <p> 示例值：6836004780707807251
     *
     * @param categoryId
     * @return
     */
    public Builder categoryId(String categoryId) {
      this.categoryId = categoryId;
      return this;
    }


    /**
     * 问题
     * <p> 示例值：问题
     *
     * @param question
     * @return
     */
    public Builder question(String question) {
      this.question = question;
      return this;
    }


    /**
     * 答案
     * <p> 示例值：答案
     *
     * @param answer
     * @return
     */
    public Builder answer(String answer) {
      this.answer = answer;
      return this;
    }


    /**
     * 富文本答案和答案必须有一个必填。Json Array格式，富文本结构请见[了解更多: 富文本](https://open.feishu.cn/document/ukTMukTMukTM/uITM0YjLyEDN24iMxQjN)
     * <p> 示例值：[{;                        "content": "这只是一个测试，医保问题",;                        "type":
     * "text";                    }]
     *
     * @param answerRichtext
     * @return
     */
    public Builder answerRichtext(String answerRichtext) {
      this.answerRichtext = answerRichtext;
      return this;
    }


    /**
     * 相似问题
     * <p> 示例值：["tag1","tag2","tag3"]
     *
     * @param tags
     * @return
     */
    public Builder tags(String[] tags) {
      this.tags = tags;
      return this;
    }


    public FaqUpdateInfo build() {
      return new FaqUpdateInfo(this);
    }
  }
}
