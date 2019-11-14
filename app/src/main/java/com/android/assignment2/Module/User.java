package com.android.assignment2.Module;

import java.io.Serializable;

public class User implements Serializable {
    private String Name;
    private String gender;
    private String dob;
    private String country;
    private String phone;
    private String email;
    private String img;
    public User(String Name, String gender, String dob, String country, String phone, String email, String img){

        this.Name  = Name;
        this.gender = gender;
        this.dob = dob;
        this.country  = country;
        this.email  = email;
        this.phone  = phone;
        this.img = img;

    }

    public String getName() {
        return Name;
    }

    public String getGender() {
        return gender;
    }

    public String getDob() {
        return dob;
    }

    public String getCountry() {
        return country;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getImage() {
        return img;
    }
}

