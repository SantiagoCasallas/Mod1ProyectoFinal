package PatronesCreacionales.AbstractFactory.Model.Transporte;

public abstract class Transporte {

  private String vehiculo, matricula;

  public Transporte(String vehiculo, String matricula) {
    this.vehiculo = vehiculo;
    this.matricula = matricula;
  }

  public String getVehiculo() {
    return this.vehiculo;
  }

  public String getMatricula() {
    return this.matricula;
  }

  @Override
  public String toString() {
    return (
      "{" +
      " Vehiculo: '" +
      getVehiculo() +
      "'" +
      ", Matricula: '" +
      getMatricula() +
      "'" +
      "}"
    );
  }
}
