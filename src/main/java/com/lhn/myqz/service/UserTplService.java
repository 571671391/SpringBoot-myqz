package com.lhn.myqz.service;

import com.lhn.myqz.entity.UserTpl;

import java.util.List;

public interface UserTplService {
    //添加头评论信息
    public Integer insertUserTpl(UserTpl userTpl);

    //查询所有头评论信息
    public List<UserTpl> queryUserTplByAccountNumber();

    //删除一条头评论信息
    public Integer deleteUserTpl(Integer id);
}
