package com.mycompany.greenmanagement;


import java.util.Date;

public class Sales {
//encapsulation
    private String salesID;
    private Date date;
    private double totalAmount;
    private String paymentMethod;

    public Sales(String salesID, Date date, double totalAmount, String paymentMethod) { // parametrized constructors
        this.salesID = salesID;
        this.date = date;
        this.totalAmount = totalAmount;
        this.paymentMethod = paymentMethod;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
