package com.company.productsInStock;


import com.company.productsInStock.ProductInStock;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.ArrayList;

public class ProductsInStock {
    @JacksonXmlElementWrapper(useWrapping = false)
    private ArrayList<ProductInStock> productInStock = new ArrayList<>();

    public ArrayList<ProductInStock> getProductInStock() {
        return productInStock;
    }
}
