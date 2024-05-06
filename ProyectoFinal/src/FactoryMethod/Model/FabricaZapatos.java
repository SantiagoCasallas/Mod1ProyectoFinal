package FactoryMethod.Model;

public class FabricaZapatos extends FabricaDonacionesRopa {

  @Override
  public Ropa almacenarRopa(String talla, String color, String estado) {
    // TODO Auto-generated method stub
    return new Zapatos(talla, color, estado);
  }
}
