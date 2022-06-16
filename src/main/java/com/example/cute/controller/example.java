package com.example.cute.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author gu
 * @date 2022/6/16
 */
@RestController
@RequestMapping("/e/e")
public class example {

    @GetMapping("/test")
    public List<String> test(){
        return Arrays.asList("aa","cc");
    }
}
