package com.odoevskogo_llc_enc.utility_server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @GetMapping("/")
    public String hello() {
        return "index";
    }
}
