package br.ufrn.imd.main;

import br.ufrn.imd.domain.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        
        Aluno a1 =  new Aluno(123, 10, "706", "julio");
        Curso c1 = new Curso(1, "BTI");
        Disciplina d1 = new Disciplina(1, "Aprender POO", "LP 2");
        Professor p1 = new Professor(1, "Itamir", "123");
        Disciplina d2 = new Disciplina(2, "aprender edb", "edb");
        c1.setDisciplinas(d1);

        a1.setDisciplinas(d1);
        a1.setDisciplinas(d2);
        d2.setAluno(a1);
        p1.setDisciplinasMinistradas(d1);
        d2.mostrarAlunos();


    }
}
