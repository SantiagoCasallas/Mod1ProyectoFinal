package PatronesEstructurales.Flyweight.Model;

public class ContenedorLimpieza extends Contenedor {

  @Override
  public Producto getProductos(String x, String y, String fv) {
    clave = x + " " + y + " " + fv;
    if (!contenedor.containsKey(clave)) {
      contenedor.put(clave, new ProductoLimpieza(x, y, fv));
    }
    return contenedor.get(clave); //
  }
}
