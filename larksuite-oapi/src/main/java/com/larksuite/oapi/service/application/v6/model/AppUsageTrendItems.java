// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.application.v6.model;
import com.google.gson.annotations.SerializedName;

public class AppUsageTrendItems {
    @SerializedName("id")
    private String id;
    @SerializedName("trend")
    private UsageTrendItem[] trend;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UsageTrendItem[] getTrend() {
        return this.trend;
    }

    public void setTrend(UsageTrendItem[] trend) {
        this.trend = trend;
    }

}
