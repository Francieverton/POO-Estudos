package primeirosexercicios;
import java.util.Scanner;

public class EquacaoSegGrau_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de a:");
        double a = scanner.nextDouble();
        System.out.println("Digite o valor de b:");
        double b = scanner.nextDouble();
        System.out.println("Digite o valor de c:");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Não há raízes reais.");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes são: x1 = " + x1 + " e x2 = " + x2);
        }
        scanner.close();
    }
}