package br.com.farmaciaideal.FarmaciaIdeal.resources;

import br.com.farmaciaideal.FarmaciaIdeal.entities.Aluno;
import br.com.farmaciaideal.FarmaciaIdeal.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoResource {

    @Autowired
    private AlunoService service;

    @GetMapping
    public ResponseEntity<List<Aluno>> findAll() {
        List<Aluno> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Aluno> findById(@PathVariable Long id) {
        Aluno obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
