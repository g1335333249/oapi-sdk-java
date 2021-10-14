// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.im.v1.model;
import com.google.gson.annotations.SerializedName;

public class MessageReaction {
    @SerializedName("reaction_id")
    private String reactionId;
    @SerializedName("operator")
    private Operator operator;
    @SerializedName("action_time")
    private Long actionTime;
    @SerializedName("reaction_type")
    private Emoji reactionType;

    public String getReactionId() {
        return this.reactionId;
    }

    public void setReactionId(String reactionId) {
        this.reactionId = reactionId;
    }

    public Operator getOperator() {
        return this.operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Long getActionTime() {
        return this.actionTime;
    }

    public void setActionTime(Long actionTime) {
        this.actionTime = actionTime;
    }

    public Emoji getReactionType() {
        return this.reactionType;
    }

    public void setReactionType(Emoji reactionType) {
        this.reactionType = reactionType;
    }

}
