package PatronesComportamentales.Command.Model.Comando;

import PatronesComportamentales.Command.Model.Donaciones.Libros;

public class ComandoLibros implements Comando {
    private Libros libros;

    public ComandoLibros(Libros libros) {
        this.libros = libros;
    }

    @Override
    public String ejecutar() {
        return libros.regristrar();
    }

}
