package com.daisy.springBootHelloWorld.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrintHello {

    /*
    Handle Endpoint
    localhost/8080/hello
    localhost/8080/hi
     */
    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello";
    }
    @RequestMapping("/hi")
    public String sayHi(){
        return "Hi";
    }
//    To Pass Input From EndPoints
    @RequestMapping("/input/{name}")
    public String sayInput(@PathVariable("name") String name){
        return "Hello "+ name + "!";
    }
}