package com.lhn.myqz.controller;

import com.lhn.myqz.entity.UserGroup;
import com.lhn.myqz.service.UserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/group")
@CrossOrigin
public class UserGroupController {
    @Autowired
    UserGroupService userGroupService;

    @PostMapping(value="/insert")
    public Map<String,Object> insertUserGroup(@RequestBody UserGroup userGroup){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put("success",userGroupService.insertUserGroup(userGroup));
        return modelMap;
    }

    @PostMapping(value="/delete")
    public Map<String,Object> deleteUserGroupById(@RequestBody UserGroup userGroup){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put("success",userGroupService.deleteUserGroupById(userGroup));
        return modelMap;
    }

    @PostMapping(value="/update")
    public Map<String,Object> updateUserGroupById(@RequestBody UserGroup userGroup){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put("success",userGroupService.updateUserGroupById(userGroup));
        return modelMap;
    }
}
