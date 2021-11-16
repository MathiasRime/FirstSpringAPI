package com.ynov.demoapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/helloworld")
    public String getHelloWorld(){
        return "Hello World !";
    }

    @GetMapping("/helloworld/{str}")
    public String getHelloWorldWithParam(@PathVariable("str") String str){ return "hello " + str + " !" ;}

    @PostMapping("/helloworld")
    public void postHelloWorld(@RequestBody String str){ logger.info("Received : " + str);}
}
