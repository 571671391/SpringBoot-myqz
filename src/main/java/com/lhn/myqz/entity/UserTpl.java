package com.lhn.myqz.entity;

import java.io.Serializable;
import java.util.List;

public class UserTpl implements Serializable {
    private Integer id;
    private Integer dtId;
    private String accountNumber;
    private String tplContent;
    private String createTime;

    private String headPortrait;
    private String nickName;

    private List<UserZpl> userZplList;

    @Override
    public String toString() {
        return "UserTpl{" +
                "id=" + id +
                ", dtId=" + dtId +
                ", accountNumber='" + accountNumber + '\'' +
                ", tplContent='" + tplContent + '\'' +
                ", createTime='" + createTime + '\'' +
                ", headPortrait='" + headPortrait + '\'' +
                ", nickName='" + nickName + '\'' +
                ", userZplList=" + userZplList +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDtId() {
        return dtId;
    }

    public void setDtId(Integer dtId) {
        this.dtId = dtId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getTplContent() {
        return tplContent;
    }

    public void setTplContent(String tplContent) {
        this.tplContent = tplContent;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public List<UserZpl> getUserZplList() {
        return userZplList;
    }

    public void setUserZplList(List<UserZpl> userZplList) {
        this.userZplList = userZplList;
    }
}
