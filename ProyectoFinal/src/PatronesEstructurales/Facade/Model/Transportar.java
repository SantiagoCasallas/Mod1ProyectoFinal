package PatronesEstructurales.Facade.Model;

public class Transportar implements Proceso {

  @Override
  public String ejecutar() {
    return "Transportando donación...";
  }
}
