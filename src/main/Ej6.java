import java.util.Scanner;

public class Ej6 {
    public static int leerMinimo (int[] numeros) {
        int minimo = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        return minimo;
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[10];

        System.out.println("Introduce 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros [i] = scanner.nextInt();
        }

        int minimo = leerMinimo(numeros);

        System.out.println("El numero minimo: " + minimo);
    }
}

