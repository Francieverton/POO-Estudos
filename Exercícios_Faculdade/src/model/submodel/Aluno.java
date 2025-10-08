package src.model.submodel;

import java.time.LocalDate;

public class Aluno {
    private static int contador;
    private long matricula;
    private String nome;
    private LocalDate dataNascimento;
    private String turma;
    private char sexo;

    //construtor sem parâmetros (default)
    public Aluno() {
    }

    //inicializa apenas o parâmetro dito, o resto dica como null ou 0
    public Aluno(long matricula) {
        this.matricula = matricula;
    }

    //construtor com parâmetros
    public Aluno(long matricula, String nome, LocalDate dataNascimento, String turma, char sexo) {
        contador++;
        this.matricula = matricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.turma = turma;
        this.sexo = sexo;
    }

    public static int getContador(){
        return contador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMatricula(){
        this.matricula = matricula;
    }
    public long getMatricula(){
        return matricula;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataNascimento(){
        return dataNascimento;
    }

    public void setTurma(String turma){
        this.turma = turma;
    }

    public String getTurma(){
        return turma;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public char getSexo(){
        return sexo;
    }


}