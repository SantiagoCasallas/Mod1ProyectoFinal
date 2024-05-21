package PatronesComportamentales.Visitor.Controller;

import Interfaz.Interfaz;
import PatronesComportamentales.Visitor.Model.Donacion;
import PatronesComportamentales.Visitor.Model.DonacionCiudad;
import PatronesComportamentales.Visitor.Model.DonacionPueblo;
import PatronesComportamentales.Visitor.Model.VisitorMunicipios;
import java.util.ArrayList;

public class Test {

  public static void main(String[] args) {
    Interfaz vista = new Interfaz();
    ArrayList<Donacion> listaDonaciones = new ArrayList<Donacion>();
    VisitorMunicipios visitor = new VisitorMunicipios();
    Donacion ciudad1 = new DonacionCiudad("Bogotá", 5.6);
    Donacion ciudad2 = new DonacionCiudad("Medellín", 10.6);
    Donacion ciudad3 = new DonacionCiudad("Buenaventura", 15);
    Donacion pueblo1 = new DonacionPueblo("Cota", 6.6);
    Donacion pueblo2 = new DonacionPueblo("Jamundí", 14.6);
    Donacion pueblo3 = new DonacionPueblo("Coyaima", 27.6);
    listaDonaciones.add(ciudad1);
    listaDonaciones.add(ciudad2);
    listaDonaciones.add(ciudad3);
    listaDonaciones.add(pueblo1);
    listaDonaciones.add(pueblo2);
    listaDonaciones.add(pueblo3);
    for (Donacion donacion : listaDonaciones) {
      donacion.aceptar(visitor);
    }
    vista.mostrar(visitor.informar());
  }
}
