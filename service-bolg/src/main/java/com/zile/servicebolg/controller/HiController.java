package com.zile.servicebolg.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zileShi on 2019/6/28 0028.
 **/
@RestController
public class HiController {


    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String hi(@RequestParam(value = "name") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
