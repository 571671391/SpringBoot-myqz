package com.lhn.myqz.service;

import com.lhn.myqz.entity.UserGroup;

import java.util.List;

public interface UserGroupService {
    //为一个用户添加好友分组
    public Integer insertUserGroup(UserGroup userGroup);

    //查询一个用户的好友分组信息
    public List<UserGroup> queryUserGroupByAccountNumber(String accountNumber);

    //删除一个好友分组
    public Integer deleteUserGroupById(UserGroup userGroup);

    //修改好友所属分组
    public Integer updateUserGroupById(UserGroup userGroup);
}
