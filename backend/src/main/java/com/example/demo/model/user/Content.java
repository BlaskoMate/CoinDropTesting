package com.example.demo.model.user;

import java.util.List;

public class Content {
    private Category category;
    private List<String> contentUrls;
    private String description;
    private String pageLink;
    private String profileImage;
    private String userName;
    private long userId;


    public String getPageLink(){
        return pageLink;
    }

    public Category getCategory(){
        return category;
    }

    public List<String> getContentUrls(){
        return contentUrls;
    }

    public long getUserId(){
        return userId;
    }

    public String getDescription(){
        return description;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getProfileImage() {
        return profileImage;
    }
}
