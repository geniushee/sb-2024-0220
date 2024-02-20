package com.ll.sb20240220.home.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class homeController {
    @GetMapping("/")
    @ResponseBody
    public String showHome(){
        return "<h1>Hello world!</h1>";
    }
}
