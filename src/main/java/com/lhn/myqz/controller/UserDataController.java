package com.lhn.myqz.controller;

import com.lhn.myqz.entity.UserDt;
import com.lhn.myqz.entity.UserTpl;
import com.lhn.myqz.entity.UserZpl;
import com.lhn.myqz.service.UserDataService;
import com.lhn.myqz.service.UserDtService;
import com.lhn.myqz.service.UserTplService;
import com.lhn.myqz.service.UserZplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/dataUser")
@CrossOrigin
public class UserDataController {
    @Autowired
    UserDataService userDataService;

    @PostMapping("/queryAll01")
    public Map<String,Object> queryUserDataForMyqz01(@RequestParam String accountNumber,@RequestParam String selected){
        return userDataService.getAllUserDataForMyqz01(accountNumber,selected);
    }

    @PostMapping("/queryAll02")
    public Map<String,Object> queryUserDataForMyqz02(@RequestParam String accountNumber,@RequestParam String friendAccountNumber){
        return userDataService.getAllUserDataForMyqz02(accountNumber, friendAccountNumber);
    }
}
