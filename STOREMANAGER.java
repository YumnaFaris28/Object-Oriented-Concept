package com.mycompany.greenmanagement;


import com.mycompany.greenmanagement.USER;
import java.util.Scanner;

public class STOREMANAGER extends USER { // child class inherits from USER
    
    public STOREMANAGER(String userID,String username,String password) { //parameterized constructor
        
        super(userID, username, password); 
    }
    
    @Override // polymorphism
    public void login() {
        System.out.println("Welcome, Store Manager!");
  
    }
    
    @Override //polymorphism
    public void logout() {
        System.out.println(" Store Manager session ended.");
    }
    
    public void generateReport() {
        System.out.println(" Generating management report...");
        System.out.println("   - Sales Summary");
        System.out.println("   - Inventory Status");
        System.out.println("   - Staff Performance");
    }
}

