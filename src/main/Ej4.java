
public class Ej4 {
    public static double calcularMedia(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return (double) suma / numeros.length;
    }
    public static void main(String[] args) {
        int[] numeros = {3, 5, 6, 7, 9, 10, 8, 8, 0, 10};
        double media = calcularMedia(numeros);
        System.out.print("La media es: " + media);
    }
}
