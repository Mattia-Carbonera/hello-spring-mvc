package org.lessons.java.hello_spring_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String home() {
        return new String("index");
    }
    
    
    @GetMapping("/about")
    public String about() {
        return new String("aboutPage");
    }

    @GetMapping("/contacts")
    public String contacts(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "/contacts";
    }
    
    

}
