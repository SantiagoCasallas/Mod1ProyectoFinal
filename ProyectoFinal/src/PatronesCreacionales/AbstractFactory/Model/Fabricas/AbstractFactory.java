package PatronesCreacionales.AbstractFactory.Model.Fabricas;

import PatronesCreacionales.AbstractFactory.Model.Donaciones.Donaciones;
import PatronesCreacionales.AbstractFactory.Model.Transporte.Transporte;

public interface AbstractFactory {
  public Transporte crearTransporte(String tipo, String matricula);

  public Donaciones crearDonacion(
    String nombre,
    String direccion,
    String id,
    String producto,
    int cantidad
  );
}
