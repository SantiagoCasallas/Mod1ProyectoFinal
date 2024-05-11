package PatronesEstructurales.Proxy.Model;

public class Proxy implements AccesoBD {

  private AccesoAdmin accesoAdmin;
  private boolean esAdmin;

  public Proxy(boolean esAdmin) {
    accesoAdmin = new AccesoAdmin();
    this.esAdmin = esAdmin;
    this.entrarBD();
  }

  public String entrarBD() {
    if (esAdmin) {
      return this.configAdmin();
    } else {
      return this.configUsuario();
    }
  }

  @Override
  public String configAdmin() {
    return accesoAdmin.configAdmin();
  }

  @Override
  public String configUsuario() {
    // TODO Auto-generated method stub
    return accesoAdmin.configUsuario();
  }
}
