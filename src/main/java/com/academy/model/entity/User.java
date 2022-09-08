package com.academy.model.entity;

import java.time.LocalDateTime;

public class User {
    private String username;
    private String password;
    private String firstName;
    private String secondName;
    private String email;
    private LocalDateTime regDate;


    // TODO pattern Builder (when add user function will be active)
    public User(String username, String password, String firstName, String secondName, String email, LocalDateTime regDate) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.regDate = regDate;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }
}