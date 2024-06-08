package com.example.trabalhopoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "Login/index"; // Nome do arquivo login.html
    }

    @GetMapping("/default")
    public String defaultAfterLogin() {
        return "redirect:/usuario";
    }
}
