package com.techmaster;

public class GiaiPhuongTrinh {

    public void giaiPhuongTrinhBac1(double a, double b){
        if(a!=0){
            double nghiem=-b/a;
            System.out.printf("nghiem cua phuong trinh la x= %.3f", nghiem);
        } else if(a==0 && b!=0){
            System.out.println("Phuong trinh vo nghiem");
        } else if(a==0 && b==0){
            System.out.println("Phuong trinh vo so nghiem");
        }


    }
    void giaiPhuongTrinhBac2(double a, double b, double c){
        double delta;
        double nghiem1, nghiem2;
        if(a!=0){
            delta= Math.pow(b,2)-(4*a*c);
            if(delta<0){
                System.out.println("Phuong trinh vo nghiem");
            } else if(delta==0) {
                nghiem1=-b/(2*a);
                nghiem2=-b/(2*a);
                System.out.printf("Phuong trinh co nghiem kep x1=x2= %.3f",nghiem1);
            } else {
                nghiem1= (-b+ Math.sqrt(delta))/ (2*a);
                nghiem2= (-b- Math.sqrt(delta))/ (2*a);
                System.out.printf("Phuong trinh co nghiem x1= %.3f \n", nghiem1 );
                System.out.printf("Phuong trinh co nghiem x2= %.3f", nghiem2);

            }
        } else {
            System.out.println("a phai khac 0");
        }


    }
}
