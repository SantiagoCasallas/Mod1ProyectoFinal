package PatronesCreacionales.AbstractFactory.Model.Donaciones;

public class Alimento extends Donaciones {

  public Alimento(
    String nombre,
    String direccion,
    String id,
    String producto,
    int cantidad
  ) {
    super(nombre, direccion, id, producto, cantidad);
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
