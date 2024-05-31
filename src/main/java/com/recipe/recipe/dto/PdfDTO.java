package com.recipe.recipe.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PdfDTO {

    @JsonProperty("title")
    private String title;

    @JsonProperty("headers")
    private List<HeaderDTO> headers;

    @JsonProperty("body")
    private List<BodyDTO> body;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<HeaderDTO> getHeaders() {
        return headers;
    }

    public void setHeaders(List<HeaderDTO> headers) {
        this.headers = headers;
    }

    public List<BodyDTO> getBody() {
        return body;
    }

    public void setBody(List<BodyDTO> body) {
        this.body = body;
    }
}
