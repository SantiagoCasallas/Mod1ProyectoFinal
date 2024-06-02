package PatronesComportamentales.Estrategia.Model;

public class Libro extends Donacion {
    public String tipo = "Libro";
    public String descripcion;

    public Libro(String descripcion) {

        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
