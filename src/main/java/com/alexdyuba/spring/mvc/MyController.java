package com.alexdyuba.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showView() {
        return "first-view";
    }

    @RequestMapping("askDetails")
    public String showFormForName(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-employee-details-view";
    }

    @RequestMapping("showDetails")
    public String showInfoAboutEmployee(@ModelAttribute(name = "employee") Employee employee) {
        return "show-employee-details-view";
    }
}
