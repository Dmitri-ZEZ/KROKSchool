package com.company;

import com.company.sales.Sales;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;


public class Main {

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

    public static void main(String[] args) throws IOException {
        File file = new File("XmlInput/Sales.xml");
        XmlMapper xmlMapper = new XmlMapper();
        String xml = inputStreamToString(new FileInputStream(file));

        Sales sales = xmlMapper.readValue(xml,Sales.class);

        System.out.println(sales.getSale().get(0));
        System.out.println(sales.getSale().get(1));
    }


}
