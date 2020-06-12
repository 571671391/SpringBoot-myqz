package com.lhn.myqz.dao;

import com.lhn.myqz.entity.UserBasicInfo;
import com.lhn.myqz.entity.UserDetailedInfo;

import java.util.List;
import java.util.Map;

public interface UserBasicInfoDao {
    //添加用户基本信息
    public Integer insertUserBasicInfo(UserBasicInfo userBasicInfo);

    //删除用户基本信息
    public Integer deleteUserBasicInfo(String accountNumber);

    //查询用户基本信息
    public UserBasicInfo queryUserBasicInfoByAccountNumber(UserBasicInfo userBasicInfo);
    public List<UserBasicInfo> queryUserBasicInfo();

    //更新用户基本信息
    public Integer updateUserBasicInfo(UserBasicInfo userBasicInfo);
}
