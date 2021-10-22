package com.example.restclientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@SpringBootApplication
public class RestClientDemoApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(RestClientDemoApplication.class, args);
        CatchExc catchExc = new CatchExc();
        catchExc.count();
        catchExc.countTwo();
    }
}
