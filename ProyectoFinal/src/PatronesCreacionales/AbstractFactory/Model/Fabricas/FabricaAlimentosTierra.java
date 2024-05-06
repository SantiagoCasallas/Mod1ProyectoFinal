package PatronesCreacionales.AbstractFactory.Model.Fabricas;

import PatronesCreacionales.AbstractFactory.Model.Donaciones.Alimento;
import PatronesCreacionales.AbstractFactory.Model.Donaciones.Donaciones;
import PatronesCreacionales.AbstractFactory.Model.Transporte.Terrestre;
import PatronesCreacionales.AbstractFactory.Model.Transporte.Transporte;

public class FabricaAlimentosTierra implements AbstractFactory {

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
    // TODO Auto-generated method stub
    return new Alimento(nombre, direccion, id, producto, cantidad);
  }
}
