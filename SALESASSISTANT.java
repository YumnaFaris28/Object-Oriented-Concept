package com.mycompany.greenmanagement;


import com.mycompany.greenmanagement.USER;


public class SALESASSISTANT extends USER { // child class inherits from USER
    
    public SALESASSISTANT(String userID,String username,String password) { // parameterized constructors
        
        super(userID, username, password); 
    }
    
    @Override //polymorphism
    public void login() {
        System.out.println(" Welcome, Sales Assistant!");
 
    }
    
    @Override //polymorphism
    public void logout() {
        System.out.println(" Sales Assistant session ended.");
    }
    
    public void processSale() {
        System.out.println(".... Processing customer sale...");
        System.out.println("   - Scanning items");
        System.out.println("   - Calculating total");
        System.out.println("   - Processing payment");
    }
}

