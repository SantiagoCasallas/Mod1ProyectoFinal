package PatronesComportamentales.Estrategia.Model;

public class Contexto {
    private EstrategiaDonacion estrategiaDonacion;
    Donaciones donaciones = new Donaciones();

    public void setEstrategiaDonacion(EstrategiaDonacion estrategiaDonacion) {
        this.estrategiaDonacion = estrategiaDonacion;
    }

    public void realizarDonacion(Libro don) {
        estrategiaDonacion.realizarDonacion(don, donaciones);
    }

    public void realizarDonacion(Ropa don) {
        estrategiaDonacion.realizarDonacion(don, donaciones);
    }

    public String getEstrategiaDonacion() {
        return estrategiaDonacion.toString();
    }
}