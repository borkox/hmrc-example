package com.example.ws;

import com.example.ws.models.*;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.jws.WebService;

import java.util.Collection;
import java.util.Collections;

import static com.example.ws.models.QuotationHolder.quotations;

@Endpoint
public class QuotationService {

    @PayloadRoot(namespace = "http://spring.io/guides/gs-producing-web-service", localPart = "addQuotationRequest")
    public @ResponsePayload AddQuotationResponse addQuotation(@RequestPayload  AddQuotationRequest addQuotationRequest) throws Exception {
        if (quotations.contains(addQuotationRequest.getQuotation())) {
            throw new Exception("Quotation "+addQuotationRequest.getQuotation().getReference()+" exists");
        }
        return new AddQuotationResponse(quotations.add(addQuotationRequest.getQuotation()));
    }

    @PayloadRoot(namespace = "http://spring.io/guides/gs-producing-web-service", localPart = "getQuotationsRequest")
    public @ResponsePayload
    GetQuotationsResponse getAllQuotations(@RequestPayload GetQuotationsRequest request) {
        return new GetQuotationsResponse(Collections.unmodifiableCollection(quotations));
    }
}
