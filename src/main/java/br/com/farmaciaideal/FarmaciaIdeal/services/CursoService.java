package br.com.farmaciaideal.FarmaciaIdeal.services;

import br.com.farmaciaideal.FarmaciaIdeal.entities.Curso;
import br.com.farmaciaideal.FarmaciaIdeal.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    private CursoRepository repository;

    public List<Curso> findAll() {
        return repository.findAll();
    }

    public Curso findById(Long id) {
        Optional<Curso> obj = repository.findById(id);
        return obj.get();
    }
}
