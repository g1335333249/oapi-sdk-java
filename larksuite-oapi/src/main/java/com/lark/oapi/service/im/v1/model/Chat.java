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

package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class Chat {

  @SerializedName("chat_id")
  private String chatId;
  @SerializedName("avatar")
  private String avatar;
  @SerializedName("name")
  private String name;
  @SerializedName("description")
  private String description;
  @SerializedName("i18n_names")
  private I18nNames i18nNames;
  @SerializedName("only_owner_add")
  private Boolean onlyOwnerAdd;
  @SerializedName("share_allowed")
  private Boolean shareAllowed;
  @SerializedName("only_owner_at_all")
  private Boolean onlyOwnerAtAll;
  @SerializedName("only_owner_edit")
  private Boolean onlyOwnerEdit;
  @SerializedName("owner_user_id")
  private String ownerUserId;
  @SerializedName("type")
  private String type;

  // builder 开始
  public Chat() {
  }

  public Chat(Builder builder) {
    this.chatId = builder.chatId;
    this.avatar = builder.avatar;
    this.name = builder.name;
    this.description = builder.description;
    this.i18nNames = builder.i18nNames;
    this.onlyOwnerAdd = builder.onlyOwnerAdd;
    this.shareAllowed = builder.shareAllowed;
    this.onlyOwnerAtAll = builder.onlyOwnerAtAll;
    this.onlyOwnerEdit = builder.onlyOwnerEdit;
    this.ownerUserId = builder.ownerUserId;
    this.type = builder.type;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getChatId() {
    return this.chatId;
  }

  public void setChatId(String chatId) {
    this.chatId = chatId;
  }

  public String getAvatar() {
    return this.avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
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

  public I18nNames getI18nNames() {
    return this.i18nNames;
  }

  public void setI18nNames(I18nNames i18nNames) {
    this.i18nNames = i18nNames;
  }

  public Boolean getOnlyOwnerAdd() {
    return this.onlyOwnerAdd;
  }

  public void setOnlyOwnerAdd(Boolean onlyOwnerAdd) {
    this.onlyOwnerAdd = onlyOwnerAdd;
  }

  public Boolean getShareAllowed() {
    return this.shareAllowed;
  }

  public void setShareAllowed(Boolean shareAllowed) {
    this.shareAllowed = shareAllowed;
  }

  public Boolean getOnlyOwnerAtAll() {
    return this.onlyOwnerAtAll;
  }

  public void setOnlyOwnerAtAll(Boolean onlyOwnerAtAll) {
    this.onlyOwnerAtAll = onlyOwnerAtAll;
  }

  public Boolean getOnlyOwnerEdit() {
    return this.onlyOwnerEdit;
  }

  public void setOnlyOwnerEdit(Boolean onlyOwnerEdit) {
    this.onlyOwnerEdit = onlyOwnerEdit;
  }

  public String getOwnerUserId() {
    return this.ownerUserId;
  }

  public void setOwnerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public static class Builder {

    private String chatId;
    private String avatar;
    private String name;
    private String description;
    private I18nNames i18nNames;
    private Boolean onlyOwnerAdd;
    private Boolean shareAllowed;
    private Boolean onlyOwnerAtAll;
    private Boolean onlyOwnerEdit;
    private String ownerUserId;
    private String type;

    public Builder chatId(String chatId) {
      this.chatId = chatId;
      return this;
    }

    public Builder avatar(String avatar) {
      this.avatar = avatar;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder description(String description) {
      this.description = description;
      return this;
    }

    public Builder i18nNames(I18nNames i18nNames) {
      this.i18nNames = i18nNames;
      return this;
    }

    public Builder onlyOwnerAdd(Boolean onlyOwnerAdd) {
      this.onlyOwnerAdd = onlyOwnerAdd;
      return this;
    }

    public Builder shareAllowed(Boolean shareAllowed) {
      this.shareAllowed = shareAllowed;
      return this;
    }

    public Builder onlyOwnerAtAll(Boolean onlyOwnerAtAll) {
      this.onlyOwnerAtAll = onlyOwnerAtAll;
      return this;
    }

    public Builder onlyOwnerEdit(Boolean onlyOwnerEdit) {
      this.onlyOwnerEdit = onlyOwnerEdit;
      return this;
    }

    public Builder ownerUserId(String ownerUserId) {
      this.ownerUserId = ownerUserId;
      return this;
    }

    public Builder type(String type) {
      this.type = type;
      return this;
    }


    public Chat build() {
      return new Chat(this);
    }
  }
}