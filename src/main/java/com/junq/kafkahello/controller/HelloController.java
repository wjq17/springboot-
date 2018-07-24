package com.junq.kafkahello.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: kafkahello
 * @description: hello world
 * @author: junQiuW
 * @create: 2018-07-24 16:45
 **/
@RestController
@EnableAutoConfiguration
public class HelloController {

  @RequestMapping("/hello")
  private String index(){
    return "Hello World!";
  }
}
