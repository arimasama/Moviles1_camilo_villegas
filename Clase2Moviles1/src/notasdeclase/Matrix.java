package notasdeclase;

public class Matrix {

    public static void main(String[] args) {

        String [] nombre = {"Pepito", "Maria", "Juan"};

        String [] correos = {"pp@gmail.com", "maria@gmail.com", "juan@gmail.com"};

        String [][] datosUsuario = {{"Pepito", "Maria", "Juan"}, {"pp@gmail.com", "maria@gmail.com", "juan@gmail.com"}};

        double [][] notaSubmodulos = new double[3][3];

        notaSubmodulos [0][0] = 4.3;
        notaSubmodulos [0][1] = 3.1;
        notaSubmodulos [0][2] = 3.2;

        notaSubmodulos [1][0] = 3.5;
        notaSubmodulos [1][1] = 4.5;
        notaSubmodulos [1][2] = 3.9;

        notaSubmodulos [2][0] = 5;
        notaSubmodulos [2][1] = 4.4;
        notaSubmodulos [2][2] = 3.9;

        System.out.println("El estudiante " + nombre [0] + " tiene su primera nota en: " + notaSubmodulos[0][1]);

        notaSubmodulos [0][1] = 3.8;

        System.out.println("El estudiante " + nombre [0] + " tiene su primera nota en: " + notaSubmodulos[0][1]);

        System.out.println("++++++++++++++++++++++++++++++\n");

        for (int i = 0; i < datosUsuario.length; i++) {
            for (int j = 0; j < datosUsuario[i].length; j++) {
                System.out.print(datosUsuario[i][j] + ", ");
            }
            System.out.println("\n");
        }

        for (int i = 0; i < notaSubmodulos.length; i++) {
            for (int j = 0; j < notaSubmodulos[i].length; j++) {
                System.out.print(notaSubmodulos[i][j] + ", ");
            }
            System.out.println();
        }

        System.out.println("++++++++++++++++++++++++++");

        int [] edades = {23, 34, 56};

        int [] edades2 = {45,56,63};

        int [][] datosEdad = new int [2] [3];

        datosEdad[0] = edades;
        datosEdad[1] = edades2;

        // Imprimir el contenido de la matriz
        for (int i = 0; i < datosEdad.length; i++) {
            for (int j = 0; j < datosEdad[i].length; j++) {
                System.out.print(datosEdad[i][j] + " ");
            }
            System.out.println();
        }


    }
}
