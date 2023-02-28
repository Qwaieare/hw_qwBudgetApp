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
    public String info(@RequestParam("name") String name,
                       @RequestParam("surname") String surname,
                       @RequestParam("title") String title,
                       @RequestParam("date") String date,
                       @RequestParam("description") String description) {
        return "Информация: " + "меня зовут: " + name + " " + surname +
                ", проект называется: " + title +
                " дата создания проекта: " + date +
                ", краткое описание проекта: " + description;
    }



}
