package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhangchao
 * @date 2020/8/5 9:20
 * @description xxx
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public CommonResult<String> hello(){
        return new CommonResult<>(Code.SUCCESS, "hello, 冠希");
    }

    @GetMapping("/hello/sayHello")
    public CommonResult<String> sayHello(String name){
        return new CommonResult<>(Code.SUCCESS, "hello, " + name);
    }
}
