package br.com.farmaciaideal.FarmaciaIdeal.services;

import br.com.farmaciaideal.FarmaciaIdeal.entities.Nota;
import br.com.farmaciaideal.FarmaciaIdeal.repositories.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotaService {

    @Autowired
    private NotaRepository repository;

    public List<Nota> findAll() {
        return repository.findAll();
    }

    public Nota findById(Long id) {
        Optional<Nota> obj = repository.findById(id);
        return obj.get();
    }
}
