package notasdeclase;

import java.util.Scanner;

public class IfCondicional {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = "Pepito";
        String email = "pepito@mail.com";
        int password = 12345;
        String phone = "3212220011";

        System.out.println("Ingrese su usuario o teléfono: ");
        String user = sc.nextLine();
        System.out.println("Ingrese su contraseña: ");
        int userpassword = sc.nextInt();

        if((user.equals(email) || user.equals(phone)) && userpassword == password){
            System.out.println("Bienvenido " + name);
        } else {
            System.out.println("Contraseña o usuario inconrrectos.");
        }



    }
}
