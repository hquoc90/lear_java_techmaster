package com.techmaster;

import java.util.Objects;

public class Store {
    private String maSp;
    private String tenSp;
    private String moTa;
    private int soLuong;
    private double giaBan;
    private String loaiSp;

    public Store() {
    }

    public Store(String maSp) {
        this.maSp = maSp;
    }

    public Store(String maSp, String tenSp, String moTa, int soLuong, double giaBan, String loaiSp) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.moTa = moTa;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
        this.loaiSp = loaiSp;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getLoaiSp() {
        return loaiSp;
    }

    public void setLoaiSp(String loaiSp) {
        this.loaiSp = loaiSp;
    }

    @Override
    public String toString() {
        return "Store{" +
                "maSp='" + maSp + '\'' +
                ", tenSp='" + tenSp + '\'' +
                ", moTa='" + moTa + '\'' +
                ", soLuong=" + soLuong +
                ", giaBan=" + giaBan +
                ", loaiSp='" + loaiSp + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return Objects.equals(maSp, store.maSp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maSp);
    }
}
