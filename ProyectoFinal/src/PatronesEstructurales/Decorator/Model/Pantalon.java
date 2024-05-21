package PatronesEstructurales.Decorator.Model;

import Interfaz.Interfaz;

public class Pantalon implements Donacion {
    public Interfaz vista = new Interfaz();

    public String getNombre() {
        return "pantalon";
    }

    public double getPeso() {
        vista.mostrar("El pantalon pesa: " + 0.4);
        return 0.4;
    }
}
