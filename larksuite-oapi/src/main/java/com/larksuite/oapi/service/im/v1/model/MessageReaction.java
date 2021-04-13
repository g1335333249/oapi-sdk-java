// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.im.v1.model;
import com.google.gson.annotations.SerializedName;

public class MessageReaction {
    @SerializedName("reaction_id")
    private String reactionId;
    @SerializedName("operator_id")
    private String operatorId;
    @SerializedName("action_time")
    private String actionTime;
    @SerializedName("reaction_type")
    private Emoji reactionType;

    public String getReactionId() {
        return this.reactionId;
    }

    public void setReactionId(String reactionId) {
        this.reactionId = reactionId;
    }

    public String getOperatorId() {
        return this.operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getActionTime() {
        return this.actionTime;
    }

    public void setActionTime(String actionTime) {
        this.actionTime = actionTime;
    }

    public Emoji getReactionType() {
        return this.reactionType;
    }

    public void setReactionType(Emoji reactionType) {
        this.reactionType = reactionType;
    }

}