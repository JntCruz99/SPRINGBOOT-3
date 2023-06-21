package br.com.farmaciaideal.FarmaciaIdeal.repositories;

import br.com.farmaciaideal.FarmaciaIdeal.entities.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaRepository extends JpaRepository<Nota, Long> {
}
