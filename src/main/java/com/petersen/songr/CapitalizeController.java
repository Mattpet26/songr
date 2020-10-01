package com.petersen.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CapitalizeController {
    @GetMapping("/capitalize/{to}")
    public String capitalize(Model mPotato, @PathVariable String to){
        System.out.println(to.toUpperCase());

        mPotato.addAttribute("message", to.toUpperCase());
        return "capitalize";
    }
}
