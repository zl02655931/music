package com.itucc.contorller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class DefaultContorller {

    @GetMapping
    public String HelloWorld() {
        return "欢迎构建music app";
    }
}
