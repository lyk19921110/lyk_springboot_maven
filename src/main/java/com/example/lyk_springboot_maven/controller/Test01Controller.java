package com.example.lyk_springboot_maven.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/test01")
@RestController
public class Test01Controller {

    @RequestMapping("/method01")
    public Map getTest(){
        Map map=new HashMap();
        map.put("login","我也是醉了");
        return map;
    }
}
