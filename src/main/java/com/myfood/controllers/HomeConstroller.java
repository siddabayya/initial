package com.myfood.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeConstroller {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}
