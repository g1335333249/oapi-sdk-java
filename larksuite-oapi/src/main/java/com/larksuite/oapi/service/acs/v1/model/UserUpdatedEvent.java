// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.acs.v1.model;
import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.event.model.BaseEventV2;

public class UserUpdatedEvent extends BaseEventV2{
    @SerializedName("event")
    private UserUpdatedEventData event;

    public UserUpdatedEventData getEvent() {
        return this.event;
    }

    public void setEvent(UserUpdatedEventData event) {
        this.event = event;
    }

}
