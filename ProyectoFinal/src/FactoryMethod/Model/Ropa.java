package FactoryMethod.Model;

public abstract class Ropa {

  private String talla, color, condicion;

  public Ropa(String talla, String color, String condicion) {
    this.talla = talla;
    this.color = color;
    this.condicion = condicion;
  }

  public String getTalla() {
    return this.talla;
  }

  public String getColor() {
    return this.color;
  }

  public String getCondicion() {
    return this.condicion;
  }

  @Override
  public String toString() {
    return (
      "{" +
      " talla='" +
      getTalla() +
      "'" +
      ", color='" +
      getColor() +
      "'" +
      ", condicion='" +
      getCondicion() +
      "'" +
      "}"
    );
  }
}
