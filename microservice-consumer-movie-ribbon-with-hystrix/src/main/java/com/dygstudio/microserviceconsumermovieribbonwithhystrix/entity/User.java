package com.dygstudio.microserviceconsumermovieribbonwithhystrix.entity;

/**
 * @author: diyaguang
 * @date: 2018/04/25 下午2:07
 * @description: com.dygstudio.microserviceconsumermovieribbonwithhystrix.entity
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
