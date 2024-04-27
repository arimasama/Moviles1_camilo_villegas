package notasdeclase.POO;

public class Empleado extends  Persona {
    //extends se usa para traer la clase Persona.

    private String area;
    private String cargo;

    public Empleado(int id, String name, String lastName, String number, String email, String tipoPersona, String area, String cargo) {
        super(id, name, lastName, number, email, tipoPersona);
        this.area = area;
        this.cargo = cargo;
    }

    public Empleado() {
       super();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void crearPersona() {
        super.crearPersona();
        System.out.println("Area: ");
        area = sc.nextLine();
        System.out.println("Cargo: ");
        cargo = sc.nextLine();
    }

    @Override
    public void consultarPersona() {
        super.consultarPersona();
        System.out.println("Área: " + area + "\n" +
                "Cargo: " + cargo);
    }
}
