package com.dygstudio.microserviceconsumermovieribbon.controller;

import com.dygstudio.microserviceconsumermovieribbon.entity.User;
import com.dygstudio.microserviceconsumermovieribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: diyaguang
 * @date: 2018/04/24 下午4:04
 * @description: com.dygstudio.microserviceconsumermovieribbon.controller
 */
@RestController
@RequestMapping("/api/ribbon")
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        return this.ribbonService.findById(id);
    }
}
