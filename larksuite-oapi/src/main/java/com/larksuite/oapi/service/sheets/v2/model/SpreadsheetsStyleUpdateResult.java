// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.sheets.v2.model;
import com.google.gson.annotations.SerializedName;

public class SpreadsheetsStyleUpdateResult {
    @SerializedName("spreadsheetToken")
    private String spreadsheetToken;
    @SerializedName("updatedRange")
    private String updatedRange;
    @SerializedName("updatedRows")
    private Integer updatedRows;
    @SerializedName("updatedColumns")
    private Integer updatedColumns;
    @SerializedName("updatedCells")
    private Integer updatedCells;
    @SerializedName("revision")
    private Integer revision;

    public String getSpreadsheetToken() {
        return this.spreadsheetToken;
    }

    public void setSpreadsheetToken(String spreadsheetToken) {
        this.spreadsheetToken = spreadsheetToken;
    }

    public String getUpdatedRange() {
        return this.updatedRange;
    }

    public void setUpdatedRange(String updatedRange) {
        this.updatedRange = updatedRange;
    }

    public Integer getUpdatedRows() {
        return this.updatedRows;
    }

    public void setUpdatedRows(Integer updatedRows) {
        this.updatedRows = updatedRows;
    }

    public Integer getUpdatedColumns() {
        return this.updatedColumns;
    }

    public void setUpdatedColumns(Integer updatedColumns) {
        this.updatedColumns = updatedColumns;
    }

    public Integer getUpdatedCells() {
        return this.updatedCells;
    }

    public void setUpdatedCells(Integer updatedCells) {
        this.updatedCells = updatedCells;
    }

    public Integer getRevision() {
        return this.revision;
    }

    public void setRevision(Integer revision) {
        this.revision = revision;
    }

}