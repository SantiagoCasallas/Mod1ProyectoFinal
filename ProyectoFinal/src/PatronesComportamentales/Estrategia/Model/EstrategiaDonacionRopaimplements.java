package PatronesComportamentales.Estrategia.Model;

public class EstrategiaDonacionRopaimplements implements EstrategiaDonacion {

    @Override
    public void realizarDonacion(Ropa don, Donaciones donaciones) {
        try {
            donaciones.donar((Ropa) don);
            System.out.println("se dono ropa" + don.getDescripcion());

        } catch (Exception e) {
            System.out.println("f");
            // TODO: handle exception
        }

    }

    @Override
    public void realizarDonacion(Libro don, Donaciones donaciones) {
        vista.mostrar("no se puede donar " + don.getTipo() + " en el metodo donacion de ropa");
        // TODO Auto-generated method stub

    }

}
