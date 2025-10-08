package primeirosexercicios;

import java.util.Scanner;

public class MaiorMenorMediaMultiplo_5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o Primeiro Número:");
        int num1 = sc.nextInt();

        System.out.println("Informe o Segundo Número:");
        int num2 = sc.nextInt();

        System.out.println("Informe o Terceiro Número:");
        int num3 = sc.nextInt();

        int resu = 0, div = 0;

        if (num1%2 == 0){ resu+= num1; div += 1;}
        if (num2%2 == 0){ resu+= num2; div += 1;}
        if (num3%2 == 0){ resu+= num3; div += 1;}

        int Mult = 0;
        if (num1%3 == 0){Mult+=1;}
        if (num2%3 == 0){Mult+=1;}
        if (num3%3 == 0){Mult+=1;}

        System.out.println("o Média dos valores pares é " + resu/div);

        System.out.println("tem " + Mult + " multiplos de 3.");
    }
}
