package com.mycompany.greenmanagement;


import java.util.Date;

public class Inventory {
//encapsulation
    private String inventoryID;
    private Date lastUpdated;
    private int totalItems;

    public Inventory(String inventoryID, Date lastUpdated, int totalItems) { // parametrized constructors
        this.inventoryID = inventoryID;
        this.lastUpdated = lastUpdated;
        this.totalItems = totalItems;
    }

    public int getTotalItems() { //get method
        return totalItems;
    }
}

