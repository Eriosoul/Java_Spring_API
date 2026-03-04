package com.andrei.primeraApi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller // Correcto para devolver HTML
public class ProjectController {

    @GetMapping("/projects")
    public String projects() {
        return "projects"; // Busca templates/projects.html
    }
    /*
    @GetMapping
    public List<String> getProjects() {
        return List.of("Proyecto 1", "Proyecto 2");
    }*/
}
