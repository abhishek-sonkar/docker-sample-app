package com.dockersample.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Welcome {
    @RequestMapping(value = "welcome", method = RequestMethod.GET)
    public String welcome() {
        return new String("Welcome to docker sample app");
    }
}
