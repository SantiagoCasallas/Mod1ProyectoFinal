package PatronesEstructurales.Bridge.Model;

public class BdDonacion implements Donacion {
    private int id, cantidad;
    private String nombreDonador, descripcion;

    public BdDonacion(String nombreDonador, String descripcion, int cantidad, int id) {
        this.id = id;
        this.nombreDonador = nombreDonador;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    @Override
    public String getNombreDonador() {
        // TODO Auto-generated method stub
        return nombreDonador;
    }

    @Override
    public String getDescripcion() {
        // TODO Auto-generated method stub
        return descripcion;
    }

    @Override
    public int getCantidad() {
        // TODO Auto-generated method stub
        return cantidad;
    }

}
