// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.application.v6.model;
import com.google.gson.annotations.SerializedName;

public class ApplicationAppUsageOverviewReqBody {
    @SerializedName("date")
    private String date;
    @SerializedName("cycle_type")
    private Integer cycleType;
    @SerializedName("department_id")
    private String departmentId;
    @SerializedName("ability")
    private String ability;

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getCycleType() {
        return this.cycleType;
    }

    public void setCycleType(Integer cycleType) {
        this.cycleType = cycleType;
    }

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getAbility() {
        return this.ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

}
