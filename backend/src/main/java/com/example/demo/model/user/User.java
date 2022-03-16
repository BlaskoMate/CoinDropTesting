package com.example.demo.model.user;

import java.util.Objects;

public class User {
    private final long id;
    private Content userContent;
    private String userName;
    private String email;
    private String password;
    private String profileImage;

    public User(long id, Content userContent, String userName, String email, String password, String profileImage) {
        this.id = id;
        this.userContent = userContent;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.profileImage = profileImage;
    }

    public boolean isSameCategory(Category category){
        return userContent.getCategory() == category;
    }

    public String getEndpoint(){
        return userContent.getPageLink();
    }

    public boolean hasSameEndpoint(String pageLink){
        return userContent.getPageLink().equals(pageLink);
    }

    public boolean isUserHasSameName(String name){
        return Objects.equals(userName, name);
    }

    public void payUser(){

    }

    public boolean hasSameId(long id){
        return this.id == id;
    }

    public String getUserName() {
        return userName;
    }
}
