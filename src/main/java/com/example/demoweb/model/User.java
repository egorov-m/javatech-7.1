package com.example.demoweb.model;

public class User {
    private String login;
    private String password;
    private String email;

    public User(String login, String email, String password) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof User) {
            User user = (User) o;
            if (user.getEmail() == this.email) return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return this.email.hashCode();
    }
}
