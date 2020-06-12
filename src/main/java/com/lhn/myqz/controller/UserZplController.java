package com.lhn.myqz.controller;

import com.lhn.myqz.entity.UserZpl;
import com.lhn.myqz.service.UserZplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/zplData")
@CrossOrigin
public class UserZplController {
    @Autowired
    UserZplService userZplService;

    @PostMapping("/insert")
    public Map<String, Object> insertUserZpl(@RequestBody UserZpl userZpl) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success",userZplService.insertUserZpl(userZpl));
        return modelMap;
    }
}
