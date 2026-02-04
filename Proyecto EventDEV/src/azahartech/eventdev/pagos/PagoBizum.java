package azahartech.eventdev.pagos;

public class PagoBizum implements ProcesadorPago {
    String telefono;
    int pin;

    public PagoBizum(String telefono, int pin) {
        this.telefono = telefono;
        this.pin = pin;
    }

    @Override
    public boolean procesarPago(double cantidad) {
        System.out.println("Procesando pago de " + cantidad + " con teléfono " + telefono);
        if (telefono.matches("\\d{9}")) {
            return true;
        }
        else {
            return false;
        }
    }
}
