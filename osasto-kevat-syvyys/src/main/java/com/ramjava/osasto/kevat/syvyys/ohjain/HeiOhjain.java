package com.ramjava.osasto.kevat.syvyys.ohjain;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeiOhjain {
    //@RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping("/")
    public String heiSiella() {
        return "Tervetuloa RamJavaan!!!";
    }
}
