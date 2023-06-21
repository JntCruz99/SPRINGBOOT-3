package br.com.farmaciaideal.FarmaciaIdeal.repositories;


import br.com.farmaciaideal.FarmaciaIdeal.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
