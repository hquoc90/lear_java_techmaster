package com.techmaster;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class DanhSachSp {
    private ArrayList<Store> danhsachSp;

    public DanhSachSp(ArrayList<Store> danhsachSp) {
        this.danhsachSp = danhsachSp;
    }

    public DanhSachSp() {
        this.danhsachSp = new ArrayList<Store>();
    }

    void themSp(Store stObj) {
        this.danhsachSp.add(stObj);
    }

    //    in danh sach san pham
    void printListSp() {
        for (Store stObj : danhsachSp
        ) {
            System.out.println(stObj.toString());
        }
        if (danhsachSp.isEmpty()) {
            System.out.println("Khong co san pham nao trong kho ");
        }
    }

    // tim san pham theo ten cua san pham
    void timSp(String str) {
        int count = 0;
        for (Store stObj : danhsachSp
        ) {
            if (stObj.getTenSp().indexOf(str) >= 0) {
                System.out.println(stObj.toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Khong co san pham nao");
        }

    }

    //    kiem tra ma san pham co trong danh sach hay ko
    boolean isCheckSp(String str) {
        for (Store stObj : danhsachSp
        ) {
            if (stObj.getMaSp().contains(str)) {
                return true;
            }
        }
        return false;
    }

    // Xoa san pham
    void xoaSp(int index) {
        if (index >= 0) {
            this.danhsachSp.remove(index);
            System.out.println("Xoa san pham thanh cong");
        } else System.out.println("Xoa san pham khong thanh cong");
    }

    //    Cap nhat san pham dua theo index trong arraylist
    void suaSp(int index, Store stObj) {
        this.danhsachSp.set(index, stObj);
    }

    //      lay index cua san pham theo masanpham
    int indexOf(String str) {
        for (Store stObj : danhsachSp
        ) {
            if (stObj.getMaSp().contains(str)) {
                return danhsachSp.indexOf(stObj);
            }
        }
        return -1;
    }

}
