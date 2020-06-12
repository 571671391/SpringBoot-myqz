package com.lhn.myqz.service.impl;

import com.lhn.myqz.dao.UserBasicInfoDao;
import com.lhn.myqz.dao.UserDetailedInfoDao;
import com.lhn.myqz.dao.UserFriendDao;
import com.lhn.myqz.dao.UserGroupDao;
import com.lhn.myqz.entity.UserBasicInfo;
import com.lhn.myqz.entity.UserDetailedInfo;
import com.lhn.myqz.entity.UserFriend;
import com.lhn.myqz.entity.UserGroup;
import com.lhn.myqz.service.UserBasicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
public class UserBasicInfoServiceImpl implements UserBasicInfoService {
    @Autowired
    UserBasicInfoDao userBasicInfoDao;
    @Autowired
    UserDetailedInfoDao userDetailedInfoDao;
    @Autowired
    UserGroupDao userGroupDao;
    @Autowired
    UserFriendDao userFriendDao;
    @Autowired
    RedisTemplate redisTemplate;

    @Override
    public Integer insertUserBasicInfo(UserBasicInfo userBasicInfo) {
        int num = (int) (1 + Math.random() * 5);
        String a = "../resources/static/images/moren0";
        String b = ".jpg";
        String headPortrait = a + num + b;
        userBasicInfo.setHeadPortrait(headPortrait);
        UserDetailedInfo userDetailedInfo = new UserDetailedInfo();
        UserGroup userGroup = new UserGroup();
        UserFriend userFriend = new UserFriend();

        userDetailedInfo.setAccountNumber(userBasicInfo.getAccountNumber());
        userGroup.setAccountNumber(userBasicInfo.getAccountNumber());
        userGroup.setGroupings("我的好友");
        userFriend.setAccountNumber(userBasicInfo.getAccountNumber());
        userFriend.setFriendAccountNumber(userBasicInfo.getAccountNumber());
        userFriend.setGroupings("我的好友");

        userDetailedInfoDao.insertUserDetailedInfo(userDetailedInfo);
        userGroupDao.insertUserGroup(userGroup);
        userFriendDao.insertUserFriend(userFriend);
        return userBasicInfoDao.insertUserBasicInfo(userBasicInfo);
    }

    @Override
    public UserBasicInfo queryUserBasicInfoByAccountNumber(UserBasicInfo userBasicInfo) {
        return userBasicInfoDao.queryUserBasicInfoByAccountNumber(userBasicInfo);
    }

    @Override
    public Map<String, Object> queryUserYorN(UserBasicInfo userBasicInfo) {
        Map<String, Object> modelMap = new HashMap<>();
        UserBasicInfo userBasicInfo01 = new UserBasicInfo();
        userBasicInfo01 = userBasicInfoDao.queryUserBasicInfoByAccountNumber(userBasicInfo);
        if (userFriendDao.queryUserFriendYorN(userBasicInfo.getHeadPortrait(), userBasicInfo.getAccountNumber()) > 0) {
            modelMap.put("msg", "1");
            modelMap.put("success", "该用户已是你的好友！！！");
        } else if (userBasicInfo01 != null && !"".equals(userBasicInfo01)) {
            modelMap.put("msg", "2");
            modelMap.put("success", userBasicInfo01);
        } else {
            modelMap.put("msg", "1");
            modelMap.put("success", "该用户不存在！！！");
        }
        return modelMap;
    }

    @Override
    public Integer updateUserBasicInfo(UserBasicInfo userBasicInfo) {
        ValueOperations<String, UserBasicInfo> operations = redisTemplate.opsForValue();
        String key = "tb_basic" + ":" +userBasicInfo.getAccountNumber();
        boolean haskey = redisTemplate.hasKey(key);
        if (haskey) {
            /*redisTemplate.delete(key);
            System.out.println(key+ "=========>" + "删除缓存");*/
            System.out.println(key+ "=========>" + "缓存更新");
            operations.set(key, userBasicInfo, 1, TimeUnit.HOURS);
        }
        return userBasicInfoDao.updateUserBasicInfo(userBasicInfo);
    }

    @Override
    public Integer deleteUserBasicInfo(String accountNumber) {
        return null;
    }

    @Override
    public List<UserBasicInfo> queryUserBasicInfo() {
        return null;
    }


}
