package PatronesComportamentales.Visitor.Model;

public class VisitorMunicipios implements Visitor {

  private int totalDonacionesCiudad, totalDonacionesPueblo;
  private double totalTonCiudad, totalTonPueblo;

  @Override
  public void visitarPueblo(DonacionPueblo dp) {
    totalDonacionesPueblo++;
    totalTonPueblo += dp.getTonInsumos();
  }

  @Override
  public void visitarCiudad(DonacionCiudad dc) {
    totalDonacionesCiudad++;
    totalTonCiudad += dc.getTonInsumos();
  }

  public int getTotalDonacionesCiudad() {
    return totalDonacionesCiudad;
  }

  public double getTotalTonCiudad() {
    return totalTonCiudad;
  }

  public int getTotalDonacionesPueblo() {
    return totalDonacionesPueblo;
  }

  public double getTotalTonPueblo() {
    return totalTonPueblo;
  }

  public String informar() {
    int totalDonaciones = totalDonacionesCiudad + totalDonacionesPueblo;
    double totalToneladas = getTotalTonPueblo() + getTotalTonCiudad();
    return (
      "Total Donaciones:\t" +
      totalDonaciones +
      "\nTotal donaciones en ciudades:\t" +
      totalDonacionesCiudad +
      "\nTotal donaciones en pueblos:\t" +
      totalDonacionesPueblo +
      "\n\nInsumos donados (toneladas):\t" +
      totalToneladas +
      "\n Toneladas donadas en ciudades:\t" +
      getTotalTonCiudad() +
      "\nToneladas donadas en pueblos:\t" +
      getTotalTonPueblo()
    );
  }
}
