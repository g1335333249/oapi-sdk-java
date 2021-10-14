// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;
import com.google.gson.annotations.SerializedName;

public class UserCustomAttrValue {
    @SerializedName("text")
    private String text;
    @SerializedName("url")
    private String url;
    @SerializedName("pc_url")
    private String pcUrl;
    @SerializedName("option_id")
    private String optionId;
    @SerializedName("option_value")
    private String optionValue;
    @SerializedName("name")
    private String name;
    @SerializedName("picture_url")
    private String pictureUrl;
    @SerializedName("generic_user")
    private CustomAttrGenericUser genericUser;

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPcUrl() {
        return this.pcUrl;
    }

    public void setPcUrl(String pcUrl) {
        this.pcUrl = pcUrl;
    }

    public String getOptionId() {
        return this.optionId;
    }

    public void setOptionId(String optionId) {
        this.optionId = optionId;
    }

    public String getOptionValue() {
        return this.optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPictureUrl() {
        return this.pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public CustomAttrGenericUser getGenericUser() {
        return this.genericUser;
    }

    public void setGenericUser(CustomAttrGenericUser genericUser) {
        this.genericUser = genericUser;
    }

}
