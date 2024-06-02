package com.example.demo.controller;

import com.example.demo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class DemoController {
    @GetMapping("/demo")
    public String demo(Model model) {
        String message = "Hello, Thymeleaf!";
        List<String> items = Arrays.asList("Item 1", "Item 2", "Item 3");
        Person person = new Person("John Doe", 30);
        boolean showLink = true;
        String searchQuery = "thymeleaf";
        int containerId = 1;
        double totalPrice = 99.99;

        model.addAttribute("message", message);
        model.addAttribute("items", items);
        model.addAttribute("person", person);
        model.addAttribute("showLink", showLink);
        model.addAttribute("searchQuery", searchQuery);
        model.addAttribute("containerId", containerId);
        model.addAttribute("totalPrice", totalPrice);

        return "demo";
    }
}