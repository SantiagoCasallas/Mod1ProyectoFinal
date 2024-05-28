package PatronesEstructurales.Bridge.Model;

public class DonacionCsv implements Donacion {

    private int id, cantidad;
    private String nombreDonador, descripcion;

    public DonacionCsv(String nombreDonador, String descripcion, int cantidad, int id) {
        this.nombreDonador = nombreDonador;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.id = id;
    }

    @Override
    public String getNombreDonador() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNombreDonador'");
    }

    @Override
    public String getDescripcion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDescripcion'");
    }

    @Override
    public int getCantidad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCantidad'");
    }

}
