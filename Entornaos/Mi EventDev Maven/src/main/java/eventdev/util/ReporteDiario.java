package eventdev.util;

public class ReporteDiario {
    private static final int ID_REPORTE = 1;

    public void generar() {

        try {
            System.out.println("Generando reporte " + ID_REPORTE);
            if (ID_REPORTE == 1) {
                System.out.println("Primer reporte");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean chequear(int x) {
        return x == 1;
    }

    @SuppressWarnings("PMD.ShortVariable")
    public void metodoObligatorio(int id) {
        System.out.println("Este método se ejecuta, pero no utiliza el parámetro.");
    }
}