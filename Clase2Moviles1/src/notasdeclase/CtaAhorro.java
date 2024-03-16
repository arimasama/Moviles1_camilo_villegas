package notasdeclase;


import java.util.Scanner;

public class CtaAhorro {
    static Scanner sc = new Scanner(System.in);
    static int saldoCtaAhorro = 1000000;
    static int opcionElegida = 0;
    static boolean validacionDeUsuario;
    final static String USUARIO = "Camilo";
    final static String PASSWORD = "camilo1";
    final static String FULLNAME = "Camilo Villegas";


    public static void main(String[] args) {

        validacionDeUsuario = inicioSesion(false);

        if (!validacionDeUsuario) {
            System.out.println("Su cuenta ha sido bloqueada, comuniquese para reactivarla.");
        } else {
            while (opcionElegida != 5) {
                opcionElegida = menu();
                consignacion(opcionElegida);
                retiro(opcionElegida);
                transferencia(opcionElegida);
                saldo(opcionElegida);
            }
        }

        while (opcionElegida == 5) {
        System.out.println("Cerrando sesión.");
        break;
        }
    }

    public static boolean inicioSesion(boolean verificar){
        int conteoVerificacion = 3;

        while (!verificar && conteoVerificacion >= 1) {
            System.out.println("Ingrese su usuario: ");
            String usuarioingreso = sc.nextLine();
            System.out.println("Ingrese su contraseña: ");
            String passwordingreso = sc.nextLine();

            if (usuarioingreso.equals(USUARIO) && passwordingreso.equals(PASSWORD)) {
                System.out.println("Bienvenido " + FULLNAME);
                verificar = true;
                break;
            } else {
                System.out.println("Contraseña o usuario incorrectos.");
                conteoVerificacion--;
                System.out.println("Le quedan " + conteoVerificacion + " Intentos");
            }
        }
        return verificar;
    }
    public static int menu(){

        int opcionMenu = 0;

        while (opcionMenu < 1 || opcionMenu > 5) {
            System.out.println("Seleccione transacción que desea realizar:\n" +
                    " 1. Consignación\n" +
                    " 2. Retiro\n" +
                    " 3. transeferencia\n" +
                    " 4. saldo\n" +
                    " 5. salir");

            opcionMenu = sc.nextInt();

            if (opcionMenu < 1 || opcionMenu > 5) {
                System.out.println("Opción no valida.");
            } else {
                break;
            }
        }
        return opcionMenu;
    }
    public static int menuConfirmacion() {

        int opcionConfirmacion = 0;

        while (opcionConfirmacion < 1 || opcionConfirmacion > 3) {

        System.out.println(" Seleccione:\n" +
                " 1. Confirmar transacción.\n" +
                " 2. Corregir valor\n" +
                " 3. Cancelar transacción.");

            opcionConfirmacion = sc.nextInt();

            if (opcionConfirmacion < 1 || opcionConfirmacion > 3) {
                System.out.println("Opción no valida.");
            } else {
                break;
            }
        }

        return opcionConfirmacion;
    }
    public static int consignacion(int opcionElegida) {
        if (opcionElegida == 1) {
            boolean opcionConsignacion = false;
            while (!opcionConsignacion) {
                System.out.println("Ingrese el valor a consignar:");
                int vlrConsignacion = sc.nextInt();
                System.out.println("Confirme los datos:\n" +
                        " Valor a consignar: " + vlrConsignacion + "\n");

                int opcionConfirmacion = menuConfirmacion();

                if (opcionConfirmacion == 1) {
                    saldoCtaAhorro += vlrConsignacion;
                    System.out.println("Consignación exitosa");
                    opcionConsignacion = true;
                } else if (opcionConfirmacion == 3) {
                    System.out.println("transacción cancelada");
                    break;
                }
            }
        }
        return saldoCtaAhorro;
    }
    public static int retiro(int opcionElegida) {
        if (opcionElegida == 2) {
            boolean opcionConsignacion = false;
            while (opcionConsignacion == false) {
                System.out.println("Ingrese el valor a Retirar:");
                int vlrRetiro = sc.nextInt();
                System.out.println("Confirme los datos:\n" +
                        " Valor a retirar: " + vlrRetiro + "\n");

                int opcionConfirmacion = menuConfirmacion();


                if (opcionConfirmacion == 1) {
                    saldoCtaAhorro -= vlrRetiro;
                    System.out.println("Retiro con éxito.");
                    break;
                } else if (opcionConfirmacion == 3) {
                    System.out.println("transacción cancelada");
                    break;
                }

            }
        }
        return saldoCtaAhorro;
    }
    public static int transferencia(int opcionElegida) {
        if (opcionElegida == 3) {
            boolean opcionTransferencia = false;
            while (!opcionTransferencia) {
                System.out.println("Ingrese el valor a transferir:");
                int vlrTransferencia = sc.nextInt();
                System.out.println("Confirme los datos:\n" +
                        " Valor a consignar: " + vlrTransferencia + "\n");

                int opcionConfirmacion = menuConfirmacion();


                if (opcionConfirmacion == 1) {
                    saldoCtaAhorro -= vlrTransferencia;
                    System.out.println("Transferencia exitosa");
                    opcionTransferencia = true;
                } else if (opcionConfirmacion == 3) {
                    System.out.println("transacción cancelada");
                    break;
                }

            }
        }
        return saldoCtaAhorro;
    }
    public static int saldo(int opcionElegida) {
        while (opcionElegida == 4) {
            System.out.println("Su Saldo es: " + saldoCtaAhorro);
            break;
        }
        return saldoCtaAhorro;
    }





}
