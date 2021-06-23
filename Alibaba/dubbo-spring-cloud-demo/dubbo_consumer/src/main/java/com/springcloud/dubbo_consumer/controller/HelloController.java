package com.springcloud.dubbo_consumer.controller;

import com.springcloud.dubbo_api.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/9/3
 * @Time: 22:14
 * @email: inwsy@hotmail.com
 * Description:
 */
@RestController
@RefreshScope
public class HelloController {

    @Value("${name:zzx}")
    private String name;

    @Reference
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        return helloService.hello(name);
    }
}
