package com.example.model;


import org.springframework.data.annotation.Id;
/**
 * Created by mansi.pattani on 5/2/16.
 */
public class User {

    @Id
    private String id;
    private String name;
    private String password;

    public User(){}

    public User(String name, String password){
        this.name = name;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
