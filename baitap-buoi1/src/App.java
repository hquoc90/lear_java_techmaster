import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

       //  Cau 1 - Tinh toan Cong tru nhan chia 2 so su dung class Calculator
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so a ");
        double a=scanner.nextDouble();
        System.out.println("Nhap so b ");
        double b=scanner.nextDouble();
        Calculator cal=new Calculator();
        System.out.println("tong 2 so a va b la: "+ cal.add(a, b));
        System.out.println("Hieu 2 so a va b la: "+ cal.sub(a, b));
        System.out.println("tich 2 so a va b la: "+ cal.mul(a, b));
        System.out.println("Chia 2 so a va b la: "+ cal.div(a, b));
        scanner.close();
        
        /* Cau 2: tinh chi so BMI */
        Bmi bmi=new Bmi();
        double height=1.65;
        double weight=65;
        bmi.bmiVoid(height, weight);
        System.out.println("Bmi cua ban la - goi phuong thuoc BMI return double co truyen tham so "+ bmi.bmiDoubleVariale(height, weight));
        System.out.println("BMI cua ban la - goi phuong thuc BMi return double khong truyen tham so"+ bmi.bmiDouble());
    }
}
