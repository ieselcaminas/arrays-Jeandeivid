import java.util.Scanner;

public class Ej5 {
    public static int leerMaximo(int[] numeros) {
        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }
        public static void main (String[] args){
            Scanner scanner = new Scanner(System.in);
            int [] numeros = new int[10];

            System.out.println("Introduce 10 números:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros [i] = scanner.nextInt();
            }

             int mayor = leerMaximo(numeros);

            System.out.println("El numero mayor: " + mayor);
        }
    }

