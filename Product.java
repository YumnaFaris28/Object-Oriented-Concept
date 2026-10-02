package com.mycompany.greenmanagement;

public class Product {
// encapsulation

    private String productID;
    private String productName;
    private String category;
    private double price;

    public Product(String productID, String productName, String category, double price) { //parametrized constructors
        this.productID = productID;
        this.productName = productName;
        this.category = category;
        this.price = price;

    }

    // access modifiers
    public String getProductID() {  
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    // Update product details
    public void updateProduct(String productName, String category, double price) {
        this.productName = productName;
        this.category = category;
        this.price = price;

    }

    // Display product details
    public void displayProduct() {
        System.out.println("\n--- Product Details ---");
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + price);
        System.out.println("----------------------");
    }

}

