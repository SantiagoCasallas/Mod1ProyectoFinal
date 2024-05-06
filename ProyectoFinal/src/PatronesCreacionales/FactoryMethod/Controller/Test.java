package PatronesCreacionales.FactoryMethod.Controller;

import PatronesCreacionales.FactoryMethod.Model.FabricaCamiseta;
import PatronesCreacionales.FactoryMethod.Model.FabricaDonacionesRopa;
import PatronesCreacionales.FactoryMethod.Model.Ropa;
import PatronesCreacionales.FactoryMethod.View.Vista;

public class Test {

  public static void main(String[] args) {
    Ropa prenda;
    FabricaDonacionesRopa fabricaRopa;
    Vista vista = new Vista();
    fabricaRopa = new FabricaCamiseta();
    prenda = fabricaRopa.almacenarRopa("L", "Verde", "Nuevo");
    vista.mostrar(prenda.toString());
  }
}
