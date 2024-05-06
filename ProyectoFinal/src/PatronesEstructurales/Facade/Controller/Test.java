package PatronesEstructurales.Facade.Controller;

import PatronesEstructurales.Facade.Model.Facade;
import PatronesEstructurales.Facade.View.Vista;

public class Test {

  public static void main(String[] args) {
    Facade fachada = new Facade();
    Vista vista = new Vista();
    vista.mostrar(fachada.Recibir());
    vista.mostrar(fachada.Transportar());
    vista.mostrar(fachada.Verificar());
    vista.mostrar(fachada.Almacenar());
  }
}
