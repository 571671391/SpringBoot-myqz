package com.lhn.myqz.service.impl;

import com.lhn.myqz.dao.UserZplDao;
import com.lhn.myqz.entity.UserZpl;
import com.lhn.myqz.service.UserZplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserZplServiceImpl implements UserZplService {

    @Autowired
    UserZplDao userZplDao;

    @Override
    public Integer insertUserZpl(UserZpl userZpl) {
        return userZplDao.insertUserZpl(userZpl);
    }

    @Override
    public List<UserZpl> queryUserZplByAccountNumber() {
        return userZplDao.queryUserZplByAccountNumber();
    }

    @Override
    public Integer deleteUserZpl(Integer id) {
        return null;
    }
}
