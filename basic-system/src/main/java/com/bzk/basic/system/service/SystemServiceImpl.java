package com.bzk.basic.system.service;

import com.bzk.basic.api.SystemService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class SystemServiceImpl implements SystemService {

    @Override
    public String sayHello(String name) {
        return "Hello,"+name;
    }
}
