package azahartech.eventdev.servicio;

import azahartech.eventdev.modelo.*;
import azahartech.eventdev.pagos.ProcesadorPago;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;

public class ServicioEvento {
    private Evento eventoDePrueba;
    private Usuario usuarioDePrueba;
    private Evento eventoBuscado;
    private ArrayList<Evento> listaEventosMasAforo;
    private long contadorBeneficos;
    // private Evento[] carteleraDestacados;
    // private ArrayList<Evento> listaEventos;
    // private RepositorioGenerico<Evento> repositorio = new RepositorioGenerico<>();
    private HashMap<String, Evento> mapaEventos = new HashMap<>();


    public ServicioEvento(Evento nuevoEventoDePrueba, Usuario nuevoUsuarioDePrueba) {

        //   this.listaEventos = new ArrayList<>();

        // carteleraDestacados = new Evento[5];
    }

    /*
        public Evento buscarEventoPorNombre(String nombre) {
            eventoBuscado = repositorio.listarElemento().stream()
                    .filter(e -> e.consultarNombre().equals(nombre))
                    .findFirst()
                    .orElse(null);
            return eventoBuscado;
        }

        public ArrayList<Evento> obtenerEventosConAforoMayorA(int capacidad) {
            repositorio.listarElemento().stream()
                    .filter(e -> e.consultarRecinto().consultarAforoMaximo() > capacidad)
                    .forEach(e -> listaEventosMasAforo.add(e));
            return listaEventosMasAforo;
        }
    */
    public void registrarEvento(Evento e) {
        mapaEventos.put(e.getId(), e);
    }

    public Evento buscarEventoPorId(String id) {
        return mapaEventos.get(id);
    }

    public void mostrarTodoElCatalogo() {
        for (Evento e : this.mapaEventos.values()) {
            e.mostrarInformacion();
        }


    }

    public void contarEventosPorAforo(int aforoMinimo) {
        long cuentasEventosPorAforo = mapaEventos.values().stream()
                .filter(e -> e.consultarRecinto().consultarAforoMaximo() > aforoMinimo)
                .count();

        System.out.println(cuentasEventosPorAforo);

    }

    public void generarInformeFinanciero() {

        for (Evento evento : mapaEventos.values()) {
            System.out.println("Evento: " + evento.consultarNombre());
            System.out.println("Coste operativo: " + evento.calcularCosteOperativo() + " EUR");
            System.out.println("Coste sugerido " + evento.calcularPrecioVentaRecomendado() + " EUR");
        }
    }

    public Tique realizarCompra(Usuario u, Evento e, int cantidad, ProcesadorPago pasarela) {
        double costeTotal = e.consultarPrecio() * cantidad;
        Tique tiquete = null;
        boolean pagoExitoso = pasarela.procesarPago(costeTotal);
        if (pagoExitoso) {
            tiquete = new Tique(e, u);
        } else {
            System.err.println("El pago ha sido rechazado.");
            return null;
        }
        return tiquete;

    }
}

/*
    public long contarEventosBeneficos() {
        contadorBeneficos = repositorio.listarElemento().stream()
                .map(e -> e.isEsBenefico())
                .count();
        return contadorBeneficos;
    }



    public void eliminarEventosPasados() {
        LocalDate hoy = LocalDate.now();
        Iterator<Evento> it = this.listaEventos.iterator();
        while (it.hasNext()) {
            Evento eventoActual = it.next();
            if (eventoActual.consultarFecha().isBefore(hoy) ) {
                it.remove();
                System.out.println("Eliminado evento caducado: " + eventoActual.consultarNombre());
            }


        }


    }



    boolean posicionValida;

    public boolean anadirDestacado(Evento evento, int posicion) {
        int posicion2 = posicion - 1;
        if (carteleraDestacados[posicion2] == null) {
            carteleraDestacados[posicion2] = evento;
            posicionValida = true;
        }
        if (carteleraDestacados[posicion2] != null) {
            posicionValida = false;
        }
        if (posicion < 1 || posicion > 5) {
            posicionValida = false;
        }
        return posicionValida;
    }

    public void mostrarCartelera() {
        for (int i = 0; i < carteleraDestacados.length; i++) {
            System.out.println("Posición " + i + " contiene el evento: " + carteleraDestacados[i]);
            if (carteleraDestacados[i] != null) {
                carteleraDestacados[i].mostrarInformacion();
            }
            if (carteleraDestacados[i] == null) {
                System.out.println("Espacio disponible");
            }
        }
    }



        detalle1.realizarPago(costeTotal);
        eventoDePrueba.registrarVenta(cantidad);
        return tiquenuevo;

    }

    public Evento buscarDestacadoMasCaro() {
        Evento eventoMasCaro = null;
        double precioMasAlto = -1.0;

        for (int i = 0; i < carteleraDestacados.length; i++) {

            Evento evento = carteleraDestacados[i];

            if (evento != null) {
                double precioActual = evento.consultarPrecio();
                if (precioActual > precioMasAlto) {
                    precioMasAlto = precioActual;
                    eventoMasCaro = evento;
                }
            }
        }
        return eventoMasCaro;
    }
    }



}


 */
