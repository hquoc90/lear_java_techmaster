import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.regex.Pattern;

import java.net.Proxy;
import java.util.List;
import java.awt.*;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    private ArrayList<Customer> listCustomer;

    public Service(ArrayList<Customer> listCustomer) {
        this.listCustomer = listCustomer;
    }

    public Service() {
        this.listCustomer = new ArrayList<Customer>();
    }

    //in ra danh sach
    void print() {
        for (Customer c :
                listCustomer) {
            System.out.println(c);
        }
    }

    // doc file json su dung gson
    public void getCustomers() {

        Gson gson = new Gson();
        //doc file json
        try (FileReader reader = new FileReader("/Users/quoc/lear_java_techmaster/baitap-buoi9/src/MOCK_DATA.json")) {
            //add data vao list
            listCustomer = gson.fromJson(reader, new TypeToken<List<Customer>>() {
            }.getType());
            //in ra danh sach khach hang
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // tim theo gioi tinh
    void findByGender(String str) {
        for (Customer c :
                listCustomer) {
            if (c.getSex().equals(Sex.valueOf(str))) {
                System.out.println(c);
            }
        }
    }
// them 1 phan tu vao array

    void addProfile() {
        this.listCustomer.add(inputInformation());
    }

    // tim kiem theo id
    boolean findById(String str) {
        for (Customer c :
                listCustomer) {
            if (c.getId().equals(str)) {
                System.out.println(c);
                return true;
            }
        }
        return false;
    }

    // lay index cua phan tu
    int getIndexOF(String str) {
        for (Customer c :
                listCustomer) {
            if (c.getId().equals(str)) {
                return listCustomer.indexOf(c);
            }
        }
        return -1;
    }

    // sua thong tin
    void modifiCustomer(int index) {
        Customer d = inputInformation();
        this.listCustomer.set(index, d);
    }

    // xoa 1 phan tu
    void remove(int index) {
        this.listCustomer.remove(index);
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

    // check so dien thoai theo dinh dang
    boolean isVerifyPhoneNumber(String phoneNumber) {
        String pattern = "\\d{11}";
        String pattern2 = "\\d{10}";
        if (Pattern.matches(pattern, phoneNumber) || Pattern.matches(pattern2, phoneNumber)) {
            return true;
        }
        return false;
    }

    // ham input thong tin ca nhan
    Customer inputInformation() {
        Sex sex = null;
        int choiceGender = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id khach hang ");
        String id = sc.nextLine();
        System.out.println("Nhap ten khach hang ");
        String name = sc.nextLine();
        System.out.println("Nhap nam sinh ");
        int year = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gioi tinh ");
        System.out.println("1. Nam \n" +
                "2. Nu\n");
        choiceGender = sc.nextInt();
        sc.nextLine();
        if (choiceGender == 1) {
            sex = Sex.Male;
        } else if (choiceGender == 2) {
            sex = Sex.Female;

        }
        System.out.println("Nhap dia chi ");
        String adress = sc.nextLine();
        String phoneNumber;
        do {
            System.out.println("Nhap so dien thoai ");
            phoneNumber = sc.nextLine();
            if (isVerifyPhoneNumber(phoneNumber) == false) {
                System.out.println("So dien thoai sai dinh dang, phai co tu 10 11 so");
            }
        } while (isVerifyPhoneNumber(phoneNumber) == false);
        String email;
        do {
            System.out.println("Nhap email");
            email = sc.nextLine();
            if (isVerifyEmail(email) == false) {
                System.out.println("sai dinh dang email");
            }
        } while (isVerifyEmail(email) == false);
        Customer c = new Customer(id, name, year, sex, adress, phoneNumber, email);
        return c;
    }

}
