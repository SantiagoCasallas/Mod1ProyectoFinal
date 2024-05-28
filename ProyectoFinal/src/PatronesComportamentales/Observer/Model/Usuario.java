package PatronesComportamentales.Observer.Model;

public class Usuario implements Observer {
    public Stock stock;
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

}
