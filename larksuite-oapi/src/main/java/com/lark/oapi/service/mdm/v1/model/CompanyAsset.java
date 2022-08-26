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

package com.lark.oapi.service.mdm.v1.model;

import com.google.gson.annotations.SerializedName;

public class CompanyAsset {

  /**
   * 资产唯一ID
   * <p> 示例值：U1404709301842354176
   */
  @SerializedName("asset_uid")
  private String assetUid;
  /**
   * 资产子编码
   * <p> 示例值：0
   */
  @SerializedName("asset_sub_no")
  private String assetSubNo;
  /**
   * 资产类型编码
   * <p> 示例值：1000
   */
  @SerializedName("asset_type")
  private String assetType;
  /**
   * 资产类型描述
   * <p> 示例值：设计软件
   */
  @SerializedName("asset_type_name")
  private String assetTypeName;
  /**
   * 资产描述
   * <p> 示例值：设计类软件AutoCAD
   */
  @SerializedName("asset_name")
  private String assetName;
  /**
   * 资产数量
   * <p> 示例值：40
   */
  @SerializedName("quantity")
  private Integer quantity;
  /**
   * 资产计量单位
   * <p> 示例值：Suit
   */
  @SerializedName("unit")
  private String unit;
  /**
   * 资产所属公司的唯一ID
   * <p> 示例值：U1404700168376295424
   */
  @SerializedName("company_uid")
  private String companyUid;
  /**
   * 资产类型英文描述
   * <p> 示例值：Fixed assets
   */
  @SerializedName("asset_type_name_en")
  private String assetTypeNameEn;
  /**
   * 资产编码
   * <p> 示例值：100010010001
   */
  @SerializedName("asset_no")
  private String assetNo;

  // builder 开始
  public CompanyAsset() {
  }

