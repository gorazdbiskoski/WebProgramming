package mk.ukim.finki.mk.lab.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeRedirectController {
    @GetMapping
    public String getHomePage() {
        return "redirect:/events";
    }
}
