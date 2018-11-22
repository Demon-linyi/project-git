package com.example.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sophia")
public class HelloController {
    @Value("${girl.cupSize}")
    private String cupSize;

//    @Value("${content}")
//    private String content;

    @Autowired
    private GirlProperties girlProperties;
    //GirlProperties girlProperties = new GirlProperties();

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return "今天周三";
    }
}
