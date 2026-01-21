package com.azahartech.eventdev.modelo;
import java.time.LocalDate;

public class Evento {

    private String nombre;
    private LocalDate fecha;
    private Recinto recinto;
    private DetallePago detallePago;
    private double precio;
    private boolean esBenefico;
    private String id;





    public Evento(String nuevoNombre, Recinto nuevoRecinto, double nuevoPrecio, LocalDate fecha, String id) {
        nombre = nuevoNombre;
        this.fecha = fecha;
        recinto = nuevoRecinto;
        precio = nuevoPrecio;
        this.id = id;
    }

    public String consultarNombre() {
        return nombre;

    }

    public LocalDate consultarFecha() {
        return fecha;
    }

    public Recinto consultarRecinto() {
        return recinto;
    }

    public double consultarPrecio() {
        return precio;
    }

    public void registrarVenta(int cantidad) {
        System.out.println("se han comprado " + cantidad + " entradas" );
    }

    public boolean isEsBenefico() {
        return esBenefico;
    }

    public void setEsBenefico(boolean esBenefico) {
        this.esBenefico = esBenefico;
    }


    public String getNombre() {
        return nombre;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void mostrarInformacion() {
        System.out.println("-------------------------------------");
        System.out.printf("Nombre: %s ", nombre);
        System.out.println();
        System.out.printf("Fecha: %s ", fecha);
        System.out.println();
        System.out.printf("Recinto: %s ", recinto.consultarNombre());
        System.out.println();
        System.out.printf("Precio: %s ", precio);
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Información del recinto donde se celebra este evento: ");
        recinto.mostrarInformacion();
    }

}
