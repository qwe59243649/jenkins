package com.example.jenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 柯辉煌
 * @Date 2019年11月05日
 * @Description
 */
@Controller
@RequestMapping("/test")
public class Test {

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "Hello World!!!";
    }
}
