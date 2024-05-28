package PatronesEstructurales.Bridge.Controller;

import PatronesEstructurales.Bridge.Model.BdDonacion;
import PatronesEstructurales.Bridge.Model.ProcesadorDonaciones;
import View.Interfaz;

public class Test {

  public static void main(String[] args) {
    Interfaz vista = new Interfaz();
    BdDonacion baseDeDatos = new BdDonacion("John Doe", "Computadores", 10, 1);
    ProcesadorDonaciones procesadorDonaciones = new ProcesadorDonaciones(baseDeDatos);
    vista.mostrar(procesadorDonaciones.procesar());
  }
}
