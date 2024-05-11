package PatronesEstructurales.Adapter.Controller;

import Interfaz.Interfaz;
import PatronesEstructurales.Adapter.Model.AdaptadorCantidad;

public class Test {

  public static void main(String[] args) {
    Interfaz vista = new Interfaz();
    AdaptadorCantidad adapter = new AdaptadorCantidad();
    vista.mostrar(adapter.donacionSI(2000, "gr"));
  }
}
