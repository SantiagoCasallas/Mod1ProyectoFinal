package PatronesComportamentales.Observer.Model;

import java.util.ArrayList;

public class Usuario implements Observer {
    public Stock stock = new Stock();
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void agregarDonacion(Donacion don) {

        stock.addItem(don);

    }

    public Stock getStock() {
        return stock;
    }

}
