package PatronesCreacionales.FactoryMethod.Model;

public class FabricaPantalon extends FabricaDonacionesRopa {

  @Override
  public Ropa almacenarRopa(String talla, String color, String estado) {
    // TODO Auto-generated method stub
    return new Pantalon(talla, color, estado);
  }
}
