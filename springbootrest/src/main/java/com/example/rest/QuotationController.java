package com.example.rest;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import static com.example.rest.QuotationHolder.quotations;

@RestController
@RequestMapping("/quotations")
public class QuotationController {
    private static final Logger log = LoggerFactory.getLogger(QuotationController.class);


    @PostMapping("/add")
    public OperationResponse addQuotation(@RequestBody Quotation quotation) throws Exception {
        log.info("Invoke addQuotation : {}", quotation);
        if (quotations.contains(quotation)) {
            log.error("This reference already exists:{}", quotation.getReference());
            throw new Exception("Quotation " + quotation.getReference()+" exists");
        }
        return new OperationResponse(quotations.add(quotation));
    }

    @GetMapping("/all")
    public List<Quotation> getAllQuotations() {
        log.info("Invoke getAllQuotations returning {} quotations", quotations.size());

        return new ArrayList<>(quotations);
    }

    @DeleteMapping("/removeAll")
    public OperationResponse deleteAllQuotations() {
        log.info("Invoke deleteAllQuotations");
        quotations.clear();
        return new OperationResponse(true);
    }
}
