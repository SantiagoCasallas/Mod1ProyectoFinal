package PatronesCreacionales.Builder.Controller;

import Interfaz.Interfaz;
import PatronesCreacionales.Builder.Model.Director;
import PatronesCreacionales.Builder.Model.Donacion;
import PatronesCreacionales.Builder.Model.DonacionRopa;
import PatronesCreacionales.Builder.Model.Pantalon;

public class Test {

  public static void main(String[] args) {
    Interfaz vista = new Interfaz();
    // Director director = new Director();
    // Donacion builder = new Donacion();
    // Donacion builder1 = new Donacion();
    // director.DonacionPantalon(builder);

    // DonacionRopa donacion = builder.getDonacionRopa();
    // vista.mostrar("primero" + "\n" + donacion.getColor() + "\n" +
    // donacion.getMarca() + "\n" + donacion.getTalla());
    // vista.mostrar(donacion.toString());
    // donacion.setColor("Verde");
    // donacion.setMarca("Nike");
    // donacion.setTalla("XL");

    // vista.mostrar("segundo" + "\n" + donacion.getColor() + "\n" +
    // donacion.getMarca() + "\n" + donacion.getTalla());
    // vista.mostrar(donacion.toString());

  }

  public static Director crearPantalon(DonacionRopa donacion) {
    Director director = new Director();
    Donacion builder = new Donacion();
    director.DonacionPantalon(builder);
    return director;
  }

}
