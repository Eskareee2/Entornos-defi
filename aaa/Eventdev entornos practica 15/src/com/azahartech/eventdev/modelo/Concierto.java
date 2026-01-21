package com.azahartech.eventdev.modelo;

import java.time.LocalDate;

public class Concierto extends Evento {

    private static double nuevoPrecio = 0;
    private String bandaPrincipal;

    public Concierto(String nuevoNombre, Recinto nuevoRecinto, String nuevaBandaPrincipal, LocalDate nuevaFecha, String id) {
        super(nuevoNombre, nuevoRecinto, nuevoPrecio, nuevaFecha, id);
        bandaPrincipal = nuevaBandaPrincipal;
    }

    public String consultarBandaPrincipal() {
        return bandaPrincipal;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.printf("Banda Principal: %s ", bandaPrincipal);
        System.out.println();
    }

}
