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

    @Autowired
    private NotaRepository notaRepository;


    @Override
    public void run(String... args) throws Exception {

        Curso c1 = new Curso(null, "Enfermagem");
        Curso c2 = new Curso(null, "Radiologia");
        cursoRepository.save(c1);
        cursoRepository.save(c2);


        Turma t1 = new Turma(null, "2021.1", c1);
        Turma t2 = new Turma(null, "2021.2", c2);
        turmaRepository.save(t2);
        turmaRepository.save(t1);

        Aluno a1 = new Aluno(null, "jonatas",t1);
        Aluno a2 = new Aluno(null, "Antonio",t2);

        alunoRepository.save(a1);
        alunoRepository.save(a2);

        Professor p1 = new Professor(null, "Jorge");
        Professor p2 = new Professor(null, "Amanda");
        professorRepository.save(p1);
        professorRepository.save(p2);

        Disciplina d1 = new Disciplina(null, "Anatonia",t1,p1);
        Disciplina d3 = new Disciplina(null, "AnatoniaII",t1,p1);
        Disciplina d2 = new Disciplina(null, "Radiologia",t2,p2);
        disciplinaRepository.save(d1);
        disciplinaRepository.save(d2);
        disciplinaRepository.save(d3);

        Nota n1 = new Nota(null, 7.2, a1, d1);
        Nota n2 = new Nota(null, 9.2, a1, d3);
        notaRepository.save(n1);
        notaRepository.save(n2);

    }
}
