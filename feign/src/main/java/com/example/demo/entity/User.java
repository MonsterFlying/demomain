package com.example.demo.entity;


import lombok.Getter;
import lombok.Setter;

/**
 * @author wangguo
 */
@Setter
@Getter
public class User {

    private Long id;

    private String userName;

    private Integer age;


    public User(Long id, String userName, Integer age) {
        this.id = id;
        this.userName = userName;
        this.age = age;
    }

    public User() {
    }
}
