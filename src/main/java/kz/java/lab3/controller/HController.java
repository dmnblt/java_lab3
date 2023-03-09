package kz.java.lab3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Lab3");
        return "home";
    }
}
