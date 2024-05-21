package PatronesComportamentales.Visitor.Model;

public class DonacionPueblo implements Donacion {

  private String nombre;

  private double tonInsumos;

  public DonacionPueblo(String nombre, double tonInsumos) {
    this.nombre = nombre;
    this.tonInsumos = tonInsumos;
  }

  public String getNombre() {
    return nombre;
  }

  public double getTonInsumos() {
    return tonInsumos;
  }

  @Override
  public void aceptar(Visitor visitor) {
    visitor.visitarPueblo(this);
  }
}
