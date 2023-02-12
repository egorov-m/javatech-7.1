package com.example.demoweb.service;

import java.util.Optional;

import com.example.demoweb.dao.UserDao;
import com.example.demoweb.model.User;

public class UserService {
    private final UserDao userDao;

    public UserService(UserDao userDao){
        this.userDao = userDao;
    }

    public UserService() {
        this.userDao = new UserDao();
    }

    public void addUser(String login, String email, String password) {
        if (login != null && login != "" && email != null && email != "" && password != null && password != "") {
            User user = new User(login, email, password);
            if (userDao.save(user)) return;
        }
        throw new IllegalArgumentException();
    }

    public boolean validUser(String login, String password) {
        Optional<User> user = userDao.get(login);
        return !user.isEmpty() && user.get().getPassword().equals(password);
    }
}
