package com.azahartech.eventdev.modelo;

import java.util.UUID;

public class Recinto {
    private String nombre;
    private String direccion;
    private int aforoMaximo;
    boolean[] asientosVIP = new boolean[10];

    int cantidadAsientosLibres = 0;

    public void reservarAsientoVip(int numeroAsiento) {
        numeroAsiento = numeroAsiento - 1;
        if (numeroAsiento >= 0 && numeroAsiento < asientosVIP.length) {
            if (!asientosVIP[numeroAsiento]) {
                System.out.println("Asiento disponible, reservado.");
                asientosVIP[numeroAsiento] = true;
            } else {
                System.out.println("Asiento ocupado, no se puede reservar.");
            }
        } else {
            System.err.println("Número de asiento VIP fuera del rango válido (0 a 9).");
        }
    }

    public int contarAsientosVipLibres() {
        cantidadAsientosLibres = 0;
        for (int i = 0; i < asientosVIP.length; i++) {
            System.out.println("Disponibilidad del asiento VIP " + i + ": " + asientosVIP[i]);
            if (!asientosVIP[i]) {
                cantidadAsientosLibres++;
            }
        }
        return cantidadAsientosLibres;
    }

    public Recinto(String nuevoNombre, String nuevoDireccion, int nuevoAforoMaximo) {
        nombre = nuevoNombre;
        direccion = nuevoDireccion;
        aforoMaximo = nuevoAforoMaximo;
    }

    public String consultarNombre() {
        return nombre;
    }

    public String consultarDireccion() {
        return direccion;
    }

    public int consultarAforoMaximo() {
        return aforoMaximo;
    }

    public void mostrarInformacion() {
        int asientosLibresActuales = contarAsientosVipLibres();

        System.out.println("-------------------------------------");
        System.out.printf("Direccion: %s ", direccion );
        System.out.println();
        System.out.printf("Nombre: %s ", nombre );
        System.out.println();
        System.out.printf("Aforo máximo: %s ", aforoMaximo );
        System.out.println();
        System.out.printf("Asientos VIP disponibles: %d ", asientosLibresActuales );
        System.out.println();
        System.out.println("-------------------------------------");
    }
}