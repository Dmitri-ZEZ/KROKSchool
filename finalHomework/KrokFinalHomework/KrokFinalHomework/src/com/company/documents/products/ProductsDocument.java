package com.company.documents.products;

import com.company.documents.Document;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;


import java.io.*;
import java.util.ArrayList;

public class ProductsDocument  implements Document {
    @Override
    public void printDocument() {
        System.out.println(product);
    }

    @JacksonXmlElementWrapper(useWrapping = false)
    private ArrayList<Product> product = new ArrayList<>();

    public ArrayList<Product> getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return  "" + product;
    }
/*
    public static ProductsDocument of(String path) throws IOException{
        File file = new File(path);
        XmlMapper xmlMapper = new XmlMapper();
        String xml = inputStreamToString(new FileInputStream(file));
        return xmlMapper.readValue(xml, ProductsDocument.class);
    }

    public static String inputStreamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }
    */

}