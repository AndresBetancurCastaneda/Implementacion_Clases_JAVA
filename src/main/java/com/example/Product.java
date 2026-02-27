package com.example;

public class Product {
    // Atributos de la clase Product
    private int id;
    private String name;
    private double price;
    private int stock;

    // Métodos getters y setters para los atributos
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Método toString() para representar el objeto como una cadena de texto

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", stock=" + stock + "]";
    }

    
}
