package cn.com.oyc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HelloWord {

    @RequestMapping("hello")
    public String sayHello(ModelMap model){
        System.out.println("hello Welcome！");
        model.addAttribute("hello","hello welcome!This is my first SpringBoot demo!");
        return "welcome";
    }
}
