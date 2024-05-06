package PatronesEstructurales.Composite.Controller;

import PatronesEstructurales.Composite.Model.*;
import PatronesEstructurales.Composite.View.Vista;

public class Test {

  public static void main(String[] args) {
    Donacion donacion = new Donacion("Bulto de zanahorias", 12);
    Donacion donacion1 = new Donacion("Bulto de papas", 15);
    Donacion donacion2 = new Donacion("Caja de atun", 20);
    Donacion donacion3 = new Donacion("Caja de atun", 490);
    Vista vista = new Vista();

    Transporte camion = new Transporte("camion", 500);

    camion.agregarCarga(donacion);
    camion.agregarCarga(donacion1);
    camion.agregarCarga(donacion2);
    camion.agregarCarga(donacion3);
    camion.mostrarCarga(); //

  }
}
