package com.techmaster;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        DanhSachSp danhsachSp = new DanhSachSp();
        do {
            System.out.println("Menu---\n");
            System.out.println("1. Them san pham\n" +
                    "2. In ra danh sach san pham\n" +
                    "3. Tim san pham\n" +
                    "4. Xoa san pham\n" +
                    "5. Sua thong tin san pham\n" +
                    "0. Thoat\n");
            choice = sc.nextInt();
            sc.nextLine();
//        Them san pham
            if (choice == 1) {
                System.out.println("Nhap Ma san pham ");
                String maSp = sc.nextLine();
                System.out.println("Nhap ten SP");
                String tenSp = sc.nextLine();
                System.out.println("Nhap mo ta cho SP ");
                String moTa = sc.nextLine();
                System.out.println("Nhap so luong");
                int soLuong = sc.nextInt();
                System.out.println("Nhap gia ban ");
                double giaBan = sc.nextDouble();
                sc.nextLine();
                System.out.println("Nhap loai san pham ");
                String loaiSp = sc.nextLine();
                Store stObj = new Store(maSp, tenSp, moTa, soLuong, giaBan, loaiSp);
//                Check trung Ma san pham da co trong kho
                if (danhsachSp.isCheckSp(maSp)) {
                    System.out.println("Ma san pham nay da co trong kho, vui long nhap lai ma san pham khac");
                } else {
                    danhsachSp.themSp(stObj);

                }
//               in ra danh sach san pham
            } else if (choice == 2) {
                danhsachSp.printListSp();
            }
//             tim kiem theo ten san pham
            else if (choice == 3) {
                System.out.println("Nhap ten san pham muon tim kiem ");
                String str = sc.nextLine();
                danhsachSp.timSp(str);
            }
//              Xoa 1 san pham theo ma san pham
            else if (choice == 4) {
                System.out.println("Nhap Ma san pham muon xoa ");
                String str = sc.nextLine();

//                Check san pham co trong kho khong
                if (danhsachSp.isCheckSp(str)) {
                    danhsachSp.xoaSp(danhsachSp.indexOf(str));
                } else System.out.println("San pham nay khong co trong kho");
            }
//            Sua 1 san pham theo ma san pham tim kiem
            else if (choice == 5) {
                System.out.println("Nhap Ma san pham muon sua");
                String str = sc.nextLine();
//            Check xem ma san pham co ton tai khong
                if (danhsachSp.isCheckSp(str)) {
                    System.out.println("Nhap Ma san pham moi ");
                    String maSp = sc.nextLine();
                    System.out.println("Nhap ten SP");
                    String tenSp = sc.nextLine();
                    System.out.println("Nhap mo ta cho SP ");
                    String moTa = sc.nextLine();
                    System.out.println("Nhap so luong");
                    int soLuong = sc.nextInt();
                    System.out.println("Nhap gia ban ");
                    double giaBan = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Nhap loai san pham ");
                    String loaiSp = sc.nextLine();
                    Store stObj = new Store(maSp, tenSp, moTa, soLuong, giaBan, loaiSp);

//              Check xem ma san pham sau khi sua co bi trung voi ma san pham khac hay khong
                    if (maSp.equals(str)) {
                        danhsachSp.suaSp(danhsachSp.indexOf(str), stObj);

                    } else {
                        if (danhsachSp.isCheckSp(maSp)) {
                            System.out.println("Ma san pham nay da co trong kho, vui long nhap lai ma san pham khac");

                        } else {
                            danhsachSp.suaSp(danhsachSp.indexOf(str), stObj);

                        }
                    }
                } else {
                    System.out.println("Khong tim thay san pham co ma " + str);
                }
            }
        }
        while (choice != 0);
    }
}
