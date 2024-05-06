package PatronesEstructurales.Adapter.Model;

public class AdaptadorCantidad extends DonacionesViveres implements Viveres {

  @Override
  public String donacionSI(double cantidad, String unidad) {
    // TODO Auto-generated method stub
    switch (unidad) {
      case "gr":
        cantidad = cantidad / 1000;
        unidad = "Kg";
        break;
      case "lb":
        cantidad = cantidad / 2.205;
        unidad = "Kg";
        break;
      case "ml":
        cantidad = cantidad / 1000;
        unidad = "L";
      default:
        break;
    }
    return donacionViveres(cantidad, unidad);
  }
}
