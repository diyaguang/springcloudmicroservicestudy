package com.dygstudio.microserviceconsumermovieribbon.service;

import com.dygstudio.microserviceconsumermovieribbon.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: diyaguang
 * @date: 2018/04/24 下午4:01
 * @description: com.dygstudio.microserviceconsumermovieribbon.service
 */
@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public User findById(Long id){
        return this.restTemplate.getForObject("http://microservice-provider-user/"+id,User.class);
    }
}
