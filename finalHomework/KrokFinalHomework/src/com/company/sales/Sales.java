package com.company.sales;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.ArrayList;

public class Sales {
    @JacksonXmlElementWrapper(useWrapping = false)
    private ArrayList<Sale> sale = new ArrayList<>();

    public ArrayList<Sale> getSale() {
        return sale;
    }
}
