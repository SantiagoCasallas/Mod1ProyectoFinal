package PatronesCreacionales.Singleton.Model;

public class Transaccion {

  static Transaccion instancia;
  private String nombreTransacción, entidad;

  private Transaccion() {}

  public static synchronized Transaccion getInstance() {
    if (instancia == null) {
      instancia = new Transaccion();
    }
    return instancia;
  }

  public String getNombreTransacción() {
    return this.nombreTransacción;
  }

  public void setNombreTransacción(String nombreTransacción) {
    this.nombreTransacción = nombreTransacción;
  }

  public void setEntidad(String entidad) {
    this.entidad = entidad;
  }

  public String getEntidad() {
    return this.entidad;
  }
}
