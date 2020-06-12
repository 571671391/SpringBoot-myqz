package com.lhn.myqz.controller;

import com.lhn.myqz.entity.UserDt;
import com.lhn.myqz.service.UserDtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/dtData")
@CrossOrigin
public class UserDtController {
    @Autowired
    UserDtService userDtService;

    @PostMapping("/insert")
    public Map<String,Object> insertUserDt(@RequestBody UserDt userDt, OutputStream os) throws IOException {
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put("success",userDtService.insertUserDt(userDt,os));
        return modelMap;
    }

    @PostMapping("/update")
    public Map<String,Object> updateUserDt(@RequestBody UserDt userDt){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put("success",userDtService.updateUserDt(userDt));
        return modelMap;
    }
}
