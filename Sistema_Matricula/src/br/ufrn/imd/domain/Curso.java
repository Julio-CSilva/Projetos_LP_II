package br.ufrn.imd.domain;

import java.util.ArrayList;

public class Curso {
    
    private int id;
    private String nomeCurso;
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Curso(int id, String nome){
        this.setId(id);
        this.setNomeCurso(nomeCurso);
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNomeCurso() {
        return nomeCurso;
    }


    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }


    public void Disciplinas() {
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina.getNome());
        }
    }

    public void setDisciplinas(Disciplina materia) {
        disciplinas.add(materia);
    }


    @Override
    public String toString() {
        return "id = " + id + "\n Curso = " + nomeCurso;
    }


}
