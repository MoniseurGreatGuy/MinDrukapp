package com.example.sebastian.mindrukapp;

/**
 * Created by Sebastian on 14-Mar-17.
 */

public class Alkoholiker {
    private String name;
    private int genstande;
    private int sips;

    public Alkoholiker(String name) {
        this.name = name;
    }

    public void drik(int sip){
        if((sips+sip) >= 10)
        {
            genstande++;
            sips = (sips + sips) - 10;
        }
        else {
            sips = sips + sip;
        }
    }

    public int getGenstande() {
        return genstande;
    }

    public String getName() {
        return name;
    }
}
