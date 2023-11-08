package com.bzk.basic.system.service;

import com.bzk.basic.api.DeptService;
import com.bzk.basic.api.SystemService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class DeptServiceImpl implements DeptService {

    @DubboReference
    SystemService systemService;

    @Override
    public String getSystemSayHello(String name) {
        String s = systemService.sayHello(name);
        System.out.println(s);
        return s;
    }
}
