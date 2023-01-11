package com.example.learningk8s_advanse.services;

import com.example.learningk8s_advanse.models.Professor;
import com.example.learningk8s_advanse.repositories.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public record ProfessorService(ProfessorRepository professorRepository) {

    public List<Professor> listAll() {
        return this.professorRepository.listAll();
    }

    public Professor addProfessor(Professor professor) {
        return this.professorRepository.addProfessor(professor);
    }

    public Optional<Professor> getById(String id){
        return this.professorRepository.getById(id);
    }

}
