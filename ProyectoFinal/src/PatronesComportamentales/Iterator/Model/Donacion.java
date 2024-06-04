package PatronesComportamentales.Iterator.Model;

public class Donacion {
    private String nombre, descripcion;

    public Donacion(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }
}
