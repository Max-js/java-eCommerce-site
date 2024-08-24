package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AboutScreenController {
    @GetMapping("/about")
    public String aboutPage() {
        return "about";
    }
}
