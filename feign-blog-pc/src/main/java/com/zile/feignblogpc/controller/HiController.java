package com.zile.feignblogpc.controller;

import com.zile.feignblogpc.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zileShi on 2019/6/28 0028.
 **/
@RestController
public class HiController {

    @Autowired
    private HiService hiService;


    @GetMapping(value = "sayHi")
    public String sayHi(@RequestParam String name){
        return hiService.hi(name);
    }

}
