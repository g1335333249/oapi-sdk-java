// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;
import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.event.model.BaseEventV2;

public class UserGroupDeletedEvent extends BaseEventV2{
    @SerializedName("event")
    private UserGroupDeletedEventData event;

    public UserGroupDeletedEventData getEvent() {
        return this.event;
    }

    public void setEvent(UserGroupDeletedEventData event) {
        this.event = event;
    }

}