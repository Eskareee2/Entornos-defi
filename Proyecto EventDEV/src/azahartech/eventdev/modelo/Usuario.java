package azahartech.eventdev.modelo;
import azahartech.eventdev.util.Exportable;
import azahartech.eventdev.util.Notificable;

import java.util.UUID;


public class Usuario implements Exportable, Notificable, Comparable<Usuario> {
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

    public DetallePago getDetallePago() {
        return detallePago;
    }

    public void setDetallePago(DetallePago detallePago) {
        this.detallePago = detallePago;
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
        System.out.printf("ID: %s ", id);
        System.out.println();
        System.out.printf("Nombre: %s ", nombre);
        System.out.println();
        System.out.printf("Email: %s ", email);
        System.out.println();
        if (detallePago != null) {
            detallePago.mostrarInformacion();
        }
        System.out.println();
        System.out.println("-------------------------------------");
    }

    @Override
    public String aXML() {
        return "<usuario>\n" +
                "  <id>" + id + "</id>\n" +
                "  <nombre>" + nombre + "</nombre>\n" +
                "  <email>" + email + "</email>\n" +
                "  <esVip>" + esVip + "</esVip>\n" +
                "  <detallePago>" + detallePago + "</detallePago>\n" +
                "</usuario>";
    }


    @Override
    public String aCSV() {
        return id + "," + nombre + "," + email + "," + esVip + "," + detallePago;
    }

    public void enviarNotificaciones(String mensaje) {

    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando email a " + email + ": " + mensaje);
    }

    @Override
    public int compareTo(Usuario otro) {
        return this.nombre.compareTo(otro.nombre);
    }
}


