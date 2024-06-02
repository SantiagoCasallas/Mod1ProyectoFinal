package PatronesComportamentales.Estrategia.Model;

import Interfaz.Interfaz;

public interface EstrategiaDonacion {

    public static Interfaz vista = new Interfaz();

    public void realizarDonacion(Libro don, Donaciones donaciones);

    public void realizarDonacion(Ropa don, Donaciones donaciones);

}
