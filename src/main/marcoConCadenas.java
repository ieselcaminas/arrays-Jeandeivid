import java.util.Scanner;

class marcoConCadenas {
    public static int calcularMaximo(String[] cadenas) {
        int maxima = cadenas[0].length();
        for (int i = 1; i < cadenas.length; i++) {
            if (cadenas[i].length() > maxima) {
                maxima = cadenas[i].length();
            }
        }
        return maxima;
    }

    public static void main(String[] args) {
        String[] cadenas = new String[5];
        System.out.println("Introduce 5 cadenas de texto:");
        Scanner miScanner;
        int maxima;
        miScanner = new Scanner(System.in);

        for (int i = 0; i < cadenas.length; i++) {
            cadenas[i] = miScanner.next();
        }

        maxima = calcularMaximo(cadenas);
        System.out.println(asteriscos(maxima));
        for (int i = 0; i < cadenas.length; i++) {
            System.out.print("*" + cadenas[i]);
            for (int j = 0; j < cadenas[i].length() - maxima; j++) {
                System.out.print(" ");
            }
            System.out.println(" *");
        }

    }

    private static String  asteriscos(int maxima) {
        String asterisco = "";
        for (int i = 0; i < maxima + 4; i++) {
            asterisco += "*";

        }
        return asterisco;
    }
}
