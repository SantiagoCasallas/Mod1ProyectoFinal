package AbstractFactory.Model.Fabricas;

import AbstractFactory.Model.Donaciones.Donaciones;
import AbstractFactory.Model.Donaciones.Limpieza;
import AbstractFactory.Model.Transporte.Aereo;
import AbstractFactory.Model.Transporte.Transporte;

public class FabricaLimpiezaAereo implements AbstractFactory {

  @Override
  public Transporte crearTransporte(String tipo, String matricula) {
    // TODO Auto-generated method stub
    return new Aereo(tipo, matricula);
  }

  @Override
  public Donaciones crearDonacion(
    String nombre,
    String direccion,
    String id,
    String producto,
    int cantidad
  ) {
    // TODO Auto-generated method stub
    return new Limpieza(nombre, direccion, id, producto, cantidad);
  }
}
