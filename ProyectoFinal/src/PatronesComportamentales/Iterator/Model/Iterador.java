package PatronesComportamentales.Iterator.Model;

public class Iterador {
    private ListadoDonaciones donacion;
    private int indice;

    public Iterador(ListadoDonaciones donacion) {
        this.donacion = donacion;
        this.indice = 0;
    }

    public boolean hasNext() {
        return this.indice < this.donacion.size;
    }

    public Donacion next() {
        if (!hasNext()) {
            throw new RuntimeException("No hay más elementos");
        }
        return donacion.donaciones[indice++];
    }
}
