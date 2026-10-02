package com.mycompany.greenmanagement;

import java.util.Scanner;

public abstract class USER { // abstarction

    //encapsulation
    private String UserID;
    private String Username;
    private String Password;

    public USER(String UserID, String Username, String Password) { //parameterized constructors
        this.UserID = UserID;
        this.Username = Username;
        this.Password = Password;
    }

    public abstract void login();  //polymorphism

    public abstract void logout();

    public String getUserID() { // encapsulation - get methods
        return UserID;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public boolean authenticate(String inputUsername, String inputPassword) {
        return this.Username.equals(inputUsername) && this.Password.equals(inputPassword);
    }
}
