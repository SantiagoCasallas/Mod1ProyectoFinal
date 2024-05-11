package PatronesEstructurales.Flyweight.Model;

public abstract class Producto {

  public String nombre, cantidad;

  public Producto(String nombre, String cantidad) {
    this.nombre = nombre;
    this.cantidad = cantidad;
  }

  public String getCantidad() {
    return cantidad;
  }

  public String getNombre() {
    return nombre;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "Producto: " + nombre + ", Cantidad: " + cantidad;
  }
}
