
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import jdk.jfr.Category;

import java.io.FileReader;
import java.util.*;

public class Service {
    private ArrayList<Book> listBook=new ArrayList<Book>();

    public Service() {
        this.listBook=new ArrayList<Book>();
    }

    public void getData() {

        Gson gson = new Gson();
        //doc file json
        try (FileReader reader = new FileReader("/Users/quoc/lear_java_techmaster/baitap-buoi13/Book.json")) {
            //add data vao list
            listBook = gson.fromJson(reader, new TypeToken<List<Book>>() {
            }.getType());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    void print(){
        for (Book b:
             listBook) {
            System.out.println(b);
        }
    }
    void filterByCategory(String str){
        for (Book b:
                listBook) {
           for(int i=0;i<b.getCategory().length;i++){
               if(b.getCategory()[i].toLowerCase().contains(str.toLowerCase())){
                   System.out.println(b);
               }
           }
        }
    }
    int countByCategory(String str){
        int count=0;
        for (Book b:
                listBook) {
            for(int i=0;i<b.getCategory().length;i++){
                if(b.getCategory()[i].toLowerCase().equals(str.toLowerCase())){
                    count=count+1;
                    break;
                }
            }
        }
        return count;
    }
    void sortByPublishingYear(){
        Collections.sort(listBook, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPublishingYear()-o2.getPublishingYear();
            }
        });
        System.out.println("Sap xep danh sach theo nam xuat ban");
        print();
    }

    void findByBookTitle(String str){
        for (Book b:
                listBook) {
                if(b.getTitle().toLowerCase().contains(str.toLowerCase())){
                    System.out.println(b);
                }

        }
    }

}
