// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.application.v6.model;
import com.google.gson.annotations.SerializedName;

public class NavigateMeta {
    @SerializedName("version")
    private String version;
    @SerializedName("image_url")
    private String imageUrl;
    @SerializedName("hover_image_url")
    private String hoverImageUrl;

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getHoverImageUrl() {
        return this.hoverImageUrl;
    }

    public void setHoverImageUrl(String hoverImageUrl) {
        this.hoverImageUrl = hoverImageUrl;
    }

}
