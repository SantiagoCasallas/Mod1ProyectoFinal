package PatronesComportamentales.Observer.Controller;

import java.time.LocalDateTime;

import PatronesComportamentales.Observer.Model.Donacion;
import PatronesComportamentales.Observer.Model.Stock;
import PatronesComportamentales.Observer.Model.Usuario;
import PatronesComportamentales.Observer.Model.Observer;

public class Test {
    public static void main(String[] args) {
        Stock stock1 = new Stock();
        Stock stock = new Stock();

        Observer usuario1 = new Usuario("Administrador");
        Observer usuario2 = new Usuario("Gerente");

        stock.añadirObserver(usuario1);
        stock.añadirObserver(usuario2);
        stock.addItem(new Donacion("5 camisetas y 3 pantalones", LocalDateTime.now()));
        stock.addItem(new Donacion("2 kit de alimentos y 3 pares de zapatos", LocalDateTime.now()));
        stock.addItem(new Donacion("3 kits de limpieza y 1 kit de alimentos", LocalDateTime.now()));

        stock.toString();
        usuario1.agregarDonacion(new Donacion("1kit de alimentos", LocalDateTime.now()));

        stock.getDonacion(1).setDescripcion("3 kits de alimentos y 3 pares de zapatos");
        stock.toString();

    }

}
