package com.recipe.recipe.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HeaderDTO {

    @JsonProperty("field")
    private String field;

    @JsonProperty("headerName")
    private String headerName;

    @JsonProperty("hide")
    private boolean hide;

    // Getters and Setters

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getHeaderName() {
        return headerName;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    public boolean isHide() {
        return hide;
    }

    public void setHide(boolean hide) {
        this.hide = hide;
    }
}
