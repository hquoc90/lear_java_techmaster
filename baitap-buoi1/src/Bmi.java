public class Bmi {
    public void bmiVoid(double height, double weight) {
        double bmi= weight/(height*height);
        System.out.println("BMI cua ban la - goi phuong thuc BMI void "+ bmi);
        
    }
    public double bmiDouble(){
        double weight=62;
        double height=1.65;
        return weight/(height*height);
       
    }
public  double bmiDoubleVariale(double height, double weight){
    return weight/(height*height);
}
}
