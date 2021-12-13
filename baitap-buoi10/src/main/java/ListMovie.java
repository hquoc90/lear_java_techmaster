import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.sql.ClientInfoStatus;
import java.util.*;

public class ListMovie {
    private ArrayList<Movie> listMovie;

    public ListMovie() {
        this.listMovie=new ArrayList<Movie>();
    }

    public ListMovie(ArrayList<Movie> listMovie) {
        this.listMovie = listMovie;
    }

    void getData(){
        Gson gson = new Gson();
        //doc file json
        try (FileReader reader = new FileReader("/Users/quoc/lear_java_techmaster/baitap-buoi10/movie-list-java10.json")) {
            //add data vao list
            listMovie = gson.fromJson(reader, new TypeToken<List<Movie>>() {
            }.getType());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    // in danh sach film
    void printListMovie(){
        for (Movie m: listMovie ) {
            System.out.println(m);
        }
    }
    //sap xep theo ten
    void sortByMovieName(){
        Collections.sort(listMovie, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Danh sach sap xep theo ten");
        printListMovie();
    }
    //sap xep theo thoi luong
    void sortByLongTime(){
        Collections.sort(listMovie, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getLongTime()-o2.getLongTime();
            }
        });
        System.out.println("Danh sach sap xep theo thoi luong fime");
        printListMovie();
    }
    //Sap xep theo luot xem
    void sortByView(){
        Collections.sort(listMovie, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getView()-o2.getView();
            }
        });
        System.out.println("Danh sach sap xep theo luot xem");
        printListMovie();
    }
}
