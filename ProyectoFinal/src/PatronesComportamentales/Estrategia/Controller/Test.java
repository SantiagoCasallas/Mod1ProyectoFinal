package PatronesComportamentales.Estrategia.Controller;

import Interfaz.Interfaz;
import PatronesComportamentales.Estrategia.Model.Contexto;
import PatronesComportamentales.Estrategia.Model.EstrategiaDonacionLibro;
import PatronesComportamentales.Estrategia.Model.EstrategiaDonacionRopa;
import PatronesComportamentales.Estrategia.Model.Libro;
import PatronesComportamentales.Estrategia.Model.Ropa;

public class Test {
    public static void main(String[] args) {
        Interfaz vista = new Interfaz();

        Libro libro = new Libro("");

        Ropa ropa = new Ropa("");

        Contexto contexto = new Contexto();
        contexto.setEstrategiaDonacion(new EstrategiaDonacionLibro());
        contexto.realizarDonacion(new Ropa("camiseta roja"));
        contexto.realizarDonacion(new Libro("cien años de soledad"));
        contexto.realizarDonacion(new Libro("el coronel no tiene quien le escriba"));
        contexto.setEstrategiaDonacion(new EstrategiaDonacionRopa()); //
        contexto.realizarDonacion(ropa);

        contexto.getRopa();
        imprimir(contexto, vista, libro);
        imprimir(contexto, vista, ropa);

    }

    static final void imprimir(Contexto contexto, Interfaz vista, Libro libro) {
        for (Libro don : contexto.getLibros()) {
            vista.mostrar(don.getDescripcion());
        }
    }

    static final void imprimir(Contexto contexto, Interfaz vista, Ropa ropa) {
        for (Ropa don : contexto.getRopa()) {
            vista.mostrar(don.getDescripcion());
        }
    }
}
