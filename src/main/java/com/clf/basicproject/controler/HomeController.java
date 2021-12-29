package com.clf.basicproject.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/index")
    public String index() {
        return "hello world";
    }

}