  public CompanyAsset(Builder builder) {
    /**
     * 资产唯一ID
     * <p> 示例值：U1404709301842354176
     */
    this.assetUid = builder.assetUid;
    /**
     * 资产子编码
     * <p> 示例值：0
     */
    this.assetSubNo = builder.assetSubNo;
    /**
     * 资产类型编码
     * <p> 示例值：1000
     */
    this.assetType = builder.assetType;
    /**
     * 资产类型描述
     * <p> 示例值：设计软件
     */
    this.assetTypeName = builder.assetTypeName;
    /**
     * 资产描述
     * <p> 示例值：设计类软件AutoCAD
     */
    this.assetName = builder.assetName;
    /**
     * 资产数量
     * <p> 示例值：40
     */
    this.quantity = builder.quantity;
    /**
     * 资产计量单位
     * <p> 示例值：Suit
     */
    this.unit = builder.unit;
    /**
     * 资产所属公司的唯一ID
     * <p> 示例值：U1404700168376295424
     */
    this.companyUid = builder.companyUid;
    /**
     * 资产类型英文描述
     * <p> 示例值：Fixed assets
     */
    this.assetTypeNameEn = builder.assetTypeNameEn;
    /**
     * 资产编码
     * <p> 示例值：100010010001
     */
    this.assetNo = builder.assetNo;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getAssetUid() {
    return this.assetUid;
  }

  public void setAssetUid(String assetUid) {
    this.assetUid = assetUid;
  }

  public String getAssetSubNo() {
    return this.assetSubNo;
  }

  public void setAssetSubNo(String assetSubNo) {
    this.assetSubNo = assetSubNo;
  }

  public String getAssetType() {
    return this.assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  public String getAssetTypeName() {
    return this.assetTypeName;
  }

  public void setAssetTypeName(String assetTypeName) {
    this.assetTypeName = assetTypeName;
  }

  public String getAssetName() {
    return this.assetName;
  }

  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }

  public Integer getQuantity() {
    return this.quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public String getUnit() {
    return this.unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public String getCompanyUid() {
    return this.companyUid;
  }

  public void setCompanyUid(String companyUid) {
    this.companyUid = companyUid;
  }

  public String getAssetTypeNameEn() {
    return this.assetTypeNameEn;
  }

  public void setAssetTypeNameEn(String assetTypeNameEn) {
    this.assetTypeNameEn = assetTypeNameEn;
  }

  public String getAssetNo() {
    return this.assetNo;
  }

  public void setAssetNo(String assetNo) {
    this.assetNo = assetNo;
  }

  public static class Builder {

    /**
     * 资产唯一ID
     * <p> 示例值：U1404709301842354176
     */
    private String assetUid;
    /**
     * 资产子编码
     * <p> 示例值：0
     */
    private String assetSubNo;
    /**
     * 资产类型编码
     * <p> 示例值：1000
     */
    private String assetType;
    /**
     * 资产类型描述
     * <p> 示例值：设计软件
     */
    private String assetTypeName;
    /**
     * 资产描述
     * <p> 示例值：设计类软件AutoCAD
     */
    private String assetName;
    /**
     * 资产数量
     * <p> 示例值：40
     */
    private Integer quantity;
    /**
     * 资产计量单位
     * <p> 示例值：Suit
     */
    private String unit;
    /**
     * 资产所属公司的唯一ID
     * <p> 示例值：U1404700168376295424
     */
    private String companyUid;
    /**
     * 资产类型英文描述
     * <p> 示例值：Fixed assets
     */
    private String assetTypeNameEn;
    /**
     * 资产编码
     * <p> 示例值：100010010001
     */
    private String assetNo;

    /**
     * 资产唯一ID
     * <p> 示例值：U1404709301842354176
     *
     * @param assetUid
     * @return
     */
    public Builder assetUid(String assetUid) {
      this.assetUid = assetUid;
      return this;
    }


    /**
     * 资产子编码
     * <p> 示例值：0
     *
     * @param assetSubNo
     * @return
     */
    public Builder assetSubNo(String assetSubNo) {
      this.assetSubNo = assetSubNo;
      return this;
    }


    /**
     * 资产类型编码
     * <p> 示例值：1000
     *
     * @param assetType
     * @return
     */
    public Builder assetType(String assetType) {
      this.assetType = assetType;
      return this;
    }


    /**
     * 资产类型描述
     * <p> 示例值：设计软件
     *
     * @param assetTypeName
     * @return
     */
    public Builder assetTypeName(String assetTypeName) {
      this.assetTypeName = assetTypeName;
      return this;
    }


    /**
     * 资产描述
     * <p> 示例值：设计类软件AutoCAD
     *
     * @param assetName
     * @return
     */
    public Builder assetName(String assetName) {
      this.assetName = assetName;
      return this;
    }


    /**
     * 资产数量
     * <p> 示例值：40
     *
     * @param quantity
     * @return
     */
    public Builder quantity(Integer quantity) {
      this.quantity = quantity;
      return this;
    }


    /**
     * 资产计量单位
     * <p> 示例值：Suit
     *
     * @param unit
     * @return
     */
    public Builder unit(String unit) {
      this.unit = unit;
      return this;
    }


    /**
     * 资产所属公司的唯一ID
     * <p> 示例值：U1404700168376295424
     *
     * @param companyUid
     * @return
     */
    public Builder companyUid(String companyUid) {
      this.companyUid = companyUid;
      return this;
    }


    /**
     * 资产类型英文描述
     * <p> 示例值：Fixed assets
     *
     * @param assetTypeNameEn
     * @return
     */
    public Builder assetTypeNameEn(String assetTypeNameEn) {
      this.assetTypeNameEn = assetTypeNameEn;
      return this;
    }


    /**
     * 资产编码
     * <p> 示例值：100010010001
     *
     * @param assetNo
     * @return
     */
    public Builder assetNo(String assetNo) {
      this.assetNo = assetNo;
      return this;
    }


    public CompanyAsset build() {
      return new CompanyAsset(this);
    }
  }
}