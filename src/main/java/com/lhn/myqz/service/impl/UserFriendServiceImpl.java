package com.lhn.myqz.service.impl;

import com.lhn.myqz.dao.UserFriendDao;
import com.lhn.myqz.entity.UserFriend;
import com.lhn.myqz.service.UserFriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFriendServiceImpl implements UserFriendService {
    @Autowired
    UserFriendDao userFriendDao;

    @Override
    public Integer insertUserFriend(UserFriend userFriend) {
        return userFriendDao.insertUserFriend(userFriend);
    }

    @Override
    public List<UserFriend> queryUserFriendByAccountNumber(String accountNumber) {
        return null;
    }

    @Override
    public Integer updateUserFriendById(UserFriend userFriend) {
        return userFriendDao.updateUserFriendById(userFriend);
    }

    @Override
    public Integer deleteUserFriendById(Integer id) {
        return userFriendDao.deleteUserFriendById(id);
    }

    @Override
    public Integer updateUserFriend(String accountNumber, String groupings) {
        return null;
    }
}
