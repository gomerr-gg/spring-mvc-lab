package com.example.spring_mv_lab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("textHello", "Hello Kasdi From Model Attribute");
        return "about";
    }
}

