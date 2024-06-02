package PatronesComportamentales.Estrategia.Controller;

import Interfaz.Interfaz;
import PatronesComportamentales.Estrategia.Model.Contexto;
import PatronesComportamentales.Estrategia.Model.Donacion;
import PatronesComportamentales.Estrategia.Model.EstrategiaDonacionLibro;
import PatronesComportamentales.Estrategia.Model.Libro;
import PatronesComportamentales.Estrategia.Model.Ropa;

public class Test {
    public static void main(String[] args) {
        Interfaz vista = new Interfaz();

        Libro libro = new Libro("Cien años de soledad");
        Ropa ropa = new Ropa("Camiseta roja");

        Contexto contexto = new Contexto();
        contexto.setEstrategiaDonacion(new EstrategiaDonacionLibro());
        contexto.realizarDonacion(ropa);
        contexto.realizarDonacion(libro);

    }
}
