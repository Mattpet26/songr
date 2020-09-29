package com.petersen.songr;

public class Capitalize {
    String str;

    public Capitalize(String str) {
        this.str = str.toUpperCase();
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
