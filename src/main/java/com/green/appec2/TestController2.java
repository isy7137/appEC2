package com.green.appec2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/web")
public class TestController2 {

    @GetMapping("/nice2")
    public String hi(){
        return "this is nice2 string";
    }

}
