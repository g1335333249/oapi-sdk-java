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

package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;

public class UserCustomAttr {

  /**
   * 自定义字段类型   ;- `TEXT`：文本;- `HREF`：网页;- `ENUMERATION`：枚举;- `PICTURE_ENUM`：图片;-
   * `GENERIC_USER`：用户;;具体说明参见常见问题的[用户接口相关问题](https://open.feishu.cn/document/ugTN1YjL4UTN24CO1UjN/uQzN1YjL0cTN24CN3UjN#77061525)
   * <p> 示例值：TEXT
   */
  @SerializedName("type")
  private String type;
  /**
   * 自定义字段ID
   * <p> 示例值：DemoId
   */
  @SerializedName("id")
  private String id;
  /**
   * 自定义字段取值
   * <p> 示例值：
   */
  @SerializedName("value")
  private UserCustomAttrValue value;

  // builder 开始
  public UserCustomAttr() {
  }

  public UserCustomAttr(Builder builder) {
    /**
     * 自定义字段类型   ;- `TEXT`：文本;- `HREF`：网页;- `ENUMERATION`：枚举;- `PICTURE_ENUM`：图片;- `GENERIC_USER`：用户;;具体说明参见常见问题的[用户接口相关问题](https://open.feishu.cn/document/ugTN1YjL4UTN24CO1UjN/uQzN1YjL0cTN24CN3UjN#77061525)
     * <p> 示例值：TEXT
     */
    this.type = builder.type;
    /**
     * 自定义字段ID
     * <p> 示例值：DemoId
     */
    this.id = builder.id;
    /**
     * 自定义字段取值
     * <p> 示例值：
     */
    this.value = builder.value;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserCustomAttrValue getValue() {
    return this.value;
  }

  public void setValue(UserCustomAttrValue value) {
    this.value = value;
  }

  public static class Builder {

    /**
     * 自定义字段类型   ;- `TEXT`：文本;- `HREF`：网页;- `ENUMERATION`：枚举;- `PICTURE_ENUM`：图片;-
     * `GENERIC_USER`：用户;;具体说明参见常见问题的[用户接口相关问题](https://open.feishu.cn/document/ugTN1YjL4UTN24CO1UjN/uQzN1YjL0cTN24CN3UjN#77061525)
     * <p> 示例值：TEXT
     */
    private String type;
    /**
     * 自定义字段ID
     * <p> 示例值：DemoId
     */
    private String id;
    /**
     * 自定义字段取值
     * <p> 示例值：
     */
    private UserCustomAttrValue value;

    /**
     * 自定义字段类型   ;- `TEXT`：文本;- `HREF`：网页;- `ENUMERATION`：枚举;- `PICTURE_ENUM`：图片;-
     * `GENERIC_USER`：用户;;具体说明参见常见问题的[用户接口相关问题](https://open.feishu.cn/document/ugTN1YjL4UTN24CO1UjN/uQzN1YjL0cTN24CN3UjN#77061525)
     * <p> 示例值：TEXT
     *
     * @param type
     * @return
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }


    /**
     * 自定义字段ID
     * <p> 示例值：DemoId
     *
     * @param id
     * @return
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }


    /**
     * 自定义字段取值
     * <p> 示例值：
     *
     * @param value
     * @return
     */
    public Builder value(UserCustomAttrValue value) {
      this.value = value;
      return this;
    }


    public UserCustomAttr build() {
      return new UserCustomAttr(this);
    }
  }
}
