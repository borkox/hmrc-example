package com.example.ws.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://spring.io/guides/gs-producing-web-service", name = "addQuotationRequest")
public class AddQuotationRequest {
    private Quotation quotation;

    public Quotation getQuotation() {
        return quotation;
    }

    public void setQuotation(Quotation quotation) {
        this.quotation = quotation;
    }
}
