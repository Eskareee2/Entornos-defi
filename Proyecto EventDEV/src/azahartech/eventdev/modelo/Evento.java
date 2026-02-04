package azahartech.eventdev.modelo;
import azahartech.eventdev.util.Exportable;

import java.time.LocalDate;
import java.util.concurrent.RecursiveTask;

public abstract class Evento implements Exportable {

    private String nombre;
    private LocalDate fecha;
    private Recinto recinto;
    private DetallePago detallePago;
    private double precio;
    private boolean esBenefico;
    private String id;
    private EstadoEvento estado;
    private TipoEvento tipo;





    public Evento(String nuevoNombre, Recinto nuevoRecinto, double nuevoPrecio, LocalDate fecha, String id, TipoEvento tipo) {
        nombre = nuevoNombre;
        this.fecha = fecha;
        recinto = nuevoRecinto;
        precio = nuevoPrecio;
        this.id = id;
        this.tipo = tipo;
        estado = EstadoEvento.PLANIFICADO;
        System.out.println("Construyendo Evento...");
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

    public boolean registrarVenta(int cantidad) {
        if (estado == EstadoEvento.ACTIVO) {
            System.out.println("Se ha comprado " + cantidad + " de entradas");
            return true;
        }
        else {
            System.err.println("No se pueden vender entardas. El evento está " + estado);
            return false;
        }
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

    public final String obtenerCodigoReferencia() {
        return "REF-" + id + "-NOM-" + nombre;
    }

    public final double calcularPrecioVentaRecomendado() {
        final double calculo = (calcularCosteOperativo() / recinto.consultarAforoMaximo());
       final double calculo2 = calculo * 0.20;
        return calculo2;
    }

    public void activarVenta() {
        estado = EstadoEvento.ACTIVO;
    }

    public void cancelarEvento() {
        estado = EstadoEvento.CANCELADO;
    }

    public void finalizarEvento() {
        estado = EstadoEvento.FINALIZADO;
    }




    public abstract double calcularCosteOperativo();

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
        System.out.printf("Estado: %s ", estado);
        System.out.println();
        System.out.printf("Tipo: %s ", tipo.getDescripcion());
        System.out.println();
        System.out.println("Información del recinto donde se celebra este evento: ");
        recinto.mostrarInformacion();
    }

    @Override
    public String aXML() {
        return  "  <nombre>" + nombre + "</nombre>\n" +
                "  <fecha>" + fecha + "</fecha>\n" +
                "  <detallePago>" + detallePago + "</detallePago>\n" +
                "  <precio>" + precio + "</precio>\n" +
                "  <id>" + id + "</id>\n" +
                "  <esBenefico>" + esBenefico + "</esBenefico>\n" +
                "  <nombreRecinto>" + this.recinto.consultarNombre() + "</nombreRecinto>\n" +
                "  <direccionRecinto>" + this.recinto.consultarDireccion() + "</nombreDireccion>\n" +
                "  <aforoRecinto>" + this.recinto.consultarAforoMaximo() + "</aforoRecinto>\n";
    }

    @Override
    public String aCSV() {
        return nombre + "," + fecha + "," + detallePago + "," + precio + "," + id + "," + esBenefico + "," + this.recinto.consultarNombre() + "," + this.recinto.consultarDireccion() + "," + this.recinto.consultarAforoMaximo();
    }
}


