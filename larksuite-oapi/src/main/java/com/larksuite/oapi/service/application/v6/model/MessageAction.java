// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.application.v6.model;
import com.google.gson.annotations.SerializedName;

public class MessageAction {
    @SerializedName("pc_app_link")
    private String pcAppLink;
    @SerializedName("mobile_app_link")
    private String mobileAppLink;
    @SerializedName("i18n")
    private MessageActionI18nInfo[] i18n;

    public String getPcAppLink() {
        return this.pcAppLink;
    }

    public void setPcAppLink(String pcAppLink) {
        this.pcAppLink = pcAppLink;
    }

    public String getMobileAppLink() {
        return this.mobileAppLink;
    }

    public void setMobileAppLink(String mobileAppLink) {
        this.mobileAppLink = mobileAppLink;
    }

    public MessageActionI18nInfo[] getI18n() {
        return this.i18n;
    }

    public void setI18n(MessageActionI18nInfo[] i18n) {
        this.i18n = i18n;
    }

}
