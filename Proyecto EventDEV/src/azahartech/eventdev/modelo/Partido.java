package azahartech.eventdev.modelo;

import java.time.LocalDate;

public class Partido extends Evento {

    private static double nuevoPrecio = 0;
    private String equipoLocal;
    private String equipoVisitante;
    private double costeSeguridad;
    private double costeArbitraje;
    private EstadoEvento estado;
    private TipoEvento tipo;

    public Partido(String nuevoNombre, Recinto nuevoRecinto, String nuevoEquipoLocal, String nuevoEquipoVisitante, LocalDate nuevaFecha, String id, double costeSeguridad, double costeArbitraje, TipoEvento tipo) {
        super(nuevoNombre, nuevoRecinto, nuevoPrecio, nuevaFecha, id, tipo);
        equipoVisitante = nuevoEquipoVisitante;
        equipoLocal = nuevoEquipoLocal;
        this.costeSeguridad = costeSeguridad;
        this.costeArbitraje = costeArbitraje;
        estado = EstadoEvento.PLANIFICADO;
    }

    public String consultarEquipoLocal() {
        return equipoLocal;
    }

    public String consultarEquipoVisitante() {
        return equipoVisitante;
    }

    @Override
    public double calcularCosteOperativo() {
        return costeArbitraje + costeSeguridad + 2000.0;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.printf("Equipo Local: %s ", equipoLocal);
        System.out.println();
        System.out.printf("Equipo Visitante: %s ", equipoVisitante);
        System.out.println();
    }

    @Override
    public String aXML() {
        return "<partido>\n" +
                super.aXML() +
                "  <equipoLocal>" + equipoLocal + "</equipoLocal>\n" +
                "  <equipoVisitante>" + equipoVisitante + "</equipoVisitante>\n" +
                "  <costeSeguridad>" + costeSeguridad + "</costeSeguridad>\n" +
                "  <costeArbitraje>" + costeArbitraje + "</costeArbitraje>\n" +
                "</partido>";
    }

    @Override
    public String aCSV() {
        return super.aCSV() + "," + equipoLocal + "," + equipoVisitante + "," + costeSeguridad + "," + costeArbitraje;
    }
}
