package com.techmaster;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Service s=new Service();
//    Waiter w=new Waiter();
        int choice =0;
        Scanner sc=new Scanner(System.in);
    ArrayList<Waiter> listW=new ArrayList<Waiter>();
    ArrayList<Kitchen> listK=new ArrayList<Kitchen>();
    boolean isCheck=false;
    do{
        System.out.println("Menu--------\n" +
                "1. Add phuc vu\n" +
                "2. Add Dau bep\n" +
                "3. In ra danh sach phuc vu\n" +
                "4. In ra danh sach dau bep\n" +
                "0. Thoat");
       choice=sc.nextInt();
        switch(choice){
            case 1:
                s.insert(listW,choice);
                break;
            case 2:
                s.insert(listK,choice);
                break;
            case 3:
                s.print(listW);
                break;
            case 4:
                s.print(listK);
                break;
            case 0:
                break;
            default:
                System.out.println("Khong co lua chon nay");
        }
    }while(choice!=0);


    }
}
