package PatronesComportamentales.Memento.Model;

public class Donacion {
    private String items, descripcion;
    private int cantidad;

    public Donacion(String string, String string2, int i) {
        this.items = string;
        this.descripcion = string2;
        this.cantidad = i;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public Donacion getDonacion(String items, String descripcion, int cantidad) {
        setItems(items);
        setCantidad(cantidad);
        setDescripcion(descripcion);
        return this;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getItems() {
        return items;
    }

    public void recuperarTodo(Backup bckup) {
        setItems(bckup.getEstado1());
        setDescripcion(bckup.getEstado2());
        setCantidad(bckup.getEstado3());
    }

    public void recuperarItems(Backup bckup) {
        setItems(bckup.getEstado1());
    }

    public void recuperarDescripcion(Backup bckup) {
        setDescripcion(bckup.getEstado2());
    }

    public void recuperarCantidad(Backup bckup) {
        setCantidad(bckup.getEstado3());
    }

    public Backup guardar() {
        return new Backup(getItems(), getDescripcion(), getCantidad());
    }

    @Override
    public String toString() {
        return "{" +
                " items='" + getItems() + "'" +
                ", descripcion='" + getDescripcion() + "'" +
                ", cantidad='" + getCantidad() + "'" +
                "}";
    }
}