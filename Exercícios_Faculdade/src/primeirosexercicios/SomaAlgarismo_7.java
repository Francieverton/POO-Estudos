package primeirosexercicios;

import java.util.Scanner;

public class SomaAlgarismo_7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int number = sc.nextInt();

        int div1 = number/100;
        int div2 = number%100;
        int div3 = div2/10;
        int div4 = div2%10;

        int resultado = div1+div4+div3;

        System.out.println("A soma dos algarismos de "+ number +" é igual a "+resultado);
    }
}
