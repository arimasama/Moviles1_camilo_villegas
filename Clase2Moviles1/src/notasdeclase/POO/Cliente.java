package notasdeclase.POO;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class Cliente  extends Persona {

    Producto producto;
    LocalDate fecha = LocalDate.now();
    private String clave;
    private String prod;

    public Cliente(int id, String name, String lastName, String number, String email, String tipoPersona, String clave, String prod) {
        super(id, name, lastName, number, email, tipoPersona);
        this.clave = clave;
        this.prod = prod;
    }

    public Cliente() {
        super();
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    @Override
    public void crearPersona() {
        super.crearPersona();
        prod = producto.getNombreProducto();
        System.out.println("Contraseña: ");
        clave = sc.nextLine();
    }

    @Override
    public void consultarPersona() {
        super.consultarPersona();

        System.out.println("fecha: " + fecha + "\n"+
                "Producto: " + prod + "\n" +
                "Contraseña: ********");

    }
}
