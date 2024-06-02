package PatronesComportamentales.Estrategia.Model;

public class Ropa extends Donacion {
    public String tipo = "Ropa";
    public String descripcion;

    public Ropa(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
