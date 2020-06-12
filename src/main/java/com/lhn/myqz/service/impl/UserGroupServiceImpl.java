package com.lhn.myqz.service.impl;

import com.lhn.myqz.dao.UserFriendDao;
import com.lhn.myqz.dao.UserGroupDao;
import com.lhn.myqz.entity.UserGroup;
import com.lhn.myqz.service.UserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserGroupServiceImpl implements UserGroupService {
    @Autowired
    UserGroupDao userGroupDao;
    @Autowired
    UserFriendDao userFriendDao;

    @Override
    public Integer insertUserGroup(UserGroup userGroup) {
        return userGroupDao.insertUserGroup(userGroup);
    }

    @Override
    public Integer deleteUserGroupById(UserGroup userGroup) {
        userFriendDao.updateUserFriend(userGroup.getAccountNumber(), userGroup.getGroupings());
        return userGroupDao.deleteUserGroupById(userGroup.getId());
    }

    @Override
    public Integer updateUserGroupById(UserGroup userGroup) {
        return userGroupDao.updateUserGroupById(userGroup);
    }

    @Override
    public List<UserGroup> queryUserGroupByAccountNumber(String accountNumber) {
        return null;
    }
}
