package com.company.products;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Product
{
    @JacksonXmlProperty(isAttribute = true)
    private int idProduct;
    @JacksonXmlProperty(isAttribute = true)
    private String nameProduct;


    public int  getIdProduct() {
        return idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    @Override
    public String toString() {
        return "ID: " + idProduct + " | Name: " + nameProduct;
    }
}