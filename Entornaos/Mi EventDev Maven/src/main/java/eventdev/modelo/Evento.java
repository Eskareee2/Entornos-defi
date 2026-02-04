package eventdev.modelo;
/**
 * Representa un evento cultural o deportivo dentro del sistema EventDEV.
 * Gestiona la información básica y el control de aforo.
 *
 * @author Izan
 * @version 1.0
 */
public class Evento {
    public String nombre;
    public String fecha;
    // ... atributos ...
    /**
     * Comprueba si el aforo del evento se ha completado.
     * @param inverso Si es true devolvera si esta vacio sino devolvera esta lleno
     * @return true si número de inscritos es igual o mayor al aforo máximo,
     * false si aún quedan plazas libres.
     */
    public boolean estaLleno(Boolean inverso) {
        return true;
    }
}