package br.com.farmaciaideal.FarmaciaIdeal.resources;

import br.com.farmaciaideal.FarmaciaIdeal.entities.Professor;
import br.com.farmaciaideal.FarmaciaIdeal.entities.Professor;
import br.com.farmaciaideal.FarmaciaIdeal.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/professores")
@CrossOrigin(origins = "*")
public class ProfessorResource {

    @Autowired
    private ProfessorService service;

    @GetMapping
    public ResponseEntity<List<Professor>> findAll() {
        List<Professor> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Professor> findById(@PathVariable Long id) {
        Professor obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
