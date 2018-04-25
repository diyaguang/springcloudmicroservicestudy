package com.dygstudio.microserviceconsumermovieribbonwithhystrix.service;

import com.dygstudio.microserviceconsumermovieribbonwithhystrix.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 * @author: diyaguang
 * @date: 2018/04/25 下午2:17
 * @description: com.dygstudio.microserviceconsumermovieribbonwithhystrix.service
 */
@Service
public class RibbonHystrixService {
    private RestTemplate restTemplate;
    private static final Logger LOGGER = LoggerFactory.getLogger(RibbonHystrixService.class);

    @HystrixCommand(fallbackMethod = "fallback")
    public User findById(Long id){
        return this.restTemplate.getForObject("http://microservice-provider-user"+id,User.class);
    }

    public User fallback(Long id){
        RibbonHystrixService.LOGGER.info("异常发生，进入 fallback 方法，接收的参数：id={}",id);
        User user = new User();
        user.setId(-1l);
        user.setAge(0);
        user.setUsername("default username");
        return user;
    }
}
