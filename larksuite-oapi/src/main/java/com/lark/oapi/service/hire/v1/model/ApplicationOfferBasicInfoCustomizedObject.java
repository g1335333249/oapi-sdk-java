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

public class ApplicationOfferBasicInfoCustomizedObject {

  /**
   * id
   * <p> 示例值：
   */
  @SerializedName("id")
  private String id;
  /**
   * 名字
   * <p> 示例值：
   */
  @SerializedName("name")
  private OfferSchemaName name;
  /**
   * 自定义字段类型
   * <p> 示例值：
   */
  @SerializedName("type")
  private String type;
  /**
   * 自定义字段的值
   * <p> 示例值：
   */
  @SerializedName("value")
  private String value;
  /**
   * 单选/多选自定义字段的值
   * <p> 示例值：
   */
  @SerializedName("option_value_list")
  private ApplicationOfferBasicInfoCustomizedObjectOptionValue[] optionValueList;

  // builder 开始
  public ApplicationOfferBasicInfoCustomizedObject() {
  }

  public ApplicationOfferBasicInfoCustomizedObject(Builder builder) {
    /**
     * id
     * <p> 示例值：
     */
    this.id = builder.id;
    /**
     * 名字
     * <p> 示例值：
     */
    this.name = builder.name;
    /**
     * 自定义字段类型
     * <p> 示例值：
     */
    this.type = builder.type;
    /**
     * 自定义字段的值
     * <p> 示例值：
     */
    this.value = builder.value;
    /**
     * 单选/多选自定义字段的值
     * <p> 示例值：
     */
    this.optionValueList = builder.optionValueList;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OfferSchemaName getName() {
    return this.name;
  }

  public void setName(OfferSchemaName name) {
    this.name = name;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ApplicationOfferBasicInfoCustomizedObjectOptionValue[] getOptionValueList() {
    return this.optionValueList;
  }

  public void setOptionValueList(
      ApplicationOfferBasicInfoCustomizedObjectOptionValue[] optionValueList) {
    this.optionValueList = optionValueList;
  }

  public static class Builder {

    /**
     * id
     * <p> 示例值：
     */
    private String id;
    /**
     * 名字
     * <p> 示例值：
     */
    private OfferSchemaName name;
    /**
     * 自定义字段类型
     * <p> 示例值：
     */
    private String type;
    /**
     * 自定义字段的值
     * <p> 示例值：
     */
    private String value;
    /**
     * 单选/多选自定义字段的值
     * <p> 示例值：
     */
    private ApplicationOfferBasicInfoCustomizedObjectOptionValue[] optionValueList;

    /**
     * id
     * <p> 示例值：
     *
     * @param id
     * @return
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }


    /**
     * 名字
     * <p> 示例值：
     *
     * @param name
     * @return
     */
    public Builder name(OfferSchemaName name) {
      this.name = name;
      return this;
    }


    /**
     * 自定义字段类型
     * <p> 示例值：
     *
     * @param type
     * @return
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }


    /**
     * 自定义字段的值
     * <p> 示例值：
     *
     * @param value
     * @return
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }


    /**
     * 单选/多选自定义字段的值
     * <p> 示例值：
     *
     * @param optionValueList
     * @return
     */
    public Builder optionValueList(
        ApplicationOfferBasicInfoCustomizedObjectOptionValue[] optionValueList) {
      this.optionValueList = optionValueList;
      return this;
    }


    public ApplicationOfferBasicInfoCustomizedObject build() {
      return new ApplicationOfferBasicInfoCustomizedObject(this);
    }
  }
}