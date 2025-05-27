package com.zcc;
public class Product {
    private String id;
    private String name;
    private int price;
    private int number;

    public Product() {}

    public Product(String id, String name, int price, int number) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}