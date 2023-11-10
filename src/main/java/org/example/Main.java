package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    public static void main(String[] args) {
        User user = new User("Danya","Belovol");
        Gson gson = new GsonBuilder().create();
        System.out.println(gson.toJson(user));
    }
}