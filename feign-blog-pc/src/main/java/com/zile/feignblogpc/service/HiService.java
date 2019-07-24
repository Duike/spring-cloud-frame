package com.zile.feignblogpc.service;

import com.zile.feignblogpc.fallback.HiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zileShi on 2019/6/28 0028.
 **/
@FeignClient(value = "service-bolg",fallback = HiHystric.class)
public interface HiService {

    @GetMapping(value = "/hi")
    public String hi(@RequestParam(value = "name") String name);

}
