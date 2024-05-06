package AbstractFactory.Model.Donaciones;

public abstract class Donaciones {

  private String nombreDonante, direccionDonante, idDonante, producto, cantidad;

  public Donaciones(
    String nombre,
    String direccion,
    String id,
    String producto,
    int cantidad
  ) {
    nombreDonante = nombre;
    direccionDonante = direccion;
    idDonante = id;
    this.producto = producto;
    this.cantidad = "" + cantidad;
  }

  public String getNombreDonante() {
    return this.nombreDonante;
  }

  public String getDireccionDonante() {
    return this.direccionDonante;
  }

  public String getIdDonante() {
    return this.idDonante;
  }

  public String getProducto() {
    return this.producto;
  }

  public String getCantidad() {
    return this.cantidad;
  }

  @Override
  public String toString() {
    return (
      "{" +
      " Nombre donante: '" +
      getNombreDonante() +
      "'" +
      ", Direccion donante: '" +
      getDireccionDonante() +
      "'" +
      ", ID donante: '" +
      getIdDonante() +
      "'" +
      ", Producto: '" +
      getProducto() +
      "'" +
      ", Cantidad: '" +
      getCantidad() +
      "'" +
      "}"
    );
  }
}
