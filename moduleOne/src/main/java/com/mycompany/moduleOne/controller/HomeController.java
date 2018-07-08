package com.mycompany.moduleOne.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {


    @GetMapping("/")
    public String home(@RequestParam(name = "name", required = false, defaultValue = "Anonymous") String name, Model model) {
        model.addAttribute("name", name);
        return "home";
    }
}
