package PatronesEstructurales.Facade.Model;

public class Recibir implements Proceso {

  @Override
  public String ejecutar() {
    return "Recibiendo donación...";
  }
}
