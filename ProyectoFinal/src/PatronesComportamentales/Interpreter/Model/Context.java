package PatronesComportamentales.Interpreter.Model;

import java.util.ArrayList;
import java.util.List;

import Interfaz.Interfaz;

public class Context {
    private List<Donacion> donaciones = new ArrayList<>();
    Interfaz vista = new Interfaz();

    public List<Donacion> getDonaciones() {
        return donaciones;
    }

    public void agregarDonacion(Donacion donacion) {
        donaciones.add(donacion);
        vista.mostrar("Donación de " + donacion.getTipo() + " agregada.");
    }

    public void listarDonaciones() {
        if (donaciones.isEmpty()) {
            vista.mostrar("No hay donaciones.");
        } else {
            vista.mostrar("Lista de donaciones: (" + donaciones.size() + ")");
            for (Donacion donacion : donaciones) {
                vista.mostrar("- " + donacion.getTipo());
            }
        }
    }
}