package com.lhn.myqz.entity;

import java.io.Serializable;

public class UserDetailedInfo implements Serializable {
    private Integer id;
    private String accountNumber;
    private String name;
    private String interest;
    private Integer luckyNumber;
    private String favoriteGames;
    private String favoriteDishes;
    private String selfDescription;
    private String hometown;
    private String phone;

    @Override
    public String toString() {
        return "UserDetailedInfo{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", name='" + name + '\'' +
                ", interest='" + interest + '\'' +
                ", luckyNumber=" + luckyNumber +
                ", favoriteGames='" + favoriteGames + '\'' +
                ", favoriteDishes='" + favoriteDishes + '\'' +
                ", selfDescription='" + selfDescription + '\'' +
                ", hometown='" + hometown + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public Integer getLuckyNumber() {
        return luckyNumber;
    }

    public void setLuckyNumber(Integer luckyNumber) {
        this.luckyNumber = luckyNumber;
    }

    public String getFavoriteGames() {
        return favoriteGames;
    }

    public void setFavoriteGames(String favoriteGames) {
        this.favoriteGames = favoriteGames;
    }

    public String getFavoriteDishes() {
        return favoriteDishes;
    }

    public void setFavoriteDishes(String favoriteDishes) {
        this.favoriteDishes = favoriteDishes;
    }

    public String getSelfDescription() {
        return selfDescription;
    }

    public void setSelfDescription(String selfDescription) {
        this.selfDescription = selfDescription;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
