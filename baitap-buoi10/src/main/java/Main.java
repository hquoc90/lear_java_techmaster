import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListMovie list = new ListMovie();
        Scanner sc = new Scanner(System.in);
        list.getData();
        int choice = 0;
        do {
            System.out.println("Menu---");
            System.out.println("1. In ra danh sach cac bo film\n" +
                    "2. Sap xep theo ten \n" +
                    "3. Sap xep theo thoi luong film\n" +
                    "4. Sap xep theo luot view\n" +
                    "0. Thoat");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    list.printListMovie();
                    break;
                case 2:
                    list.sortByMovieName();
                    break;
                case 3:
                    list.sortByLongTime();
                    break;
                case 4:
                    list.sortByView();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Khong co lua chon nay");

            }
        } while (choice != 0);


    }
}
