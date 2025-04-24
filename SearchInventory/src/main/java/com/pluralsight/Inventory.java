package com.pluralsight;


import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Inventory {

    private static BufferedReader bufferedReader;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");
        ArrayList<Product> inventory = getInventory();
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d | %s | Price: $%.2f \n", p.getId(), p.getName(), p.getPrice());
        }
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> products = new ArrayList<Product>();
      try {
// want to set array with the parts of product, why wont it letme, have tried using product
// id is weird too
          //id name price
          products.add(new Product(01, "Philodendron Pink Princess", 45.99f));
          products.add(new Product(02, "Monstera Deleciousa 7 inch pot", 35.99f));
          products.add(new Product(03, "Rattlesnake Calathea", 25.99f));
          products.add(new Product(04, "Lithops", 10.99f));
          products.add(new Product(05, "Saguaro Cactus", 25.99f));

          String input;
          //take each line and split into the 4 different parts, go over the entire block of text from source material
          while ((input = bufferedReader.readLine()) != null) {
              //splits here
              String[] inputSplit = input.split(Pattern.quote("|"));
              //here are the parts
              int id = Integer.parseInt(inputSplit[0]);
              String name = inputSplit[1];
              float price = Float.parseFloat(inputSplit[2]);
              //now you have a new employee from the file(database can be used as well)
              products.add(new Product(id, name, price));

          }
      }catch (Exception e){
              System.out.print("Error: file not available");
          }

      return products;
}}