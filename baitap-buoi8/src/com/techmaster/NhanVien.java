package com.techmaster;

import java.text.DecimalFormat;

public class NhanVien {
    private String maNhanVien;
    private String hoVaTen;
    private int age;
    private String phoneNumber;
    private String email;
    private long luongCoBan;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String hoVaTen, int age, String phoneNumber, String email, long luongCoBan) {
        this.maNhanVien = maNhanVien;
        this.hoVaTen = hoVaTen;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.luongCoBan = luongCoBan;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(long luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNhanVien='" + maNhanVien + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", luongCoBan=" + formatNumber(luongCoBan) +
                '}';
    }
    public  String formatNumber(long money){
        String pattern = "###,###,##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        return decimalFormat.format(money);
    }
}
