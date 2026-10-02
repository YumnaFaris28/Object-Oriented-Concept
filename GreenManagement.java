package com.mycompany.greenmanagement;

import java.util.Scanner;
import java.util.AbstractList;
import java.util.Date;

public class GreenManagement {

    private static USER[] USER = { //polymorphism array - can hold different subclasses
        new STOREMANAGER("M001", "manager", "admin123"), //STOREMANAGER object
        new SALESASSISTANT("A001", "assistant", "user456") //SALESASSISTANT object
    };

    // Product Manager instance
    private static ProductManager productManager = new ProductManager();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("     GREEN MANAGEMENT SYSTEM");

        // Login Process
        System.out.print("\nEnter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        USER loggedInUser = authenticateUser(username, password);

        if (loggedInUser == null) {
            System.out.println("\n✗ Login failed! Invalid credentials.");
            scanner.close();
            return;
        }

        loggedInUser.login();

        // Show system data based on user role
        showSystemData(loggedInUser);

        // Show PRODUCT MANAGEMENT MENU
        showProductManagementMenu(loggedInUser, scanner);

        // Show role-specific actions
        System.out.println("ROLE-SPECIFIC ACTIONS");

        if (loggedInUser instanceof STOREMANAGER) {  // checks if object is STOREMANAGER
            STOREMANAGER manager = (STOREMANAGER) loggedInUser;
            manager.generateReport();
        } else if (loggedInUser instanceof SALESASSISTANT) { // checks if object is SALESASSISTANT
            SALESASSISTANT assistant = (SALESASSISTANT) loggedInUser;
            assistant.processSale();
        }

        // Logout
        loggedInUser.logout();

        scanner.close();
    }

    private static USER authenticateUser(String username, String password) {
        for (USER user : USER) {
            if (user.authenticate(username, password)) {
                return user;
            }
        }
        return null;
    }

    private static void showSystemData(USER user) {  // associates with multiple other classes
        System.out.println("SYSTEM DATA");

        // Create object from classes
        Product laptop = new Product("P001", "Laptop", "Electronics", 1200.00);

        Sales sale1 = new Sales("SALE001", new Date(), 2400.00, "Credit Card");

        Inventory inventory = new Inventory("INV001", new Date(), 150);

        Report report = new Report("REP001", "Sales Report", new Date(), "Monthly");

        // Display data
        System.out.println("Product: " + laptop.getProductName() + ", Price: $" + laptop.getPrice());
        System.out.println("Sales Total: $" + sale1.getTotalAmount());
        System.out.println("Inventory Items: " + inventory.getTotalItems());
        System.out.println("Report Type: " + report.getType());
    }

    private static void showProductManagementMenu(USER user, Scanner scanner) {
        boolean continueMenu = true;

        while (continueMenu) {
             System.out.println("PRODUCT MANAGEMENT MENU");
             System.out.println("1. View All Products");
            System.out.println("2. View Product Details");
            System.out.println("3. Add New Product");
            System.out.println("4. Search Product");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    productManager.viewAllProducts();
                    break;

                case 2:
                    productManager.viewProductDetails();
                    break;

                case 3:
                    // Check if user has permission (Store Manager only)
                    if (user instanceof STOREMANAGER) {
                        productManager.addProduct();
                    } else {
                        System.out.println("\nAccess denied! Only Store Managers can add products.");
                    }
                    break;

                case 4:
                    productManager.searchProduct();
                    break;

                case 5:
                    continueMenu = false;
                    System.out.println("Returning to main menu...");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter 1-5.");
            }
        }
    }

}
