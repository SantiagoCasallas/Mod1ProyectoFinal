package PatronesEstructurales.Facade.Model;

public class Almacenar implements Proceso {

  @Override
  public String ejecutar() {
    return "Almacenando donación....";
  }
}
