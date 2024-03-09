package notasdeclase;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraImc {
    static Scanner  sc = new Scanner(System.in);
    static String email;
    static String password;
    static String fullname;

    public static void  registroSesion(){

        System.out.println("Registre su nombre y apellido:");
        fullname = sc.nextLine();
        System.out.println("Regisrtre su email:");
        email = sc.nextLine();
        System.out.println("Registre su contraseña:");
        password = sc.nextLine();

    }

    public static void inicioSesion(){

        boolean verificar = false;

        while (verificar == false) {
            System.out.println("Ingrese su email: ");
            String emailingreso = sc.nextLine();
            System.out.println("Ingrese su contraseña: ");
            String passwordingreso = sc.nextLine();

            if (emailingreso.equals(email) && passwordingreso.equals(password)) {
                System.out.println("Bienvenido " + fullname);
                verificar = true;
                break;
            } else {
                System.out.println("Contraseña o usuario inconrrectos.");
            }
        }
    }


    public static double calcularImc(){
        System.out.println("Ingrese su peso en Kg:");
        double peso = sc.nextDouble();
        System.out.println("Ingrese su estatura en metros:");
        double estatura = sc.nextDouble();
        double imc = peso / (estatura*estatura);
        return imc;
    }

    public static void leerImc(double imc){
        if (imc < 18){
            System.out.println("tiene bajo peso.");
        } else if (imc >= 18 && imc < 25) {
            System.out.println("Su peso es normal.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Tiene sobre peso.");
        }else {
            System.out.println("Tiene obesidad.");
        }
    }

    public static void recomendartratamiento(){

        System.out.println("Ingrese el número de la recomendación de acuerdo a su imc:\n" +
                "1. Bajo peso\n"+
                "2. Peso normal\n" +
                "3. Sobrepeso\n" +
                "4. Obesidad\n");

        int opc = sc.nextInt();

        switch (opc){
            case 1:
                System.out.println("las recomendaciones para bajo peso son:");
                break;
            case 2:
                System.out.println("las recomendaciones para peso normal son:");
                break;
            case 3:
                System.out.println("las recomendaciones para el sobre peso son:");
                break;
            case 4:
                System.out.println("Las recomendaciones para la obesidad son:");
                break;
            default:
                System.out.println("Ingrese una opción valida");
                break;
        }
    }


    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");//esto se utiliza para redondear de forma específica.
        registroSesion();
        inicioSesion();
        double imc = calcularImc();
        System.out.println("su Imc es de:" + df.format(imc));
        leerImc(imc);
        recomendartratamiento();


    }
}
