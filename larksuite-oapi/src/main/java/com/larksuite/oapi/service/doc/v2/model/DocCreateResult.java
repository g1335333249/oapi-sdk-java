// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.doc.v2.model;
import com.google.gson.annotations.SerializedName;

public class DocCreateResult {
    @SerializedName("objToken")
    private String objToken;
    @SerializedName("url")
    private String url;

    public String getObjToken() {
        return this.objToken;
    }

    public void setObjToken(String objToken) {
        this.objToken = objToken;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}