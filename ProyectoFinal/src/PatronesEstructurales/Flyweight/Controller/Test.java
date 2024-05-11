package PatronesEstructurales.Flyweight.Controller;

import Interfaz.Interfaz;
import PatronesEstructurales.Flyweight.Model.Contenedor;
import PatronesEstructurales.Flyweight.Model.ContenedorAlimentos;
import PatronesEstructurales.Flyweight.Model.ContenedorLimpieza;
import PatronesEstructurales.Flyweight.Model.Producto;
import PatronesEstructurales.Flyweight.Model.ProductoAlimienticio;
import java.util.ArrayList;

public class Test {

  @SuppressWarnings("static-access")
  public static void main(String[] args) {
    Interfaz vista = new Interfaz();
    ArrayList<Producto> bodega = new ArrayList<Producto>();
    Contenedor flyweight;
    flyweight = new ContenedorAlimentos();
    Producto producto;
    for (int i = 0; i < 20000; i++) {
      producto = flyweight.getProductos("Arroz", "500 gr", "18 Mayo 2026");
      bodega.add((ProductoAlimienticio) producto);
    }
    vista.mostrar("Tamaño bodega alimentos: " + bodega.size());
    vista.mostrar("Tamaño map Contenedor: " + flyweight.contenedor.size());
    producto = flyweight.getProductos("Arroz", "1 kg", "18 Mayo 2026");
    bodega.add((ProductoAlimienticio) producto);
    vista.mostrar("Añadiendo un producto con clave diferente");
    vista.mostrar("Tamaño bodega alimentos: " + bodega.size());
    vista.mostrar("Tamaño map Contenedor: " + flyweight.contenedor.size());
    //----------------------------------------------------------------
    vista.mostrar("------------------------------------------------");
    Contenedor flyweight2 = new ContenedorLimpieza();
    Producto producto2;
    ArrayList<Producto> bodega2 = new ArrayList<Producto>();

    for (int i = 0; i < 2000; i++) {
      producto2 = flyweight2.getProductos("Arroz", "500 gr", "18 Mayo 2026");
      bodega2.add(producto2);
    }
    vista.mostrar("Tamaño bodega alimentos: " + bodega2.size());
    vista.mostrar("Tamaño map Contenedor: " + flyweight2.contenedor.size());
    producto2 = flyweight2.getProductos("Arroz", "1 kg", "18 Mayo 2026");
    bodega2.add(producto2);
    vista.mostrar("Añadiendo un producto con clave diferente");
    vista.mostrar("Tamaño bodega artículos de limpieza: " + bodega2.size());
    vista.mostrar("Tamaño map Contenedor: " + flyweight2.contenedor.size());
  }
  // public void testLimpieza() {

}
