package pro.sky.budgetapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {


    @GetMapping
    public String helloWorld() {
        return "Hello, World!";
    }

    @GetMapping("/info")
    public String info(@RequestParam String info) {
        return "Page: " + info;
    }



}
