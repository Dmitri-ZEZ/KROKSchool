package com.company.products;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;


import java.util.ArrayList;

public class Products {
    @JacksonXmlElementWrapper(useWrapping = false)
    private ArrayList<Product> product = new ArrayList<>();

    public ArrayList<Product> getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return  "" + product;
    }
}