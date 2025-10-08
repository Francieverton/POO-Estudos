package primeirosexercicios;

import java.util.Scanner;

public class NumeroPerfeito_3 {
    static void main(String[] args) {
        System.out.println("Digite um numero: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int k, resu = 0;

        for (k=1; k<number; k++){
            if (number%k == 0){
                resu += k;
            }
        }
        if (number == resu){
            System.out.printf("o número %d é um número perfeito!",number);
        } else if (number != resu){
            System.out.printf("o número %d não é um número perfeito!", number);
        }
    }
}