package com.techmaster;

import java.io.Console;
import java.util.Scanner;


public class Array {
    // In mang 1 chieu
    public void printArrray(String[] arr) {
        System.out.println("Cac phan tu cua mang la ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // Dem so lan ky tu xuat hien trong mang
    public void countIndexOfArray(String[] arr, String str) {
        int count = 0, fromIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            while ((fromIndex = arr[i].indexOf(str, fromIndex)) != -1) {
                count++;
                fromIndex++;
            }
        }
        System.out.printf("So lan \"%s \" xuat hien trong mang la  %d  lan \n", str, count);
    }

    // Kiem tra chuoi o vi tri nao trong mang
    public void checkStringArray(String[] arr, String str) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].indexOf(str, 0) != -1) {
                sum++;
                System.out.printf("Chuoi \"%s\" xuat hien tai vi tri thu %d trong mang \n", str, i);
            }
        }
        if (sum == 0) {
            System.out.println("Khong co phan tu nao cua mang chua chuoi " + str);
        }
    }
}
