package PatronesComportamentales.Visitor.Model;

public interface Visitor {
  public void visitarPueblo(DonacionPueblo dp);

  public void visitarCiudad(DonacionCiudad dc);
}
