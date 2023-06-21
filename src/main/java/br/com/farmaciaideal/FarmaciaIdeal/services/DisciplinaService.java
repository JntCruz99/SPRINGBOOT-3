package br.com.farmaciaideal.FarmaciaIdeal.services;

import br.com.farmaciaideal.FarmaciaIdeal.entities.Disciplina;
import br.com.farmaciaideal.FarmaciaIdeal.repositories.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository repository;

    public List<Disciplina> findAll() {
        return repository.findAll();
    }

    public Disciplina findById(Long id) {
        Optional<Disciplina> obj = repository.findById(id);
        return obj.get();
    }
}
