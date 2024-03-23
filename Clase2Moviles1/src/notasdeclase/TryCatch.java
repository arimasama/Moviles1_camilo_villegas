package notasdeclase;

import java.util.Scanner;

public class TryCatch {
    static Scanner sc = new Scanner(System.in);
    static String name;
    static String rol;
    static String mail;
    static String password;
    static String[][] usuarios  = new String[2][4];
    static int pos;


    public static  void registrarDatos() {

        String[] datoUsuario = new String[4];

        System.out.println("Ingrese su posición:");

        try {
            pos = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Solo se permiten números.");
            System.out.println(e);
            sc.next();
            registrarDatos();
        }
        sc.nextLine();

        System.out.println("Nombre:");
        name = sc.nextLine();
        datoUsuario [0] = name;
        System.out.println("Rol:");
        rol = sc.nextLine();
        datoUsuario [1] = rol;
        System.out.println("Email:");
        mail = sc.nextLine();
        datoUsuario [2] = mail;
        System.out.println("Contraseña:");
        password = sc.nextLine();
        datoUsuario [3] = password;

        usuarios[pos-1] = datoUsuario;


    }

    public static void recorrerDatos(){

        for (int i = 0; i < usuarios.length; i++) {
            for (int j = 0; j < usuarios[i].length; j++){

                System.out.println(usuarios[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        registrarDatos();
        registrarDatos();
        recorrerDatos();

    }
}
