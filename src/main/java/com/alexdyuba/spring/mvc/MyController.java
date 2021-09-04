package com.alexdyuba.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String showInfoAboutEmployee(@RequestParam("imployeeName") String name, Model model) {
        model.addAttribute("nameEmployee", "Mr " + name);
        return "show-employee-details-view";
    }
}
