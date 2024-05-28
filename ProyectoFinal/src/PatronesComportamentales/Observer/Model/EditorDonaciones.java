package PatronesComportamentales.Observer.Model;

import java.util.ArrayList;

public class EditorDonaciones {
    public ArrayList<Observer> donacionObserver = new ArrayList<>();

    public void añadirObserver(Observer o) {
        donacionObserver.add(o);
    }

    public void borrarObserver(Observer o) {
        for (Observer donacion : donacionObserver) {
            if (o == donacion) {
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
