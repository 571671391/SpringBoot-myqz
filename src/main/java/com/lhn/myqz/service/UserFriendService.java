package com.lhn.myqz.service;

import com.lhn.myqz.entity.UserFriend;

import java.util.List;

public interface UserFriendService {
    //为一个用户添加好友
    public Integer insertUserFriend(UserFriend userFriend);

    //查询一个用户的好友信息
    public List<UserFriend> queryUserFriendByAccountNumber(String accountNumber);

    //将好友移至指定分组
    public Integer updateUserFriendById(UserFriend userFriend);

    //删除一个好友
    public Integer deleteUserFriendById(Integer id);

    //修改好友所属分组
    public Integer updateUserFriend(String accountNumber, String groupings);
}
