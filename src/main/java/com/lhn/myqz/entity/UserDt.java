package com.lhn.myqz.entity;

import java.io.Serializable;
import java.util.List;

public class UserDt implements Serializable {
    private Integer id;
    private String accountNumber;
    private String createTime;
    private String dtContent;
    private String dtImg;
    private String dtPopularity;
    private String base64;

    private String headPortrait;
    private String nickName;

    private List<UserTpl> userTplList;

    @Override
    public String toString() {
        return "UserDt{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", createTime='" + createTime + '\'' +
                ", dtContent='" + dtContent + '\'' +
                ", dtImg='" + dtImg + '\'' +
                ", dtPopularity='" + dtPopularity + '\'' +
                ", base64='" + base64 + '\'' +
                ", headPortrait='" + headPortrait + '\'' +
                ", nickName='" + nickName + '\'' +
                ", userTplList=" + userTplList +
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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDtContent() {
        return dtContent;
    }

    public void setDtContent(String dtContent) {
        this.dtContent = dtContent;
    }

    public String getDtImg() {
        return dtImg;
    }

    public void setDtImg(String dtImg) {
        this.dtImg = dtImg;
    }

    public String getDtPopularity() {
        return dtPopularity;
    }

    public void setDtPopularity(String dtPopularity) {
        this.dtPopularity = dtPopularity;
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
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

    public List<UserTpl> getUserTplList() {
        return userTplList;
    }

    public void setUserTplList(List<UserTpl> userTplList) {
        this.userTplList = userTplList;
    }
}
