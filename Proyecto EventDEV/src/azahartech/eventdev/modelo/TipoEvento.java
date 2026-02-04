package azahartech.eventdev.modelo;

public enum TipoEvento {
    CONCIERTO('C', "Concierto de música en vivo"),
    TEATRO('T', "Obra de teatro"),
    DEPORTE('D', "Evento deportivo"),
    FESTIVAL('F', "Festival cultural");

    private final char codigo;
    private final String descripcion;

    TipoEvento(char codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public char getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
