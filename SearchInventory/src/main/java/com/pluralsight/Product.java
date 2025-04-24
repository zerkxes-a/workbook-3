package com.pluralsight;

import java.util.ArrayList;
//whats a product? gotta figure out what makes a product
public class Product{
    private int id;
    private String name;
    private float price;
    //should i be putting in a setter method as well? brainblank
    public Product(int id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
      return this.name;
    }
    public float getPrice(){
        return this.price;
    }
}
