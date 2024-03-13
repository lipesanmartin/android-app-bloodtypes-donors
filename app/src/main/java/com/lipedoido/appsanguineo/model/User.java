package com.lipedoido.appsanguineo.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String bloodType;

    public User(String type) {
        this.bloodType = type;
    }

    public String getType() {
        return bloodType;
    }

    public void setType(String type) {
        this.bloodType = type;
    }

    public List<String> canReceiveBlood (String bloodType) {
        List<String> bloodTypes = new ArrayList<>();
        switch (bloodType) {
            case "A+":
                bloodTypes.add("A+");
                bloodTypes.add("A-");
                bloodTypes.add("O+");
                bloodTypes.add("O-");
                break;
            case "A-":
                bloodTypes.add("A-");
                bloodTypes.add("O-");
                break;
            case "B+":
                bloodTypes.add("B+");
                bloodTypes.add("B-");
                bloodTypes.add("O+");
                bloodTypes.add("O-");
                break;
            case "B-":
                bloodTypes.add("B-");
                bloodTypes.add("O-");
                break;
            case "AB+":
                bloodTypes.add("A+");
                bloodTypes.add("A-");
                bloodTypes.add("B+");
                bloodTypes.add("B-");
                bloodTypes.add("AB+");
                bloodTypes.add("AB-");
                bloodTypes.add("O+");
                bloodTypes.add("O-");
                break;
            case "AB-":
                bloodTypes.add("A-");
                bloodTypes.add("B-");
                bloodTypes.add("AB-");
                bloodTypes.add("O-");
                break;
            case "O+":
                bloodTypes.add("O+");
                bloodTypes.add("O-");
                break;
            case "O-":
                bloodTypes.add("O-");
                break;
        }
        return bloodTypes;
    }


}
