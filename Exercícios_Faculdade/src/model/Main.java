package src.model;

import src.model.submodel.Aluno;
import src.model.submodel.Professor;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a matricula do aluno: ");
        long matricula = sc.nextLong();

        System.out.print("Informe o nome do aluno: ");
        String nome = sc.next();

        System.out.print("Informe a sua data de nascimento (ano-mes-dia): ");
        String nascimento = sc.next();
        LocalDate dataNascimento = LocalDate.parse(nascimento);

        System.out.print("Informe a turma que você faz parte: ");
        String turma = sc.next();

        System.out.print("Informe o sexo (M ou F): ");
        char sexo = sc.next().charAt(0);

        Aluno aluno = new Aluno(matricula, nome, dataNascimento, turma, sexo);
    }
}