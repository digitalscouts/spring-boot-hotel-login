package com.ronald.boot.landon.roomwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("/loginpage")
    public String getLoginPage(){
        return "login";
    }
}
