package com.techmaster;

public class SoNguyenTo {
    //Check so nguyen to
    public  boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    //List ra n so nguyen to dau tien
    public void listSoNguyenTo(int n){
        int i=0;
        int count=0;
        while(count != n){
            i++;
            if(isPrimeNumber(i)){
                System.out.print(i+" ");
                count++;
            }
        }
    }
    //List ra cac so nguyen to nho hon n
    public void listSoNguyenToNhoHon10(int n){
        for(int i=0;i<10;i++){
            if(isPrimeNumber(i)){
                System.out.print(i+" ");
            }
        }
    }
}
