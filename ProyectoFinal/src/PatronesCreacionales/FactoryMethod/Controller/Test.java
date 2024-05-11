package PatronesCreacionales.FactoryMethod.Controller;

import Interfaz.Interfaz;
import PatronesCreacionales.FactoryMethod.Model.FabricaCamiseta;
import PatronesCreacionales.FactoryMethod.Model.FabricaDonacionesRopa;
import PatronesCreacionales.FactoryMethod.Model.Ropa;

public class Test {

  public static void main(String[] args) {
    Ropa prenda;
    FabricaDonacionesRopa fabricaRopa;
    Interfaz vista = new Interfaz();
    fabricaRopa = new FabricaCamiseta();
    prenda = fabricaRopa.almacenarRopa("L", "Verde", "Nuevo");
    vista.mostrar(prenda.toString());
  }
}
