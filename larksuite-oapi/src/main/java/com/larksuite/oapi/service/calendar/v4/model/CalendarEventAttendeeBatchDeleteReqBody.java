// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.calendar.v4.model;
import com.google.gson.annotations.SerializedName;

public class CalendarEventAttendeeBatchDeleteReqBody {
    @SerializedName("attendee_ids")
    private String[] attendeeIds;

    public String[] getAttendeeIds() {
        return this.attendeeIds;
    }

    public void setAttendeeIds(String[] attendeeIds) {
        this.attendeeIds = attendeeIds;
    }

}