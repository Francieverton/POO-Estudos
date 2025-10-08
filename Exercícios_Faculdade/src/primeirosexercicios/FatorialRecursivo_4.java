package primeirosexercicios;

public class FatorialRecursivo_4 {

    public static int FatorialRecursivo(int n){
        if (n==1){
            return n;
        }
        return  n * FatorialRecursivo(n-1);
    }

    static void main(String[] args) {
        int numero = 5;
        int resultado = FatorialRecursivo(numero);
        System.out.printf("o fatorial de %d é %d",numero,resultado);
    }
}