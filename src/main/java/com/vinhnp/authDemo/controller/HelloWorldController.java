package com.vinhnp.authDemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/hello-world")
public class HelloWorldController {

    @GetMapping("/get-value-hello-world")
    public ResponseEntity<?> getStringHelloWorld(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .header("hello test","hihi123")
                .body("Hello world");
    }

}
