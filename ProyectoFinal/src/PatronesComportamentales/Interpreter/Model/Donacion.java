package PatronesComportamentales.Interpreter.Model;

public abstract class Donacion {
    private String tipo;
    private String descripcion;

    public Donacion(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}