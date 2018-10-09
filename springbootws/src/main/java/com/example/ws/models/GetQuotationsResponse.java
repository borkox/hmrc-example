package com.example.ws.models;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collection;
import java.util.Collections;

@XmlRootElement
public class GetQuotationsResponse {
    private Collection<Quotation> quotations;

    public GetQuotationsResponse(Collection<Quotation> quotations) {
        this.quotations = quotations;
    }

    public GetQuotationsResponse() {
    }

    public Collection<Quotation> getQuotations() {
        return quotations;
    }

    public void setQuotations(Collection<Quotation> quotations) {
        this.quotations = quotations;
    }
}
