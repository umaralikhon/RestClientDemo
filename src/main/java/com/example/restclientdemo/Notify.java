package com.example.restclientdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Data
@Configuration
@AllArgsConstructor
@PropertySource("classpath:application.properties")
public class Notify {

    @Autowired
    private Environment env;

    @NonNull
    private String[] to;

    @NonNull
//    @Value("Hello world!")
    private String subject;

    @NonNull
    private String message;

    private NotifyType type;

    private Long delay;

    private String[] hashtags;

    public Notify(){
        this.to = new String[]{"1"};
        this.subject = "Subject";
        this.hashtags = new String[]{"hashtags"};
        this.type = NotifyType.COMMON;
    }

    public Notify(String message){
        this();
        this.message = message;
    }
}