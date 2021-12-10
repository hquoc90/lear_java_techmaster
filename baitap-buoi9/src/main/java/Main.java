import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import netscape.javascript.JSObject;


import java.io.*;
import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Service s = new Service();
        Scanner sc = new Scanner(System.in);

        s.getCustomers();
        int choice = 0;
        int choice2 = 0;
        do {
            System.out.println("Menu-----------");
            System.out.println("1. In ra danh sach khach hang \n" +
                    "2. In ra danh sach khach hang nam hoac nu\n" +
                    "3. Them thong tin khach hang\n" +
                    "4. Tim khach hang theo ma khach hang\n" +
                    "0. Thoat\n");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                s.print();
            } else if (choice == 2) {
                System.out.println("1. In ra tat ca khach hang la nam \n" +
                        "2. In ra tat ca khach hang la nu\n");
                choice2 = sc.nextInt();
                if (choice2 == 1) {
                    s.findByGender("Male");
                } else if (choice2 == 2) {
                    s.findByGender("Female");
                } else {
                    continue;
                }

            } else if (choice == 3) {
                s.addProfile();
            } else if (choice == 4) {
                System.out.println("Nhap id tim kiem ");
                String id = sc.nextLine();

                if (s.findById(id)) { // tim theo id
                    System.out.println("1. Sua thong tin khach hang\n" +
                            "2. Xoa thong tin khach hang\n" +
                            "0. Quay lai");
                    int choice3 = Integer.parseInt(sc.nextLine());
                    if (choice3 == 1) {
                        s.modifiCustomer(s.getIndexOF(id));
                    } else if (choice3 == 2) {
                        System.out.println(s.getIndexOF(id));
                        s.remove(s.getIndexOF(id));
                    } else if (choice3 == 0) {
                        continue;
                    }

                } else {
                    System.out.println("Khong thay khach hang nao co id " + id);
                }

            } else if (choice != 0) {
                System.out.println("Khong co lua chon nay");
            }

        } while (choice != 0);


    }
}

