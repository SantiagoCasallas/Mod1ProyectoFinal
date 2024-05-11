package PatronesEstructurales.Proxy.Controller;

import PatronesEstructurales.Proxy.Model.Proxy;
import PatronesEstructurales.Proxy.View.Vista;

public class Test {

  public static void main(String[] args) {
    Vista vista = new Vista();
    Proxy proxy = new Proxy(true);
    Proxy proxy2 = new Proxy(false);
    vista.mostrar(proxy.entrarBD());
    vista.mostrar(proxy2.entrarBD());
  }
}
