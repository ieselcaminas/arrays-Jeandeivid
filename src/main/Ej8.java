import java.util.Scanner;

public class Ej8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] anArray = new int[10];

        int sumaPositivos = 0;
        int sumaNegativos = 0;

        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < anArray.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            anArray[i] = scanner.nextInt();

            if (anArray[i] > 0) {
                sumaPositivos += anArray[i];
            } else if (anArray[i] < 0) {
                sumaNegativos += anArray[i];
            }
        }

        System.out.println("La suma de los números positivos es: " + sumaPositivos);
        System.out.println("La suma de los números negativos es: " + sumaNegativos);

    }
}
