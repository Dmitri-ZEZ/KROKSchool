package com.company.documents;

import com.company.documents.Document;
import com.company.documents.products.ProductsDocument;
import com.company.documents.productsInStock.ProductsInStockDocument;
import com.company.documents.sales.SalesDocument;
import com.company.documents.sellers.SellersDocument;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;


public class DocumentFactory {
    public static Document getDocument(TypeDocument typeDocument, String path) throws IOException {
        String xml = getXml(path);
        XmlMapper xmlMapper = new XmlMapper();
        switch (typeDocument) {
            case Products:
                return xmlMapper.readValue(xml, ProductsDocument.class);
            case Sellers:
                return xmlMapper.readValue(xml, SellersDocument.class);
            case ProductsInStock:
                return xmlMapper.readValue(xml, ProductsInStockDocument.class);
            case Sales:
                return xmlMapper.readValue(xml, SalesDocument.class);
            default:
                throw new IllegalArgumentException("Задан неверный тип документа");
        }
    }

    public static ProductsDocument getProductsDocument(String path) throws IOException{
        String xml = getXml(path);
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(xml, ProductsDocument.class);
    }
    public static SellersDocument getSellersDocument(String path) throws IOException{
        String xml = getXml(path);
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(xml, SellersDocument.class);
    }
    public static ProductsInStockDocument getProductsInStockDocument(String path) throws IOException{
        String xml = getXml(path);
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(xml, ProductsInStockDocument.class);
    }
    public static SalesDocument getSalesDocument(String path) throws IOException{
        String xml = getXml(path);
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(xml, SalesDocument.class);
    }


    public static String getXml(String path) throws IOException {
        File file = new File(path);
        String xml = inputStreamToString(new FileInputStream(file));
        return xml;
    }


    public static String inputStreamToString (InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }
}
