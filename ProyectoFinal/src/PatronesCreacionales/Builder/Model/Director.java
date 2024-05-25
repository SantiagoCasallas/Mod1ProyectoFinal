package PatronesCreacionales.Builder.Model;

public class Director {
  BuilderDonacion builder = new Donacion();

  public Director(BuilderDonacion builder) {
    this.builder = builder;

  }

  public void crearDonacion() {
    builder.setZapatos("Botas", "Venus", "38", "Tela");
    builder.setPantalon("Negro", "Facol", "L", "Jean");

    builder.setCamiseta("Manga corta estampada", "Only", "L");
    builder.setChaqueta("Verde Oscuro", "Koaj", "L");

  }

  public DonacionRopa getDonacion() {
    return builder.getDonacionRopa();
  }
}
