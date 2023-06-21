package br.com.farmaciaideal.FarmaciaIdeal.services;

import br.com.farmaciaideal.FarmaciaIdeal.entities.Professor;
import br.com.farmaciaideal.FarmaciaIdeal.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository repository;

    public List<Professor> findAll() {
        return repository.findAll();
    }

    public Professor findById(Long id) {
        Optional<Professor> obj = repository.findById(id);
        return obj.get();
    }
}
