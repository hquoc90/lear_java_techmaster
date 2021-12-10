public class Customer {
    private String id;
    private String name;
    private int year;
    private Sex sex;
    private String adress;
    private String phoneNumber;
    private String email;

    public Customer(String id, String name, int year, String sex, String adress, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.sex = Sex.valueOf(sex);
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Customer() {
    }

    public Customer(String id, String name, int year, Sex sex, String adress, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.sex = sex;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", sex=" + sex +
                ", adress='" + adress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
