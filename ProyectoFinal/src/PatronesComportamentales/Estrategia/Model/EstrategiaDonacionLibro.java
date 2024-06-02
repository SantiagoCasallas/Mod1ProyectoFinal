package PatronesComportamentales.Estrategia.Model;

public class EstrategiaDonacionLibro implements EstrategiaDonacion {

    @Override
    public void realizarDonacion(Libro don, Donaciones donaciones) {

        donaciones.donar((Libro) don);

    }

    @Override
    public void realizarDonacion(Ropa don, Donaciones donaciones) {

        vista.mostrar("no se puede donar " + don.getTipo() + " en el metodo de donacion de libros");
        // TODO Auto-generated method stub
    }
}