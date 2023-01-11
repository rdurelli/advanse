package com.example.learningk8s_advanse.repositories;

import com.example.learningk8s_advanse.models.Professor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProfessorRepository {

    private List<Professor> professors = new ArrayList<>();

    public List<Professor> listAll() {
        return this.professors;
    }

    public Professor addProfessor(Professor professor) {
        this.professors.add(professor);
        return professor;
    }

    public Optional<Professor> getById(String id) {
        return this.professors.stream().filter(professor -> professor.id().equals(id)).findFirst();
    }

}
