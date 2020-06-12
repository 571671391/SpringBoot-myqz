package com.lhn.myqz.entity;

import java.io.Serializable;
import java.util.List;

public class UserGroup implements Serializable {
    private Integer id;
    private String accountNumber;
    private String groupings;

    private List<UserFriend> userFriendList;

    @Override
    public String toString() {
        return "UserGroup{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", groupings='" + groupings + '\'' +
                ", userFriendList=" + userFriendList +
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

    public String getGroupings() {
        return groupings;
    }

    public void setGroupings(String groupings) {
        this.groupings = groupings;
    }

    public List<UserFriend> getUserFriendList() {
        return userFriendList;
    }

    public void setUserFriendList(List<UserFriend> userFriendList) {
        this.userFriendList = userFriendList;
    }
}
