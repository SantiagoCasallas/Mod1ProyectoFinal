package PatronesCreacionales.Prototype.Modelo;

import Interfaz.Interfaz;
import java.util.ArrayList;

public abstract class Kit implements Cloneable {

  public String nombre;
  public ArrayList<Elemento> kit = new ArrayList<>();
  Interfaz vista = new Interfaz();

  public Kit(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void contenidoMostrar() {}

  public void agregar(Elemento elemento) {
    kit.add(elemento);
  }

  public abstract Kit clone();
}
