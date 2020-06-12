package com.lhn.myqz.dao;

import com.lhn.myqz.entity.UserDt;

import java.io.OutputStream;
import java.util.List;


public interface UserDtDao {
    //添加动态信息
    public Integer insertUserDt(UserDt userDt);

    //查询一个用户和他的好友的所有动态信息
    public List<UserDt> queryUserDtByAccountNumber(String accountNumber,String selected,String friendAccountNumber);

    //删除一条动态信息
    public Integer deleteUserDt(Integer id);

    //根据ID修改dt数据
    public Integer updateUserDt(UserDt userDt);

}
