package PatronesCreacionales.Builder.Model;

public class Donacion implements BuilderDonacion {
    private String descripcion, color;
    private TipoDonacion tipo;
    private int cantidad;

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipo(TipoDonacion tipo) {
        this.tipo = tipo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public DonacionRopa getDonacionRopa() {

        return new DonacionRopa(descripcion, color, tipo, cantidad);
    }
}
