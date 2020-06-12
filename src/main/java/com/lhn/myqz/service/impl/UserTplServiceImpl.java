package com.lhn.myqz.service.impl;

import com.lhn.myqz.dao.UserTplDao;
import com.lhn.myqz.entity.UserTpl;
import com.lhn.myqz.service.UserTplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTplServiceImpl implements UserTplService {

    @Autowired
    UserTplDao userTplDao;

    @Override
    public Integer insertUserTpl(UserTpl userTpl) {
        return userTplDao.insertUserTpl(userTpl);
    }

    @Override
    public List<UserTpl> queryUserTplByAccountNumber() {
        return userTplDao.queryUserTplByAccountNumber();
    }

    @Override
    public Integer deleteUserTpl(Integer id) {
        return null;
    }
}
