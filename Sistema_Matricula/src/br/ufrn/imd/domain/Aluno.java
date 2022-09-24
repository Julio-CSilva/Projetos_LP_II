package br.ufrn.imd.domain;

import java.util.ArrayList;

public class Aluno extends Pessoa{

    private int matricula;
    private Curso curso;
    private double ira;
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Aluno(int matricula, double ira, String cpf, String nome){
        setCpf(cpf);
        setIra(ira);
        setMatricula(matricula);
        setNome(nome);
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public double getIra() {
        return ira;
    }
    public void setIra(double ira) {
        this.ira = ira;
    }
    public void Disciplinas() {
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina.getNome());
        }
    }
    public void setDisciplinas(Disciplina materia) {
        disciplinas.add(materia);
    }
    
    
}
