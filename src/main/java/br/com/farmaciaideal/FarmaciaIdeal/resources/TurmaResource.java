package br.com.farmaciaideal.FarmaciaIdeal.resources;

import br.com.farmaciaideal.FarmaciaIdeal.entities.Turma;
import br.com.farmaciaideal.FarmaciaIdeal.services.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/turmas")
@CrossOrigin(origins = "*")
public class TurmaResource {

    @Autowired
    private TurmaService service;

    @GetMapping
    public ResponseEntity<List<Turma>> findAll() {
        List<Turma> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Turma> findById(@PathVariable Long id) {
        Turma obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
