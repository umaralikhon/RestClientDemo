package com.example.restclientdemo.attocomsian.get;

import com.example.restclientdemo.attocomsian.model.MyPost;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
public class RestTemplateTest {
    private RestTemplate restTemplate;

    public RestTemplateTest(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }

    public String sendSimpleGetReq(){
        String url = "https://jsonplaceholder.typicode.com/posts";
        return restTemplate.getForObject(url, String.class);
    }

    public MyPost[] getMyPostAsObject(){
        String url = "https://jsonplaceholder.typicode.com/posts";
        return restTemplate.getForObject(url, MyPost[].class);
    }

    public MyPost getMyPostWithUrlParameter(){
        String url = "https://jsonplaceholder.typicode.com/posts/{id}";
        return restTemplate.getForObject(url, MyPost.class, 1);
    }

    public MyPost responseHandling(){
        String url = "https://jsonplaceholder.typicode.com/posts/{id}";
        ResponseEntity<MyPost> response = restTemplate.getForEntity(url, MyPost.class, 2);

        if(response.getStatusCodeValue() == 200){
            return response.getBody();
        }else{
            return null;
        }
    }

    public MyPost setHeaders(){
        String url = "https://jsonplaceholder.typicode.com/posts/{id}";

        HttpHeaders httpHeaders =  new HttpHeaders();
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        httpHeaders.set("request-source", "desktop");

        HttpEntity request = new HttpEntity(httpHeaders);

        ResponseEntity<MyPost> response = restTemplate.exchange(url, HttpMethod.GET, request, MyPost.class, 3);

        if(response.getStatusCode() == HttpStatus.OK){
            return response.getBody();
        }else{
            return null;
        }
    }

    @Bean
    public void display(){
        System.out.println(sendSimpleGetReq());


//        MyPost[] myPost = getMyPostAsObject();
//
//        for(MyPost m : myPost){
//            System.out.println(m.toString());
//        }


//        System.out.println(getMyPostWithUrlParameter().toString());

//        System.out.println(responseHandling());

//        System.out.println(setHeaders());
    }

}
