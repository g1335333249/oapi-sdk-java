// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;
import com.google.gson.annotations.SerializedName;

public class UserCreatedEventData {
    @SerializedName("object")
    private UserEvent object;

    public UserEvent getObject() {
        return this.object;
    }

    public void setObject(UserEvent object) {
        this.object = object;
    }

}