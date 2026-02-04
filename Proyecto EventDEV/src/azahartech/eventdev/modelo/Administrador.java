package azahartech.eventdev.modelo;

import azahartech.eventdev.util.Notificable;

public class Administrador implements Notificable {
    private String nombre;

    public Administrador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.err.println("[LOG ERROR] Admin " + nombre + ": " + mensaje);
    }
}