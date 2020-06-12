package com.lhn.myqz.entity;

import java.io.Serializable;

public class UserFriend implements Serializable {
    private Integer id;
    private String accountNumber;
    private String friendAccountNumber;
    private String groupings;

    private String nickName;

    @Override
    public String toString() {
        return "UserFriend{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", friendAccountNumber='" + friendAccountNumber + '\'' +
                ", groupings='" + groupings + '\'' +
                ", nickName='" + nickName + '\'' +
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

    public String getFriendAccountNumber() {
        return friendAccountNumber;
    }

    public void setFriendAccountNumber(String friendAccountNumber) {
        this.friendAccountNumber = friendAccountNumber;
    }

    public String getGroupings() {
        return groupings;
    }

    public void setGroupings(String groupings) {
        this.groupings = groupings;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
