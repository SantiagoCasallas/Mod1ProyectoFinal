package PatronesCreacionales.Builder.Model;

public class DonacionRopa {

    private String descripcion, color;
    private TipoDonacion tipo;
    private int cantidad;

    public DonacionRopa(String descripcion, String color, TipoDonacion tipo, int cantidad) {
        this.descripcion = descripcion;
        this.color = color;
        this.tipo = tipo;
        this.cantidad = cantidad;

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TipoDonacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoDonacion tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
