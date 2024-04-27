package notasdeclase.POO;

import java.util.Scanner;

public abstract class Producto implements UtilProducto {

    Scanner sc = new Scanner(System.in);
    private int idProducto;
    private String nombreProducto;

    public Producto(int idProducto, String nombreProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
    }

    public Producto() {
        super();
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void crearProducto(){

        System.out.println("id del Producto: ");
        idProducto = sc.nextInt();
        sc.nextLine();
        System.out.println("Nombre del Prodcuto: ");
        nombreProducto = sc.nextLine();
    }

    public  void verProducto(){
        System.out.println("Id: " + idProducto + "\n" +
                "Nombre Producto: " + nombreProducto);
    }
}
