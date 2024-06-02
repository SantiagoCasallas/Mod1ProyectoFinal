package PatronesComportamentales.Estrategia.Model;

public class EstrategiaDonacionRopa implements EstrategiaDonacion {

    @Override
    public void realizarDonacion(Ropa don, Donaciones donaciones) {
        try {
            donaciones.donar((Ropa) don);

        } catch (Exception e) {
            System.out.println("f");
            // TODO: handle exception
        }

    }

    @Override
    public void realizarDonacion(Libro don, Donaciones donaciones) {
        // TODO Auto-generated method stub

    }

}
