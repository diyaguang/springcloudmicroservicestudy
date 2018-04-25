package com.dygstudio.microserviceprovideruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: diyaguang
 * @date: 2018/04/24 下午3:35
 * @description: com.dygstudio.microserviceprovideruser.controller
 */
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/{id}")
    public Object findById(@PathVariable Long id){
        return "this is user id is "+id;
    }

    @GetMapping("/instance-info")
    public ServiceInstance showInfo(){
        ServiceInstance localServiceInstance = this.discoveryClient.getLocalServiceInstance();
        return localServiceInstance;
    }
}
