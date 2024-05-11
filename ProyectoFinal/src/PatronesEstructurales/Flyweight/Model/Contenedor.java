package PatronesEstructurales.Flyweight.Model;

import java.util.HashMap;
import java.util.Map;

public abstract class Contenedor {

  protected static Map<String, Producto> contenedor = new HashMap<String, Producto>();
  protected String clave;

  public abstract Producto getProductos(int x, int y, String color);
}
