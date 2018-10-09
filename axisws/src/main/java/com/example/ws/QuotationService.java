package com.example.ws;

import com.example.ws.models.Quotation;

import javax.jws.WebService;

import java.util.Collection;
import java.util.Collections;

import static com.example.ws.models.QuotationHolder.quotations;

@WebService
public class QuotationService {

    public boolean addQuotation(Quotation quotation) throws Exception {
        if (quotations.contains(quotation)) {
            throw new Exception("Quotation "+quotation.getReference()+" exists");
        }
        return quotations.add(quotation);
    }

    public Collection<Quotation> getAllQuotations() {
        return Collections.unmodifiableCollection(quotations);
    }
}
