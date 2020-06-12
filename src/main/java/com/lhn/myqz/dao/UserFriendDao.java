package com.lhn.myqz.dao;

import com.lhn.myqz.entity.UserFriend;

import java.util.List;

public interface UserFriendDao {
    //为一个用户添加好友
    public Integer insertUserFriend(UserFriend userFriend);

    //查询一个用户的好友信息
    public List<UserFriend> queryUserFriendByAccountNumber(String accountNumber);

    //查询一个用户是否存在这个好友
    public Integer queryUserFriendYorN(String accountNumber, String friendAccountNumber);

    //将好友移至指定分组
    public Integer updateUserFriendById(UserFriend userFriend);

    //删除一个好友
    public Integer deleteUserFriendById(Integer id);

    //删除分组将分组内好友移至默认分组
    public Integer updateUserFriend(String accountNumber, String groupings);
}
