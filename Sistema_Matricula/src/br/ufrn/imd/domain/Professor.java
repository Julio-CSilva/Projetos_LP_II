package br.ufrn.imd.domain;

import java.util.ArrayList;

public class Professor extends Pessoa{

    private ArrayList<Disciplina> disciplinasMinistradas = new ArrayList<>();

    public Professor(int id, String nome, String cpf){
        this.setId(id);
        this.setNome(nome);
        this.setCpf(cpf);
    }

    public ArrayList<Disciplina> getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    public void setDisciplinasMinistradas(Disciplina disciplina) {
        disciplinasMinistradas.add(disciplina);
    }

}
