package PatronesCreacionales.Prototype.Modelo;

import java.util.ArrayList;

import PatronesCreacionales.Prototype.View.Vista;

public abstract class Kit implements Cloneable {
    public String nombre;
    public ArrayList<Elemento> kit = new ArrayList<>();
    Vista vista = new Vista();

    public Kit(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void contenidoMostrar() {
    }

    public void agregar(Elemento elemento) {
        kit.add(elemento);
    }

    public abstract Kit clone();
}
