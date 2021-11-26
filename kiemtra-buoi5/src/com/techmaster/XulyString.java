package com.techmaster;


public class XulyString {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';
    // Dem so tu trong chuoi
    public  int countWords(String str){
        if (str == null) {
            return -1;
        }
        int count = 0;
        int size = str.length();
        boolean notCounted = true;
        for (int i = 0; i < size; i++) {
            if (str.charAt(i) != SPACE && str.charAt(i) != TAB
                    && str.charAt(i) != BREAK_LINE) {
                if(notCounted) {
                    count++;
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        return count;
    }
    // Dem so ky tu trong chuoi
    public void countIndexChar(String str) {
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== 'o'){
                System.out.println("ky tu \'o\' o vi tri thu"+ i);
                count++;
            }
        }
        System.out.printf("Co tat ca %d ky tu \'o\' xuat hien trong chuoi \n", count);

    }
    // Chuan hoa chuoi, xoa khoang trang
    public  String chuanHoaString(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        return str;
    }
    // Chuan hoa chuoi Viet hoa chu cai dau tien
    public String chuanHoaTuRieng(String str) {
        str = chuanHoaString(str);
        String temp[] = str.split(" ");
        str = "";
        for (int i = 0; i < temp.length; i++) {
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1)
                str += " ";
        }
        return str;
    }
    // Check chuoi Plandrome
    boolean isPalindrome(String s) {
        int n = s.length();
        System.out.println(n);
        for (int i = 0; i < (n/2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
