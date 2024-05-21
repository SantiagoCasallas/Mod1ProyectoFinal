package PatronesEstructurales.Decorator.Model;

import Interfaz.Interfaz;

public class Camiseta implements Donacion {
    public Interfaz vista = new Interfaz();

    public String getNombre() {
        return "camiseta";
    }

    public double getPeso() {
        vista.mostrar("La camisa pesa: " + 0.2);

        return 0.2;
    }
}
