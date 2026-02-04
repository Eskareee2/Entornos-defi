package azahartech.eventdev.datos;

import azahartech.eventdev.modelo.Usuario;

import java.util.ArrayList;
import java.util.HashMap;

public class RepositorioGenerico<T> {
    private ArrayList<T> elementos = new ArrayList<>();


    public void guardarElemento(T elemento) {
        this.elementos.add(elemento);
    }

    public ArrayList<T> listarElemento() {
        return elementos;
    }

    public void eliminarElemento(T elemento) {
        elementos.remove(elemento);
    }

    public void obtenerElemento(int indice)  {
    elementos.get(indice);
    }

    public void tamaño() {
        System.out.println(elementos.size());
    }



}
