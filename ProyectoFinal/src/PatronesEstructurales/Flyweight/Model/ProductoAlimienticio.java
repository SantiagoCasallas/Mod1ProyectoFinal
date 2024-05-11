package PatronesEstructurales.Flyweight.Model;

public class ProductoAlimienticio extends Producto {

  String fechaCaducidad;

  public ProductoAlimienticio(
    String nombre,
    String cantidad,
    String fechaCaducidad
  ) {
    super(nombre, cantidad);
    this.fechaCaducidad = fechaCaducidad;
  }

  public String getFechaCaducidad() {
    return fechaCaducidad;
  }
}
