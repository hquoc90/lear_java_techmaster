package com.techmaster;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        Service s = new Service();
        s.addData();
        int choice1 = 0;
        int choice2 = 0;
        int choice3 =0;
        do {
            System.out.println("Menu-----------\n" +
                    "1.Dang nhap \n" +
                    "2. Dang ky \n" +
                    "0. Thoat\n");
            choice1 = sc.nextInt();
            sc.nextLine();

            switch (choice1) {
                case 1:
                    System.out.println("Nhap user name");
                    String name = sc.nextLine();
                    System.out.println("Nhap password");
                    String password = sc.nextLine();
                    if (s.isChecklogin(name, password)==1) {

                       do{
                           System.out.println("1 - Thay đổi username\n" +
                                   "2 - Thay đổi email\n" +
                                   "3 - Thay đổi mật khẩu\n" +
                                   "4 - Đăng xuất (Sau khi đăng xuất quay về mục yêu cầu đăng nhập hoặc đăng ký)\n" +
                                   "0 - Thoát chương trình");
                           choice2 = sc.nextInt();
                           sc.nextLine();
                           switch (choice2) {
                               case 1:
                                   System.out.println("Nhap username moi ");
                                   String newUserName=sc.nextLine();
                                   s.changeUserName(s.getIndexOFByUserName(name),newUserName);
                                   break;
                               case 2:
                                   System.out.println("Nhap email moi ");
                                   String newEmail=sc.nextLine();
                                   if(s.isVerifyEmail(newEmail)){
                                       s.changeEmail(s.getIndexOFByUserName(name),newEmail);
                                   }else {
                                       System.out.println("Mail sai dinh dang");
                                   }

                                   break;
                               case 3:
                                   System.out.println("Nhap mat khau moi ");
                                   String newPassword=sc.nextLine();
                                   s.changePassword(s.getIndexOFByUserName(name),newPassword);
                                   break;
                               case 4:

                                   break;
                               case 0:
                                   System.exit(10);
                               default:
                                   System.out.println("Khong co lua chon nay");
                           }
                       } while (choice2!=4);

                    }else if(s.isChecklogin(name,password)==3){
                        System.out.println("sai ten dang nhap");
                    }else if(s.isChecklogin(name,password)==2){
                        System.out.println("sai mat khau ");
                        System.out.println("1.Dang Nhap lai\n" +
                                "2. Quen mat khau\n");
                        choice3=sc.nextInt();
                        sc.nextLine();
                        switch (choice3){
                            case 1: continue;
                            case 2: s.forgetPasword();
                            break;
                            default:
                                System.out.println("khong co lua chon tren ");
                        }

                    }
                    break;

                case 2:
                    s.registerNewUser();
                    s.print();
                    break;
                case 0:

            }
        } while (choice1 !=0);


    }
}
