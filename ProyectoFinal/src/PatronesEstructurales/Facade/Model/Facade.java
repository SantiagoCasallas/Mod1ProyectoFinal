package PatronesEstructurales.Facade.Model;

public class Facade {

  Proceso proceso;

  public String Almacenar() {
    proceso = new Almacenar();
    return proceso.ejecutar();
  }

  public String Recibir() {
    proceso = new Recibir();
    return proceso.ejecutar();
  }

  public String Verificar() {
    proceso = new Verificar();
    return proceso.ejecutar();
  }

  public String Transportar() {
    proceso = new Transportar();
    return proceso.ejecutar();
  }
}
