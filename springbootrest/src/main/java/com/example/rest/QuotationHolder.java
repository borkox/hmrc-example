package com.example.rest;

import java.util.*;

public class QuotationHolder {
    static Set<Quotation> quotations = Collections.synchronizedSet(new HashSet<>());
}
