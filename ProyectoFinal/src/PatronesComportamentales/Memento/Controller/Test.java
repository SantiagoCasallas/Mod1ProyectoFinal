package PatronesComportamentales.Memento.Controller;

import PatronesComportamentales.Memento.Model.Backup;
import PatronesComportamentales.Memento.Model.Cuidador;
import PatronesComportamentales.Memento.Model.Donacion;
import View.Interfaz;

public class Test {
    public static void main(String[] args) {
        Interfaz vista = new Interfaz();
        Donacion donacion;
        donacion = new Donacion("Computadores", "Lote de computadores para ofimática", 15);
        Cuidador cuidador = new Cuidador();
        Backup backup;
        cuidador.addBackup(donacion.guardar());
        vista.mostrar("Donación registrada:\t" + donacion.toString());
        donacion.setCantidad(30);
        vista.mostrar("Donación cambiada:\t" + donacion.toString());
        backup = cuidador.getBackup();
        donacion.recuperarCantidad(backup);
        vista.mostrar("Donación recuperada:\t" + donacion.toString());

    }
}
