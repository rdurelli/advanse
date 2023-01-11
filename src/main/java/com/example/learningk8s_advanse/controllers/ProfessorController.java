package com.example.learningk8s_advanse.controllers;

import com.example.learningk8s_advanse.models.Professor;
import com.example.learningk8s_advanse.services.ProfessorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professors")
public record ProfessorController(ProfessorService professorService) {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Professor> getAllProfessor(){
        return this.professorService.listAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Professor addProfessor(@RequestBody Professor professor) {
        return this.professorService.addProfessor(professor);
    }


    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public Professor getProfessorById(@PathVariable String id){
        return this.professorService.getById(id).get();
    }

}
