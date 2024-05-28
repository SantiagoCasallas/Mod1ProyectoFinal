package PatronesComportamentales.Command.Model.Donaciones;

public abstract class Donacion {
    protected String nombre, descripcion, condicion;
    protected int cantidad;
    protected boolean valido;

    public Donacion(String nombre, String descripcion, int cantidad, String condicion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.condicion = condicion;
        if (condicion.toLowerCase() != "dañado") {
            valido = true;
        } else {
            valido = false;
        }
    }

    public abstract String regristrar();

    public abstract String verificar();

    public abstract String almacenar();

    public int getCantidad() {
        return cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCondicion() {
        return condicion;
    }

    @Override
    public String toString() {
        return "{" +
                " nombre='" + getNombre() + "'" +
                ", descripcion='" + getDescripcion() + "'" +
                ", cantidad='" + getCantidad() + "'" + ", condicion='" + getCondicion();
    }
}
