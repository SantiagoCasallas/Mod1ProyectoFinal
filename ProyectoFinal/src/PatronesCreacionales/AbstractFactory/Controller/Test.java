package PatronesCreacionales.AbstractFactory.Controller;

import Interfaz.Interfaz;
import PatronesCreacionales.AbstractFactory.Model.Donaciones.Donaciones;
import PatronesCreacionales.AbstractFactory.Model.Fabricas.AbstractFactory;
import PatronesCreacionales.AbstractFactory.Model.Fabricas.FabricaAlimentoAire;
import PatronesCreacionales.AbstractFactory.Model.Transporte.Transporte;

public class Test {

  public static void main(String[] args) {
    Donaciones donacion;
    Transporte transporte;
    AbstractFactory factory;
    Interfaz vista = new Interfaz();
    factory = new FabricaAlimentoAire();
    donacion =
      factory.crearDonacion(
        "Inc,and Sons,LLC,Group",
        "655 Alford Lodge",
        "21987391",
        "Arroz",
        12
      );
    transporte = factory.crearTransporte("Toyota Golf", "PBJL1EZPUFML17110");

    vista.mostrar("Datos de la donación: \t" + donacion.toString());
    vista.mostrar("Datos del envío: \t" + transporte.toString());
  }
}
