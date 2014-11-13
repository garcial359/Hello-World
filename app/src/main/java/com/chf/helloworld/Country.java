package com.chf.helloworld;

/**
 * Created by Lucas on 11/6/2014.
 */
public class Country {

    public String name;
    public int flagResId;

    public Country(String name, int flagResId) {
        this.name = name;
        this.flagResId = flagResId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlagResId() {
        return flagResId;
    }

    public void setFlagResId(int flagResId) {
        this.flagResId = flagResId;
    }

}
