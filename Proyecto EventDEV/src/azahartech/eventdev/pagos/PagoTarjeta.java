package azahartech.eventdev.pagos;

public class PagoTarjeta implements ProcesadorPago {
    String numeroTarjeta;
    String fechaCaducidad;

    public PagoTarjeta(String numeroTarjeta, String fechaCaducidad) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public boolean procesarPago(double cantidad) {
        double numFallo = Math.random();
        System.out.println(numFallo);
        if (numFallo < 0.1) {
            System.err.println("Error, pago fallido");
            return false;
        }
        else {
            System.out.println("Pago aceptado");
        }
        System.out.println("Procesando pago de " + cantidad + " con Tarjeta " + numeroTarjeta);
        if (numeroTarjeta.matches("\\d{16}")) {
            return true;
        }
        else {
        return false;
        }
    }
}
