package src.model.submodel;

import java.time.LocalDate;

public class Professor {
    long matricula;
    String nome;
    LocalDate dataNascimento;
    String disciplina;
    String formacao;

    public Professor(long matricula, String nome, LocalDate dataNascimento, String disciplina, String formação){
        this.matricula = matricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.disciplina = disciplina;
        this.formacao = formacao;
    }
}