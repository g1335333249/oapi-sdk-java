// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.search.v2.model;
import com.google.gson.annotations.SerializedName;

public class DataSourcePatchReqBody {
    @SerializedName("name")
    private String name;
    @SerializedName("state")
    private Integer state;
    @SerializedName("description")
    private String description;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getState() {
        return this.state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
