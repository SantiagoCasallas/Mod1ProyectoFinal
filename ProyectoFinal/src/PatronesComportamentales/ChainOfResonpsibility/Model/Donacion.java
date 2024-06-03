package PatronesComportamentales.ChainOfResonpsibility.Model;

public abstract class Donacion {
    private String tipo;
    protected String descripcion;

    public Donacion(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}