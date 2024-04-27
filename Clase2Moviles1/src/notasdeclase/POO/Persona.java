package notasdeclase.POO;

import java.util.Scanner;


public abstract class Persona implements UtilPersona {

    Scanner sc = new Scanner(System.in);
    private int id;
    private String name;
    private String lastName;
    private String number;
    private String email;
    private String tipoPersona;

    // Constructores

    public Persona(int id, String name, String lastName, String number, String email, String tipoPersona) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.number = number;
        this.email = email;
        this.tipoPersona = tipoPersona;
    }


    public Persona() {
        super();
    }


    // Getters and Setters

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    //Metodos

    public void crearPersona(){
        System.out.println("id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nombre: ");
        name = sc.nextLine();
        System.out.println("Apellido: ");
        lastName = sc.nextLine();
        System.out.println("Télefono: ");
        number = sc.nextLine();
        System.out.println("Correo: ");
        email = sc.nextLine();
        System.out.println("Tipo de Persona: ");
        tipoPersona = sc.nextLine();
    }

    public void consultarPersona(){

        System.out.println("id --> " + id + "\n" +
                "Nombre --> " + name + "\n" +
                "Apellid --> " + lastName + "\n" +
                "Teléfono --> " + number + "\n" +
                "Correo --> " + email + "\n" +
                "Tipo de Persona --> " + tipoPersona);
    }
}
