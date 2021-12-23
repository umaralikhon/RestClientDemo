package com.example.restclientdemo.attocomsian.model;

import lombok.Data;

@Data
public class MyPost {
    private Integer userId;
    private Integer id;
    private String title;
    private String body;

    public MyPost(Integer userId, String title, String body) {
        this.userId = userId;
        this.title = title;
        this.body = body;
    }
}
