package br.com.farmaciaideal.FarmaciaIdeal.resources;

import br.com.farmaciaideal.FarmaciaIdeal.entities.Nota;
import br.com.farmaciaideal.FarmaciaIdeal.services.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/notas")
public class NotaResource {

    @Autowired
    private NotaService service;

    @GetMapping
    public ResponseEntity<List<Nota>> findAll() {
        List<Nota> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Nota> findById(@PathVariable Long id) {
        Nota obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
