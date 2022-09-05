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

public class SelectOptionResult {

  /**
   * 选项 ID
   * <p> 示例值：6950930570311993644
   */
  @SerializedName("option_id")
  private String optionId;
  /**
   * 选项中文名称
   * <p> 示例值：选项一
   */
  @SerializedName("option_name")
  private String optionName;
  /**
   * 选项英文名称
   * <p> 示例值：Option 1
   */
  @SerializedName("option_en_name")
  private String optionEnName;
  /**
   * 选项中文描述
   * <p> 示例值：测试选项描述
   */
  @SerializedName("option_desc")
  private String optionDesc;
  /**
   * 选项英文描述
   * <p> 示例值：Test Option Desc
   */
  @SerializedName("option_en_desc")
  private String optionEnDesc;
  /**
   * 是否选择
   * <p> 示例值：true
   */
  @SerializedName("is_selected")
  private Boolean isSelected;

  // builder 开始
  public SelectOptionResult() {
  }

  public SelectOptionResult(Builder builder) {
    /**
     * 选项 ID
     * <p> 示例值：6950930570311993644
     */
    this.optionId = builder.optionId;
    /**
     * 选项中文名称
     * <p> 示例值：选项一
     */
    this.optionName = builder.optionName;
    /**
     * 选项英文名称
     * <p> 示例值：Option 1
     */
    this.optionEnName = builder.optionEnName;
    /**
     * 选项中文描述
     * <p> 示例值：测试选项描述
     */
    this.optionDesc = builder.optionDesc;
    /**
     * 选项英文描述
     * <p> 示例值：Test Option Desc
     */
    this.optionEnDesc = builder.optionEnDesc;
    /**
     * 是否选择
     * <p> 示例值：true
     */
    this.isSelected = builder.isSelected;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getOptionId() {
    return this.optionId;
  }

  public void setOptionId(String optionId) {
    this.optionId = optionId;
  }

  public String getOptionName() {
    return this.optionName;
  }

  public void setOptionName(String optionName) {
    this.optionName = optionName;
  }

  public String getOptionEnName() {
    return this.optionEnName;
  }

  public void setOptionEnName(String optionEnName) {
    this.optionEnName = optionEnName;
  }

  public String getOptionDesc() {
    return this.optionDesc;
  }

  public void setOptionDesc(String optionDesc) {
    this.optionDesc = optionDesc;
  }

  public String getOptionEnDesc() {
    return this.optionEnDesc;
  }

  public void setOptionEnDesc(String optionEnDesc) {
    this.optionEnDesc = optionEnDesc;
  }

  public Boolean getIsSelected() {
    return this.isSelected;
  }

  public void setIsSelected(Boolean isSelected) {
    this.isSelected = isSelected;
  }

  public static class Builder {

    /**
     * 选项 ID
     * <p> 示例值：6950930570311993644
     */
    private String optionId;
    /**
     * 选项中文名称
     * <p> 示例值：选项一
     */
    private String optionName;
    /**
     * 选项英文名称
     * <p> 示例值：Option 1
     */
    private String optionEnName;
    /**
     * 选项中文描述
     * <p> 示例值：测试选项描述
     */
    private String optionDesc;
    /**
     * 选项英文描述
     * <p> 示例值：Test Option Desc
     */
    private String optionEnDesc;
    /**
     * 是否选择
     * <p> 示例值：true
     */
    private Boolean isSelected;

    /**
     * 选项 ID
     * <p> 示例值：6950930570311993644
     *
     * @param optionId
     * @return
     */
    public Builder optionId(String optionId) {
      this.optionId = optionId;
      return this;
    }


    /**
     * 选项中文名称
     * <p> 示例值：选项一
     *
     * @param optionName
     * @return
     */
    public Builder optionName(String optionName) {
      this.optionName = optionName;
      return this;
    }


    /**
     * 选项英文名称
     * <p> 示例值：Option 1
     *
     * @param optionEnName
     * @return
     */
    public Builder optionEnName(String optionEnName) {
      this.optionEnName = optionEnName;
      return this;
    }


    /**
     * 选项中文描述
     * <p> 示例值：测试选项描述
     *
     * @param optionDesc
     * @return
     */
    public Builder optionDesc(String optionDesc) {
      this.optionDesc = optionDesc;
      return this;
    }


    /**
     * 选项英文描述
     * <p> 示例值：Test Option Desc
     *
     * @param optionEnDesc
     * @return
     */
    public Builder optionEnDesc(String optionEnDesc) {
      this.optionEnDesc = optionEnDesc;
      return this;
    }


    /**
     * 是否选择
     * <p> 示例值：true
     *
     * @param isSelected
     * @return
     */
    public Builder isSelected(Boolean isSelected) {
      this.isSelected = isSelected;
      return this;
    }


    public SelectOptionResult build() {
      return new SelectOptionResult(this);
    }
  }
}