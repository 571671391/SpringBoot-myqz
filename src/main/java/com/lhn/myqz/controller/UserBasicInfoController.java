package com.lhn.myqz.controller;

import com.lhn.myqz.entity.UserBasicInfo;
import com.lhn.myqz.service.UserBasicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/infoBasic")
@CrossOrigin
public class UserBasicInfoController {
    @Autowired
    UserBasicInfoService userBasicInfoService;

    @PostMapping(value = "/insertUser")
    public Map<String, Object> insertUserBasicInfo(@RequestBody UserBasicInfo userBasicInfo) {
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success", userBasicInfoService.insertUserBasicInfo(userBasicInfo));
        return modelMap;
    }

    @PostMapping(value = "/deleteUser")
    public Map<String, Object> deleteUserBasicInfo() {
        Map<String, Object> modelMap = new HashMap<>();
        return modelMap;
    }

    @PostMapping(value = "/queryUserByAccountNumber")
    public Map<String, Object> queryUserBasicInfoByAccountNumber(@RequestBody UserBasicInfo userBasicInfo, HttpSession session) {
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success", userBasicInfoService.queryUserBasicInfoByAccountNumber(userBasicInfo));
        session.setAttribute("accountNumber",userBasicInfo.getAccountNumber());
        return modelMap;
    }

    @PostMapping(value = "/queryUserYorN")
    public Map<String, Object> queryUserYorN(@RequestBody UserBasicInfo userBasicInfo) {
        return userBasicInfoService.queryUserYorN(userBasicInfo);
    }

    @PostMapping(value = "/updateUser")
    public Map<String, Object> updateUserBasicInfo(@RequestBody UserBasicInfo userBasicInfo) {
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success", userBasicInfoService.updateUserBasicInfo(userBasicInfo));
        return modelMap;
    }
}
