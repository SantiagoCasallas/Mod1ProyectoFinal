package PatronesEstructurales.Flyweight.Model;

public class ContenedorAlimentos extends Contenedor {

  @Override
  public Producto getProductos(String x, String y, String fv) {
    clave = x + " " + y + " " + fv;
    if (!contenedor.containsKey(clave)) {
      contenedor.put(clave, new ProductoAlimienticio(x, y, fv));
    }
    return contenedor.get(clave);
  }

  public int getTamañoContenedor() {
    return contenedor.size();
  }
}
