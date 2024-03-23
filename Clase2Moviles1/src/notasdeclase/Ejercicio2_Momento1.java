package notasdeclase;

import java.util.Scanner;

public class Ejercicio2_Momento1 {
    static Scanner sc = new Scanner(System.in);
    static double [][] notasMomentos = new double[3][2];
    static double sumaProm = 0;


    public static double promedio(double[][] notasMomentos) {

        for (int i = 0; i < notasMomentos.length; i++) {
            for (int j = 0; j < notasMomentos[i].length; j++) {
                sumaProm += notasMomentos[i][j];
            }
            System.out.println();
        }
        sumaProm /= 6;
        return sumaProm;
    }
    public static void main(String[] args) {


        for (int i = 0; i < notasMomentos.length; i++) {
            for (int j = 0; j < notasMomentos[i].length; j++) {
                System.out.println("Ingrese su nota " + (j +1) + " del modulo " + (i + 1));
                notasMomentos[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        double promSemestre = promedio(notasMomentos);

        System.out.println("Sus notas son:\n" +
                "Modulo 1 ----- Modulo 2");

        for (int i = 0; i < notasMomentos.length; i++) {
            for (int j = 0; j < notasMomentos[i].length; j++) {
                System.out.print("  " + notasMomentos[i][j] + ",         ");
            }
            System.out.println();
        }
        System.out.println("Su promedio del semestres es: " + sumaProm );


    }
}
