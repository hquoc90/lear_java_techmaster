package com.techmaster;

public class SoNguyenTo {
    public boolean isCheckSoNguyenTo(double number){
        // so nguyen n < 2 khong phai la so nguyen to
        if (number < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2

        for (int i = 2; i <= (number-1); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    }

