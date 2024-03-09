package notasdeclase;

public class Variables {

    static int myVarGlobal = 0;

    public static void main(String[] args){
        byte numByte = 127;

        short numByteToShort = (short) numByte;

        System.out.println(numByteToShort);

        numByteToShort = 32000;

        int numShortToInt = (int) numByteToShort;

        numShortToInt = 33000;

        float numIntToFloat = (float) numShortToInt;

        numIntToFloat = 45000.45f;

        long numLong = 322229797;

        //Parseo, es convertir un tipo de dato a otro.

        String notaString = "4.8";
        String edad = "25";

        float notaFloat = Float.parseFloat(notaString);
        float promNotas = (4.5f + notaFloat)/2;

        System.out.println(promNotas);

        int edadInt = Integer.parseInt(edad);

        String[] datosUsuario = new String[4];
        //para parsear un numero a String, usamos la concatenación con un espacio vacio.
        String promNotasStr = promNotas + "";

        datosUsuario[0] = promNotasStr;

        //Scope de la variable

        if (myVarGlobal == 0) {
            String saludo = "Hola";
            System.out.println(saludo);
        }

        //saludo = "Ey, parce"; //en este caso no funciona porque la variable es local.






    }
}
