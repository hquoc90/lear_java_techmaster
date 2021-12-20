package com.techmaster;

import java.util.ArrayList;
import java.util.Scanner;

public class Service<E> {
    private E value;
    private ArrayList<E> listEmployee;

    public Service(E value, ArrayList<E> listEmployee) {
        this.value = value;
        this.listEmployee = listEmployee;
    }

    public Service(E value) {
        this.listEmployee = new ArrayList<E>();
    }

    public Service() {
        this.listEmployee=new ArrayList<E>();
    }

    public Employee insertEmployee(int choice){
        Employee employee = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id");
        String id=sc.nextLine();
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi ");
        int age=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập lương cơ bản: ");
        long basicSalary = sc.nextLong();
        if(choice == 1){
                System.out.print("Nhập tong so tien tip: ");
                long  compensate = sc.nextLong();
                employee=new Waiter(id,name,age,basicSalary,compensate);
        }else if(choice == 2){
            System.out.print("Nhập service charge: ");
            long serviceCharge = sc.nextLong();
            employee = new Kitchen(id,name,age,basicSalary,serviceCharge);
        }
        return employee;
    }
    public ArrayList<E> insert(ArrayList<E> list, int choice){
        list.add((E) insertEmployee(choice));
        return list;
    }
    void print (ArrayList<E> list){
        for (E w:
                list){
            System.out.println(w);
        }
    }
}
