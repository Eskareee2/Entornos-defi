package azahartech.eventdev.servicio;

import azahartech.eventdev.datos.RepositorioGenerico;
import azahartech.eventdev.modelo.Evento;
import azahartech.eventdev.modelo.Usuario;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.HashMap;
import java.util.Objects;

public class ServicioUsuario {
    //  private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    // private RepositorioGenerico<Usuario> repositorio = new RepositorioGenerico<>();
    private HashMap<String, Usuario> mapaUsuarios = new HashMap<>();
    public void registrarUsuario(Usuario u) {
        if (mapaUsuarios.containsKey(u.consultarEmail())) {
            System.err.println("No se puede añadir, ya hay un usuario con ese email asignado. Intente usar un email diferente.");
        } else {
            this.mapaUsuarios.put(u.consultarEmail(), u);
        }
    }

    public Usuario buscarUsuarioPorNombre(String nombre) {
        for (Usuario u : this.mapaUsuarios.values()) {
            if (u.consultarNombre().equals(nombre)) {
                return u;
            }
            }
            return null;
        }

/*
    public void mostrarTodosLosUsuarios() {
        for (Usuario usuario : repositorio.listarElemento()) {
            System.out.println("Usuario: " + usuario.consultarNombre());
            usuario.mostrarInformacion();
        }
    }

    public void imprimirNombresUsuariosVip() {
            repositorio.listarElemento().stream()
                    .map(u -> u.consultarNombre())
                    .forEach(nombre -> System.out.println(nombre));
        }
        }
*/

    public Usuario buscarUsuarioPorEmail(String email) {
        return this.mapaUsuarios.get(email);
    }
}







