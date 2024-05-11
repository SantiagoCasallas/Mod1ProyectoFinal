package PatronesEstructurales.Flyweight.Model;

public class ProductoLimpieza extends Producto {

  private String toxicidad;
  private boolean estoxico;

  public ProductoLimpieza(String nombre, String cantidad, boolean estoxico) {
    super(nombre, cantidad);
    this.estoxico = estoxico;
    if (estoxico) {
      this.toxicidad = "Tóxico";
    } else {
      this.toxicidad = "No tóxico";
    }
  }

  public String getToxicidad() {
    return toxicidad;
  }
}
