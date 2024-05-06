package PatronesEstructurales.Composite.Model;

import PatronesEstructurales.Composite.View.Vista;
import java.util.ArrayList;

public class Transporte {
    String nombre;
    double capacidadCarga;
    ArrayList<Donacion> carga = new ArrayList<>();

    Vista vista = new Vista();

    public Transporte(String nombre, double capacidadCarga) {
        this.nombre = nombre;
        this.capacidadCarga = capacidadCarga; //
    }

    public String getNombre() {
        return nombre;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void agregarCarga(Donacion donacion) {
        if (getCapacidadCarga() - donacion.getPeso() >= 0) {
            carga.add(donacion);
            capacidadCarga -= donacion.getPeso();
            vista.mostrar("se agregó " + donacion.getNombre());
        } else {
            vista.mostrar("no se puede agregar " + donacion.getNombre() + " al " + getNombre());
        }
    }

    public ArrayList<Donacion> getCarga(Donacion dosDonacion) {
        return carga;

    }

    public void mostrarCarga() {
        vista.mostrar("\nEl " + getNombre() + " tiene:");

        for (int i = 0; i < carga.size(); i++) {
            vista.mostrar(carga.get(i).getNombre());
        }
    }

}
