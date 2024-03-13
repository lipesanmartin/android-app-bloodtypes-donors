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

    public List<String> canDonate (String bloodType) {
        List<String> types = new ArrayList<>();
        switch (bloodType) {
            case "A+":
                types.add("A+");
                types.add("AB+");
                break;
            case "A-":
                types.add("A+");
                types.add("A-");
                types.add("AB+");
                types.add("AB-");
                break;
            case "B+":
                types.add("B+");
                types.add("AB+");
                break;
            case "B-":
                types.add("B+");
                types.add("B-");
                types.add("AB+");
                types.add("AB-");
                break;
            case "AB+":
                types.add("AB+");
                break;
            case "AB-":
                types.add("AB+");
                types.add("AB-");
                break;
            case "O+":
                types.add("A+");
                types.add("B+");
                types.add("AB+");
                types.add("O+");
                break;
            case "O-":
                types.add("A+");
                types.add("A-");
                types.add("B+");
                types.add("B-");
                types.add("AB+");
                types.add("AB-");
                types.add("O+");
                types.add("O-");
                break;
        }
        return types;
    }

}
