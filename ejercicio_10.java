import java.util.Random;
import java.util.Scanner;
public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la dimensión de la matriz cuadrada: ");
        int n = scanner.nextInt();

        generarYMostrarMatrizSimetrica(n);
    }

    private static void generarYMostrarMatrizSimetrica(int n) {
        int[][] matriz = new int[n][n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int valor = random.nextInt(100);
                matriz[i][j] = valor;
                matriz[j][i] = valor;
            }
        }

        System.out.println("Matriz simétrica:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}

