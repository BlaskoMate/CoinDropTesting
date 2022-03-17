package com.example.demo.model.tip;


import java.time.LocalDate;

public class Tip {
    private long id;
    private int amount;
    private long userId;
    private String pageLink;
    private LocalDate date;
    private Comment comment;

    public Comment getComment(){
        return comment;
    }

    public boolean isUsersDonation(long userId){
        return userId == this.userId;
    }

    public boolean isSameId(long userId) {
        return id == userId;
    }

    public boolean hasSameLink(String pageLink){
        return this.pageLink.equals(pageLink);
    }
}
