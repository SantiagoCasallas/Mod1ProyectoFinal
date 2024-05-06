package AbstractFactory.Model.Fabricas;

import AbstractFactory.Model.Donaciones.Alimento;
import AbstractFactory.Model.Donaciones.Donaciones;
import AbstractFactory.Model.Transporte.Terrestre;
import AbstractFactory.Model.Transporte.Transporte;

public class FabricaLimpiezaTierra implements AbstractFactory {

  @Override
  public Transporte crearTransporte(String tipo, String matricula) {
    // TODO Auto-generated method stub
    return new Terrestre(tipo, matricula);
  }

  @Override
  public Donaciones crearDonacion(
    String nombre,
    String direccion,
    String id,
    String producto,
    int cantidad
  ) {
    return new Alimento(nombre, direccion, id, producto, cantidad);
  }
}
