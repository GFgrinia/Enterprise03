package com.academy.controller.model.entity;

import java.util.HashMap;
import java.util.List;

public class User {

    // To keep it simple without using real DB....
    // We use  user with preloaded username, password etc.
    // This prototype stores password insecurely....
    private static HashMap<String, List<String>> userDataBase = new HashMap<>();


    // Class initializer
    static {
        userDataBase.put("username", List.of("password", "Yury", "Hrytsuk", "yury.asdasf@gmail.com", "Jan 01 2020"));
    }


    // Get DB to check credentials
    public static HashMap<String, List<String>> getUserDataBase() {
        return userDataBase;
    }

}