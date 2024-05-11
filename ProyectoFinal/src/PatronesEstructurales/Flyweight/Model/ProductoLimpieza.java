package PatronesEstructurales.Flyweight.Model;

public class ProductoLimpieza extends Producto {

  private String toxicidad;

  public ProductoLimpieza(String nombre, String cantidad, String toxicidad) {
    super(nombre, cantidad);
    this.toxicidad = toxicidad;
  }

  public String getToxicidad() {
    return toxicidad;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString() + ", Toxicidad: " + toxicidad;
  }
}
