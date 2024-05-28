package PatronesComportamentales.Observer.Model;

import Interfaz.Interfaz;
import java.util.ArrayList;

public class Stock extends EditorDonaciones {
    public static ArrayList<Donacion> stock = new ArrayList<Donacion>();

    public void addItem(Donacion d) {
        stock.add(d);
        notificarObservers(d);
    }

    public void removeItem(Donacion d) {
        for (Donacion donacion : stock) {
            if (d == donacion) {
                stock.remove(donacion);
            }
            notificarObservers(d);
        }

    }

    public ArrayList<Donacion> getStock() {
        return stock;
    }

    public Donacion getDonacion(int a) {
        return stock.get(a);
    }

    public int getTotal() {
        return stock.size();
    }

    @Override
    public String toString() {
        Interfaz vista = new Interfaz();
        for (Donacion donacion : stock) {
            vista.mostrar(donacion.getDescripcion() + " fecha:" + donacion.getFecha());
        }
        return "";
    }
}
