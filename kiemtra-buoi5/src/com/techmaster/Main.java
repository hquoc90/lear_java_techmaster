package com.techmaster;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Cau1: in ra hinh vuong
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        // in ra hinh tam giac
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        //Câu 2:
        // Đếm số từ trong chuỗi
        String str2 = " You only live once, but if you do it right, once is enough ";
        XulyString strObj = new XulyString();
        System.out.println(strObj.countWords(str2));
        // Đếm và in ra index của các ký tự o
        strObj.countIndexChar(str2);

        //Câu 3:Viết chương trình sinh ra số ngẫu nhiên, kiểm tra số đó có là số nguyên tố không
        //Sinh 1 so ngau nhien
        SoNguyenTo sntObj=new SoNguyenTo();
        Random random=new Random();
        int randomNumber=random.nextInt();
        System.out.println("So may man cua ban la "+ randomNumber);
        if(sntObj.isPrimeNumber(randomNumber)==true){
            System.out.println("so nay la so nguyen to");
        }else
        {
            System.out.println("Khong phai so nguyen to ");
        }

        //Câu 4: Liệt kê 10 số nguyên tố đầu tiên
        sntObj.listSoNguyenTo(10);
        System.out.println();

        //Liệt kê các số nguyên tố nhỏ hơn 10
        sntObj.listSoNguyenToNhoHon10(10);
        System.out.println();


        //Cau5: Nhập chuỗi là tên của bạn, tiến hành chuẩn hóa chuỗi đó
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ten ban ");
        String name=scanner.nextLine();
        System.out.println("Chuan hoa chuoi ");
        System.out.println(strObj.chuanHoaString(name));
        System.out.println(strObj.chuanHoaTuRieng(name));

        // Nhập vào chuỗi bất kỳ, kiểm tra xem chuỗi đó có là chuỗi palindrome không
        System.out.println("Nhap 1 chuoi bat ki ");
        String str3=scanner.nextLine();
        if(strObj.isPalindrome(str3)){
            System.out.println("Chuoi la chuoi Palindrome");
        }else
        {
            System.out.println("Khong phai chuoi Palindrome ");
        }

        //Cau6: Tạo mảng 2 chiều với số dòng và cột nhập vào từ bàn phím.
        System.out.println("Nhap vao so hang cua mang 2 chieu ");
        int row=scanner.nextInt();
        System.out.println("Nhap vao so cot cua mang 2 chieu ");
        int col=scanner.nextInt();
        int[][] arr= new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.printf("Nhap phan tu mang arr[%d][%d]= ",i,j);
                arr[i][j]=scanner.nextInt();
            }
        }
        // in ra mang
        printArray(arr,row,col);
        // in ra cac phan tu duong cheo chinh
        printDuongCheoChinh(arr,row,col);


    }
    public static void printArray(int[][] arr, int row, int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void printDuongCheoChinh(int[][] arr, int row, int col)
    {
        System.out.println("Cac phan tu thuoc duong cheo chinh ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                    System.out.printf(arr[i][j] + " " );
                }
            }

    }
    }
}
