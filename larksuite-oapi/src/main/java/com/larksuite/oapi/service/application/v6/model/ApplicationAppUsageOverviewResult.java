// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.application.v6.model;
import com.google.gson.annotations.SerializedName;

public class ApplicationAppUsageOverviewResult {
    @SerializedName("items")
    private ApplicationAppUsage[] items;

    public ApplicationAppUsage[] getItems() {
        return this.items;
    }

    public void setItems(ApplicationAppUsage[] items) {
        this.items = items;
    }

}
