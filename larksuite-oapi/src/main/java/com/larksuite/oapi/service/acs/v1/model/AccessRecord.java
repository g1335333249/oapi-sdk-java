// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.acs.v1.model;
import com.google.gson.annotations.SerializedName;

public class AccessRecord {
    @SerializedName("access_record_id")
    private Long accessRecordId;
    @SerializedName("user_id")
    private String userId;
    @SerializedName("device_id")
    private Long deviceId;
    @SerializedName("is_clock_in")
    private Boolean isClockIn;
    @SerializedName("access_time")
    private Long accessTime;
    @SerializedName("access_type")
    private String accessType;
    @SerializedName("access_data")
    private String accessData;
    @SerializedName("is_door_open")
    private Boolean isDoorOpen;

    public Long getAccessRecordId() {
        return this.accessRecordId;
    }

    public void setAccessRecordId(Long accessRecordId) {
        this.accessRecordId = accessRecordId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public Boolean getIsClockIn() {
        return this.isClockIn;
    }

    public void setIsClockIn(Boolean isClockIn) {
        this.isClockIn = isClockIn;
    }

    public Long getAccessTime() {
        return this.accessTime;
    }

    public void setAccessTime(Long accessTime) {
        this.accessTime = accessTime;
    }

    public String getAccessType() {
        return this.accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    public String getAccessData() {
        return this.accessData;
    }

    public void setAccessData(String accessData) {
        this.accessData = accessData;
    }

    public Boolean getIsDoorOpen() {
        return this.isDoorOpen;
    }

    public void setIsDoorOpen(Boolean isDoorOpen) {
        this.isDoorOpen = isDoorOpen;
    }

}
