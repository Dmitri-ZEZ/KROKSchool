package com.company.documents.productsInStock;


import com.company.documents.Document;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import java.util.ArrayList;

public class ProductsInStockDocument implements Document {
    @JacksonXmlElementWrapper(useWrapping = false)
    private ArrayList<ProductInStock> productInStock = new ArrayList<>();

    public ArrayList<ProductInStock> getProductInStock() {
        return productInStock;
    }

    @Override
    public void printDocument() {
        System.out.println(productInStock);
    }

    @Override
    public String toString() {
        return ""+productInStock;
    }
}
