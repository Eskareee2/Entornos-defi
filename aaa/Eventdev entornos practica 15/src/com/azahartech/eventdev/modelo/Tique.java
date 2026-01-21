package com.azahartech.eventdev.modelo;

import java.time.LocalDate;
import java.util.UUID;

public class Tique {
    private String id;
    private Evento evento;
    private Usuario comprador;
    private LocalDate fechaCompra;
    private static int contadorTiquesCreados = 0;

    public Tique(Evento nuevoEvento, Usuario nuevoComprador) {
        id = UUID.randomUUID().toString();
        fechaCompra = LocalDate.now();
        contadorTiquesCreados++;
    }

    public static int obtenerTotalTiques() {
        return contadorTiquesCreados;
    }

    public void mostrarInformacion() {
        System.out.println("-------------------------------------");
        System.out.printf("ID: %s ", id);
        System.out.println();
        System.out.print("Evento:");
        evento.mostrarInformacion();
        System.out.print("Comprador:");
        comprador.mostrarInformacion();
        System.out.println();
        System.out.printf("Fecha: %s ", fechaCompra);
        System.out.println("-------------------------------------");

    }
}
