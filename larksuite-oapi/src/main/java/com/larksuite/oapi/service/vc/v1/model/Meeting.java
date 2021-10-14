// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.vc.v1.model;
import com.google.gson.annotations.SerializedName;

public class Meeting {
    @SerializedName("id")
    private Long id;
    @SerializedName("topic")
    private String topic;
    @SerializedName("url")
    private String url;
    @SerializedName("meeting_no")
    private String meetingNo;
    @SerializedName("create_time")
    private Long createTime;
    @SerializedName("start_time")
    private Long startTime;
    @SerializedName("end_time")
    private Long endTime;
    @SerializedName("host_user")
    private MeetingUser hostUser;
    @SerializedName("status")
    private Integer status;
    @SerializedName("participant_count")
    private Long participantCount;
    @SerializedName("participant_count_accumulated")
    private Long participantCountAccumulated;
    @SerializedName("participants")
    private MeetingParticipant[] participants;
    @SerializedName("ability")
    private MeetingAbility ability;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopic() {
        return this.topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMeetingNo() {
        return this.meetingNo;
    }

    public void setMeetingNo(String meetingNo) {
        this.meetingNo = meetingNo;
    }

    public Long getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public MeetingUser getHostUser() {
        return this.hostUser;
    }

    public void setHostUser(MeetingUser hostUser) {
        this.hostUser = hostUser;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getParticipantCount() {
        return this.participantCount;
    }

    public void setParticipantCount(Long participantCount) {
        this.participantCount = participantCount;
    }

    public Long getParticipantCountAccumulated() {
        return this.participantCountAccumulated;
    }

    public void setParticipantCountAccumulated(Long participantCountAccumulated) {
        this.participantCountAccumulated = participantCountAccumulated;
    }

    public MeetingParticipant[] getParticipants() {
        return this.participants;
    }

    public void setParticipants(MeetingParticipant[] participants) {
        this.participants = participants;
    }

    public MeetingAbility getAbility() {
        return this.ability;
    }

    public void setAbility(MeetingAbility ability) {
        this.ability = ability;
    }

}
