package com.petstore.petstore.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/welcom")
    public @ResponseBody String welcomeMessage(){

        return "Pet Store Application Running!!! Yeah!!!";
    }

    @GetMapping("/")

    public @ResponseBody String welcomePage(){

        return "Message";

    }

    @GetMapping
    public @ResponseBody String dashboardMessage(){

        return "Welcome to the dashboard";
    }
}
