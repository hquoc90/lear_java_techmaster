package com.techmaster;

import java.util.ArrayList;
import java.util.Scanner;

public class KiemChungVien extends NhanVien{
    private int totalBugs;
    private ArrayList<KiemChungVien> listKiemChungvien=new ArrayList<KiemChungVien>();
    public KiemChungVien(String maNhanVien, String hoVaTen, int age, String phoneNumber, String email, long luongCoBan, int totalBugs) {
        super(maNhanVien, hoVaTen, age, phoneNumber, email, luongCoBan);
        this.totalBugs = totalBugs;
    }

    public KiemChungVien() {
    }

    public int getTotalBugs() {
        return totalBugs;
    }

    public void setTotalBugs(int totalBugs) {
        this.totalBugs = totalBugs;
    }
//    Tinh luong KTV
    String luongKtv(){
        return formatNumber(getLuongCoBan()+ totalBugs*50000);
    }
//    THem KTV
    void addKtv(){
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
        System.out.println("So loi phat hien dc ");
        int bug=sc.nextInt();
        KiemChungVien ktv=new KiemChungVien(maNhanVien,hoVaTen,age,phoneNumber,email,luongCb,bug);
        this.listKiemChungvien.add(ktv);
    }
//    In ra danh sach KTV
    void printKtv(){
        for (KiemChungVien k :
                listKiemChungvien) {
            System.out.println(k.toString());
        }
    }
    @Override
    public String toString() {
        return super.toString()+ "\n "+ "KiemChungVien{" +
                "totalBugs=  " + totalBugs +" "+ "Luong thuc te " + " "+ luongKtv()
                +
                '}';
    }


}
