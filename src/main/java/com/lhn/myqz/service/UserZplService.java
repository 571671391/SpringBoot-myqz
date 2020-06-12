package com.lhn.myqz.service;

import com.lhn.myqz.entity.UserZpl;

import java.util.List;

public interface UserZplService {
    //添加子评论信息
    public Integer insertUserZpl(UserZpl userZpl);

    //查询所有子评论信息
    public List<UserZpl> queryUserZplByAccountNumber();

    //删除一条子评论信息
    public Integer deleteUserZpl(Integer id);
}
