package azahartech.eventdev.pagos;

public class PagoPayPal implements ProcesadorPago {
    String emailUsuario;

    public PagoPayPal(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    @Override
    public boolean procesarPago(double cantidad) {
        System.out.println("Redirigiendo a PayPal para el usuario " + emailUsuario);
        System.out.println("Cobro de " + cantidad + " realizado");
        return true;
    }
}
