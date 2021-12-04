package com.techmaster;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ListMovie {
    private ArrayList<Movie> listMovie;

    public ListMovie(ArrayList<Movie> listMovie) {
        this.listMovie = listMovie;
    }

    public ListMovie() {
        this.listMovie=new ArrayList<Movie>();
    }
    void addFilm(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma cua bo film");
        String id=sc.nextLine();
        System.out.println("Nhap ten bo film");
        String name=sc.nextLine();
        System.out.println("Nhap the loai film ");
        String category=sc.nextLine();
        System.out.println("Nhap do dai film (Phut) ");
        int totalTime=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten nha san xuat");
        String production=sc.nextLine();
        System.out.println("Nhap nam cong chieu");
        int year=sc.nextInt();
        Movie m=new Movie(id,name,category,totalTime,production,year);
        listMovie.add(m);
    }
    void print(){
        for (Movie m :
                listMovie) {
            System.out.println(m);
        }
        if(listMovie.isEmpty()){
            System.out.println("Khong co bo film nao trong danh sach ");
        }
    }
    void filterByCategory(String str){
        int count=0;
        for (Movie m :
                listMovie) {
            if(m.getCategory().toLowerCase(Locale.ROOT).contains(str)){
                System.out.println(m);
                count++;
            }
        }
        if (count==0){
            System.out.println("Khong tim thay bo film nao co the loai la "+str);
        }
    }
}
