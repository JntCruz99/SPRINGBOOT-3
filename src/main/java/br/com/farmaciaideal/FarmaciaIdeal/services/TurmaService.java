package br.com.farmaciaideal.FarmaciaIdeal.services;

import br.com.farmaciaideal.FarmaciaIdeal.entities.Turma;
import br.com.farmaciaideal.FarmaciaIdeal.repositories.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TurmaService {

    @Autowired
    private TurmaRepository repository;

    public List<Turma> findAll() {
        return repository.findAll();
    }

    public Turma findById(Long id) {
        Optional<Turma> obj = repository.findById(id);
        return obj.get();
    }
}
