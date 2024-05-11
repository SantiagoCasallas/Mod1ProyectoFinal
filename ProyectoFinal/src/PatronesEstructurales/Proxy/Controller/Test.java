package PatronesEstructurales.Proxy.Controller;

import Interfaz.Interfaz;
import PatronesEstructurales.Proxy.Model.Proxy;

public class Test {

  public static void main(String[] args) {
    Interfaz vista = new Interfaz();
    Proxy proxy = new Proxy(true);
    Proxy proxy2 = new Proxy(false);
    vista.mostrar(proxy.entrarBD());
    vista.mostrar(proxy2.entrarBD());
  }
}
