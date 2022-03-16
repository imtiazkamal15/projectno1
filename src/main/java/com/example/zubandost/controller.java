package com.example.zubandost;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

@RequestMapping("/")
    public String index(){
    return "zindgi yadani deem roi ay nam ent";
}
}
