package PatronesCreacionales.Builder.Model;

public class Director {

  public void DonacionCamiseta(BuilderDonacion builder) {
    builder.setColor("Rojo");
    builder.setMarca("Adiddas");
    builder.setTalla("M");
  }

  public void DonacionZapatos(BuilderDonacion builder) {
    builder.setColor("Azul jean");
    builder.setMarca("Levis");
    builder.setTalla("32");
  }

  public void DonacionChaqueta(BuilderDonacion builder) {
    builder.setColor("Azul jean");
    builder.setMarca("Nike");
    builder.setTalla("M");

  }

  public void DonacionPantalon(BuilderDonacion builder) {
    builder.setMarca("puma");
    builder.setTalla("8");
    builder.setColor("California");
  }
}
