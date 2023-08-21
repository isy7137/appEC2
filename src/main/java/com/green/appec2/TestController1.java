package com.green.appec2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/web")
public class TestController1 {

    @GetMapping("/nice")
    public String hi(){
        return "gvfs";
    }

    @GetMapping("/nice3")
    public String hi(Model model)
    {
        model.addAttribute("today", "Monday");
        return "data";

    }

}
