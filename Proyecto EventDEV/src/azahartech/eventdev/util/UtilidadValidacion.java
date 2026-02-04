package azahartech.eventdev.util;
import java.security.PublicKey;
import java.time.LocalDate;

public class UtilidadValidacion {
    public static boolean emailValido(String email) {
        boolean emailCoincide = false;
            String regexEmail = "\\w+@[a-z]+\\.[a-z]{2,4}";
            if (email.matches(regexEmail)) {
                return true;
            } else {
                return false;
            }
        }


    public static boolean esCodigoEventoValido(String codigo) {
        String regexCodigo = "EVT-\\d{4}-[A-Z]{3}";
        if (codigo.matches(regexCodigo)) {
            return true;
        }
        else {
            return false;
        }
    }


    public static boolean puntuacionValida(int puntuacion) {
        return puntuacion >= 1 && puntuacion <= 5;
    }

    public static boolean fechaFutura(LocalDate fecha) {
        if (fecha == null) {
            return false;
        }
        return fecha.isAfter(LocalDate.now());
    }

    public static boolean validadorTelefono(String numeroTelefono) {
        boolean numeroCoincide = false;
        String regexTelefono = "^[679]\\\\d{8}$";
        if (numeroTelefono.matches(regexTelefono)) {
            return true;
        } else {
            return false;
        }
    }
}


