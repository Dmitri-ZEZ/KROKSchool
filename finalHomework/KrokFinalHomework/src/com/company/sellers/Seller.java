package com.company.sellers;

public class Seller {
    private int idSeller;
    private String surnameSeller;
    private String nameSeller;

    public int getIdSeller() {
        return idSeller;
    }

    public String getNameSeller() {
        return nameSeller;
    }

    public String getSurnameSeller() {
        return surnameSeller;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "idSeller=" + idSeller +
                ", surnameSeller='" + surnameSeller + '\'' +
                ", nameSeller='" + nameSeller + '\'' +
                '}';
    }
}
