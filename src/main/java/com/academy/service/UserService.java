package com.academy.service;

import com.academy.model.entity.User;

import java.time.format.DateTimeFormatter;

public class UserService {


    public String getFullName(User user) {
        return user.getFirstName() + " " + user.getSecondName();
    }


    public String getEmail(User user) {
        return user.getEmail();
    }


    public String getRegDate(User user) {
        return user.getRegDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm"));
    }
}
