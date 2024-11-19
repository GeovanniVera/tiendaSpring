package com.tienda.entity;

public class Productos {
    private int id;
    private String name;
    private String details;
    private String category;
    private String brand;
    private double price;

    public Productos(int id, String name, String details, String category, String brand, double price) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.category = category;
        this.brand = brand;
        this.price = price;
    }

    public Productos() {
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


}
