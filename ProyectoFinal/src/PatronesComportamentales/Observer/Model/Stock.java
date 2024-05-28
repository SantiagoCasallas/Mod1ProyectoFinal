package PatronesComportamentales.Observer.Model;

import java.util.ArrayList;

public class Stock extends EditorDonaciones {
    public static ArrayList<Donacion> stock = new ArrayList<Donacion>();

    public void addItem(Donacion d) {
        stock.add(d);
        // notificarObservers(d);
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
        String stockString = "";
        for (Donacion donacion : stock) {
            stockString += (donacion.getDescripcion() + " fecha:" + donacion.getFecha() + "\n");
        }
        return stockString;
    }
}
