package com.lhn.myqz.service;

import com.lhn.myqz.entity.UserBasicInfo;

import java.util.List;
import java.util.Map;

public interface UserBasicInfoService {
    //添加用户基本信息
    public Integer insertUserBasicInfo(UserBasicInfo userBasicInfo);

    //删除用户基本信息
    public Integer deleteUserBasicInfo(String accountNumber);

    //查询用户基本信息
    public UserBasicInfo queryUserBasicInfoByAccountNumber(UserBasicInfo userBasicInfo);

    public List<UserBasicInfo> queryUserBasicInfo();

    //更新用户基本信息
    public Integer updateUserBasicInfo(UserBasicInfo userBasicInfo);

    //查询是否存在该用户
    public Map<String, Object> queryUserYorN(UserBasicInfo userBasicInfo);
}
