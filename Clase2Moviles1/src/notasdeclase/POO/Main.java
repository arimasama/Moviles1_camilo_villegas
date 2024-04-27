package notasdeclase.POO;

public class Main {

    public static void main(String[] args) {

        Empleado empleado = new Empleado();
        Cliente cliente = new Cliente();
        CtaAhorro ctaAhorro = new CtaAhorro();

        cliente.producto = ctaAhorro;


        ctaAhorro.crearProducto();
        cliente.crearPersona();
        cliente.consultarPersona();
        ctaAhorro.verProducto();

    }
}
