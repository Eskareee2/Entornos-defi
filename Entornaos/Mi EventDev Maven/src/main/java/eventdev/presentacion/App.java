package eventdev.presentacion;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fecha = LocalDate.of(2025, 10, 31);
        System.out.println(!fecha.isBefore(fechaActual));
    }
}
