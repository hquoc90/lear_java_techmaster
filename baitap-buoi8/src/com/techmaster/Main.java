package com.techmaster;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        LapTrinhVien ltv=new LapTrinhVien();
        KiemChungVien ktv=new KiemChungVien();
        int choice1=0;
        int choice2=0;
        do{
            System.out.println("Menu------");
            System.out.println("1. Bang Lap trinh vien\n" +
                    "2. Bang Kiem Chung Vien\n" +
                    "0. Thoat \n ");
            choice1=sc.nextInt();
            sc.nextLine();
            if(choice1==1){
                do{
                    System.out.println("1. Nhap thong tin LTV\n" +
                            "2. In ra danh sach LTV\n" +
                            "0. Quay lai\n");
                    choice2=sc.nextInt();
                    sc.nextLine();
                    if(choice2==1){
                        ltv.addLtv();
                    } else if(choice2==2){
                        ltv.printLtv();
                    }else if(choice2!=0){
                        System.out.println("Khong co option nay");
                    }
                }while(choice2!=0);
            }
           if (choice1==2)
           {
               do{
                   System.out.println("1. Nhap thong tin KTV\n" +
                           "2. In ra danh sach KTV\n" +
                           "0. Quay lai\n");
                   choice2=sc.nextInt();
                   sc.nextLine();
                   if(choice2==1){
                       ktv.addKtv();
                   } else if(choice2==2){
                       ktv.printKtv();
                   }else if(choice2!=0){
                       System.out.println("Khong co option nay");
                   }
               }while(choice2!=0);
           }else if(choice1!=0){
               System.out.println("Khong co option nay");
           }


        }  while(choice1!=0);
    }
}
