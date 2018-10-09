package com.example.ws.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AddQuotationResponse {
    private boolean added;

    public AddQuotationResponse() {
    }

    public AddQuotationResponse(boolean added) {
        this.added = added;
    }

    public boolean isAdded() {
        return added;
    }

    public void setAdded(boolean added) {
        this.added = added;
    }
}
