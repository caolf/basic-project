package com.clf.basicproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import({
        com.clf.basicproject.auth.SecurityConfig.class
})
@SpringBootApplication
public class BasicProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicProjectApplication.class, args);
    }

}
