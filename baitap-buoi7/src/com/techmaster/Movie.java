package com.techmaster;

import java.time.Year;

public class Movie {
    private String id;
    private  String name;
    private String category;
    private int totalTime;
    private String product;
    private int year;

    public Movie() {
    }

    public Movie(String id, String name, String category, int totalTime, String product, int year) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.totalTime = totalTime;
        this.product = product;
        this.year = year;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", totalTime=" + totalTime +
                ", product='" + product + '\'' +
                ", year=" + year +
                '}';
    }
}
