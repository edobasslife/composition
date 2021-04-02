package com.timbuchalka;

public class Bed {
    private String sytle;
    private int pillows;
    private int height;
    private  int sheets;
    private int quilts;

    public Bed(String sytle, int pillows, int height, int sheets, int quilts) {
        this.sytle = sytle;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilts;
    }

    public void make(){
        System.out.println("Bed -> Making");
    }

    public String getSytle() {
        return sytle;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() {
        return quilts;
    }
}
