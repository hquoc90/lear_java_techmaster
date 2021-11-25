package com.techmaster;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            // Cau1: Tạo mảng chuỗi gồm n phần tử (n nhập vào từ bàn phím)
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap vao so phan tu cua mang 1 chieu");
            int n = Integer.parseInt(scanner.nextLine());

            // Cau2: Nhập thông tin cho các phần tử
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Nhap vao phan tu mang thu " + i);
                arr[i] = scanner.nextLine();
            }

            //Cau3:  In thông tin ra màn hình
            Array arrObj = new Array();
            arrObj.printArrray(arr);

            //Cau4: Đếm số lần ky tu “Java” xuất hiện trong mảng

            arrObj.countIndexOfArray(arr, "java");

            //Cau5: Nhập vào từ bàn phím chuỗi bất kỳ, kiểm tra chuỗi đó ở vị trí nào của mảng
            System.out.println("Nhap 1 chuoi bat ki ");
            String str1 = scanner.nextLine();
            arrObj.checkStringArray(arr, str1);

        } catch (Exception e) {
            System.out.println("Nhap sai dinh dang yeu cau");
        }

    }
}
