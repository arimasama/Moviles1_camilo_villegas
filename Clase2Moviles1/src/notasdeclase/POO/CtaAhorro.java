package notasdeclase.POO;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CtaAhorro extends Producto {


     private String numCtaAhorro;

     LocalDateTime fecha  =  LocalDateTime.now();

    public String getNumCtaAhorro() {
        return numCtaAhorro;
    }

    public void setNumCtaAhorro(String numCtaAhorro) {
        this.numCtaAhorro = numCtaAhorro;
    }

    public CtaAhorro(int idProducto, String nombreProducto, String numCtaAhorro) {
        super(idProducto, nombreProducto);
        this.numCtaAhorro = numCtaAhorro;
    }

    public CtaAhorro(){
        super();
    }

    @Override
    public void crearProducto() {
        super.crearProducto();
        System.out.println("Ingrese numero de Cuenta: ");
        numCtaAhorro = sc.nextLine();
    }

    @Override
    public void verProducto() {
        super.verProducto();
        System.out.println("Fecha de creación de Cuenta: " + fecha + "\n" +
                "Númmero de Cuenta: " + numCtaAhorro + "\n" +
                "Tipo de producto: " + this.getNombreProducto());
    }
}
