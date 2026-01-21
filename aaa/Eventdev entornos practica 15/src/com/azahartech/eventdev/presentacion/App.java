package com.azahartech.eventdev.presentacion;

import com.azahartech.eventdev.modelo.Evento;
import com.azahartech.eventdev.modelo.Recinto;
import com.azahartech.eventdev.modelo.Usuario;
import com.azahartech.eventdev.servicio.ServicioUsuario;
import com.azahartech.eventdev.util.UtilidadValidacion;

import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       /* Usuario eskare = new Usuario("Eskare", "eskare@gmail.com");
        eskare.mostrarInformacion();
        System.out.println();


        Recinto sitioguay = new Recinto("Sitio Guay", "Calle del pintor Soler Blasco", 275);
        sitioguay.mostrarInformacion();
        System.out.println();

        Recinto recinto = new Recinto("Recinto", "Calle Cristian", 777);
        Evento miEvento = new Evento("miEvento", recinto);
        miEvento.mostrarInformacion();

        Usuario manolo = new Usuario("Manolo", "manolo_el_churrero@gmail.com");
        DetallePago detalleManolo = new DetallePago("VISA", "1234567890777777");
        detalleManolo.anadirDetallePago(detalleManolo);
        manolo.mostrarInformacion();

        Evento concierto = new Evento("Concierto Lenna6", recinto);
        Usuario cristian = new Usuario("Cristian", "Cristian@gmail.com");

        Tique tique1 = new Tique(concierto, cristian);
        Comentario comentarioTique1 = new Comentario(concierto, cristian, 4, "Un excelente servicio");

        Tique.obtenerTotalTiques();
        System.out.println(Tique.obtenerTotalTiques());

        Tique tique2 = new Tique(concierto, cristian);

        Recinto RePrueba = new Recinto("RePrueba", "DireccionGuay", 1000);
        Evento EvPrueba = new Evento("EvPrueba", RePrueba);
        Usuario UsPrueba = new Usuario("UsPrueba", "UsPrueba@gmail.com");

        ServicioEvento servicio1 = new ServicioEvento(EvPrueba, UsPrueba);

        Recinto Recinto12 = new Recinto("Recinto12", "Calle12", 777);
        Concierto Lenna6 = new Concierto("Concierto Lenna6", Recinto12, "Lenna6");
        Partido Clasico = new Partido("Clasico1", Recinto12, "Barça", "Madrid");

        Lenna6.consultarNombre();
        System.out.println(Lenna6.consultarNombre());

        Lenna6.consultarBandaPrincipal();
        System.out.println(Lenna6.consultarBandaPrincipal());

        Lenna6.mostrarInformacion();
        Clasico.mostrarInformacion();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Para crear concierto, escriba 1, para crear un partido escriba 2.");
        int eleccion = scanner.nextInt();
        scanner.nextLine();

        if (eleccion == 1) {
            System.out.println("Escriba el nombre del evento:");
            String nombreEventoElegido = scanner.nextLine();
            System.out.println("Escriba la fecha en formato '2000-12-31'");
            LocalDate fechaElegida = LocalDate.parse(scanner.nextLine());
            System.out.println("Escriba el nombre del recinto donde se celebrará:");
            String nombreRecintoElegido = scanner.nextLine();
            System.out.println("Escriba la dirección del recinto donde se celebrará:");
            String direccionRecintoElegido = scanner.nextLine();
            System.out.println("Escriba el aforo máximo del recinto:");
            int aforoElegido = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Escriba la banda principal que dará el concierto:");
            String bandaPrincipalElegido = scanner.nextLine();

            Recinto recintoCreado = new Recinto(nombreRecintoElegido, direccionRecintoElegido, aforoElegido);
            Concierto conciertoCreado = new Concierto(nombreEventoElegido, recintoCreado, bandaPrincipalElegido);

            boolean fechaBien = UtilidadValidacion.fechaFutura(fechaElegida);
            System.out.println("La fecha '" + fechaElegida + "' es válida: " + fechaBien);

            conciertoCreado.mostrarInformacion();
        }

        if (eleccion == 2) {
            System.out.println("Escriba el nombre del evento:");
            String nombreEventoElegido = scanner.nextLine();
            System.out.println("Escriba la fecha en formato '2000-12-31'");
            LocalDate fechaElegida = LocalDate.parse(scanner.nextLine());
            System.out.println("Escriba el nombre del recinto donde se celebrará:");
            String nombreRecintoElegido = scanner.nextLine();
            System.out.println("Escriba la dirección del recinto donde se celebrará:");
            String direccionRecintoElegido = scanner.nextLine();
            System.out.println("Escriba el aforo máximo del recinto:");
            int aforoElegido = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Escriba el equipo local:");
            String equipoLocalElegido = scanner.nextLine();
            System.out.println("Escriba el equipo visitante:");
            String equipoVisitanteElegido = scanner.nextLine();

            Recinto recintoCreado = new Recinto(nombreRecintoElegido, direccionRecintoElegido, aforoElegido);
            Partido partidoCreado = new Partido(nombreEventoElegido, recintoCreado, equipoLocalElegido, equipoVisitanteElegido);

            boolean fechaBien = UtilidadValidacion.fechaFutura(fechaElegida);
            System.out.println("La fecha '" + fechaElegida + "' es válida: " + fechaBien);

            partidoCreado.mostrarInformacion();
        }
*/



        Recinto recintoVips = new Recinto("Recinto Vips", "Calle Vips", 1000);
        Recinto recintoVips2 = new Recinto("Recinto Vips", "Calle Vips", 10);
  /*      recintoVips.reservarAsientoVip(1);
        recintoVips.reservarAsientoVip(5);
        recintoVips.reservarAsientoVip(10);
        recintoVips.mostrarInformacion();

 */


        LocalDate fecha1 = LocalDate.of(2026, 7, 7);
        LocalDate fecha2 = LocalDate.of(2027, 7, 7);
        LocalDate fecha3 = LocalDate.of(2028, 7, 7);
        LocalDate fecha4 = LocalDate.of(2021, 7, 7);
        LocalDate fecha5 = LocalDate.of(2020, 7, 7);

       /* Evento eventoPruebaServicio = new Evento("Evento prueba servicioEvento", recintoVips, 10.10);
       Usuario Eskare = new Usuario("Eskare", "Eskare@gmail");
        Usuario Eskare2 = new Usuario("Eskare2", "Eskare2@gmail");
        Usuario Eskare3 = new Usuario("Eskare3", "Eskare3@gmail");
        ServicioEvento servicioEvento = new ServicioEvento(eventoPruebaServicio, Eskare);
*/
        /*
        Evento evento1 = new Evento("Evento1", recintoVips, 7.5, fecha1);
        Evento evento2 = new Evento("Evento2", recintoVips,8.0, fecha2);
        Evento evento3 = new Evento("Evento3", recintoVips, 9.99, fecha3);
        Evento evento4 = new Evento("Evento4", recintoVips, 11.99, fecha4);
        Evento evento5 = new Evento("Evento5", recintoVips, 10.0, fecha5);
 /*
        servicioEvento.anadirDestacado(evento1, 1);
        servicioEvento.anadirDestacado(evento2, 3);
        servicioEvento.anadirDestacado(evento3, 5);
        servicioEvento.mostrarCartelera();

        servicioEvento.buscarDestacadoMasCaro();
        System.out.println("El mas caro es: " + servicioEvento.buscarDestacadoMasCaro().consultarNombre());



        ServicioEvento hola = new ServicioEvento(evento1, Eskare);
        hola.registrarEvento(evento1);
        hola.registrarEvento(evento3);
        hola.registrarEvento(evento2);
        hola.mostrarTodoElCatalogo();


       // ServicioUsuario hola = new ServicioUsuario();
        // hola.registrarUsuario(Eskare);
        // hola.registrarUsuario(Eskare2);
       // hola.registrarUsuario(Eskare3);
        // hola.buscarUsuarioPorEmail("Eskare3@gmail");

        ServicioEvento servicioEvento = new ServicioEvento(evento1, Eskare);

        servicioEvento.registrarEvento(evento1);
        servicioEvento.registrarEvento(evento2);
        servicioEvento.registrarEvento(evento3);
        servicioEvento.registrarEvento(evento4);
        servicioEvento.registrarEvento(evento5);

        servicioEvento.mostrarTodoElCatalogo();

        servicioEvento.eliminarEventosPasados();

        System.out.println("------------------------------------------------------------------");

        servicioEvento.mostrarTodoElCatalogo();

*/


       /* ServicioEvento hola = new ServicioEvento(evento1, Eskare);
        hola.registrarEvento(evento1);
        hola.mostrarTodoElCatalogo();

        ServicioUsuario adios = new ServicioUsuario();
         adios.registrarUsuario(Eskare);
         adios.mostrarTodosLosUsuarios();
*/
/*
        Evento evento6 = new Evento("Evento6", recintoVips, 100.99, fecha1);
        Evento evento7 = new Evento("Evento7", recintoVips2, 1.99, fecha2);
        Usuario Eskare = new Usuario("Eskare", "Eskare@gmail", true);
        Usuario Eskare2 = new Usuario("Eskare2", "Eskare2@gmail", false);
*/

        Usuario semana16 = new Usuario("Semana16", "sem-ana16@gmail.com", true);
        ServicioUsuario semana16SE = new ServicioUsuario();
     /*  System.out.println(UtilidadValidacion.emailValido(semana16.consultarEmail()));

       while (!UtilidadValidacion.emailValido(semana16.consultarEmail())) {
            System.err.println("Email no válido, escriba otro:");
            semana16.cambiarEmail(scanner.nextLine());
            UtilidadValidacion.emailValido(semana16.consultarEmail());
            System.out.println(UtilidadValidacion.emailValido(semana16.consultarEmail()));
        }

        semana16SE.registrarUsuario(semana16);

        Evento evento16 = new Evento("evento16", recintoVips, 20.0, fecha1, "EVT-2026-AAA");
        ServicioEvento evento16SE = new ServicioEvento(evento16, semana16);

        System.out.println(UtilidadValidacion.esCodigoEventoValido(evento16.getId()));

        if (UtilidadValidacion.esCodigoEventoValido(evento16.getId())) {
            evento16SE.registrarEvento(evento16);
        }
        else {
            System.err.println("Código no válido");
        }

        Usuario Kenneth = new Usuario("Kenneth", "KennethYMarko@gmail.com", true);
        Usuario Marko = new Usuario("Marko", "KennethYMarko@gmail.com", true);
        ServicioUsuario KennethMarko = new ServicioUsuario();

        KennethMarko.registrarUsuario(Kenneth);
       KennethMarko.registrarUsuario(Marko);
*/
        Evento evento16A = new Evento("evento16a", recintoVips, 20.0, fecha1, "evt-2026-AAA");
        Evento evento16B = new Evento("evento16b", recintoVips, 20.0, fecha1, "EVT-26-AAA");
        Evento evento16C = new Evento("evento16c", recintoVips, 20.0, fecha1, "EVT-2026-A");
        Evento evento16D = new Evento("evento16d", recintoVips, 20.0, fecha1, "EVT-2026-ZAR");

        System.out.println(UtilidadValidacion.esCodigoEventoValido(evento16A.getId()));
        System.out.println(UtilidadValidacion.esCodigoEventoValido(evento16B.getId()));
        System.out.println(UtilidadValidacion.esCodigoEventoValido(evento16C.getId()));
        System.out.println(UtilidadValidacion.esCodigoEventoValido(evento16D.getId()));




        }
    }
