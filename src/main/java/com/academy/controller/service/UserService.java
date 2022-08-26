package com.academy.controller.service;

import com.academy.controller.model.entity.User;

import java.util.HashMap;
import java.util.List;


public class UserService {

    public String getFullName(String user) {
        HashMap<String, List<String>> hashMap = User.getUserDataBase();
        return hashMap.get(user).get(1) + " " + hashMap.get(user).get(2);
    }


    public String getEmail(String user) {
        HashMap<String, List<String>> hashMap = User.getUserDataBase();
        return hashMap.get(user).get(3);
    }


    public String getRegDate(String user) {
        HashMap<String, List<String>> hashMap = User.getUserDataBase();
        return hashMap.get(user).get(4);
    }
}
