// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.suite.v1.model;
import com.google.gson.annotations.SerializedName;

public class DocsApiMetaResult {
    @SerializedName("docs_metas")
    private DocsMeta[] docsMetas;

    public DocsMeta[] getDocsMetas() {
        return this.docsMetas;
    }

    public void setDocsMetas(DocsMeta[] docsMetas) {
        this.docsMetas = docsMetas;
    }

}