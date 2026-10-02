package com.mycompany.greenmanagement;

import com.mycompany.greenmanagement.Product;
import java.util.Scanner;
import java.util.ArrayList;

public class ProductManager {
//encapsulation

    private ArrayList<Product> products; // association
    private Scanner scanner;

    public ProductManager() {  // default constructor
        products = new ArrayList<>();
        scanner = new Scanner(System.in);
        initializeSampleProducts();
    }

    private void initializeSampleProducts() {
        products.add(new Product("P001", "Laptop", "electronics", 999.99));
        products.add(new Product("P002", "Smartphone", "electronics", 699.99));
        products.add(new Product("P003", "Milk", "grocery", 2.99));
        products.add(new Product("P004", "Bread", "grocery", 1.99));
    }

    // View all products
    public void viewAllProducts() {

        System.out.println("ALL PRODUCTS");

        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        System.out.printf("%-10s %-20s %-15s %-10s%n", "ID", "Name", "Category", "Price");

        for (Product product : products) {
            System.out.printf("%-10s %-20s %-15s $%-9.2f%n",
                    product.getProductID(), //get methods
                    product.getProductName(),
                    product.getCategory(),
                    product.getPrice());

        }
    }

    // View detailed product information
    public void viewProductDetails() {
        System.out.print("\nEnter Product ID to view details: ");
        String productID = scanner.nextLine();

        Product product = findProductByID(productID); //encapsulation
        if (product != null) {
            product.displayProduct();
        } else {
            System.out.println("Product not found!");
        }
    }

    // Add a new product
    public void addProduct() {
        System.out.println("ADD NEW PRODUCT");

        System.out.print("Enter Product ID: ");
        String productID = scanner.nextLine();

        // Check if product ID already exists
        if (findProductByID(productID) != null) {
            System.out.println("Product ID already exists!");
            return;
        }

        System.out.print("Enter Product Name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter Description: ");
        String description = scanner.nextLine();

        System.out.print("Enter Category: ");
        String category = scanner.nextLine();

        System.out.print("Enter Price: ");
        double price = 0;
        try {
            price = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid price format!");
            return;
        }

        System.out.print("Enter Stock Quantity: ");
        int stockQuantity = 0;
        try {
            stockQuantity = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid quantity format!");
            return;
        }

        Product newProduct = new Product(productID, productName, category, price);
        //association
        products.add(newProduct);

        System.out.println("\n Product added successfully!");
        newProduct.displayProduct();
    }

    // Search product by name or ID
    public void searchProduct() {
        System.out.println("SEARCH PRODUCT");
        System.out.println("Search by:");
        System.out.println("1. Product ID");
        System.out.println("2. Product Name");
        System.out.println("3. Category");
        System.out.print("Enter choice: ");

        int choice = 0;
        try {
            choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid choice!");
            return;
        }

        System.out.print("Enter search term: ");
        String searchTerm = scanner.nextLine().toLowerCase();
        //composition
        ArrayList<Product> searchResults = new ArrayList<>();

        switch (choice) {
            case 1:
                // Search by ID
                //association
                for (Product product : products) {
                    if (product.getProductID().toLowerCase().contains(searchTerm)) {
                        searchResults.add(product);
                    }
                }
                break;

            case 2:
                // Search by name
                for (Product product : products) {

                    if (product.getProductName().toLowerCase().contains(searchTerm)) {
                        searchResults.add(product);
                    }
                }
                break;

            case 3:
                // Search by category
                //association
                for (Product product : products) {
                    if (product.getCategory().toLowerCase().contains(searchTerm)) {
                        searchResults.add(product);
                    }
                }
                break;

            default:
                System.out.println("Invalid choice!");
                return;
        }

        // Display search results
        if (searchResults.isEmpty()) {
            System.out.println("No products found!");
        } else {
            System.out.println("\nSearch Results (" + searchResults.size() + " found):");
            System.out.printf("%-10s %-20s %-15s %-10s ",
                    "ID", "Name", "Category", "Price", "Stock");
            System.out.println("-".repeat(65));

            for (Product product : searchResults) {
                System.out.printf("%-10s %-20s %-15s $%-9.2f %",
                        product.getProductID(),
                        product.getProductName(),
                        product.getCategory(),
                        product.getPrice()
                );
            }
        }
    }

    // Helper method to find product by ID
    private Product findProductByID(String productID) {
        //association
        for (Product product : products) {
            if (product.getProductID().equalsIgnoreCase(productID)) {
                return product;
            }
        }
        return null;
    }

    // encapsulation
    public ArrayList<Product> getAllProducts() {
        return products;
    }
}
