package br.com.farmaciaideal.FarmaciaIdeal.services;

import br.com.farmaciaideal.FarmaciaIdeal.entities.Aluno;
import br.com.farmaciaideal.FarmaciaIdeal.repositories.AlunoRepository;
import br.com.farmaciaideal.FarmaciaIdeal.services.exceptions.ResourceNotFooundExceptions;
import jakarta.persistence.Entity;
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
        return obj.orElseThrow(()-> new ResourceNotFooundExceptions(id));
    }

    public Aluno insert(Aluno obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Aluno update(Long id, Aluno obj){
        Aluno entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Aluno entity, Aluno obj) {
        entity.setNome(obj.getNome());
    }

}
