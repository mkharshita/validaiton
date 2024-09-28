package com.validate.validation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.validate.validation.entities.LoginData;

@Controller
public class MyController {

    @GetMapping("/form")
    public String openForm(Model model) {
        model.addAttribute("loginData", new LoginData());
        return "form";
    }

    @PostMapping("/process")
    public String processForm(@ModelAttribute("loginData") LoginData loginData ){
        System.out.println(loginData);
        return "success";
    }
    
}
