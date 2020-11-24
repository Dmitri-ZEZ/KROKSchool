package com.company.sellers;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.ArrayList;

public class Sellers {
    @JacksonXmlElementWrapper(useWrapping = false)
    private ArrayList<Seller> seller = new ArrayList<>();

    public ArrayList<Seller> getSeller() {
        return seller;
    }
}
