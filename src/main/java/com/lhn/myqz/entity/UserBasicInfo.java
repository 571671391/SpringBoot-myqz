package com.lhn.myqz.entity;

import java.io.Serializable;

public class UserBasicInfo implements Serializable {
    //账号
    private String accountNumber;
    //密码
    private String password;
    //头像
    private String headPortrait;
    //昵称
    private String nickName;
    //个性签名
    private String personalSignature;
    //性别
    private String sex;
    //年龄
    private Integer age;
    //星座
    private String constellation;
    //职业
    private String occupation;
    //悄悄话
    private String whisper;

    @Override
    public String toString() {
        return "UserBasicInfo{" +
                "accountNumber='" + accountNumber + '\'' +
                ", password='" + password + '\'' +
                ", headPortrait='" + headPortrait + '\'' +
                ", nickName='" + nickName + '\'' +
                ", personalSignature='" + personalSignature + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", constellation='" + constellation + '\'' +
                ", occupation='" + occupation + '\'' +
                ", whisper='" + whisper + '\'' +
                '}';
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getPersonalSignature() {
        return personalSignature;
    }

    public void setPersonalSignature(String personalSignature) {
        this.personalSignature = personalSignature;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getWhisper() {
        return whisper;
    }

    public void setWhisper(String whisper) {
        this.whisper = whisper;
    }
}
