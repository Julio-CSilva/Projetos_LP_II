package br.ufrn.imd.domain;

import java.util.ArrayList;

public class Disciplina {
    
    private int id;
    private String ementa;
    private String nome;
    private Curso curso;
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Disciplina(int id, String ementa, String nome){
        setId(id);
        setNome(nome);
        setEmenta(ementa);
    }
    
    public void mostrarAlunos(){
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }

    public void setAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmenta() {
        return ementa;
    }
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    
}
