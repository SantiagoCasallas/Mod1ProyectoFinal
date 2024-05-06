package PatronesCreacionales.Singleton.Controller;

import PatronesCreacionales.Singleton.Model.Transaccion;
import PatronesCreacionales.Singleton.View.Vista;

public class Test {

  public static void main(String[] args) {
    Transaccion transaccion = Transaccion.getInstance();
    Vista vista = new Vista();
    transaccion.setEntidad("Fundación cultural Guafa");
    transaccion.setNombreTransacción("Donación de material fonográfico");
    vista.mostrar("La entidad:\t" + transaccion.getEntidad());
    vista.mostrar("Realiza:\t" + transaccion.getNombreTransacción());
  }
}
