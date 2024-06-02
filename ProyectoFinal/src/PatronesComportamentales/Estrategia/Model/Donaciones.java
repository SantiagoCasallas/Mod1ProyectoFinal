package PatronesComportamentales.Estrategia.Model;

import java.util.ArrayList;
import java.util.Arrays;

public class Donaciones {

    ArrayList<Libro> LibrosDonados = new ArrayList<Libro>();
    ArrayList<Ropa> RopaDonada = new ArrayList<Ropa>();

    public void donar(Libro libro) {
        LibrosDonados.add(libro);
    }

    public void donar(Ropa ropa) {
        RopaDonada.add(ropa);
    }

    public ArrayList<Libro> getLibros() {
        return LibrosDonados;
    }

    public ArrayList<Ropa> getRopa() {
        return RopaDonada;
    }

}
