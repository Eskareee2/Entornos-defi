package com.azahartech.eventdev.modelo;

import java.time.LocalDate;

public class Partido extends Evento {

    private static double nuevoPrecio = 0;
    private String equipoLocal;
    private String equipoVisitante;

    public Partido(String nuevoNombre, Recinto nuevoRecinto, String nuevoEquipoLocal, String nuevoEquipoVisitante, LocalDate nuevaFecha, String id) {
        super(nuevoNombre, nuevoRecinto, nuevoPrecio, nuevaFecha, id);
        equipoVisitante = nuevoEquipoVisitante;
        equipoLocal = nuevoEquipoLocal;
    }

    public String consultarEquipoLocal() {
        return equipoLocal;
    }

    public String consultarEquipoVisitante() {
        return equipoVisitante;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.printf("Equipo Local: %s ", equipoLocal);
        System.out.println();
        System.out.printf("Equipo Visitante: %s ", equipoVisitante);
        System.out.println();
    }
}
