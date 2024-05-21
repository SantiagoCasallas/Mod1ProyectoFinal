package PatronesEstructurales.Decorator.Model;

public class KitConcreto extends KitAbstracto {

    public KitConcreto(Donacion donacion, Donacion donacion2, Donacion donacion3) {
        super(donacion, donacion2, donacion3);
        this.donacion = donacion;
        this.donacion2 = donacion2;
        this.donacion3 = donacion3;

    }

    @Override
    public String getNombre() {
        return "se donó " + donacion.getNombre() + ", " + donacion2.getNombre() + ", " + donacion3.getNombre();
    }

    @Override
    public double getPeso() {
        return donacion.getPeso() + donacion2.getPeso() + donacion3.getPeso();
    }

}
