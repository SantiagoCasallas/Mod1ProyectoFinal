package PatronesComportamentales.State.Model;

public class Donacion {
    private EstadoDonacion estado;
    private String tipo;
    private String descripcion;

    public Donacion(String tipo, String descripcion) {
        estado = new EstadoRecibido();
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEstado(EstadoDonacion estado) {
        this.estado = estado;
    }

    public void recibir() {
        estado.recibir(this);
    }

    public void clasificar() {
        estado.clasificar(this);
    }

    public void almacenar() {
        estado.almacenar(this);
    }

    public void distribuir() {
        estado.distribuir(this);
    }

    public String getEstado() {
        return estado.getEstado();
    }
}