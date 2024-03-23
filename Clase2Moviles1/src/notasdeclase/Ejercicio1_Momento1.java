package notasdeclase;

import java.util.Scanner;

public class Ejercicio1_Momento1 {

    static Scanner sc = new Scanner(System.in);
    static int opcionMenu = 0;
    static double cateto1;
    static double cateto2;

    public static void menu(){
        while (opcionMenu != 4) {
            System.out.println("Bienvenido a la app para calculos geomeéricos de un triángulo rectángulo");
            System.out.println("Elija el cálculo que desea\n" +
                    "1. Área\n" +
                    "2. Perímetro\n" +
                    "3. Hipotenusa\n" +
                    "4. salir");
            opcionMenu = sc.nextInt();
            if (opcionMenu < 1 || opcionMenu > 4) {
                System.out.println("opción invalida.");
            } else if (opcionMenu == 1) {
                ingresoDatos();
                double areaFinal = getArea(cateto1,cateto2);
                System.out.println("el área del triángulo es: " + areaFinal);
            } else if (opcionMenu == 2) {
                ingresoDatos();
                double hipotenusa = getHipotenusa(cateto1, cateto2);
                double perimetroFinal = getPerimetro(cateto1, cateto2, hipotenusa);
                System.out.println("El perímetro del triángulo es: " + perimetroFinal);
            } else if (opcionMenu == 3) {
                ingresoDatos();
                double hipotenusa = getHipotenusa(cateto1, cateto2);
                System.out.println("La  del triángulo es: " + hipotenusa);
            } else {
                System.out.println("Saliendo de la App.");
                break;
            }
        }

    }
    public static void ingresoDatos(){
            System.out.println("Ingrese la medida del primer cateto del triángulo-rectángulo en cm");
            cateto1 = sc.nextDouble();
            System.out.println("Ingrese la medida del segundo cateto del triángulo-rectángulo en cm");
            cateto2 = sc.nextDouble();
    }
    public static double getPerimetro(double cat1, double cat2, double hipo) {

        double perimetro = (cat1 + cat2 + hipo);
        return perimetro;
    }
    public static double getHipotenusa(double cat1, double cat2) {

         double pitagoras = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
        return pitagoras;
    }
    public static double getArea(double cat1, double cat2) {
        double area = (cat1*cat2)/2;
        return area;
    }

    public static void main(String[] args) {
        menu();
    }
}
