package com.lhn.myqz.service.impl;

import com.lhn.myqz.dao.UserDetailedInfoDao;
import com.lhn.myqz.entity.UserBasicInfo;
import com.lhn.myqz.entity.UserDetailedInfo;
import com.lhn.myqz.service.UserDetailedInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class UserDetailedInfoServiceImpl implements UserDetailedInfoService {

    @Autowired
    UserDetailedInfoDao userDetailedInfoDao;
    @Autowired
    RedisTemplate redisTemplate;

    @Override
    public Integer updateUserDetailedInfo(UserDetailedInfo userDetailedInfo) {
        ValueOperations<String, UserDetailedInfo> operations = redisTemplate.opsForValue();
        String key = "tb_Detailed" + ":" +userDetailedInfo.getAccountNumber();
        boolean haskey = redisTemplate.hasKey(key);
        if (haskey) {
            /*redisTemplate.delete(key);
            System.out.println(key+ "=========>" + "删除缓存");*/
            System.out.println(key+ "=========>" + "缓存更新");
            operations.set(key, userDetailedInfo, 1, TimeUnit.HOURS);
        }
        return userDetailedInfoDao.updateUserDetailedInfo(userDetailedInfo);
    }
}
