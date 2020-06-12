package com.lhn.myqz.controller;

import com.lhn.myqz.entity.UserTpl;
import com.lhn.myqz.service.UserTplService;
import com.lhn.myqz.service.UserZplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/tplData")
@CrossOrigin
public class UserTplController {
    @Autowired
    UserTplService userTplService;

    @PostMapping("/insert")
    public Map<String, Object> insertUserTpl(@RequestBody UserTpl userTpl) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success",userTplService.insertUserTpl(userTpl));
        return modelMap;
    }
}
