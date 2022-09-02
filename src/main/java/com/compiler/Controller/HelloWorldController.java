package com.compiler.Controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description
 *
 * @author Tesla Liu
 * Date 2022/9/2 17:17
 */

@EnableAutoConfiguration
@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello World! I'm Bean";
    }
}