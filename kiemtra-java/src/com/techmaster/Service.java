package com.techmaster;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Service {
    private ArrayList<User> listUser=new ArrayList<User>();

    public Service() {
        this.listUser=new ArrayList<User>();
    }
    void addData(){
        User u1=new User("test1","1","hoang90@gmail.com");
        User u2=new User("test2","2","hoang91@gmail.com");
        User u3=new User("test3","3","hoang92@gmail.com");
        User u4=new User("test4","4","hoang93@gmail.com");
        this.listUser.add(u1);
        this.listUser.add(u2);
        this.listUser.add(u3);
        this.listUser.add(u4);
    }

    void registerNewUser(){
        User u=inputUser();

            if(isCheckUserName(u.getName())==false){
                if(isVerifyPassword(u.getPassword())){
                    if (isVerifyEmail(u.getEmail())&& isCheckEmail(u.getEmail())==false){
                        this.listUser.add(u);
                        System.out.println("Dang ky thanh cong");
                    }else {
                        System.out.println("Email sai dinh dang hoac da ton tai ");
                    }
                } else {
                    System.out.println("password dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt ");

                }
            } else
            {
                System.out.println("tai khoan da ton tai trong he thong ");
            }


    }
    // Login
    int isChecklogin(String name, String password){

        for (User u :
                listUser) {
            if(u.getName().toLowerCase().equals(name.toLowerCase()) && u.getPassword().equals(password)){
                    return 1;
            }
        }
        for (User u :
                listUser) {
            if(u.getName().toLowerCase().equals(name.toLowerCase())&& u.getPassword().equals(password)==false){
                return 2;
        }
        }
        for (User u:
             listUser) {
            if(u.getName().toLowerCase().equals(name.toLowerCase())==false){
                return 3;
            }
        }

        return 0;
    }

    // Check ten dang nhap
    boolean isCheckUserName(String name){
        for (User u :
                listUser) {
            if(u.getName().toLowerCase().equals(name)){
                    return true;
            }
        }
        return false;
    }
    //Check email ton tai
    boolean isCheckEmail(String email){
        for (User u :
                listUser) {
            if(u.getEmail().equals(email)){
                return true;
            }
        }
        return false;
    }
    //Check password dang nhap
    boolean isCheckPassword(String password){
        for (User u :
                listUser) {
            if(u.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
    // thay doi username
    void changeUserName(int id,String newName){
       if(id>=0) {
           if(isCheckUserName(newName)==false){
               this.listUser.get(id).setName(newName);
               System.out.println("doi username thanh cong");
           }else {
               System.out.println("doi username khong thanh cong");
           }
       }
    }
    //thay doi email
    void changeEmail(int id, String newEmail){
        if(id>=0){
           if(isCheckEmail(newEmail)==false){
               this.listUser.get(id).setEmail(newEmail);
               System.out.println("doi Email thanh cong ");
           }
           else{
               System.out.println("Doi email khong thanh cong");
           }
        }

    }
    //thay doi mat khau
    void changePassword(int id, String newPassword){
        if(id>=0)    {
            if(isVerifyPassword(newPassword)){
                listUser.get(id).setPassword(newPassword);
                System.out.println("doi mat khau thanh cong");
            }else {
                System.out.println("password dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt ");

            }

        }

    }
    //quen mat khau
    void forgetPasword(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap email ");
        String email=sc.nextLine();
        if(isCheckEmail(email)){
            System.out.println("Nhap mat khau moi");
            String newPassword=sc.nextLine();
            listUser.get(getIndexOFByEmail(email)).setPassword(newPassword);
            System.out.println("Doi mat khau thanh cong");
        }else{
            System.out.println("Tai khoan khong ton tai");
        }

    }
    // lay index cua phan tu bang email
    int getIndexOFByEmail(String str) {
        for (User u :
                listUser) {
            if (u.getEmail().equals(str)) {
                return listUser.indexOf(u);
            }
        }
        return -1;
    }
    // lay index cua phan tu bang username
    int getIndexOFByUserName(String str) {
        for (User u :
                listUser) {
            if (u.getName().equals(str)) {
                return listUser.indexOf(u);
            }
        }
        return -1;
    }

     User  inputUser(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap username ");
        String name=sc.nextLine();
        System.out.println("Nhap password ");
        String password=sc.nextLine();
        System.out.println("Nhap email ");
        String email=sc.nextLine();

        User u=new User(name,password,email);
        return u;
    }
    //verify email theo dinh dang
    boolean isVerifyEmail(String email) {
        String EMAIL_PATTERN =
                "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        if (Pattern.matches(EMAIL_PATTERN, email)) {
            return true;
        }
        return false;
    }
    //verify password
    boolean isVerifyPassword(String password){
        String PASSWORD_PATTERN =
                "^(?=.*[~!@#$%^&*()_+`\\-=\\[\\]\\{\\};':\\\",./<>?])(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])\\S{7,15}$";
        if (Pattern.matches(PASSWORD_PATTERN, password)) {
            return true;
        }
        return false;
    }
    void print(){
        listUser.stream().forEach(System.out::println);
    }
}
