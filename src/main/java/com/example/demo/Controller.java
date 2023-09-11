package com.example.demo;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Dobrodošli u moju Spring web aplikaciju!");
        return "index"; // Prikazuje view s imenom "index"
    }
}