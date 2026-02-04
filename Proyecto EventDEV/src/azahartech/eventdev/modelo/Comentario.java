package azahartech.eventdev.modelo;

public class Comentario {
    private Evento evento;
    private Usuario autor;
    private int puntuacion;
    private String comentario;

    public Comentario(Evento nuevoEvento, Usuario nuevoAutor, int nuevoPuntuacion, String nuevoComentario) {
        if (nuevoPuntuacion < 1 || nuevoPuntuacion > 5) {
            System.err.println("La puntuación debe ser entre 1 y 5");
            puntuacion = 0;
        } else {
            puntuacion = nuevoPuntuacion;
        }
    }
    public Evento consultarEvento() {
        return evento;

    }

    public Usuario consultarAutor() {
        return autor;

    }

    public int consultarPuntuacion() {
        return puntuacion;

    }

    public String consultarComentario() {
        return comentario;

    }

    public void mostrarInformacion() {
        System.out.println("-------------------------------------");
        System.out.printf("Evento: %s ", evento);
        System.out.println();
        System.out.printf("Autor: %s ", autor);
        System.out.println();
        System.out.printf("Puntuacion: %d ", puntuacion);
        System.out.println();
        System.out.printf("Comentario: %s ", comentario);
        System.out.println();
        System.out.println("-------------------------------------");

    }

}

