package com.example.rest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;

import static com.example.rest.QuotationHolder.quotations;

@RestController
@RequestMapping("/quotations")
public class QuotationController {


    @PostMapping("/add")
    public AddQuotationResponse addQuotation(@RequestBody Quotation quotation) throws Exception {
        if (quotations.contains(quotation)) {
            throw new Exception("Quotation " + quotation.getReference()+" exists");
        }
        return new AddQuotationResponse(quotations.add(quotation));
    }

    @GetMapping("/all")
    public List<Quotation> getAllQuotations() {
        return new ArrayList<>(quotations);
    }
}
