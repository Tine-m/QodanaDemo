package com.example.demo.controller;

import com.example.demo.model.TouristAttraction;
import com.example.demo.repository.TouristRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MyController {

    private TouristRepository repository;
    public MyController(TouristRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    public String sayHello() {
        TouristAttraction toBeUpdated =  new TouristAttraction("SMK", "Museum for Kunst", "Ørestaden", 145, List.of("Kunst", "Museum"));
        TouristAttraction updated = repository.findByName(toBeUpdated.getName());
        System.out.println("inden NY city " + updated);
        repository.updateAttraction(toBeUpdated);
        updated = repository.findByName("SMK");
        System.out.println("update NY city " + updated);

        return "welcome";
    }
}
