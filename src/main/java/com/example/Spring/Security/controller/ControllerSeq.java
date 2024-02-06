package com.example.Spring.Security.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ControllerSeq {

    @GetMapping("/public")
    public String publicPage() {
        return "publicPage";
    }


    @GetMapping("/privat")
    public String privatPage(){
        return "privatPage";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }


}
