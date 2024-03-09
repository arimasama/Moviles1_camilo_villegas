package notasdeclase;

import java.util.Scanner;

public class Operador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Operadores
        //aritmeticos, comparación, lógicos, asignación, incremento, this, .
        //Jerarquía, 1. (), 2. potenciacón y radicación 3. pos-neg, 4. *,/, 5. + o -, 6. comparación, 7. lógicos

        int operacion = 200*(35/3)/2+4;

        System.out.println("El resultado de la operación es: " + operacion);

        System.out.println("Ingrese el primer número:");
        int nro1 = sc.nextInt();

        System.out.println("Ingrese el segundo número:");
        int nro2 = sc.nextInt();

        //operadores aritméticos (+, -, *, /, %)

        int suma = nro1 + nro2;
        System.out.println("El resultado de la suma es: " + suma);

        int resta = nro1 - nro2;
        System.out.println("El resultado de la resta es: " + resta);

        int multiplicacion = nro1 * nro2;
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);

        int division = nro1 / nro2;
        System.out.println("El resultado de la división es: " + division);

        // operadores de comparación (<, >, <=, >=, ==; !=) retorna un booleano

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        boolean esMayor = nro1 > nro2;
        boolean esMenor = nro1 < nro2;
        boolean esIgual = nro1 == nro2;
        boolean diferente = nro1 != nro2;


        System.out.println(nro1 + " es mayor que " + nro2 + " : " + esMayor);
        System.out.println(nro1 + " es menor que " + nro2 + " : " + esMenor);
        System.out.println(nro1 + " es igual que " + nro2 + " : " + esIgual);
        System.out.println(nro1 + " es diferente que " + nro2 + " : " + diferente);

        //operadores lógicos (||, &&, not)

        System.out.println("++++++++++++++++++++++++++++++");

        boolean validaEmail = false;
        boolean validaPassword = true;
        boolean validaphone = true;
        boolean iniciaSesion = (validaEmail || validaphone) && validaPassword;

        System.out.println("Inicia sesion " + iniciaSesion);

        //Operadores de asignación (=, +=, -=, *=, /=)

        System.out.println("++++++++++++++++++++++++++++");

        int sum = 0;
        sum += nro1;
        System.out.println("El valor de suma es: " + sum);
        sum += nro1;
        System.out.println("El valor de suma es: " + sum);
        sum += nro1;
        System.out.println("El valor de suma es: " + sum);

        int sum2 = 0;
        System.out.println("El valor de sum2 es: " + sum2++);
        System.out.println("El valor de sum2 es: " + sum2++);
        System.out.println("El valor de sum2 es: " + sum2++);
        System.out.println("El valor de sum2 es: " + sum2++);




    }
}
