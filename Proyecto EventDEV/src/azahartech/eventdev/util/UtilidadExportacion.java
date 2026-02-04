package azahartech.eventdev.util;

import java.util.List;

public class UtilidadExportacion {
    public static void exportarLista(List<Exportable> listaObjetos) {
        for (Exportable item : listaObjetos) {
            System.out.println("CSV:");
            System.out.println(item.aCSV());

            System.out.println("XML:");
            System.out.println(item.aXML());
        }
    }
}
