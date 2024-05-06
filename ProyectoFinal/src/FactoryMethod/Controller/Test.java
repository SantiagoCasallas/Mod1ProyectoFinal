package FactoryMethod.Controller;

import FactoryMethod.Model.FabricaCamiseta;
import FactoryMethod.Model.FabricaDonacionesRopa;
import FactoryMethod.Model.Ropa;
import FactoryMethod.View.Vista;

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
