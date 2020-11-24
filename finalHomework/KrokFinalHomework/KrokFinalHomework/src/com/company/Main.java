package com.company;


import com.company.documents.Document;
import com.company.documents.DocumentFactory;
import com.company.documents.TypeDocument;
import com.company.documents.products.ProductsDocument;
import com.company.documents.productsInStock.ProductsInStockDocument;
import com.company.documents.sales.SalesDocument;
import com.company.documents.sellers.SellersDocument;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;


public class Main {


    public static void main(String[] args) throws IOException {

        ProductsDocument d1 = DocumentFactory.getProductsDocument("XmlInput/Products.xml");
        System.out.println(d1);

        SellersDocument d2 = DocumentFactory.getSellersDocument("XmlInput/Sellers.xml");
        System.out.println(d2);

        ProductsInStockDocument d3 = DocumentFactory.getProductsInStockDocument("XmlInput/ProductsInStock.xml");
        System.out.println(d3);

        Document d4 = DocumentFactory.getDocument(TypeDocument.Sales,"XmlInput/Sales.xml");
        d4.printDocument();





    }


}
