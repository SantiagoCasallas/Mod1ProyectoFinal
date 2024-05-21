package PatronesEstructurales.Decorator.Model;

public abstract class KitAbstracto implements Donacion {
    protected Donacion donacion;
    protected Donacion donacion2;
    protected Donacion donacion3;

    public KitAbstracto(Donacion donacion, Donacion donacion2, Donacion donacion3) {
        this.donacion = donacion;
        this.donacion2 = donacion2;
        this.donacion3 = donacion3;
    }

    @Override
    public String getNombre() {
        return donacion.getNombre();
    }

    @Override
    public double getPeso() {
        return donacion.getPeso();
    }

}
