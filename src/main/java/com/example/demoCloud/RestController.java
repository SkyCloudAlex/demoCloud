package com.example.demoCloud;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/7/14 0014.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("/hello")
    public String helloWorld(){
        return "hello";
    }

}
