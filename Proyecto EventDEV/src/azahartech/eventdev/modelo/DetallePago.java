package azahartech.eventdev.modelo;

public class DetallePago {
    private String tipoTarjeta;
    private String numeroTarjeta;

    public DetallePago(String nuevoTipoTarjeta, String nuevoNumeroTarjeta) {
        tipoTarjeta = nuevoTipoTarjeta;
        numeroTarjeta = nuevoNumeroTarjeta;
    }

    public String consultarTipoTarjeta() {
        return tipoTarjeta;

    }

    public String consultarNumeroTarjeta() {
        return numeroTarjeta;

    }

    public void mostrarInformacion() {
        System.out.println("-------------------------------------");
        System.out.printf("Tipo de tarjeta: %s ", tipoTarjeta);
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.printf("Numero de tarjeta: %s ", numeroTarjeta);
        System.out.println();
        System.out.println("-------------------------------------");
    }

    public void anadirDetallePago(DetallePago nuevoDetallePago) {

    }


    public void realizarPago(double costeTotal) {
        System.out.println(costeTotal);

    }

    public void realizarPago(double costeTotal, String tipoTarjeta) {
        this.realizarPago(costeTotal);
        System.out.println(tipoTarjeta);

    }












}