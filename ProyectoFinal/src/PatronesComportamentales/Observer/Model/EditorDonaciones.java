package PatronesComportamentales.Observer.Model;

import java.util.ArrayList;

public class EditorDonaciones {
    public ArrayList<Observer> donacionObserver = new ArrayList<Observer>();

    public void añadirObserver(Observer d) {
        donacionObserver.add(d);
    }

    public void borrarObserver(Donacion d) {
        for (Observer donacion : donacionObserver) {
            if (d == donacion) {
                donacionObserver.remove(donacion);
            }
        }
    }

    public Observer actualizarDonacion(int id) {
        return donacionObserver.get(id);
    }

    public ArrayList<Observer> getDonaciones() {
        return donacionObserver;
    }

    public void notificarObservers(Donacion don) {
        for (Observer observer : donacionObserver) {
            observer.agregarDonacion(don);
        }
    };

}
