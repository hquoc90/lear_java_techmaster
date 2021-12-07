package com.techmaster;

import java.util.ArrayList;
import java.util.Scanner;

public class LapTrinhVien extends NhanVien{
    private int totalOverTime;
    ArrayList<LapTrinhVien> listLapTrinhVien= new ArrayList<LapTrinhVien>();

    public LapTrinhVien() {
    }

    public LapTrinhVien(String maNhanVien, String hoVaTen, int age, String phoneNumber, String email, long luongCoBan, int totalOverTime) {
        super(maNhanVien, hoVaTen, age, phoneNumber, email, luongCoBan);
        this.totalOverTime = totalOverTime;
    }

    public int getTotalOverTime() {
        return totalOverTime;
    }

    public void setTotalOverTime(int totalOverTime) {
        this.totalOverTime = totalOverTime;
    }
//    Tinh luong Lap trinh  vien + format dinh dang
    String luongLtv(){
        long luong= getLuongCoBan()+ totalOverTime*200000;
        return formatNumber(luong);
    }
//    Them LTV
    void addLtv(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma nhan vien ");
        String maNhanVien=sc.nextLine();
        System.out.println("Nhap ho va ten ");
        String hoVaTen=sc.nextLine();
        System.out.println("Nhap tuoi ");
        int age=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so dien thoai ");
        String phoneNumber=sc.nextLine();
        System.out.println("Nhap email");
        String email=sc.nextLine();
        System.out.println("Nhap luong co ban ");
        long luongCb=sc.nextLong();
        System.out.println("so gio OT");
        int overTime=sc.nextInt();
        LapTrinhVien ltv=new LapTrinhVien(maNhanVien,hoVaTen,age,phoneNumber,email,luongCb,overTime);
        listLapTrinhVien.add(ltv);

    }
//    in ra danh sach LTV
    void printLtv(){
        for (LapTrinhVien l :
                listLapTrinhVien) {
            System.out.println(l.toString());
        }
    }

    @Override
    public String toString() {
        return super.toString()+ "\n "+ "LapTrinhVien{" +
                "totalOverTime=" + totalOverTime + " " + "luong thuc te " + luongLtv()+
                '}';
    }


}
