package PatronesEstructurales.Composite.Model;

import java.util.ArrayList;

public class Transporte {
    String nombre;
    double peso;
    ArrayList<Donacion> carga = new ArrayList<>();

    public Transporte(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }
}
