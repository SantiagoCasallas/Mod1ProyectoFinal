package PatronesCreacionales.Builder.Controller;

import Interfaz.Interfaz;
import PatronesCreacionales.Builder.Model.BuilderDonacion;
import PatronesCreacionales.Builder.Model.Director;
import PatronesCreacionales.Builder.Model.Donacion;
import PatronesCreacionales.Builder.Model.DonacionRopa;

public class Test {

  public static void main(String[] args) {

    Interfaz vista = new Interfaz();
    BuilderDonacion builder = new Donacion();
    Director director = new Director(builder);
    director.crearDonacion();
    DonacionRopa conjunto1 = director.getDonacion();
    vista.mostrar(conjunto1.toString());
    conjunto1.getCamiseta().setMarca("Gucci");
    conjunto1.getCamiseta().setTalla("M");
    vista.mostrar(conjunto1.toString());

  }

  // public static Director crearPantalon(DonacionRopa donacion) {
  // Director director = new Director();
  // Donacion builder = new Donacion();
  // director.DonacionPantalon(builder);
  // return director;
  // }

}
