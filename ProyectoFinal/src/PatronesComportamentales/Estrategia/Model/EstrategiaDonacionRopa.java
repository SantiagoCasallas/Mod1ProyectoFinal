package PatronesComportamentales.Estrategia.Model;

public class EstrategiaDonacionRopa implements EstrategiaDonacion {

    @Override
    public void realizarDonacion(Ropa don, Donaciones donaciones) {
        donaciones.donar((Ropa) don);

    }

    @Override
    public void realizarDonacion(Libro don, Donaciones donaciones) {
        // TODO Auto-generated method stub

    }

}
