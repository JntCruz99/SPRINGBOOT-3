package br.com.farmaciaideal.FarmaciaIdeal.repositories;

import br.com.farmaciaideal.FarmaciaIdeal.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
