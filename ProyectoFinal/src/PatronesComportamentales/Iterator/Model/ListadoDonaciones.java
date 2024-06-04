
package PatronesComportamentales.Iterator.Model;

public class ListadoDonaciones {
    public Donacion[] donaciones;
    public int size;

    public ListadoDonaciones(int contenido) {
        this.donaciones = new Donacion[contenido];

    }

    public void add(Donacion donacion) {
        if (size == donaciones.length) {
            Donacion[] donacionesTemp = new Donacion[donaciones.length * 2];
            for (int i = 0; i < donaciones.length; i++) {
                donacionesTemp[i] = donaciones[i];
            }
            donaciones = donacionesTemp;
        }
        donaciones[size++] = donacion;
    }

    public Iterador iterator() {
        return new Iterador(this);

    }

}