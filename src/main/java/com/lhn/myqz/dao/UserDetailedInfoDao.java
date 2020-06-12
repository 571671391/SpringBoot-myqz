package com.lhn.myqz.dao;

import com.lhn.myqz.entity.UserDetailedInfo;

import java.util.List;

public interface UserDetailedInfoDao {
    //查询用户详细信息
    public UserDetailedInfo queryUserDetailedInfoByAccountNumber(String accountNumber);
    public List<UserDetailedInfo> queryUserDetailedInfo();

    //更新用户详细信息
    public Integer updateUserDetailedInfo(UserDetailedInfo userDetailedInfo);

    //插入用户详细信息
    public Integer insertUserDetailedInfo(UserDetailedInfo userDetailedInfo);
}
