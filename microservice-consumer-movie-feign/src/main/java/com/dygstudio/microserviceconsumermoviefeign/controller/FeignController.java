package com.dygstudio.microserviceconsumermoviefeign.controller;

import com.dygstudio.microserviceconsumermoviefeign.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: diyaguang
 * @date: 2018/04/24 下午4:33
 * @description: com.dygstudio.microserviceconsumermoviefeign.controller
 */
@RestController
public class FeignController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("feign/{id}")
    public User findByIdFeign(@PathVariable Long id){
        User user = this.userFeignClient.findByIdFeign(id);
        return user;
    }
}
