package PatronesEstructurales.Facade.Controller;

import Interfaz.Interfaz;
import PatronesEstructurales.Facade.Model.Facade;

public class Test {

  public static void main(String[] args) {
    Facade fachada = new Facade();
    Interfaz vista = new Interfaz();
    vista.mostrar(fachada.Recibir());
    vista.mostrar(fachada.Transportar());
    vista.mostrar(fachada.Verificar());
    vista.mostrar(fachada.Almacenar());
  }
}
