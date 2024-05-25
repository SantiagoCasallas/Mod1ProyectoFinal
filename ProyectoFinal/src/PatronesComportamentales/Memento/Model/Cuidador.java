package PatronesComportamentales.Memento.Model;

import java.util.ArrayList;

public class Cuidador {
    private ArrayList<Backup> historial;

    public Cuidador() {
        historial = new ArrayList<Backup>();
    }

    public void addBackup(Backup backup) {
        historial.add(backup);
    }

    public Backup getBackup() {
        return historial.get(historial.size() - 1);
    }

}
