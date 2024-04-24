package com.example.plug;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class User {
    String login;
    String password;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    LocalDateTime date;
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
