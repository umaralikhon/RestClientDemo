package com.example.restclientdemo;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
@Component
@Configuration
public class RestTemplateDemo {
    private Notify notify;
    private RestTemplate restTemplate;

    public RestTemplateDemo(){
    }

    public void getTemplate(Notify notify) {
        this.notify = notify;
        restTemplate = new RestTemplate();

        ResponseEntity<Notify> response = restTemplate.postForEntity("http://localhost:9096/api/v1/tg", notify, Notify.class);
        log.info(response.toString());
    }
}
