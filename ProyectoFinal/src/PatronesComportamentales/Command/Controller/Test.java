package PatronesComportamentales.Command.Controller;

import Interfaz.Interfaz;
import PatronesComportamentales.Command.Model.Invoker;
import PatronesComportamentales.Command.Model.Comando.Comando;
import PatronesComportamentales.Command.Model.Comando.ComandoLibros;
import PatronesComportamentales.Command.Model.Donaciones.Donacion;
import PatronesComportamentales.Command.Model.Donaciones.Libros;

public class Test {

    public static void main(String[] args) {
        Interfaz vista = new Interfaz();
        vista.mostrar(testLibros());
    }

    public static String testLibros() {
        Donacion donacion = new Libros("El hobbit", "Libro de literatura infantil", 20, "Nueva", false);
        Comando comando = new ComandoLibros((Libros) donacion);
        Invoker invoker = new Invoker();
        invoker.setComando(comando);
        return invoker.ejecutarComando();
    }
}
