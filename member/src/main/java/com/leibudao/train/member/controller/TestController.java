package com.leibudao.train.member.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World1 member";
    }
}
