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

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString() + "Fecha de vencimiento: " + fechaCaducidad;
  }
}
