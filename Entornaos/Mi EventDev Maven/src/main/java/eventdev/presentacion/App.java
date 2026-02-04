package eventdev.presentacion;
// Importamos la clase "Gson" desde la librería que hemos añadido
import com.google.gson.Gson;
public class App {
    public static void main(String[] args) {
        // 1. Creamos y damos datos a nuestro objeto Evento
        com.azahartech.eventdev.model.Evento miConcierto = new com.azahartech.eventdev.model.Evento();
        miConcierto.nombre = "Concierto Inauguración Azahar Tech";
        miConcierto.fecha = "2025-09-25";
        // 2. Usamos la herramienta Gson para la conversión
        Gson gson = new Gson();
        String textoJson = gson.toJson(miConcierto);
        // 3. Mostramos el resultado
        System.out.println("--- CONVIRTIENDO OBJETO A JSON ---");
        System.out.println("La librería Gson ha convertido nuestros datos a este texto:");
        System.out.println(textoJson);
    }
}