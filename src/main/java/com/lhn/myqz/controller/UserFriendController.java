package com.lhn.myqz.controller;

import com.lhn.myqz.entity.UserFriend;
import com.lhn.myqz.service.UserFriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/friend")
@CrossOrigin
public class UserFriendController {
    @Autowired
    UserFriendService userFriendService;

    @PostMapping(value = "/insert")
    public Map<String, Object> insertUserFriend(@RequestBody UserFriend userFriend) {
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success", userFriendService.insertUserFriend(userFriend));
        return modelMap;
    }

    @PostMapping(value = "/update")
    public Map<String, Object> updateUserFriendById(@RequestBody UserFriend userFriend) {
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success", userFriendService.updateUserFriendById(userFriend));
        return modelMap;
    }

    @PostMapping(value = "/delete")
    public Map<String, Object> deleteUserFriendById(@RequestParam Integer id) {
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success", userFriendService.deleteUserFriendById(id));
        return modelMap;
    }

}
