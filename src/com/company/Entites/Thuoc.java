package com.company.Entites;

public class Thuoc {
    private int mathuoc;
    private String tenthuoc;
    private String lopthuoc;
    private String donvi;
    private String thanhphan;
    private String ghichu;

    @Override
    public String toString(){
        return mathuoc+"#"+tenthuoc+"#"+lopthuoc+"#"+donvi+"#"+thanhphan+"#"+ghichu;
    }
    public int getMathuoc() {
        return mathuoc;
    }

    public void setMathuoc(int mathuoc) {
        this.mathuoc = mathuoc;
    }

    public String getTenthuoc() {
        return tenthuoc;
    }

    public void setTenthuoc(String tenthuoc) {
        this.tenthuoc = tenthuoc;
    }

    public String getLopthuoc() {
        return lopthuoc;
    }

    public void setLopthuoc(String lopthuoc) {
        this.lopthuoc = lopthuoc;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public String getThanhphan() {
        return thanhphan;
    }

    public void setThanhphan(String thanhphan) {
        this.thanhphan = thanhphan;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public Thuoc(int mathuoc, String tenthuoc, String lopthuoc, String donvi, String thanhphan, String ghichu) {
        this.mathuoc = mathuoc;
        this.tenthuoc = tenthuoc;
        this.lopthuoc = lopthuoc;
        this.donvi = donvi;
        this.thanhphan = thanhphan;
        this.ghichu = ghichu;
    }
}
