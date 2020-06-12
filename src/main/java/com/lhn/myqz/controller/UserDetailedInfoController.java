package com.lhn.myqz.controller;

import com.lhn.myqz.entity.UserDetailedInfo;
import com.lhn.myqz.service.UserDetailedInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/infoDetailed")
@CrossOrigin
public class UserDetailedInfoController {
    @Autowired
    UserDetailedInfoService userDetailedInfoService;

    @PostMapping(value = "/updateUser")
    public Map<String,Object> updateUserDetailedInfo(@RequestBody UserDetailedInfo userDetailedInfo){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put("success", userDetailedInfoService.updateUserDetailedInfo(userDetailedInfo));
        return modelMap;
    }
}
