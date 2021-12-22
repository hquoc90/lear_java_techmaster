import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String arg[]) throws IOException, ParseException {
        Service s = new Service();
        s.getData();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Menu----------\n" +
                    "1. In danh sach Sach\n" +
                    "2. Loc sach theo the loai\n" +
                    "3. Thong ke so luong sach theo the loai\n" +
                    "4. Sap xep sach theo nam xuat ban\n" +
                    "5. Tim sach theo title\n" +
                    "0. Thoat");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    s.print();
                    break;
                case 2:
                    System.out.println("Nhap the loai sach can tim  kiem");
                    String str=sc.nextLine();
                    s.filterByCategory(str);
                    break;
                case 3:
                    System.out.println("Nhap ten loai sach");
                    String str1=sc.nextLine();
                    System.out.printf("co %d cuon sach the loai %s",s.countByCategory(str1),str1);
                    System.out.println();
                    break;
                case 4:
                    s.sortByPublishingYear();
                    break;
                case 5:
                    System.out.println("Nhap ten cuon sach can tim kiem");
                    String str3=sc.nextLine();
                    s.findByBookTitle(str3);
                    break;
                case 0: break;
                default:
                    System.out.println("Khong co lua chon nay");
            }
        } while (choice != 0);

        System.out.println(s.countByCategory("Drama"));
        s.sortByPublishingYear();
        s.findByBookTitle("photo");
    }
}
