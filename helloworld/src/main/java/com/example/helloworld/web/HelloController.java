package com.example.helloworld.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class HelloController {
 @RequestMapping("/hello")
 public String hello(@RequestParam String name, String location) {
 return "Welcome to the " + location + " " + name + "!";
 }
}