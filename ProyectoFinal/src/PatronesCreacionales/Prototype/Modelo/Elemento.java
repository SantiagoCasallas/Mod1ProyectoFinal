package PatronesCreacionales.Prototype.Modelo;

public class Elemento {
    String nombre;
    String cantidad;

    public Elemento(String nombre, String cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCantidad() {
        return cantidad;
    }
}
