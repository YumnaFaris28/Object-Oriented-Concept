package com.mycompany.greenmanagement;


import java.util.Date;

public class Report {
//encapsualtion
    private String reportID;
    private String type;
    private Date generateDate;
    private String period;

    public Report(String reportID, String type, Date generateDate, String period) { //parameterized constructor
        
        this.reportID = reportID;
        this.type = type;
        this.generateDate = generateDate;
        this.period = period;
    }

    public String getType() {
        return type;
    }
}

