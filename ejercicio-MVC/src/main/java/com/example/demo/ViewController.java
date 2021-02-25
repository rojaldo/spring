package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class ViewController {

    @Autowired
    private UserRepository repository;
    
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting.html";
    }

    @GetMapping("/users")
    public String users(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("users", repository.findAll());
        return "users.html";
    }
}
