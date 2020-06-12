package com.lhn.myqz.service.impl;

import com.lhn.myqz.dao.*;
import com.lhn.myqz.entity.*;
import com.lhn.myqz.service.UserBasicInfoService;
import com.lhn.myqz.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
public class UserDataServiceImpl implements UserDataService {
    @Autowired
    UserBasicInfoDao userBasicInfoDao;
    @Autowired
    UserDetailedInfoDao userDetailedInfoDao;
    @Autowired
    UserGroupDao userGroupDao;
    @Autowired
    UserFriendDao userFriendDao;
    @Autowired
    UserDtDao userDtDao;
    @Autowired
    UserTplDao userTplDao;
    @Autowired
    UserZplDao userZplDao;
    @Autowired
    RedisTemplate redisTemplate;

    @Override
    public Map<String, Object> getAllUserDataForMyqz01(String accountNumber, String selected) {
        RedisSerializer redisSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(redisSerializer);
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<UserGroup> group = new ArrayList<UserGroup>();
        List<UserFriend> fri = new ArrayList<UserFriend>();
        List<UserDt> dt = new ArrayList<UserDt>();
        List<UserTpl> tpl = new ArrayList<UserTpl>();
        List<UserZpl> zpl = new ArrayList<UserZpl>();
        group = userGroupDao.queryUserGroupByAccountNumber(accountNumber);
        fri = userFriendDao.queryUserFriendByAccountNumber(accountNumber);
        dt = userDtDao.queryUserDtByAccountNumber(accountNumber, selected, null);
        tpl = userTplDao.queryUserTplByAccountNumber();
        zpl = userZplDao.queryUserZplByAccountNumber();
        for (UserGroup userGroup : group) {
            List<UserFriend> fri1 = new ArrayList<UserFriend>();
            for (UserFriend userFriend : fri) {
                if (userGroup.getGroupings().equals(userFriend.getGroupings())) {
                    fri1.add(userFriend);
                }
            }
            userGroup.setUserFriendList(fri1);
        }
        //第二种for遍历ArrayList方式
        for (int i = 0; i < tpl.size(); i++) {
            List<UserZpl> zpl1 = new ArrayList<UserZpl>();
            for (int j = 0; j < zpl.size(); j++) {
                if (tpl.get(i).getId() == zpl.get(j).getTplId()) {
                    zpl1.add(zpl.get(j));
                }
            }
            tpl.get(i).setUserZplList(zpl1);
        }
        for (UserDt userDt : dt) {
            List<UserTpl> tpl1 = new ArrayList<UserTpl>();
            for (UserTpl userTpl : tpl) {
                if (userDt.getId() == userTpl.getDtId()) {
                    tpl1.add(userTpl);
                }
            }
            userDt.setUserTplList(tpl1);
        }
        modelMap.put("userBasicInfo", queryUserBasicInfoByAccountNumber(accountNumber));
        modelMap.put("userDetailedInfo", queryUserDetailedInfoByAccountNumber(accountNumber));
        modelMap.put("userGroup", group);
        modelMap.put("userDt", dt);
        return modelMap;
    }

    @Override
    public Map<String, Object> getAllUserDataForMyqz02(String accountNumber, String friendAccountNumber) {
        RedisSerializer redisSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(redisSerializer);
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<UserDt> dt = new ArrayList<UserDt>();
        List<UserTpl> tpl = new ArrayList<UserTpl>();
        List<UserZpl> zpl = new ArrayList<UserZpl>();
        dt = userDtDao.queryUserDtByAccountNumber(accountNumber, null, friendAccountNumber);
        tpl = userTplDao.queryUserTplByAccountNumber();
        zpl = userZplDao.queryUserZplByAccountNumber();
        for (int i = 0; i < tpl.size(); i++) {
            List<UserZpl> zpl1 = new ArrayList<UserZpl>();
            for (int j = 0; j < zpl.size(); j++) {
                if (tpl.get(i).getId() == zpl.get(j).getTplId()) {
                    zpl1.add(zpl.get(j));
                }
            }
            tpl.get(i).setUserZplList(zpl1);
        }
        for (UserDt userDt : dt) {
            List<UserTpl> tpl1 = new ArrayList<UserTpl>();
            for (UserTpl userTpl : tpl) {
                if (userDt.getId() == userTpl.getDtId()) {
                    tpl1.add(userTpl);
                }
            }
            userDt.setUserTplList(tpl1);
        }
        modelMap.put("userBasicInfo01", queryUserBasicInfoByAccountNumber(accountNumber));
        modelMap.put("userBasicInfo02", queryUserBasicInfoByAccountNumber(friendAccountNumber));
        modelMap.put("userDetailedInfo", queryUserDetailedInfoByAccountNumber(accountNumber));
        modelMap.put("userDt", dt);
        return modelMap;
    }

    //进行redis缓存
    public UserBasicInfo queryUserBasicInfoByAccountNumber(String accountNumber) {
        UserBasicInfo userBasicInfo = new UserBasicInfo();
        userBasicInfo.setAccountNumber(accountNumber);
        String key = "tb_basic" + ":" + accountNumber;
        ValueOperations<String, UserBasicInfo> operations = redisTemplate.opsForValue();
        boolean hasKey = redisTemplate.hasKey(key);
        if (hasKey) {
            System.out.println(key+"=========>"+"redis缓存读取");
            userBasicInfo = operations.get(key);
            return userBasicInfo;
        } else {
            System.out.println(key+"=========>"+"mysql数据库读取");
            UserBasicInfo userBasicInfo01 = new UserBasicInfo();
            userBasicInfo01 = userBasicInfoDao.queryUserBasicInfoByAccountNumber(userBasicInfo);
            operations.set(key, userBasicInfo01, 1, TimeUnit.HOURS);
            return userBasicInfo01;
        }
    }

    //进行redis缓存
    public UserDetailedInfo queryUserDetailedInfoByAccountNumber(String accountNumber) {
        UserDetailedInfo userDetailedInfo = new UserDetailedInfo();
        String key = "tb_detailed" + ":" + accountNumber ;
        ValueOperations<String, UserDetailedInfo> operations = redisTemplate.opsForValue();
        boolean hasKey = redisTemplate.hasKey(key);
        if (hasKey) {
            System.out.println(key+"=========>"+"redis缓存读取");
            userDetailedInfo = operations.get(key);
            return userDetailedInfo;
        } else {
            System.out.println(key+"=========>"+"mysql数据库读取");
            userDetailedInfo = userDetailedInfoDao.queryUserDetailedInfoByAccountNumber(accountNumber);
            operations.set(key, userDetailedInfo, 1, TimeUnit.HOURS);
            return userDetailedInfo;
        }
    }

}
