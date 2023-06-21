package br.com.farmaciaideal.FarmaciaIdeal.services;

import br.com.farmaciaideal.FarmaciaIdeal.entities.Aluno;
import br.com.farmaciaideal.FarmaciaIdeal.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public List<Aluno> findAll() {
        return repository.findAll();
    }

    public Aluno findById(Long id) {
        Optional<Aluno> obj = repository.findById(id);
        return obj.get();
    }
}
