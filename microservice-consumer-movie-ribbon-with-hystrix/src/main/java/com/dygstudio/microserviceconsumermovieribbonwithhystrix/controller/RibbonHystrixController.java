package com.dygstudio.microserviceconsumermovieribbonwithhystrix.controller;

import com.dygstudio.microserviceconsumermovieribbonwithhystrix.entity.User;
import com.dygstudio.microserviceconsumermovieribbonwithhystrix.service.RibbonHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: diyaguang
 * @date: 2018/04/25 下午2:30
 * @description: com.dygstudio.microserviceconsumermovieribbonwithhystrix.controller
 */
@RestController
public class RibbonHystrixController {

    @Autowired
    private RibbonHystrixService ribbonHystrixService;

    @RequestMapping("/ribbon/{id}")
    public User findById(@PathVariable Long id){
        return this.ribbonHystrixService.findById(id);
    }
}
