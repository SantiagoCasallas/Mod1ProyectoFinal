package PatronesEstructurales.Adapter.Controller;

import PatronesEstructurales.Adapter.Model.AdaptadorCantidad;
import PatronesEstructurales.Adapter.View.Vista;

public class Test {

  public static void main(String[] args) {
    Vista vista = new Vista();
    AdaptadorCantidad adapter = new AdaptadorCantidad();
    vista.mostrar(adapter.donacionSI(2000, "gr"));
  }
}
