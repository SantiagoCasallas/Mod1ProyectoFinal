package PatronesEstructurales.Decorator.Controller;

import Interfaz.Interfaz;
import PatronesEstructurales.Decorator.Model.*;

public class Test {
    public static void main(String[] args) {
        Interfaz vista = new Interfaz();
        Donacion donacion = new KitConcreto(new Pantalon(), new Camiseta(), new Pantalon());
        vista.mostrar(donacion.getNombre());
        donacion.getPeso();
    }
}
