// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.task.v1.model;
import com.google.gson.annotations.SerializedName;

public class Reminder {
    @SerializedName("id")
    private Long id;
    @SerializedName("relative_fire_minute")
    private Integer relativeFireMinute;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRelativeFireMinute() {
        return this.relativeFireMinute;
    }

    public void setRelativeFireMinute(Integer relativeFireMinute) {
        this.relativeFireMinute = relativeFireMinute;
    }

}
