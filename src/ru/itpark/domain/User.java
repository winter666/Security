package ru.itpark.domain;

import java.util.List;

public class User {
    private int id;
    private String login;
    private String password;
    private List<String> permissions;

    public User(int id, String login, String password, List<String> permissions) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.permissions = permissions;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }
}
