package br.com.farmaciaideal.FarmaciaIdeal.config;

import br.com.farmaciaideal.FarmaciaIdeal.entities.*;
import br.com.farmaciaideal.FarmaciaIdeal.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private TurmaRepository turmaRepository;
    @Autowired
    private DisciplinaRepository disciplinaRepository;
    @Autowired
    private ProfessorRepository professorRepository;


    @Override
    public void run(String... args) throws Exception {

        Curso c1 = new Curso(null, "Enfermagem");
        cursoRepository.save(c1);

        Turma t1 = new Turma(null, "2021.1", c1);
        turmaRepository.save(t1);

        Aluno a1 = new Aluno(null, "jonatas",t1);
        Aluno a2 = new Aluno(null, "Antonio",t1);

        alunoRepository.save(a1);
        alunoRepository.save(a2);

        Professor p1 = new Professor(null, "Jorge");
        professorRepository.save(p1);

        Disciplina d1 = new Disciplina(null, "Anatonia",t1,p1);
        disciplinaRepository.save(d1);

    }
}
