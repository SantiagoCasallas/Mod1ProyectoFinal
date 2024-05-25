package PatronesComportamentales.Template.Model;

public class Items {
    private String descripción;
    private int cantidad;

    public Items(String descripción, int cantidad) {
        this.descripción = descripción;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }
}
