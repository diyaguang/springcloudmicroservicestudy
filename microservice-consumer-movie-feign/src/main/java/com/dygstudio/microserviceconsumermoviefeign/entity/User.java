package com.dygstudio.microserviceconsumermoviefeign.entity;

/**
 * @author: diyaguang
 * @date: 2018/04/24 下午4:27
 * @description: com.dygstudio.microserviceconsumermoviefeign.entity
 */
public class User {
    private Long id;
    private String username;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
