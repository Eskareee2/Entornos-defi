package azahartech.eventdev.modelo;

import azahartech.eventdev.util.Exportable;

import java.time.LocalDate;
import java.util.UUID;

public class Tique implements Exportable {
    private String id;
    private Evento evento;
    private Usuario comprador;
    private LocalDate fechaCompra;
    private static int contadorTiquesCreados = 0;

    public Tique(Evento nuevoEvento, Usuario nuevoComprador) {
        this.evento = nuevoEvento;
        this.comprador = nuevoComprador;

        this.id = UUID.randomUUID().toString();
        this.fechaCompra = LocalDate.now();
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

    @Override
    public String aXML() {
        return "<tique>\n" +
                "  <idTique>" + id + "</idTique>\n" +
                "  <fechaCompra>" + fechaCompra + "</fechaCompra>\n" +
                "  <nombreEvento>" + this.evento.consultarNombre() + "</nombreEvento>\n" +
                "  <fechaEvento>" + this.evento.consultarFecha() + "</fechaEvento>\n" +
                "  <recintoEvento>" + this.evento.consultarRecinto().consultarNombre() + "</recintoEvento>\n" +
                "  <precioEvento>" + this.evento.consultarPrecio() + "</precioEvento>\n" +
                "  <nombreComprador>" + this.comprador.consultarNombre() + "</nombreComprador>\n" +
                "  <emailComprador>" + this.comprador.consultarEmail() + "</emailComprador>\n" +
                "  <idEvento>" + this.evento.getId() + "</idEvento>\n" +
                "  <idComprador>" + this.comprador.consultarId() + "</idComprador>\n" +
                "  <detallePagoComprador>" + this.comprador.getDetallePago() + "</detallePagoComprador>\n" +
                "  <vipComprador>" + this.comprador.isEsVip() + "</vipComprador>\n" +
                "</tique>";
    }

    @Override
    public String aCSV() {
        return      id + "," +
                    fechaCompra + "," +
                    evento.consultarNombre() + "," +
                    evento.consultarFecha() + "," +
                    evento.consultarRecinto().consultarNombre() + "," +
                    evento.consultarPrecio() + "," +
                    comprador.consultarNombre() + "," +
                    comprador.consultarEmail() + "," +
                    evento.getId() + "," +
                    comprador.consultarId();
        }
    }

