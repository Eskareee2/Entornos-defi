package com.azahartech.eventdev.modelo;
import java.util.UUID;


public class Usuario {
    private String id;
    private String nombre;
    private String email;
    private DetallePago detallePago;
    private boolean esVip;

    public Usuario(String nuevoNombre, String nuevoEmail, boolean esVip) {
        nombre = nuevoNombre;
        email = nuevoEmail;
        id = UUID.randomUUID().toString();
        this.esVip = esVip;

    }

    public String consultarNombre() {
        return nombre;

    }

    public String consultarEmail() {
        return email;

    }

    public String consultarId() {
        return id;

    }

    public void cambiarEmail(String nuevoEmail) {
        email = nuevoEmail;
    }

    public boolean isEsVip() {
        return esVip;
    }

    public void setEsVip(boolean esVip) {
        this.esVip = esVip;
    }

    public void mostrarInformacion() {
        System.out.println("-------------------------------------");
        System.out.printf("ID: %s ", id );
        System.out.println();
        System.out.printf("Nombre: %s ", nombre );
        System.out.println();
        System.out.printf("Email: %s ", email );
        System.out.println();
        if (detallePago != null) {
            detallePago.mostrarInformacion();
        }
        System.out.println();
        System.out.println("-------------------------------------");
    }
}


