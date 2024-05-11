package PatronesEstructurales.Proxy.Model;

public class AccesoAdmin implements AccesoBD {

  @Override
  public String configAdmin() {
    // TODO Auto-generated method stub
    return "Acceso de administrador, es posible hacer registros, consultas, gestión de usuarios y modificacones de registros";
  }

  @Override
  public String configUsuario() {
    // TODO Auto-generated method stub
    return "Acceso de usuario, solo es posible hacer registros y consultas";
  }
}
