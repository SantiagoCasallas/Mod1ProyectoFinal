package PatronesComportamentales.Memento.Model;

public class Backup {
    private String estado1, estado2;
    private int estado3;

    public Backup(String estado1, String estado2, int estado3) {
        this.estado1 = estado1;
        this.estado2 = estado2;
        this.estado3 = estado3;
    }

    public String getEstado1() {
        return estado1;
    }

    public String getEstado2() {
        return estado2;
    }

    public int getEstado3() {
        return estado3;
    }
}
