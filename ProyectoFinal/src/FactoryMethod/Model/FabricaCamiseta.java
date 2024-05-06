package FactoryMethod.Model;

public class FabricaCamiseta extends FabricaDonacionesRopa {

  @Override
  public Ropa almacenarRopa(String talla, String color, String estado) {
    // TODO Auto-generated method stub
    return new Camiseta(talla, color, estado);
  }
}
