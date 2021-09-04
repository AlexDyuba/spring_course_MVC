package com.alexdyuba.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showView() {
        return "first-view";
    }

    @RequestMapping("askDetails")
    public String showFormForName() {
        return "ask-employee-details-view";
    }

    @RequestMapping("showDetails")
    public String showInfoAboutEmployee() {
        return "show-employee-details-view";
    }
}
