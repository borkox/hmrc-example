package com.example.ws.models;

import java.util.Objects;


public class Quotation {
    private String reference;
    private String details;
    private float cost;
    private String currency;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quotation quotation = (Quotation) o;
        return Objects.equals(reference, quotation.reference);
    }

    @Override
    public int hashCode() {

        return Objects.hash(reference);
    }
}
