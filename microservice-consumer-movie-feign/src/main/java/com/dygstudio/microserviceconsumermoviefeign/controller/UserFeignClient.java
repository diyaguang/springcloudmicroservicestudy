package com.dygstudio.microserviceconsumermoviefeign.controller;

import com.dygstudio.microserviceconsumermoviefeign.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: diyaguang
 * @date: 2018/04/24 下午4:30
 * @description: com.dygstudio.microserviceconsumermoviefeign.controller
 */
@FeignClient(name = "microservice-provider-user")
public interface UserFeignClient {

    @RequestMapping("/{id}")
    public User findByIdFeign(@RequestParam("id") Long id);
}
