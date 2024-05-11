package PatronesCreacionales.Singleton.Controller;

import Interfaz.Interfaz;
import PatronesCreacionales.Singleton.Model.Transaccion;

public class Test {

  public static void main(String[] args) {
    Transaccion transaccion = Transaccion.getInstance();
    Interfaz vista = new Interfaz();
    transaccion.setEntidad("Fundación cultural Guafa");
    transaccion.setNombreTransacción("Donación de material fonográfico");
    vista.mostrar("La entidad:\t" + transaccion.getEntidad());
    vista.mostrar("Realiza:\t" + transaccion.getNombreTransacción());
  }
}
