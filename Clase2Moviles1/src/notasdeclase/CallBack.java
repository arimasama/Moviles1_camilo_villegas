package notasdeclase;

public class CallBack {

    public static void main(String[] args) {

        double salario = 1300000;
        calcularsalarioNeto(calcularPension(salario), calcularPension(salario), salario);


    }

    public static double calcularEPS(double salary){

        double eps = salary * 0.04;
        return eps;
    }

    public static double calcularPension(double salary){

        double pension = salary * 0.04;
        return pension;
    }

    public static void calcularsalarioNeto(double calcularEPS, double calcularPension, double salario){

        //double eps = calcularEPS;
        //double pension = calcularPension;

        double salarioNeto = salario - calcularPension - calcularEPS;

        System.out.println("Salario Neto: " + salarioNeto);
    }
}
