package com.example;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();
        
        product1.setId(1);
        product1.setName("Laptop");
        product1.setPrice(999.99);
        product1.setStock(10);  

        product2.setId(2);
        product2.setName("smartphone");
        product2.setPrice(499.99);
        product2.setStock(15);

        System.out.println("Product ID: " + product1.getId());
        System.out.println("Product Name: " + product1.getName());
        System.out.println("Product Price: $" + product1.getPrice());
        System.out.println("Product Stock: " + product1.getStock());

        System.out.println("Product ID: " + product2.getId());
        System.out.println("Product Name: " + product2.getName());
        System.out.println("Product Price: $" + product2.getPrice());
        System.out.println("Product Stock: " + product2.getStock());

        System.out.println(product1.toString());
        System.out.println(product2.toString());
        
    }
}