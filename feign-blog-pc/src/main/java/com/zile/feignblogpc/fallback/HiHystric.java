package com.zile.feignblogpc.fallback;

import com.zile.feignblogpc.service.HiService;
import org.springframework.stereotype.Component;

/**
 * Created by zileShi on 2019/6/28 0028.
 **/
@Component
public class HiHystric implements HiService {

    @Override
    public String hi(String name) {
        return "服务崩溃, " + name;
    }
}
