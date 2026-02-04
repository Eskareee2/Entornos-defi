package azahartech.eventdev.modelo;

import java.time.LocalDate;

public class Concierto extends Evento {

    private String bandaPrincipal;
    private double costeMontaje;
    private EstadoEvento estado;
    private TipoEvento tipo;

    public Concierto(String nuevoNombre, Recinto nuevoRecinto, String nuevaBandaPrincipal, LocalDate nuevaFecha, String id, double costeMontaje, double nuevoPrecio, TipoEvento tipo) {
        super(nuevoNombre, nuevoRecinto, nuevoPrecio, nuevaFecha, id, tipo);
        bandaPrincipal = nuevaBandaPrincipal;
        System.out.println("Construyendo Concierto...");
        this.costeMontaje = costeMontaje;
        estado = EstadoEvento.PLANIFICADO;

    }

    public String consultarBandaPrincipal() {
        return bandaPrincipal;
    }

    @Override
    public double calcularCosteOperativo() {
        return costeMontaje + 5000.0;
    }

    /* public final String obtenerCodigoReferencia() {
            return "REF-" + id + "-NOM-" + nombre;
        }
    */ // NO FUNCIONA PORQUE ES FINAL
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.printf("Banda Principal: %s ", bandaPrincipal);
        System.out.println();
    }

    @Override
    public String aXML() {
        return "<concierto>\n" +
                super.aXML() +
                "  <bandaPrincipal>" + bandaPrincipal + "</bandaPrincipal>\n" +
                "  <costeMontaje>" + costeMontaje + "</costeMontaje>\n" +
                "</concierto>";
    }

    @Override
    public String aCSV() {
        return super.aCSV() + "," + bandaPrincipal + "," + costeMontaje;
    }
}



