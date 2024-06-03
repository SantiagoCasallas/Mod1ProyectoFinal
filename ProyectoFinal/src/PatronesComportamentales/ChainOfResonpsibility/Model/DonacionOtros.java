package PatronesComportamentales.ChainOfResonpsibility.Model;

public class DonacionOtros extends Donacion {

    public DonacionOtros(String descripcion) {
        super("Otros");
        this.descripcion = descripcion;
    }
}