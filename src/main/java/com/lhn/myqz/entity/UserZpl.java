package com.lhn.myqz.entity;

import java.io.Serializable;

public class UserZpl implements Serializable {
    private Integer id;
    private Integer tplId;
    private String leftAccountNumber;
    private String rightAccountNumber;
    private String zplContent;
    private String createTime;

    private String headPortrait;
    private String leftNickName;
    private String rightNickName;

    @Override
    public String toString() {
        return "UserZpl{" +
                "id=" + id +
                ", tplId=" + tplId +
                ", leftAccountNumber='" + leftAccountNumber + '\'' +
                ", rightAccountNumber='" + rightAccountNumber + '\'' +
                ", zplContent='" + zplContent + '\'' +
                ", createTime='" + createTime + '\'' +
                ", headPortrait='" + headPortrait + '\'' +
                ", leftNickName='" + leftNickName + '\'' +
                ", rightNickName='" + rightNickName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTplId() {
        return tplId;
    }

    public void setTplId(Integer tplId) {
        this.tplId = tplId;
    }

    public String getLeftAccountNumber() {
        return leftAccountNumber;
    }

    public void setLeftAccountNumber(String leftAccountNumber) {
        this.leftAccountNumber = leftAccountNumber;
    }

    public String getRightAccountNumber() {
        return rightAccountNumber;
    }

    public void setRightAccountNumber(String rightAccountNumber) {
        this.rightAccountNumber = rightAccountNumber;
    }

    public String getZplContent() {
        return zplContent;
    }

    public void setZplContent(String zplContent) {
        this.zplContent = zplContent;
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

    public String getLeftNickName() {
        return leftNickName;
    }

    public void setLeftNickName(String leftNickName) {
        this.leftNickName = leftNickName;
    }

    public String getRightNickName() {
        return rightNickName;
    }

    public void setRightNickName(String rightNickName) {
        this.rightNickName = rightNickName;
    }
}
