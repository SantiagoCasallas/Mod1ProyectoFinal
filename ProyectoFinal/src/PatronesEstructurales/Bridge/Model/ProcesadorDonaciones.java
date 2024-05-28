package PatronesEstructurales.Bridge.Model;

public class ProcesadorDonaciones {
    private Donacion donacion;

    public ProcesadorDonaciones(Donacion donacion) {
        this.donacion = donacion;
    }

    public String procesar() {
        return "Donador:\t" + donacion.getNombreDonador() + "\nDescripción del artículo:\t" + donacion.getDescripcion()
                + "\nCantidad:\t" + donacion.getCantidad();
    }
}
