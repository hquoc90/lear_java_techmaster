package com.techmaster;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        ListMovie list=new ListMovie();
        int choice=0;
        do{
            System.out.println("Menu--------");
            System.out.println("1. Them film moi\n" +
                    "2. In danh sach film \n" +
                    "3. Tim film the loai la action\n" +
                    "0. Thoat\n");
            choice=sc.nextInt();
            if(choice==1){
                list.addFilm();
            }else if(choice==2){
                list.print();
            }else if(choice==3){
                list.filterByCategory("action");
            }

        }while (choice!=0);
    }
}
